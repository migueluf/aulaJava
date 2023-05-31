
package com.mycompany.conta;
import java.util.Scanner;

public class Conta {
   // public static String idade;

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
       // Scanner ler = new Scanner(System.in);
        CadConta c1 = new CadConta();
        
        System.out.println("Insira seu nome: ");
        c1.setNome(ler.nextLine());
        System.out.println("Insira sua agencia: ");
        c1.setAgencia(ler.nextInt());
        System.out.println("Insira sua conta: ");
        c1.setConta(ler.nextInt());
        System.out.println("Insira sua idade: ");
        c1.setIdade(ler.nextInt());
        if (c1.getIdade() < 18){
            System.out.println("Correntista menor de idade: ");
        }else{
            System.out.println("Correntista maior de idade: ");
        }
        
        
        
        System.out.println("Seu cadastro é "+c1.getNome()+"\n Agência "+c1.getAgencia()+"\n Sua conta: "+c1.getConta());
        
        
    
    }
    
}
