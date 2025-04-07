/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

import java.util.Scanner ;

/**
 *
 * @author Rafael
 */
        
        
class Cliente{
    private String nome;
    private String sobrenome;
    private String CPF;
    private double saldo;
    
    public Cliente(String nome, String sobrenome, String CPF){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.saldo = 0.0;
    }
    
    public void consultaSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
    
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito invalido");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$:" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor do saldo invalido");
        }
    }
}
    public class GerenciaBanco {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("informe seu nome:");
            String nome = scanner.nextLine();
            System.out.println("Informe seus sobrenome:");
            String sobrenome = scanner.nextLine();
            System.out.println("Infome seu CPF:");
            String CPF = scanner.nextLine();
            
            Cliente cliente = new Cliente(nome, sobrenome, CPF);
            
            boolean continuar = true;
            while (continuar){
                System.out.println("\n o que deseja?;");
                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Fazer Deposito");
                System.out.println("3 - Fazer Saque");
                System.out.println("4 - Encerrar Aplicativo\n\n");
                
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        cliente.consultaSaldo();
                        break;
                    case 2:
                        System.out.println("Informe o valor a ser depositado:");
                        double valorDeposito = scanner.nextDouble();
                        cliente.depositar(valorDeposito);
                        break;
                        
                    case 3:
                        System.out.println("informe o valor a ser sacado");
                        double valorSaque = scanner.nextDouble();
                        cliente.sacar(valorSaque);
                        break;
                    
                    case 4:
                        continuar = false;
                        System.out.println("Encerrado a aplicação!");
                        break;
                        
                    default:
                        System.out.println("Opção Invalida, tente novamente");
                        break;
 
           }
            
        }            
            scanner.close();
      }
        
    }
