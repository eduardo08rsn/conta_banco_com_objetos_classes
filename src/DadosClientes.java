import java.util.Scanner;
public class DadosClientes {

    Scanner input = new Scanner(System.in);
        String name;
        String accountType;
        double currency;

         void newLineSeparation(){
            System.out.println("-------------------------------------------------------------------------------------");
        }

        void getName(){
            System.out.println("informe o seu nome: ");
            name = input.nextLine();
        }

        void getAccounttType(){
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

        void getCurrency(){
            System.out.println("digite o seu saldo atual: ");
            currency = input.nextDouble();
        }

}



