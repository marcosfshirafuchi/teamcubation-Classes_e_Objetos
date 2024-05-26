package Exercicio03;
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
public class Carro {
    private String marca;
    private String modelo;

    public Carro(){

    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: " + this.marca + " , Modelo: " + this.modelo);
    }
}
