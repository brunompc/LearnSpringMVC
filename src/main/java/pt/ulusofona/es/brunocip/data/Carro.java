
package pt.ulusofona.es.brunocip.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carro implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String matricula;
    
    @Column(nullable = false)
    private Integer marca;
    
    public Carro() {}
    
    public Carro(Integer id, String matricula) {
        this.id = id;
        this.matricula = matricula;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Integer getMarac() {
        return marca;
    }
    
    public void setMarca(Integer marca) {
        this.marca = marca;
    }
}
