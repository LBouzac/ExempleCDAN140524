package com.example.exemplecdan140524.controller;

import com.example.exemplecdan140524.dto.DresseurInDto;
import com.example.exemplecdan140524.dto.DresseurOutDto;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller RestService
@RequestMapping("Dresseur") // URL de base
public class DresseurController {
    /// # Exercice 1 : Dresseur/Create
    /// Ajouter un point de terminaison Dresseur/create
    /// ce point de terminaison est un post il prend en entrée un dto de type Dresseur DTO qui contient, le nom, prenom, jour, mois, année de naissance
    /// il renvoi le nom et prenom du dresseur ainsi que son age

    @PostMapping("create")
    private ResponseEntity createDresseur(@RequestBody DresseurInDto dto) {
        DresseurOutDto outDto = new DresseurOutDto();
        outDto.setNom(dto.getNom());
        outDto.setPrenom(dto.getPrenom());
        outDto.setDateNaissance(dto.getDateNaissance()); // L'âge sera calculé automatiquement
        return new ResponseEntity(outDto, HttpStatusCode.valueOf(200));
    }
}
