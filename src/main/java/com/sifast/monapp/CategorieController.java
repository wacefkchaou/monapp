package com.sifast.monapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.service.ICategorieService;

@RestController
@RequestMapping(value = "/categories")
public class CategorieController {

    @Autowired
    ICategorieService icategorieservice;

    @RequestMapping(value = "/enregistrer", method = RequestMethod.GET)
    public String home(Model model, @ModelAttribute Categorie p) {

        icategorieservice.save(p);
        List<Categorie> categories = icategorieservice.findAll();

        model.addAttribute("cat", categories);
        return "categorie";
    }

    @RequestMapping(value = "/nouveauform", method = RequestMethod.GET)
    public String home1() {

        return "categorie";
    }
}
