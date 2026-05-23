package conta;

import java.util.Scanner;
public class DadosClientes {

    Scanner input = new Scanner(System.in);
        private String name;
        private String accountType;
        private double currency;


    public void newLineSeparation(){
            System.out.println("-------------------------------------------------------------------------------------");
        }

        public void setName(){
            name = input.nextLine();
        }

        public void setAccounttType(){
             int TIPO = 0;
             while (TIPO != 1 && TIPO != 2) {
                 System.out.println("qual o seu tipo de conta?");
                 System.out.println("1-Corrente");
                 System.out.println("2-Poupança");

                 TIPO = input.nextInt();

                 switch (TIPO){
                     case 1:
                         accountType = "Corrente";
                     case 2:
                         accountType = "Poupança";

                     default:
                         if (TIPO != 1 && TIPO != 2) {
                             System.out.println("tipo inválido!");
                         }
                 }


             }




        }

    public void receive (){

        double requestedBalance = 0;

        newLineSeparation();
        System.out.println("digite o valor a ser recebido: ");
        currency += input.nextDouble();

        System.out.println("seu novo saldo é: R$" + currency);
        newLineSeparation();

    }

    private boolean transferValidation(double transferBalance){

        if (transferBalance > currency){
            newLineSeparation();
            System.out.println("não é possível transferir esse valor!");
            newLineSeparation();
            return false;

        }else {

            return true ;
        }

    }

    public void transfer(){

        double transferBalance;

        newLineSeparation();
        System.out.println(" digite o valor a ser transferido: ");
        transferBalance = input.nextDouble();

        if (transferValidation(transferBalance)){
            currency -= transferBalance;

            System.out.println("seu novo saldo é: R$" + currency);
            newLineSeparation();

        }

    }


    public double getCurrency() {
        return currency;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getName() {
        return name;
    }


    public void setCurrency(){

            currency = input.nextDouble();
        }

}



