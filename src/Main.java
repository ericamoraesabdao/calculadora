import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        int operacao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a operação desejada (1. +, 2. -, 3. *, 4. /): ");
        operacao = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite um valor: ");
        numero1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite um segundo valor: ");
        numero2 = Integer.parseInt(entrada.next());

        if (operacao == 1) {
            System.out.println("O resultado da adição é: " + (numero1 + numero2));
        }

        if (operacao == 2) {
            System.out.println("O resultado da subtração é: " + (numero1 - numero2));
        }

        if (operacao == 3) {
            System.out.println("O resultado da multiplicação é: " + (numero1 * numero2));
        }

        if (operacao == 4) {
            if (numero2 == 0) {
                System.out.println("Não podemos fazer divisão por 0");
            } else {
                System.out.println("O resultado da divisão é: " + (numero1 / numero2));
            }
        }
        else  {
            System.out.println("Operação inválida, Tente novamente!");

        }
    }
}