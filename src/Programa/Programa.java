package Programa;

import java.util.Scanner;

import Classes.Cliente;
import Classes.Conta;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente cliente = new Cliente("Marcus");
        Conta conta = new Conta(cliente);
   
        int opcao = -1;

        while (opcao != 0) {
            exibeMenu();
            opcao = ler.nextInt();

            switch(opcao){
                case 0:
                  System.out.println("Encerrando a aplicação");
                  return;  
                case 1:
                  sacar(ler, conta.getCliente()); 
                  break;
                case 2:
                  depositar(ler, conta.getCliente());
                  break;
                case 3:
                  exibeSaldo(conta);
                  break;
                default:
                  System.out.println("Operação inválida. Verifique");  
                    
            }


        }

        ler.close();
        
        
    }

    private static void exibeSaldo(Conta conta) {
        conta.getCliente().exibirSaldo();
    }

    private static void depositar(Scanner ler, Cliente cliente) {
        double valor;
        System.out.println("Digite o valor a depositar: ");
          valor = ler.nextDouble();
          cliente.depositar(valor);
    }

    private static void sacar(Scanner ler, Cliente cliente) {
        double valor;
        System.out.println("Digite o valor a sacar: "); 
          valor = ler.nextDouble();
          cliente.sacar(valor);
       
    }

    private static void exibeMenu() {
        System.out.println("\n*******************");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saldo");
        System.out.println("0 - Sair");
        System.out.println("\nDigite a opção desejada:");
    }
    
}
