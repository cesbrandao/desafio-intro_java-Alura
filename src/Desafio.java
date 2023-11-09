import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Carlos Eduardo Brandão";
        String tipoConta = "Corrente";
        double saldo = 1000.00;

        String menu = "** Digite sua opção **" +
                "\n 1 - Consulta saldo" +
                "\n 2 - Transferir valor" +
                "\n 3 - Receber valor" +
                "\n 4 - Sair";
        int opcao = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("========================================");

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            /*switch (opcao){
                case 1:
                    // code;
                    break;
                default:
                    // code;
                    break;
            }

            if(opcao != 1 || opcao != 2 || opcao != 3 || opcao != 4){
                System.out.println("Opção inválida!\n");
            }*/
        }
    }
}
