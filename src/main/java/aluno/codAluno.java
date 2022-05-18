package aluno;

import java.util.Scanner;
import java.util.Random;

public class codAluno {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();

        diciplina dicip = new diciplina();
        diciplina[] vetDiciplina = new diciplina[5];

        Aluno aluno = new Aluno();
        Aluno[] alunos = new Aluno[10];

        int quantDiciplinas = 0;
        int quantAlunos = 0;
        int opcao = 0;

        while (opcao != 0) ;

        do {

            System.out.println("  ");
            System.out.println("--- CADASTRO ALUNO ---");
            System.out.println("1- Inserir diciplina");//ok 
            System.out.println("2- Remover diciplina");
            System.out.println("3- Listar diciplina");
            System.out.println("4- Cadastrar aluno"); //ok
            System.out.println("5- Alterar os dados dos alunos");
            System.out.println("6- Listar os alunos");
            System.out.println("7- Matricular o aluno em diciplina");
            System.out.println("8- Listar matrículas");
            System.out.println("9- sair");

            System.out.println("--------------------");
            System.out.println("  ");
            System.out.println("Escolha uma nova opção:");
            System.out.println(" ");

            opcao = scn.nextInt();

            if (opcao == 1) {

                System.out.println("Insira o código da diciplina:");
                dicip.codDiciplina = rnd.nextInt(100);

                System.out.println("Insira o nome da diciplina:");
                dicip.nomeDiciplina = scn.next();

                System.out.println("Insira o ano:");
                dicip.ano = scn.nextInt();

                System.out.println("Insira o nome do professor:");
                dicip.professor = scn.next();

                vetDiciplina[quantDiciplinas] = dicip;
                quantDiciplinas++;

                boolean d = cadastroDic(dicip, vetDiciplina);

                if (d == true) {
                    System.out.println("Diciplina cadastrado com sucesso");
                } else {
                    System.out.println("Falha em cadastrar diciplina");
                }
            }

            if (opcao == 2) {

                //pegar a diciplina que deseja remover
                //passar todas as outras diciplinas
                //jogar null na ultima
            }

            if (opcao == 3) {

                //LISTAR DICIPLINA
                for (int i = 0; i < quantDiciplinas; i++) {
                    if (vetDiciplina[i] != null) {
                        System.out.println("-> Código da diciplina: " + vetDiciplina[i].codDiciplina);

                        System.out.println("-> Nome da diciplina: " + vetDiciplina[i].nomeDiciplina);

                        System.out.println("-> Ano:" + dicip.ano);
                        System.out.println("-> Nome do professor: " + vetDiciplina[i].professor);

                        System.out.println(" ");

                    }
                }
            }

            if (opcao == 4) {
                System.out.println("Insira o código do aluno:");
                aluno.codAluno = scn.nextInt();

                System.out.println("Insira o nome do aluno:");
                aluno.nome = scn.next();

                System.out.println("Insira o endereço do aluno:");
                aluno.endereco = scn.next();

                System.out.println("Insira as diciplinas do aluno:");
                aluno.diciplina = scn.next();

                alunos[quantAlunos] = aluno;
                quantAlunos++;

                boolean r = inserir(aluno, alunos);

                if (r == true) {
                    System.out.println("Aluno cadastrado com sucesso");
                } else {
                    System.out.println("Falha em cadastrar aluno");
                }

            }

            if (opcao == 5) {

            }

            if (opcao == 6) {

            }

            if (opcao == 7) {

                System.out.println("Matricular o aluno em diciplina");

            }

            if (opcao == 8) {

            }

        } while (opcao != 0);
    } // fim do main

    //case 1
    static boolean cadastroDic(diciplina dicip, diciplina[] vetDiciplina) {
        for (int i = 0; i < 10; i++) {
            if (vetDiciplina[i] == null) {
                vetDiciplina[i] = dicip;

                return true;
            }
        }

        return false;
    }

    //case 4
    static boolean inserir(Aluno aluno, Aluno[] alunos) {
        for (int i = 0; i < 10; i++) {
            if (alunos[i] == null) {
                alunos[i] = aluno;

                return true;
            }
        }

        return false;
    }
}
