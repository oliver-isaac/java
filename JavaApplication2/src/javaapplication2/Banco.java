/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 023.970610
 */
public class Banco {
    public int codigo;
      public int conta;
      public int agencia;
      public String tipo;
      public double saldo;
      
    public Banco (int codigo, int conta, int agencia , String tipo, double saldo ){
        
        this.codigo = codigo;
        this.conta = conta;
        this.agencia = agencia;
        this.tipo = tipo ;
        this.saldo = saldo;
    }
    public Banco(){}
    
    public void Depositar (double valor){
        
        this.saldo += valor;
    }
    
    public double Sacar (double valor , String tipo){
        
        if(this.saldo >= valor){
            
            if(tipo.equals("corrente")){             
                this.saldo = (this.saldo - valor )-1;
               
            }else{
                
            return this.saldo -= valor;
            
        }
      
    }
    return this.saldo;
    }
    
    public boolean sacar(double valor ){
        boolean resp = false ;
        
         if(this.saldo >= valor){
            
            if(tipo.equals("corrente")){             
                this.saldo = (this.saldo - valor )-1;
               resp = true;
            }else{
                
            this.saldo -= valor;
            
            
        }
      
    }
         return resp;
    }
}