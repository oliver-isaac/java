/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class principal {

    public static void main(String [] args) {
          Veiculos carros = new Veiculos();
          carros.modelo = "gol";
          carros.diasalugados = 10;
          carros.valordiaria = 3;
          
          carros.exibirdetalhes();
        
    }
  
}
