
package com.mycompany.conta;
import java.util.Scanner;

public class Conta {
   public static int saldo = 1000;

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
        System.out.println("Quanto deseja sacar: ");
        c1.setSaldo(1000);
        /*c1.setIdade(ler.nextInt());
        
        if (c1.getIdade() < 18){
            System.out.println("Correntista menor de idade: ");
        }else{
            System.out.println("Correntista maior de idade: ");
        } */       
        
        
        while (c1.getSaldo()> saldo){
            System.out.println("iNSIRA OUTRO VALOR: ");
            c1.setSaldo(1000);
        }
        saldo = saldo - c1.getSaldo();
        
        
        
        System.out.println("Seu cadastro é "+c1.getNome()+"\n Agência "+c1.getAgencia()+"\n Sua conta: "+c1.getConta()+"\n Seu saldo atual é: "+saldo);
        
        
    
    }
    
}
