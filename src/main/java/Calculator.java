import java.util.Scanner;

public class Calculator {
    public static int Calculator(int operacao, int numero1, int numero2) {
        if (operacao == 1) {
            System.out.println("O resultado da adição é: " + (numero1 + numero2));
            return numero1 + numero2;
        } else if (operacao == 2) {
            System.out.println("O resultado da subtração é: " + (numero1 - numero2));
            return numero1 - numero2;
        } else if (operacao == 3) {
            System.out.println("O resultado da multiplicação é: " + (numero1 * numero2));
            return numero1 * numero2;
        } else if (operacao == 4) {
            if (numero2 == 0) {
                System.out.println("Não podemos fazer divisão por 0");
                return 0;
            } else {
                System.out.println("O resultado da divisão é: " + (numero1 / numero2));
                return numero1 / numero2;
            }
        } else if (operacao == 5) {
            System.out.println("O resto da divisão é: " + (numero1 % numero2));
            return numero1 % numero2;
        } else {
            System.out.println("Operação inválida, Tente novamente!");

        } return 0;
    }
}