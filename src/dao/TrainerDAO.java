package dao;


import model.TrainercharEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TrainerDAO {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void insertTrainer(TrainercharEntity trainer) {

        em.persist(trainer);
        // an den ebaza to annotation eprepe na valw:
        // em.getTransaction().begin();
        // em.flush();
        // em.getTransaction().commit();
    }

    @Transactional
    public List<TrainercharEntity> showAllTrainers(){
        List<TrainercharEntity> result = em.createQuery("SELECT c FROM TrainercharEntity c ").getResultList();
        return result;
    }

    @Transactional
    public void updateTrainer(TrainercharEntity trEnt) {

        em.merge(trEnt);
    }

    @Transactional
    public TrainercharEntity findTrainer(int id) {
      return em.find(TrainercharEntity.class, id);

    }

    @Transactional
    public void deleteTr( int id) {
    em.remove(findTrainer(id));

    }


}
