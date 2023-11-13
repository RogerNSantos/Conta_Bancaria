import java.util.Scanner;

public class Conta_Bancaria {
    public static void main(String[] args) {
        String nome = "Rogério Santos";
        String tipoConta = "Corrente";
        double saldoConta = 2278.65;
        int opcao = 0;

        System.out.println("\n====================================");
        System.out.println("* * * Extrato Conta Corrente * * * *");
        System.out.println("====================================");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atualizado: " + saldoConta);

        String menu = """
                == Escolha uma opção: 
                1 - Consultar saldo: 
                2 - Fazer tranferência:
                3 - Receber:
                4 - Sair:
                                 
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

        }

    }
}
