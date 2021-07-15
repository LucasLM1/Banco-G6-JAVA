package entidades;

	public class ContaEmpresa extends Contag6 {
		private double emprestimo;

		public ContaEmpresa(int numero, String nomeCliente, double emprestimo) {
	        super(numero, nomeCliente);
			this.emprestimo = emprestimo;
			
		}
		
		public double getEmprestimo() {
			return emprestimo;
		}

		public void inicioEmpresa() {
			System.out.println("Bem vinde sua Conta Empresa!");
			System.out.println("Limite de empr�stimo dispon�vel: R$ 10.000");
			System.out.println("Saldo Atual: "+saldo);
			System.out.println("Saldo Emprestimo: "+emprestimo);
		}
		
		public double emprestimo(double valorEmprestimo){
			emprestimo=10000.00;
			if(valorEmprestimo <= 0 ) {
				System.out.println("Valor invalido\n");
			}
			else if (valorEmprestimo>emprestimo) {
				System.out.printf("Saldo insulficiente. Voc� ainda possui R$ %d de limite de emprestimo dispon�vel",emprestimo);
			} else if(valorEmprestimo <= emprestimo){
				this.emprestimo = this.emprestimo - valorEmprestimo;
				super.saldo = super.saldo + valorEmprestimo;
				System.out.println("Emprestimo conclu�do com sucesso");
			}
			return emprestimo;
		}
	}
