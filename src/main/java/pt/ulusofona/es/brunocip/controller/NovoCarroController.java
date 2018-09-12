package pt.ulusofona.es.brunocip.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pt.ulusofona.es.brunocip.form.Carro;

@Controller
public class NovoCarroController {
    
    ArrayList<String> marcas;

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
        model.put("novoCarro", new Carro());
        return "novoCarro";
    }
    
    @RequestMapping(value="/novoCarro", method = RequestMethod.POST)
    public String submitForm(@Valid @ModelAttribute("novoCarro") Carro novoCarro,
                             BindingResult bindingResult,
                             ModelMap model) {
        
        System.out.println("#1 - Carro: " + novoCarro);
        System.out.println("Modelo: " + novoCarro.getModelo());
        System.out.println("Matricula: " + novoCarro.getMatricula());
        System.out.println("Preco Compra: " + novoCarro.getPrecoCompra());
        System.out.println("Preco Venda: " + novoCarro.getPrecoMinimoVenda());
        
        System.out.println("#2 - hasErrors:" + bindingResult.hasErrors());

        if(bindingResult.hasErrors()) {
            inicializarMarcas();
            System.out.println("Nr Erros: " + bindingResult.getAllErrors().size());
            model.put("marcas", marcas);
            return "novoCarro";
        }
        
        return "carros";
    }
    
}
