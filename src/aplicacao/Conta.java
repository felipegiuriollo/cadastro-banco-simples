package aplicacao;

public class Conta {

	private int agencia;
	private int conta;
	private int dac;
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(int agencia, int conta, int dac) {
		this.agencia = agencia;
		this.conta = conta;
		this.dac = dac;
	}
	
	public Conta(int agencia, int conta, int dac, double credInicial) {
		this.agencia = agencia;
		this.conta = conta;
		this.dac = dac;
		credito(credInicial);
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getDac() {
		return dac;
	}
	public void setDac(int dac) {
		this.dac = dac;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void debito(double deb) {
		this.saldo -= deb;
	}
	
	public void credito(double cred) {
		this.saldo += cred;
	}
	
	public String toString() {
		return "Agência: "
	+ this.agencia 
	+ ", Conta: " 
	+ this.conta 
	+ "-" 
	+ this.dac 
	+ ", Saldo da conta: " 
	+ this.saldo;
	}
	
	
	
}
