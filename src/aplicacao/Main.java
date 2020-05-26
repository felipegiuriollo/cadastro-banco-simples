package aplicacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conta C1;
		
		System.out.print("Digite a Conta: ");
		int conta = sc.nextInt();
		System.out.print("Digite a Agência: ");
		int agencia = sc.nextInt();
		System.out.print("DAC da conta: ");
		int dac = sc.nextInt();
		
		System.out.println("Deseja creditar a conta? S/N");
		char creditoconta = sc.next().charAt(0);
		
		if (creditoconta == 'S' || creditoconta == 's') {
			System.out.print("Digite o valor a ser creditado com a abertura da conta: ");
			double cred = sc.nextDouble();
			
			C1 = new Conta(conta,agencia,dac,cred);
		}
		
		else {
			C1 = new Conta(conta,agencia,dac);
		}
		
		System.out.println("Digite 1 para informações da conta\n"
				+ "Digite 2 para creditar a conta\n"
				+ "Digite 3 para debitar a conta");
			int dec = sc.nextInt();
		
		if(dec == 1) {
			System.out.println(C1);
		}
		else if(dec == 2) {
			System.out.print("Valor a ser creditado: ");
			double vcred = sc.nextDouble();
			C1.setSaldo(vcred);
		}
		
		else if (dec == 3){
			System.out.print("Valor a ser debitado: ");
			double vdeb = sc.nextDouble();
			C1.setSaldo(vdeb);
		}
		
			System.out.println(C1);
		
			sc.close();
	}

}
