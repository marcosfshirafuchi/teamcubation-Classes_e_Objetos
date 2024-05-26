package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    /**
     * <h1> Teamcubation - Classes_e_Objetos</h1>
     * Exercício 4: Criando Métodos com Parâmetros
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   25/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        int resultado = calculadora.somar(numero1,numero2);
        System.out.printf("O resultado da soma: %d + %d = %d ",numero1,numero2,resultado);
        scanner.close();
    }
}
