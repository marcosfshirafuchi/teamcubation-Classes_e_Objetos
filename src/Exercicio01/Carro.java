package Exercicio01;
/**
 * <h1> Teamcubation - Classes_e_Objetos</h1>
 * Exercício 1: Definição de Classe
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   25/05/2024
 */
public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;

    public void imprimir(){
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + " e Ano: " + this.ano);
    }

}
