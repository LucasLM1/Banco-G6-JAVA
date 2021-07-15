package entidades;

public class ContaPoupanca extends Contag6 {
    private final double aumento = 0.05;
    private int dianiv;
   
    

    public ContaPoupanca(int numero, String nomeCliente, int dianiv) {
       super(numero, nomeCliente);
        this.dianiv = dianiv;
    }

    public int getDianiv() {
        return dianiv;
    }

    public void setDianiv(int dianiv) {
        this.dianiv = dianiv;
    }

    public void aumento() {
        if(dianiv == 25) {
            this.saldo = ((saldo * aumento) + saldo);

            System.out.printf("Parabéns\n");
            System.out.println("Seu Saldo foi aumentado em 0.05%");
            System.out.printf("Portanto seu saldo ficou em R$%.2f",saldo);
        }
        else {
        System.out.println("Sua conta infelizmente não foi premiada com o aumento...");
        }
    }
}
    


