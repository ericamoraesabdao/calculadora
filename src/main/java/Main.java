import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a operação desejada (1. +, 2. -, 3. *, 4. /, 5. resto): ");
        int operacao = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite um valor: ");
        int numero1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite um segundo valor: ");
        int numero2 = Integer.parseInt(entrada.next());

        Calculator.Calculator(operacao, numero1, numero2);
    }
}