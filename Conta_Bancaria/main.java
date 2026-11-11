package Conta_Bancaria;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deposito inicial: ");
        var valorIni = sc.nextDouble();

       ContaBancaria conta = new ContaBancaria(valorIni);
     
       

        int opcao = -1;

        while (opcao != 7) {
            System.out.println("================");
            System.out.println("1) Consultar saldo: ");
            System.out.println("2) Consultar cheque: ");
            System.out.println("3) Depositar: ");
            System.out.println("4) sacar: ");
            System.out.println("5) pagar boleto: ");
            System.out.println("6) Ver cheque especial: ");
            System.out.println("7) sair: ");
            System.out.println("================");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo: " + conta.saldo());
            }
            if (opcao == 2)  {
                System.out.println("Seu cheque: " + conta.cheque()); 
            }
            if (opcao == 3) {
                System.out.println("Digite o valor correto: ");
                var valor = sc.nextDouble();
                if (valor > 0) {
                conta.depositar(valor);
                System.out.println("Seu saldo: "+ conta.saldo());
                } else {
                    System.out.println("Saldo para depositar insuficiente");
                }   
            }
            if (opcao == 4){
                System.out.println("Digite o valor para sacar: ");
                var valorsacar = sc.nextDouble();
                if (valorsacar <= conta.saldoDisponivel() && valorsacar > 0){
                conta.sacar(valorsacar);
                conta.taxaCobra();
                System.out.println("Seu saldo: "+ conta.saldo());
                } else{
                    System.out.println("Saldo insuficiente");
                }  
            }
            if (opcao == 5) {
                System.out.println("Digite a codigo do boleto: ");
                var cod = sc.nextInt();
                System.out.println("Digite o valor: ");
                var valo = sc.nextDouble();
                if (cod == 13){
                    if (valo <= conta.saldoDisponivel() && valo > 0) {
                    conta.pagarBoleto(valo);
                    conta.taxaCobra();
                    System.out.println("Seu saldo: "+ conta.saldo());
                    } else {
                        System.out.println("Falta saldo");
                    }  
                } else{
                    System.out.println("Codigo boleto errado:");
                }
            }

            if (opcao == 6) {
                if (conta.usandoChequeEspecial()) {
                    System.out.println("A conta está usando o cheque especial." );
                } else {
                    System.out.println("A  conta não está usando o cheque especial." );
                }
            }
            } else if (opcao == 7) {
                System.out.println("Encerrando...");

            } else {
                System.out.println("Opção inválida");
            }
             
        }
        sc.close();
    }
}
    



