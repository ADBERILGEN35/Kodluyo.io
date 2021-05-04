package Entities;

import Abstract.IEntity;

public class Gamer implements IEntity {

    private int id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private long nationalityID;

    public Gamer() {

    }

    public Gamer(int id, String firstName, String lastName, int birthYear, long nationalityID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nationalityID = nationalityID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public long getNationalityID() {
        return nationalityID;
    }

    public void setNationalityID(long nationalityID) {
        this.nationalityID = nationalityID;
    }
}

