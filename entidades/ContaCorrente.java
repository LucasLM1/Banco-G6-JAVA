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
           String menuCorrente[] = {"D�bito", "Cr�dito", "Saldo","Cheques", "Sair"};
           
           for(int x = 0; x<menuCorrente.length; x++) {
               System.out.print((x+1) + " - " + menuCorrente[x] + "\n");
           }
       }*/
       
       public void pedirCheque (int chequesPedidos) {
           if (chequesDisponiveis == 0) {
               System.out.println("Limite de cheques atingidos. ");
           } 
           else {
               System.out.println("A cada cheque a conta ser� debitada em 30,00 reais. ");
               System.out.println("Seu saldo atual � de "+ saldo+" reais.");
               System.out.println("Deseja solicitar cheques? ( S / N) ");
               opcaoLetra = leia.next().toUpperCase().charAt(0);
               if (opcaoLetra == 'S') {
                   if (chequesDisponiveis<=3 && saldo>=30) {
                       
                       if (chequesDisponiveis >1) {
                           System.out.println("H� "+chequesDisponiveis+" cheques dispon�veis. Quantos deseja ? ");
                           chequesPedidos = leia.nextInt();
                       } 
                       else {
                           System.out.println("H� 1 cheques dispon�vel. Deseja fazer uso ? ");
       
                       }
                       
                        if ((chequesPedidos*30.00) <= saldo) {
                            saldo -= chequesPedidos*30.00;
                            System.out.println("Parab�ns pela escolha!");
                            System.out.println("Seu saldo atual � "+ saldo);
                            chequesDisponiveis -= chequesPedidos;
                        }
                        else {
                                System.out.println("Saldo insuficiente para essa quantidade de cheques. ");
                        }
                   } 
                   else {
                           System.out.println("Saldo insuficiente para essa op��o.");
                   }
               }
               else {
                   
                   System.out.println("x");;
               }
           }        
       }  
}