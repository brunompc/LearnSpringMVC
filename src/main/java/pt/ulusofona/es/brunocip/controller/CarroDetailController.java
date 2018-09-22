
package pt.ulusofona.es.brunocip.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.brunocip.data.Carro;

@Controller
public class CarroDetailController {
    
    @PersistenceContext
    private EntityManager em;
    
    @RequestMapping(value="/carroDetail/{id}", method = RequestMethod.GET)
    public String getForm(ModelMap model, @PathVariable("id") Integer id) {
        
        System.out.println("ID: " + id);

        Carro carro = em.find(Carro.class, id);

        if(carro == null) {
            // TODO: handle error
            return "carros";
        }
        
        model.put("carro", carro);

        return "carroDetail";
    }
    
}
