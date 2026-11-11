package Conta_Bancaria;

public class ContaBancaria {
    private double cheque;
    private double saldo;

    
    public double saldoDisponivel() {
        return cheque + saldo;
    }

    public ContaBancaria(double valorInicial) {
        saldo = valorInicial;
    
        if (valorInicial <= 500) {
            cheque = 50;
        }else {
            cheque  = (valorInicial / 2);
        }   
    }

    public double cheque(){
        return cheque;
    }
    
    public double saldo(){
        return saldo;
    }

    public void depositar(double dinheiro){
        saldo = saldo + dinheiro;  
    }

    public void sacar(double valor){
        if (valor > saldoDisponivel()) {
        } else {
            saldo = saldo - valor;
        }
    }
    public void taxaCobra(){
        if(saldo <= 0){
            double usado = -saldo;
            saldo = saldo - (usado * 0.20);
        }
    }
    public void pagarBoleto(double valorBo){
        
        if (valorBo <= saldoDisponivel()) {
            saldo = saldo - valorBo;
        }
    }

    public boolean usandoChequeEspecial() {
    return saldo < 0;
    }


}
