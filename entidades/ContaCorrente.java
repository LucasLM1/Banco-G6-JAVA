package entidades; 

import java.util.Scanner;

public class ContaCorrente extends Contag6 {
	   public int chequesDisponiveis = 3;
       public char opcaoLetra;
       Scanner leia = new Scanner(System.in);
       
       public ContaCorrente(int numero, String nomeCliente, int chequesDisponiveis) {
           super(numero, nomeCliente);
           this.chequesDisponiveis = chequesDisponiveis;
       }
       
       /*public void menuCorrente() {
           String menuCorrente[] = {"Débito", "Crédito", "Saldo","Cheques", "Sair"};
           
           for(int x = 0; x<menuCorrente.length; x++) {
               System.out.print((x+1) + " - " + menuCorrente[x] + "\n");
           }
       }*/
       
       public void pedirCheque (int chequesPedidos) {
           if (chequesDisponiveis == 0) {
               System.out.println("Limite de cheques atingidos. ");
           } 
           else {
        	   System.out.println("Há cheques diponíveis para essa conta! ");
               System.out.println("A cada cheque a conta será debitada em 30,00 reais. ");
               System.out.println("Seu saldo atual é de "+ saldo+" reais.");
               System.out.println("Deseja solicitar cheques? ( S / N) ");
               opcaoLetra = leia.next().toUpperCase().charAt(0);
               if (opcaoLetra == 'S') {
                   if (chequesDisponiveis<=3 && saldo>=30) {
                       
                       if (chequesDisponiveis >1) {
                           System.out.println("Há "+chequesDisponiveis+" cheques disponíveis. Quantos deseja ? ");
                           chequesPedidos = leia.nextInt();
                       } 
                       else {
                           System.out.println("Há 1 cheques disponível. Deseja fazer uso ? ");
       
                       }
                       
                        if ((chequesPedidos*30.00) <= saldo) {
                            saldo -= chequesPedidos*30.00;
                            System.out.println("Parabéns pela escolha!");
                            System.out.println("Seu saldo atual é "+ saldo);
                            chequesDisponiveis -= chequesPedidos;
                        }
                        else {
                                System.out.println("Saldo insuficiente para essa quantidade de cheques. ");
                        }
                   } 
                   else {
                           System.out.println("Saldo insuficiente para essa opção.");
                   }
               }
               else {
                   
                   System.out.println("agradecemos por usar o banco G6, volte sempre!");
               }
           }        
       }  
}