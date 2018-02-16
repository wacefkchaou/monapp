package com.sifast.monapp;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sifast.monapp.dao.IProduitDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    @Autowired(required = true)
    IProduitDao produitDao;
    // @Autowired(required = true)
    // IProduitRepository iProduitRepository;

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        // Date date = new Date();
        // DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        // String formattedDate = dateFormat.format(date);

        // model.addAttribute("serverTime", formattedDate);

        // List<Produit> produits = iProduitRepository.findAll();
        // model.addAttribute("p", produits);

        // List<Produit> produits = produitDao.listProduit();
        // model.addAttribute("p", produits);

        return "home";
    }

}
