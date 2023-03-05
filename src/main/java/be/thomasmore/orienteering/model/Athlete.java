package be.thomasmore.orienteering.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Athlete {
    @Id
    private int id;
    private String athleteName;
    private String birthDate;
    private String gender;
    private int chestNumber;

    public Athlete() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getChestNumber() {
        return chestNumber;
    }

    public void setChestNumber(int chestNumber) {
        this.chestNumber = chestNumber;
    }
}
