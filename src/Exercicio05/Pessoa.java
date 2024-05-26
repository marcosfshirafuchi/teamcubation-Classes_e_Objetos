package Exercicio05;
import java.text.SimpleDateFormat;
import java.util.Date;
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

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private String profissao;
    private String telefone;
    private Endereco endereco;

    public Pessoa(String nome, Date dataNascimento, String profissao, String telefone, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void exibirDetalhesPessoa(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(
        "Nome: " + getNome() +
                "\nData Mascimento: "+ formato.format(getDataNascimento()) +
                "\nProfissão: " + getProfissao() +
                "\nTelefone: " + getTelefone() +
                "\nEndereço: " + endereco.getRua() + ", Numero: " + endereco.getNumero() + ". Cidade: " + endereco.getCidade());

    }
    

}
