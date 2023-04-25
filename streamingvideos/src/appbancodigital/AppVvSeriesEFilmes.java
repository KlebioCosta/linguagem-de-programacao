package appbancodigital;

import entidades.Cliente;
import entidades.ContaCliente;

import java.util.ArrayList;
import java.util.Scanner;

public class AppVvSeriesEFilmes {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<ContaCliente> novosClientes;

    public  static void main(String[] args) {
        novosClientes = new ArrayList<ContaCliente>();
        fazerCadastro();
    }

    public static void fazerCadastro() {

        System.out.println("---------------------------------------------------------");
        System.out.println("----------------Bem vindo ao VVVideos--------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("---------Selecione uma das operações a seguir------------");
        System.out.println("---------------------------------------------------------");

        System.out.println("|    Opção 1 - Criar conta      |");
        System.out.println("|    Opção 2 - Fazer Login      |");

        int fazerCadastro = sc.nextInt();

        switch (fazerCadastro) {
            case 1:
                criarConta();
                break;
            default:
                System.out.println("Opção invalida!!");
                System.out.println("Por favor digite outra opção!!");
                fazerCadastro();
                break;
        }

    }
    public static void criarConta() {

        System.out.println("-=-=Preencha todos os dados=-=-=-");
        System.out.println("\nNome Cliente: ");
        String nome = sc.next();

        System.out.println("\nData de Nascimento: ");
        int dataNascimento = sc.nextInt();

        System.out.println("\nCPF: ");
        int cPF = sc.nextInt();

        System.out.println("\nEmail: ");
        String email = sc.next();

        System.out.println("\nSenha: ");
        String senha = sc.next();

        System.out.println("\nConfirmar Senha: ");
        String confimarSenha = sc.next();

        Cliente cliente = new Cliente(nome, dataNascimento, cPF, email, senha, confimarSenha);
        ContaCliente contaCliente = new ContaCliente(cliente);

        System.out.println("Verifique seus dados: ");
        System.out.println(contaCliente);
        if(contaCliente == True) {
            novosClientes.add(contaCliente);
        }else {
            criarConta();
        }





    }
}
