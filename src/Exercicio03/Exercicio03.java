package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    /**
     * <h1> Teamcubation - Classes_e_Objetos</h1>
     * Exercício 3: Usando Construtores
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   25/05/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        Carro carro = new Carro(marca,modelo);
        carro.exibirDetalhes();
        scanner.close();
    }
}
