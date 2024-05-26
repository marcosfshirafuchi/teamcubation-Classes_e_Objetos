package Exercicio02;

import java.util.Scanner;
/**
 * <h1> Teamcubation - Classes_e_Objetos</h1>
 * Exercício 2: Getters e Setters
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   25/05/2024
 */
public class Exercicio02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setModelo("CRV");
        carro.imprimir();
        scanner.close();
    }
}
