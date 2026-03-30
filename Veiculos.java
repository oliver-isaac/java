/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Cliente
 */
public class Veiculos {
    public String modelo;
    public double valordiaria;
    public int diasalugados;
    
    public Veiculos(String modelo , double valordiaria , int diasalugados){
  
        this.modelo = modelo;
        this.valordiaria = valordiaria;
        this.diasalugados = diasalugados;
    }
    
    public Veiculos(){}
    
    public double calculartotal(){
        
        return this.valordiaria * this.diasalugados;
    }
    
    public void exibirdetalhes(){
        
        System.out.println("modelo: "
        +this.modelo);
        System.out.println("valor da diaria: "
        +this.valordiaria);
        System.out.println("dias alugados: "
        +this.diasalugados);
        
    }
}
