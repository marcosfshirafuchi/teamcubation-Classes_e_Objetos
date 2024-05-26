package Exercicio05;

/**
 * <h1> Teamcubation - Classes_e_Objetos</h1>
 * Exercício 5: Trabalhando com Múltiplas Classes
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   25/05/2024
 */
public class Endereco {
    private String rua;
    private Integer numero;
    private String cidade;

    public Endereco(String rua, Integer numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void exibirEndereco(){
        System.out.println("Endereço: " + rua + ", numero: " +numero+ ". Cidade: " + cidade);
    }


}
