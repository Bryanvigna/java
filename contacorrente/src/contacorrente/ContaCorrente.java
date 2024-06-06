/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contacorrente;

/**
 *
 * @author bryan
 */
public class ContaCorrente {
    public float juros = 0.01f;
    public float saldo;
    public float limiteChequeEspecial = -200;
    public String nomeCliente;
    public String sobrenomeCliente;
    private long numeroConta;

    public void deposito(float valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void saque(float valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

    public void rendimento() {
        if (saldo >= 0) {
            saldo *= (1 + juros);
            System.out.println("Rendimento aplicado. Novo saldo: R$" + saldo);
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public String getNome() {
        return nomeCliente + " " + sobrenomeCliente;
    }

    public long getNumero() {
        return numeroConta;
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.nomeCliente = "João";
        conta.sobrenomeCliente = "Silva";
        conta.numeroConta = 123456789;
        
        conta.deposito(100);
        conta.saque(125);
        conta.rendimento();
        conta.exibirSaldo();
    }
}
