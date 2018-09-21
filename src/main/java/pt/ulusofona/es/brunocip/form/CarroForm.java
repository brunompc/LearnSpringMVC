
package pt.ulusofona.es.brunocip.form;

import org.hibernate.validator.constraints.NotEmpty;

public class Carro {
    
    private static int counter = 0;
    private int id;
    
    @NotEmpty(message="A marca tem de estar preenchida.")
    private String marca;
    
    @NotEmpty(message="O modelo tem de estar preenchido.")
    private String modelo;
    
    private String matricula;
    private int cilindrada;
    
    private int precoCompra;
    private int precoMinimoVenda;
    
    public Carro() {}
    
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Carro(String marca, String modelo, String matricula, int cilindrada) {
        this.marca = marca;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        id = counter;
        counter++;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public int getId() {
        return id;
    }
    
    public int getPrecoCompra() {
        return precoCompra;
    }
    
    public void setPrecoCompra(int precoCompra) {
        this.precoCompra = precoCompra;
    }
    
    public int getPrecoMinimoVenda() {
        return precoMinimoVenda;
    }
    
    public void setPrecoMinimoVenda(int precoMinimoVenda) {
        this.precoMinimoVenda = precoMinimoVenda;
    }
    
}
