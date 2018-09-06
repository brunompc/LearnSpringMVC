/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ulusofona.es.brunocip.form;

/**
 *
 * @author user
 */
public class Carro {
    
    private static int counter = 0;
    private int id;
    
    private String marca;
    private String modelo;
    private String matricula;
    private int cilindrada;
    
    private int precoCompra;
    private int precoVendaMinimoLucro;
    
    public Carro(String marca, String matricula, int cilindrada) {
        this.marca = marca;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        id = counter;
        counter++;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }
    
    public int getId() {
        return id;
    }
    
}
