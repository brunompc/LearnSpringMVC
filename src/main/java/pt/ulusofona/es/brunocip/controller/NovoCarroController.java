package pt.ulusofona.es.brunocip.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.brunocip.form.CarroForm;
import pt.ulusofona.es.brunocip.data.Carro;

@Transactional
@Controller
public class NovoCarroController {
    @PersistenceContext
    private EntityManager em;
    
    List<String> marcas;

    void inicializarMarcas() {
        marcas = new ArrayList<>();
        marcas.add("BMW");
        marcas.add("Ferrari");
        marcas.add("Toyota");
    }
    
    @RequestMapping(value="/novoCarro", method = RequestMethod.GET)
    public String getForm(ModelMap model) {
        inicializarMarcas();
        model.put("marcas", marcas);
        model.put("novoCarro", new CarroForm());
        return "novoCarro";
    }
    
    @RequestMapping(value="/novoCarro", method = RequestMethod.POST)
    public String submitForm(@Valid @ModelAttribute("novoCarro") CarroForm carFormData,
                             BindingResult bindingResult,
                             ModelMap model) {
        
        if(bindingResult.hasErrors()) {
            inicializarMarcas();
            System.out.println("Nr Erros: " + bindingResult.getAllErrors().size());
            System.out.println("Erros: ");
            bindingResult.
                    getAllErrors().
                    forEach((e) -> System.out.println(e.getDefaultMessage()));
            model.put("marcas", marcas);
            return "novoCarro";
        }
        
        Carro carro = new Carro();
        carro.setMarca(1); // TODO: replace dummy value
        carro.setModelo(carFormData.getModelo());
        carro.setCilindrada(carFormData.getCilindrada());
        carro.setMatricula(carFormData.getMatricula());
        em.persist(carro);
        
        return "/carros";
    }
    
}
