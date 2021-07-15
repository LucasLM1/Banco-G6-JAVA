package bancog6;

import java.util.Random;
import java.util.Scanner;

import entidades.ContaCorrente;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;
import entidades.LogoG6;

public class BancoPrincipal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		int numero;
		String nome;
		char op;
		char cd = ' ';
		char continua;
		int w = 0;
		LogoG6 logo = new LogoG6();
		logo.mostrarLogo();
		System.out.println("\n");
		System.out.print("Sejam bem vindes ao G6 Bank! \n");
		System.out.print("O Banco a sua altura \n");
		System.out.print("O Banco com a sua ess�ncia \n");
		System.out.println("Somos o G6, venha fazer parte!\n");
		numero = random.nextInt(99999);
		System.out.printf("-----------------------------------\n");
		System.out.println("Gerando o n�mero da sua conta...");
		System.out.println("Digite o seu nome: ");
		nome = leia.next().toUpperCase();
		ContaPoupanca conta1 = new ContaPoupanca(numero, nome, 25);
		ContaCorrente conta2 = new ContaCorrente (numero,nome, 3);
		ContaEspecial conta3 = new ContaEspecial(numero, nome, 1000);
		System.out.printf("-----------------------------------\n");
		System.out.print("\r\n");
		do {
			System.out.printf("-----------------------------------\n");
			System.out.println("Cliente: "+nome+" Conta: "+numero);
			System.out.println("1 - Conta Poupan�a");
			System.out.println("2 - Conta Corrente");
			System.out.println("3 - Conta Especial");
			System.out.println("4 - Conta Empresa");
			System.out.println("5 - Conta Estudantil");
			System.out.println("6 - SAIR");
			System.out.printf("-----------------------------------\n");
			System.out.print("Digite o numero da sua op��o: ");
			op = leia.next().charAt(0);
			
			if(op == '1') {
			for(int x = 1; x<=10;x++) {
				System.out.print("\n");
				System.out.print("������������������������������� \n");
				System.out.print("Bem vinde a Conta Poupanca G6 \n");
				System.out.print("������������������������������� \n");
				System.out.println("Contagem de movimenta��es : "+x);
				System.out.println("D�bito ou Credito? [D / C]: ");
				cd = leia.next().toUpperCase() .charAt(0);
				if(cd =='D') {
					System.out.println("Digite o valor que deseja debitar: ");
					double valordeb = leia.nextInt();
					conta1.debito(valordeb);
				}else if(cd =='C') {
					System.out.println("Digite o valor que deseja creditar: ");
					int valorcred = leia.nextInt();
					x++;
					conta1.credito(valorcred);
					if(x<=1) {
						conta1.aumento();
					}
				}else {
					System.out.println("Op��o inv�lida tente novamente.");
					}
				System.out.println("Continua [S / N] ? ");
				continua = leia.next().toUpperCase() .charAt(0);
				if (continua =='N') {
					break;
					}
				}
			}
			if(op == '2') {
	                System.out.println("Conta Corrente");

	                 for (int i=0; i<10;i++) {
	                    String menuCorrente[] = {"D�bito", "Cr�dito", "Saldo","Cheques", "Voltar ao Menu", "Sair"};

	                    for(int x = 0; x<menuCorrente.length; x++) {
	                        System.out.print((x+1) + " - " + menuCorrente[x] + "\n");
	                }
	                    System.out.println("Digite uma op��o : ");
	                    op = leia.next().charAt(0);
	                    if (op== '1') {
	                        System.out.println("Digite o valor do d�bito : ");
	                        conta2.debito(leia.nextDouble());
	                    }
	                    if (op =='2') {
	                        System.out.println("Digite o valor do cr�dito : ");
	                        conta2.credito(leia.nextDouble());
	                    }
	                    if (op =='3') {
	                        System.out.println("Valor de saldo � : "+ conta2.getSaldo());
	                    }
	                    if (op == '4') {

	                        conta2.pedirCheque(2);
	                    }
	                    if (op == '5') {
	                        if (conta2.chequesDisponiveis<3) {
	                            conta2.pedirCheque(1);
	                        }
	                    if (op =='6') {
	                        if (conta2.chequesDisponiveis<3) {
	                            conta2.pedirCheque(1);
	                            break;
	                        }
	                        else {
	                            break ;
	                        }
	                    }
	                    }
	                 } System.out.println("Voc� atingiu o limite de movimenta��es da Conta Corrente.");
	                   if (conta2.chequesDisponiveis<3) {
	                       conta2.pedirCheque(1);
	                   }

	            }	
			if(op == '3') {
				System.out.print("\n");
				System.out.print("������������������������������� \n");
				System.out.print("Bem vinde a Conta Especial G6 \n");
				System.out.print("������������������������������� \n");
				for(int x = 0; x<10;x++) {
					System.out.printf("-----------------------------------\n");
					System.out.println("Contagem de movimenta��es : "+x);
					conta3.mostraSaldo();
					System.out.printf("-----------------------------------\n");
					System.out.println("D�bito ou Credito? [D / C]: ");
					cd = leia.next().toUpperCase() .charAt(0);
					if(cd =='D') {
						System.out.println("Digite o valor que deseja debitar: ");
						double valordeb = leia.nextInt();
						conta3.debito(valordeb);
					}else if(cd =='C') {
						System.out.println("Digite o valor que deseja creditar: ");
						int valorcred = leia.nextInt();
						conta3.credito(valorcred);
					}else {
						System.out.println("Op��o inv�lida tente novamente.");
						}
					System.out.println("Continua [S / N] ? ");
					continua = leia.next().toUpperCase() .charAt(0);
					if (continua =='N') {
						System.out.println("agradecemos por usar o banco G6, volte sempre!");
						break;
						}
					if(x == 10) {
						System.out.println("Voc� atingiu o limite de movimenta��es da Conta Corrente.");
					}
				}	
			}
		}while (op!=6);
	}
}
