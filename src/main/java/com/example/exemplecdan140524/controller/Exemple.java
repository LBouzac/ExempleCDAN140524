package com.example.exemplecdan140524.controller;

import com.example.exemplecdan140524.dto.PokemonDto;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

///
/// # Cours Exemple
///

@RestController // Controller RestService
@RequestMapping("toto") // URL de base
public class Exemple { // Classe de contrôleur

    @GetMapping("test") // URL de la méthode
    public ResponseEntity hello() { // Méthode de traitement
        // Retourne une réponse HTTP avec un message
        return new ResponseEntity("Bonjour a tous", HttpStatusCode.valueOf(200));
    }

    @GetMapping("exemple") // URL de la méthode
    public ResponseEntity exemple(@RequestParam("prenom") String firstname, Integer age) {

        return new ResponseEntity("Bonjour " + firstname + " tu as " + age +" ans.", HttpStatusCode.valueOf(200));
    }

    @GetMapping("exemple2") // URL de la méthode
    public ResponseEntity exemple2(@RequestParam("note") List<Integer> notes) {
        float sum = 0;
        for (int i = 0; i < notes.size(); i++) {
            sum += notes.get(i);
        }
        return new ResponseEntity("Tu as " + sum/notes.size() + " de moyenne", HttpStatusCode.valueOf(200));

    }

    @GetMapping("get/{id}") // URL de la méthode
    public ResponseEntity get(@PathVariable("id") String ID) {
        return new ResponseEntity("Mon id est "+ID, HttpStatusCode.valueOf(200));
    }

    @PostMapping("initPokemon")
    private ResponseEntity createPokemon(@RequestBody PokemonDto dto) {
        return new ResponseEntity("J'ai un pokémon de type " + dto.getType() + ". Il s'appelle " + dto.getNom(), HttpStatusCode.valueOf(200));
    }

}
