package entidades;

public class ContaEspecial extends Contag6 {
	private double limite;
	private double newsaldo;
	char op;

	public ContaEspecial(int numero, String nomeCliente, int limite) {
		super(numero, nomeCliente);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	@Override
	public void credito(double valorcred) {
		if (valorcred < 0) {
			System.out.println("Valor digitado inválido");
		}else {
			this.saldo+= valorcred;
			System.out.printf("\nCrédito realizado com sucesso!\n");
			System.out.printf("\nsaldo atualizado: R$%.2f ", saldo);
			System.out.print("\n");
		}
	}
	@Override
	public void debito(double valordeb) {
			if(valordeb > saldo + limite) {
				System.out.printf("\nNão é possível sacar %.2f", valordeb);
				System.out.print("\n");
			}else if(saldo >= valordeb) {
				saldo-=valordeb;
				System.out.printf("\nDébito realizado");
				System.out.print("\n");
			}else if(saldo == 0 && valordeb > limite) {
				System.out.printf("Não há saldo!");
				System.out.print("\n");
			}else if(saldo == 0 && valordeb < limite) {
				limite -= valordeb;
				System.out.printf("\nDébito realizado com sucesso!!!\n");
				System.out.printf("\nLimite atualizado: R$%.2f ",limite);
				System.out.println("\n");
			}else if(saldo<valordeb) {
				newsaldo = valordeb - saldo;
				limite -= newsaldo;
				saldo = 0.00;
				System.out.printf("\nDébito realizado com sucesso");
				System.out.printf("\nlimite atualizado R$%.2f ", limite);
				System.out.print("\n");
			}
	}
	public void mostraSaldo() {
		System.out.println("Seu saldo atual é: "+ saldo);
		System.out.println("Seu limite atual é: "+ limite);
	}
}