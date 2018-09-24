
package pt.ulusofona.es.brunocip.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.brunocip.data.Carro;
import pt.ulusofona.es.brunocip.form.CarroForm;

@Controller
public class CarroEditController {
    
    @PersistenceContext
    private EntityManager em;
    
    @RequestMapping(value="/carroEdit/{id}", method = RequestMethod.GET)
    public String getForm(ModelMap model, @PathVariable("id") Integer id) {
        
        Carro carro = em.find(Carro.class, id);
        
        if(carro == null) {
           model.put("ERROR_MESSAGE", "Erro: O registo com id " + id + " nao foi encontrado...");
           return "carroEdit";
        }
        
        CarroForm carroForm = new CarroForm();
        
        carroForm.setMarca("1"); // TODO replace dummy value
        carroForm.setModelo(carro.getModelo());
        carroForm.setMatricula(carro.getMatricula());
        carroForm.setCilindrada(carro.getCilindrada());
        
        model.put("carroForm", carroForm);
        
        return "carroEdit";
    }
    
}
