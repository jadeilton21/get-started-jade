import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;



        do{

            System.out.println("------------- ESCOLHA UMA DAS OPÇÕES!!!!!");
            System.out.println("1 - DAR BANHO NO PET");
            System.out.println("2 - ABASTECER A MAQUINA COM AGUA");
            System.out.println("3 - ABASTECER A MAQUINA COM SHAMPOO");
            System.out.println("4 - VERIFICAR A AGUA DA MAQUINA");
            System.out.println("5 - VERIFICAR O SHAMPOO DA MAQUINA");
            System.out.println("6 - VERFICIAR SE TEM PET NO BANHO");
            System.out.println("7 - COLOCAR PET NA MAQUINA");
            System.out.println("8 - RETIRAR PET DA MAQUINA");
            System.out.println("9 - LIMPAR A MAQUINA");
            System.out.println("0 - SAIR");
            option = scanner.nextInt();

            switch (option) {
                case 7 ->
            }

        }while (option != 0);
    }

}