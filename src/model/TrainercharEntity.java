package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trainerchar", schema = "springmvc")
public class TrainercharEntity {
    private int trainerId;
    private String trainerFirstname;
    private String trainerLastname;
    private String trainerSubject;

    @Id
    @Column(name = "trainerID")
    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    @Basic
    @Column(name = "trainerFirstname")
    public String getTrainerFirstname() {
        return trainerFirstname;
    }

    public void setTrainerFirstname(String trainerFirstname) {
        this.trainerFirstname = trainerFirstname;
    }

    @Basic
    @Column(name = "trainerLastname")
    public String getTrainerLastname() {
        return trainerLastname;
    }

    public void setTrainerLastname(String trainerLastname) {
        this.trainerLastname = trainerLastname;
    }

    @Basic
    @Column(name = "trainerSubject")
    public String getTrainerSubject() {
        return trainerSubject;
    }

    public void setTrainerSubject(String trainerSubject) {
        this.trainerSubject = trainerSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainercharEntity that = (TrainercharEntity) o;
        return trainerId == that.trainerId &&
                Objects.equals(trainerFirstname, that.trainerFirstname) &&
                Objects.equals(trainerLastname, that.trainerLastname) &&
                Objects.equals(trainerSubject, that.trainerSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId, trainerFirstname, trainerLastname, trainerSubject);
    }
}
