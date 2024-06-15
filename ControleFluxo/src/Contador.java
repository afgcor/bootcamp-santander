import java.util.Scanner;
import java.lang.Exception;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o primeiro número inteiro: ");
        String entrada = scan.nextLine();
        int num1 = Integer.parseInt(entrada);
        System.out.print("Insira o segundo número inteiro: ");
        entrada = scan.nextLine();
        int num2 = Integer.parseInt(entrada);

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        scan.close();
    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor do que o segundo!");
        } else {
            int contagem = num2 - num1;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        }
    }
}
