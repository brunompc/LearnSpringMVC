
package pt.ulusofona.es.brunocip.controller;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.brunocip.data.Carro;
import pt.ulusofona.es.brunocip.data.Marca;

@Controller
public class CarroListController {
    
    @PersistenceContext
    private EntityManager em;
    
    private List<Carro> fakeCarList() {
        List<Carro> carros = new ArrayList<>();
        //carros.add(new CarroForm("BMW", "Z3", "XX-YY-ZZ", 1200));
        //carros.add(new CarroForm("Mercedes-Benz", "","20-XX-30", 1400));
        //carros.add(new CarroForm("Ferrari", "Testarosa", "AA-BB-CC", 1200));
        return carros;
    }
    
    @RequestMapping(value="/carros", method = RequestMethod.GET)
    public String getForm(ModelMap model) {
        List<Carro> carros = em.createQuery("select c from Carro c", Carro.class).getResultList();
        model.put("carros", carros);
        return "carros";
    }
    
}
