/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import java.util.Scanner;

public class BANCO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DadosBancarios dados = new DadosBancarios();
        int op = 0;
        while(op !=6){
            System.out.println("\n---DIGITE UMA OPÇÃO---");
            System.out.println("1) depositar.");
            System.out.println("2) sacar.");
            System.out.println("3) transferir.");
            System.out.println("4) criar conta.");
            System.out.println("5) gerar relatório.");
            System.out.println("6) encerrar.");
            System.out.println("Opção: ");
            op = leia.nextInt();
            System.out.println("");
            if(op == 1){
                  double deposito;
                  System.out.println("---Digite o numero da conta que receberá o depósito:---");
                  int conta = leia.nextInt();
                  System.out.println("---Agora digite o valor a ser depositado:---");
                  deposito = leia.nextInt();
                  dados.deposito(conta, deposito);
            }
            else if(op==2){
                  double saque;
                  System.out.println("---Digite o numero da conta que receberá o saque:---");
                  int conta = leia.nextInt();
                  System.out.println("---Agora digite o valor a ser sacado:---");
                  saque = leia.nextDouble();
                  dados.saque(conta, saque);
                }
            else if(op==3){
                  double transferencia;
                  System.out.println("---Digite o numero da conta que fará a transferência:---");
                  int conta1 = leia.nextInt();
                  System.out.println("---Agora digite o numero da conta que receberá a transferência:---");
                  int conta2 = leia.nextInt();
                  System.out.println("---Agora digite o valor a ser depositado:---");
                  transferencia = leia.nextDouble();
                  dados.transferir(conta1, conta2, transferencia);
                }
            else if(op==4){
                  System.out.println("---CRIAR CONTA---");
                  System.out.println("---1)Poupança---");
                  System.out.println("---2)Corrente---");
                  int op2 = leia.nextInt();
                  if(op2 == 1){
                  System.out.println("---Digite o nome do titular da conta:---");
                  String titular = leia.next();
                  System.out.println("---Digite o cpf do titular da conta:---");
                  int cpf = leia.nextInt();
                  System.out.println("---Digite o rg do titular da conta:---");
                  int rg = leia.nextInt();
                  dados.criar(titular, cpf, rg, "pou");
                  System.out.println("Conta criada");
                  }
                  if(op2 == 2){
                  System.out.println("---Digite o nome do titular da conta:---");
                  String titular = leia.next();
                  System.out.println("---Digite o cpf do titular da conta:---");
                  int cpf = leia.nextInt();
                  System.out.println("---Digite o rg do titular da conta:---");
                  int rg = leia.nextInt();
                  System.out.println("Conta criada");
                  dados.criar(titular, cpf, rg, "corrente");
                  }
                }
            else if(op == 5){
                  System.out.println(dados.Relatorio());
            }
        }
        System.out.println("Programa finalizado.");
    }


}
