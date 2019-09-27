package controllers;


import dao.TrainerDAO;
import model.TrainercharEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class TrainerController {
    @Autowired
    TrainerDAO trdao;

    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping("showform")
    public String show(ModelMap m) {
        TrainercharEntity trainer = new TrainercharEntity();
        m.addAttribute("emTrainer", trainer);
        return "forminsert";
    }

    @PostMapping("insertTrainer")
    public String insert(@ModelAttribute(value = "emTrainer") TrainercharEntity train) {
        trdao.insertTrainer(train);
        return "redirect:/getalltrainers";
    }

    @GetMapping("getalltrainers")
    public String showAll(ModelMap map) {
        List<TrainercharEntity> tre = new ArrayList<>();
        tre = trdao.showAllTrainers();
        map.addAttribute("Trainers", tre);
        return "formtable";
    }

    @GetMapping("update/{id}")
    public String updateTrainer(ModelMap map, @PathVariable int id) {
        map.addAttribute("uptrain", trdao.findTrainer(id));

        return "updateform";
    }

    @PostMapping("updateTre")
    public String updatr(@ModelAttribute(value = "uptrain")TrainercharEntity trent) {
        trdao.updateTrainer(trent);
        return "redirect:/getalltrainers";
    }


    @GetMapping("delete/{id}")
    public String deletetrainer(@PathVariable int id) {
        trdao.deleteTr(id);

        return "forward:/getalltrainers";
    }

}
