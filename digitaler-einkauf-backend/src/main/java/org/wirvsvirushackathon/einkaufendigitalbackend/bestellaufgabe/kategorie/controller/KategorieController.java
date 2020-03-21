package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.kategorie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.kategorie.entities.Kategorie;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.kategorie.repositories.KategorieRepository;

@RestController
public class KategorieController {

    @Autowired
    private KategorieRepository kategorieRepository;


    @GetMapping("/kategorie")
    public Iterable<Kategorie> getAll() {
        return kategorieRepository.findAll();
    }



}
