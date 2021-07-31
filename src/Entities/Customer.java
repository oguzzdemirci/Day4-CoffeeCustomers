package Entities;

import Abstract.Entity;

import java.time.LocalDate;

public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate DateOfBirth;
    private String nationalId;
    
    public Customer() {
    	
    }

    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DateOfBirth = dateOfBirth;
        this.nationalId = nationalId;
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

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
