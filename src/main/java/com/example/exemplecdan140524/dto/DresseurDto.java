package com.example.exemplecdan140524.dto;

import java.time.LocalDate;

public class DresseurDto {
    private String nom;
    private String prenom;
    private Integer jourNaissance;
    private Integer moisNaissance;
    private Integer anneeNaissance;
    private Integer age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getJourNaissance() {
        return jourNaissance;
    }

    public void setJourNaissance(Integer jourNaissance) {
        this.jourNaissance = jourNaissance;
    }

    public Integer getMoisNaissance() {
        return moisNaissance;
    }

    public void setMoisNaissance(Integer moisNaissance) {
        this.moisNaissance = moisNaissance;
    }

    public Integer getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(Integer anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public Integer getAge() {
        LocalDate todaysDate = LocalDate.now();
        this.age = todaysDate.getYear() - getAnneeNaissance();
        if (todaysDate.getMonthValue() < getMoisNaissance()) {
            this.age--;
        } else if (todaysDate.getMonthValue() == getMoisNaissance() && todaysDate.getDayOfMonth() < getJourNaissance()) {
            this.age--;
        }
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
