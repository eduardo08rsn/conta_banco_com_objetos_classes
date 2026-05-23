    import conta.DadosClientes;

    import java.util.Scanner;
    void main() {

        DadosClientes cliente = new DadosClientes();
        boolean exitCondition = false;
        int i = 0;
        String menu = """
                operações
                
                1- consultar saldo
                2- receber valor
                3- transferir valor
                4- sair""";
        System.out.println("informe o seu nome: ");
        cliente.setName();
        System.out.println("digite o seu saldo atual: ");
        cliente.setCurrency();

        cliente.setAccounttType();

        newLineSeparation();
        System.out.println("Bem-vindo(a)" + cliente.getName());
        System.out.println("seu saldo é: " + cliente.getCurrency());
        System.out.println("sua conta é:" + cliente.getAccountType());
        cliente.newLineSeparation();

        while (!exitCondition) {

            System.out.println(menu);
            i = inputInt();

            switch (i) {
                case 1:

                    newLineSeparation();
                    System.out.println("seu saldo é: R$" + cliente.getCurrency());
                    newLineSeparation();

                    break;
                case 2:
                    cliente.receive();
                    break;
                case 3:
                     cliente.transfer();
                    break;
                case 4:
                    exitCondition = true;
                default:
                    if (i < 1) {

                       newLineSeparation();
                        System.out.println("operação inválida!");
                        newLineSeparation();

                    } else if (i > 4) {

                        newLineSeparation();
                        System.out.println("operação inválida!");
                        newLineSeparation();

                    }

                    break;
            }


        }
    }



    void newLineSeparation(){
        System.out.println("-----------------------------------------------------------------------------");
    }

    String inputString (){

        String inputVar;
        Scanner input = new Scanner(System.in);
        inputVar = input.nextLine();
        return  inputVar;
    }

    double inputDouble (){

        double inputVar;
        Scanner input = new Scanner(System.in);
        inputVar = input.nextDouble();
        return  inputVar;
    }




    int inputInt (){
        int inputVar;
            Scanner input = new Scanner(System.in);
            inputVar = input.nextInt();
            return  inputVar;
    }











