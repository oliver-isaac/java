/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 023.970610
 */
public class JavaApplication2 {


    public static void main() {
        Banco brasil = new Banco();
        brasil.codigo = 1;
        brasil.conta = 1010;
        brasil.agencia = 55410;
        brasil.tipo = "corrente";
        brasil.saldo = 0;
        
        brasil.Depositar( 5000);
        brasil.Sacar(1000, brasil.tipo);
        System.out.println("novo saldo: " + brasil.saldo);
        
        if(brasil.sacar(200)){
            System.out.println("Saque realizado com sucesso: "
                    +brasil.saldo);
        }else{
            System.out.println("Erro ao tentar sacar");
        }
    }
    
}
