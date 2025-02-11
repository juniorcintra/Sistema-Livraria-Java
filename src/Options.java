import java.util.Scanner;

public class Options {


    Livro livro = new Livro();
    Autor autor = new Autor();
    Biblioteca biblioteca = new Biblioteca();
    Emprestimo emprestimo = new Emprestimo();
    Scanner scanner = new Scanner(System.in);

    public void optionsAdm(){

        while (true){
            System.out.println("Selecione uma opção: \n" +
                    "[1] Cadastrar Livro \n" +
                    "[2] Remover Livro \n" +
                    "[3] Listar Livros \n" +
                    "[4] Listar Empréstimos \n" +
                    "[5] Listar Clientes \n" +
                    "[6] Sair");

            System.out.printf("Digite aqui: ");
            int opt = scanner.nextInt();
            scanner.nextLine();

            if(opt == 1){
                System.out.println(opt);
                biblioteca.cadastrarLivro();
            } else if (opt == 2) {
                System.out.println(opt);
                biblioteca.removerLivro();
            } else if(opt == 3){
                System.out.println(opt);
                biblioteca.listarLivros();
            } else if(opt == 4){
                System.out.println(opt);
                biblioteca.listarEmprestimos();
            } else if(opt == 5){
                System.out.println(opt);
                biblioteca.listarClientes();
            } else if(opt == 6){
                System.out.println(opt);
                break;
            }
        }
    }

    public void optionsCliente(){
        while (true){
            System.out.println("Selecione uma opção: \n" +
                    "[1] Cadastre-se \n" +
                    "[2] Listar Livros Disponíveis \n" +
                    "[3] Emprestar Livro \n" +
                    "[4] Sair");

            System.out.printf("Digite aqui: ");
            int opt = scanner.nextInt();
            scanner.nextLine();

            if(opt == 1){
                System.out.println(opt);
                biblioteca.cadastrarCliente();
            } else if (opt == 2) {
                System.out.println(opt);
                biblioteca.listarLivrosDisp();
            } else if(opt == 3){
                System.out.println(opt);
                biblioteca.realizarEmprestimo();
            } else if(opt == 4){
                System.out.println(opt);
                break;
            }
        }
    }

    public void optionsLogin(){

        while (true){
            System.out.printf("Logar como:\n [1]Cliente: \n [2]ADM: \n [3]Sair: \n Digite Aqui: ");
            int opt = scanner.nextInt();
            scanner.nextLine();

            if(opt == 1){
                optionsCliente();
            }
            else if(opt == 2){
                Adm adm = new Adm();
                System.out.printf("Digite a senha: ");
                String senhaVerificar = scanner.nextLine();

                if (senhaVerificar.equals(adm.getSenha())){
                    optionsAdm();
                }
                else {
                    System.out.println("Senha inválida!");
                }
            }
            else if (opt == 3){
                break;
            }
        }

    }
}
