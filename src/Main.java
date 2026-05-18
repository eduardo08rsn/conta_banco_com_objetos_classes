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

    cliente.getName();
    cliente.getCurrency();
    cliente.getAccounttType();

    newLineSeparation();
    System.out.println("Bem-vindo(a)" + cliente.name);
    System.out.println("seu saldo é: " + cliente.currency);
    System.out.println("sua conta é:" + cliente.accountType);
    cliente.newLineSeparation();

    while (!exitCondition) {

        System.out.println(menu);
        i = inputInt(i);

        switch (i) {
            case 1:

                newLineSeparation();
                System.out.println("seu saldo é: R$" + cliente.currency);
                newLineSeparation();

                break;
            case 2:
                cliente.currency = receive(cliente.currency);
                break;
            case 3:
                cliente.currency = transfer(cliente.currency);
                break;
            case 4:
                exitCondition = true;
            default:
                if (i < 1) {

                   newLineSeparation();
                    System.out.println("operação inválida!");
                    cliente.newLineSeparation();

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


double inputDouble (double inputVar){

    Scanner input = new Scanner(System.in);
    inputVar = input.nextDouble();
    return  inputVar;
}




int inputInt (int inputVar){

        Scanner input = new Scanner(System.in);
        inputVar = input.nextInt();
        return  inputVar;
}





double receive (double currentBalance){

    double requestedBalance = 0;

    newLineSeparation();
    System.out.println("digite o valor a ser recebido: ");
    currentBalance += inputDouble(requestedBalance);

    System.out.println("seu novo saldo é: R$" + currentBalance);
    newLineSeparation();

    return currentBalance ;
}






double transfer(double currentBalance){

    double transferBalance = 0;

    newLineSeparation();
    System.out.println(" digite o valor a ser transferido: ");
    transferBalance = inputDouble(transferBalance);

    if (transferBalance > currentBalance){
        newLineSeparation();
        System.out.println("não é possível transferir esse valor!");
        newLineSeparation();
        return currentBalance;

    }else {

        currentBalance -= transferBalance;

        System.out.println("seu novo saldo é: R$" + currentBalance);
        newLineSeparation();
        return currentBalance ;
    }


}