
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
    
    @Column(nullable = false)
    private String modelo;
    
    @Column
    private int cilindrada;
    
    public Carro() {}
    
    public Carro(Integer id, String matricula) {
        this.id = id;
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return marca + "|" + matricula  + "|" + id;
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
    
    public Integer getMarca() {
        return marca;
    }
    
    public void setMarca(Integer marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
        
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
