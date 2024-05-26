package Exercicio05;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio05 {
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

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a data de nascimento no formato (dd/mms/aaaa): ");
        String dataNascimento = scanner.nextLine();
        String dia = dataNascimento.split("/")[0];
        String mes = dataNascimento.split("/")[1];
        String ano = dataNascimento.split("/")[2];
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dia+"/"+mes+"/"+ano);
        System.out.print("Digite a profissão: ");
        String profissao = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o nome da rua: ");
        String rua = scanner.nextLine();
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();
        Endereco endereco = new Endereco(rua,numero,cidade);
        Pessoa pessoa = new Pessoa(nome,dataFormatada,profissao,telefone,endereco);
        System.out.println();
        System.out.println("Dados completo de " + nome+":");
        pessoa.exibirDetalhesPessoa();
        System.out.println();
        System.out.printf("Só endereço de %s:\n", nome);
        endereco.exibirEndereco();
        scanner.close();
    }
}
