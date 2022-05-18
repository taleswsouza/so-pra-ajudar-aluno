package aluno;

import java.util.Scanner;
import java.util.Random;

public class CadastroAluno {

    static Scanner leituraTeclado = new Scanner(System.in);
    static Random numeroAleatorio = new Random();

    public static void main(String[] args) {

        Disciplina[] disciplinas = new Disciplina[5];
        int quantidadeDisciplinas = 0;

        Aluno[] alunos = new Aluno[10];
        int quantidadeAlunos = 0;

        while (true) {

            apresentarMenu();
            
            int opcao = leituraTeclado.nextInt();

            switch (opcao) {
                case 1:
                    quantidadeDisciplinas = cadastrarDisciplina(disciplinas, quantidadeDisciplinas);
                    break;
                case 2:
                    break;
                case 3:
                    listarDisciplinas(quantidadeDisciplinas, disciplinas);
                    break;
                case 4:
                    quantidadeAlunos = cadastrarAluno(alunos, quantidadeAlunos);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;
            }
        }
    }

    static void apresentarMenu() {
        System.out.println();
        System.out.println("--- CADASTRO ALUNO ---");
        System.out.println("1- Inserir diciplina");
        System.out.println("2- Remover diciplina");
        System.out.println("3- Listar diciplina");
        System.out.println("4- Cadastrar aluno");
        System.out.println("5- Alterar os dados dos alunos");
        System.out.println("6- Listar os alunos");
        System.out.println("7- Matricular o aluno em diciplina");
        System.out.println("8- Listar matrículas");
        System.out.println("9- sair");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Escolha uma nova opção: ");
    }

    static void listarDisciplinas(int quantidadeDiciplinas, Disciplina[] disciplinas) {
        for (int i = 0; i < quantidadeDiciplinas; i++) {
            if (disciplinas[i] != null) {
                System.out.println("-> Código da diciplina: " + disciplinas[i].codigo);
                System.out.println("-> Nome da diciplina: " + disciplinas[i].nome);
                System.out.println("-> Ano:" + disciplinas[i].ano);
                System.out.println("-> Nome do professor: " + disciplinas[i].professor);
                System.out.println();
            }
        }
    }

    static int cadastrarDisciplina(Disciplina[] disciplinas, int quantidadeDisciplinas) {
        Disciplina disciplina = new Disciplina();

//        System.out.println("Insira o código da diciplina:");
        disciplina.codigo = numeroAleatorio.nextInt(100);

        System.out.println("Insira o nome da diciplina:");
        disciplina.nome = leituraTeclado.next();

        System.out.println("Insira o ano:");
        disciplina.ano = leituraTeclado.nextInt();

        System.out.println("Insira o nome do professor:");
        disciplina.professor = leituraTeclado.next();

        disciplinas[quantidadeDisciplinas] = disciplina;
        quantidadeDisciplinas++;
        
        return quantidadeDisciplinas;
    }

    static int cadastrarAluno(Aluno[] alunos, int quantidadeAlunos) {
        Aluno aluno = new Aluno();

//        System.out.println("Insira o código do aluno: ");
        aluno.codigo = leituraTeclado.nextInt();

        System.out.println("Insira o nome do aluno: ");
        aluno.nome = leituraTeclado.next();

        System.out.println("Insira o endereço do aluno: ");
        aluno.endereco = leituraTeclado.next();

        System.out.println("Insira as diciplinas do aluno: ");
        aluno.disciplina = leituraTeclado.next();

        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
        
        return quantidadeAlunos;
    }
}
