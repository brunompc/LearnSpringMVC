
package pt.ulusofona.es.brunocip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.brunocip.form.CarroForm;

@Controller
public class CarroDetailController {
    
    @RequestMapping(value="/carroDetail/{id}", method = RequestMethod.GET)
    public String getForm(ModelMap model, @PathVariable("id") Long id) {
        
        System.out.println("ID: " + id);
        
        //CarroForm carro = new CarroForm("BMW", "Z3", "XX-YY-ZZ", 1200); // for now
        
        Carro carro = em.find(Carro.class, id);
        
        model.put("carro", carro);
        model.put("id", id);
        
        //return "novoCarro";
        return "carroDetail";
    }
    
}
