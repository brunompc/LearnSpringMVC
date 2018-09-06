
package pt.ulusofona.es.brunocip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.brunocip.form.Carro;

@Controller
public class CarroDetailController {
    
    @RequestMapping(value="/carroDetail/{id}", method = RequestMethod.GET)
    public String getForm(ModelMap model, @PathVariable("id") Long id) {
        
        System.out.println("ID: " + id);
        
        Carro carro = new Carro("BMW", "XX-YY-ZZ", 1200); // for now
        
        model.put("carro", carro);
        model.put("id", id);
        
        //return "novoCarro";
        return "carroDetail";
    }
    
}
