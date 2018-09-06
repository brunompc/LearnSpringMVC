/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ulusofona.es.brunocip.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.brunocip.form.Carro;

@Controller
public class CarroController {
    
    @RequestMapping(value="/carros", method = RequestMethod.GET)
    public String getForm(ModelMap model) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("BMW", "XX-YY-ZZ", 1200));
        carros.add(new Carro("Mercedes", "20-XX-30", 1400));
        carros.add(new Carro("Ferrari", "AA-BB-CC", 1200));
        model.put("carros", carros);
        return "carros";
    }
    
}
