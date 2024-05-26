package Exercicio02;
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
public class Carro {
    private String marca;
    private String modelo;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void imprimir(){
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo);
    }
}
