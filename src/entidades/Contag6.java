package entidades;

public abstract class Contag6 {
	
	//atributos
	 private int numero;
	 private String nomeCliente;
	 protected double saldo;
	 //constructor
	public Contag6(int numero, String nomeCliente) {
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//metodos
	public void credito(double valorcred) {
		if (valorcred < 0) {
			System.out.println("Valor digitado inválido");
		}else {
			this.saldo+= valorcred;
			System.out.printf("\nCrédito realizado com sucesso, saldo atualizado R$%.2f ", saldo);
			System.out.print("\n");
		}
	}
	public void debito(double valordeb) {
		 if(valordeb <= 0) {
             System.out.println("Não é possível realizar o débito");
         }
         else if(valordeb > saldo) {
             System.out.println("Valor de saldo indisponível, realize um crédito");
         }else {
             this.saldo -= valordeb;
             System.out.println("Valor de saldo atualizado é : "+saldo);
         }
	}
}
