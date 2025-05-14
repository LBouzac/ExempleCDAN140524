package com.example.exemplecdan140524.dto;

import java.time.LocalDate;
import java.time.Period;

public class DresseurOutDto {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private int age;

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

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
        calculateAge();
    }

    public int getAge() {
        return age;
    }

    private void calculateAge() {
        if (dateNaissance != null) {
            age = Period.between(dateNaissance, LocalDate.now()).getYears();
        }
    }
}