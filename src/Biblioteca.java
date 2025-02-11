import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    //<editor-fold desc="Atributos">
    private List <Cliente> clientes = new ArrayList<>();
    private List <Livro> livros = new ArrayList<>();
    private List <Autor> autores = new ArrayList<>();
    private List <Emprestimo> emprestimos = new ArrayList<>();
    //</editor-fold>


    //<editor-fold desc="Cadastrar Livros e Autores">
    public void cadastrarLivro(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o ID do livro: ");
        int idLivro = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        LocalDate dataCadastro = LocalDate.now();
        LocalDate dataAtualizacao = LocalDate.now();
        boolean disponivel = true;


        System.out.printf("Digite o ID do autor: ");
        int idAutor = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Digite o nome do Autor: ");
        String nome = scanner.nextLine();

        System.out.printf("Digite a data de nascimento do autor: ");
        String dataNascimentoStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

        Autor autor = new Autor(idAutor, nome, dataNascimento );
        Livro livro = new Livro(idLivro, titulo, autor, disponivel, dataCadastro, dataAtualizacao);

        autores.add(autor);
        livros.add(livro);

        System.out.println(livro.getId() + livro.getTitulo() + livro.getAutor() + livro.getDataCadastro());
    }
    //</editor-fold>

    //<editor-fold desc="Remover Livros">
    public void removerLivro(){
        Scanner scanner = new Scanner(System.in);
        for(Livro livro : livros){
            System.out.println(livro.getTitulo() + livro.getId());
        }
        System.out.printf("Digite o ID do livro para ser removido: ");
        int idEscolha = scanner.nextInt();

        Livro livroRemover = null;
        for (Livro livro : livros){
            if(livro.getId() == idEscolha){
                livroRemover = livro;
                break;
            }
        }
        if(livroRemover != null){
            livros.remove(livroRemover);
            System.out.println("Livro removido com sucesso!");
        }
        else {
            System.out.println("Livro não encontrado.");
        }
    }
    //</editor-fold>

    //<editor-fold desc="Cadastrar Cliente">

    public void cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.printf("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.printf("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.printf("Digite sua data de nascimento: ");
        String nascimentoString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimentoFrmt = LocalDate.parse(nascimentoString, formatter);

        Cliente cliente = new Cliente(nome, cpf, email, nascimentoFrmt);

        clientes.add(cliente);

        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.getDataNascimento());
    }

    //</editor-fold>

    //<editor-fold desc="Listar Livros Disponíveis">
        public void listarLivrosDisp(){
            System.out.println("Livros Disponíveis: ");
            for(Livro livro: livros){
                if (livro.isDisponivel()){
                    System.out.println(livro.getTitulo() + livro.getId());
                }
            }
        }
    //</editor-fold>

    //<editor-fold desc="Listar Todos os Livros">
        public void listarLivros(){
            System.out.println("Livros Cadastrados: ");
            if(livros.isEmpty()){
                System.out.println("Nenhum livro cadastrado!");
            }else {
                for(Livro livro: livros){
                    System.out.println("Titulo: "+ livro.getTitulo());
                    System.out.println("ID: "+ livro.getId());
                    System.out.println("Autor: " + livro.getAutor());
                    System.out.println("Disponibilidade: "+ livro.disponibilidade());
                    System.out.println("Data de Cadastro: "+ livro.getDataCadastro());
                    System.out.println("Última atualização: "+ livro.getDataAtualizacao());
                }
            }
        }
    //</editor-fold>

    //<editor-fold desc="Realizar Empréstimo">
    public void realizarEmprestimo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual livro você quer emprestar? ");
        listarLivrosDisp();
        System.out.println("Digite o ID: ");
        String idLivroEmprestimo = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu email: ");
        String emailCliente = scanner.nextLine();

        LocalDate dataEmprestimo = LocalDate.now();

        System.out.println("Data de devolução: ");
        String dataDevolucaoStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDevolucao = LocalDate.parse(dataDevolucaoStr, formatter);

        Emprestimo emprestimo = new Emprestimo(idLivroEmprestimo, nomeCliente, emailCliente, dataEmprestimo, dataDevolucao );

        emprestimos.add(emprestimo);
    }
    //</editor-fold>

    //<editor-fold desc="Listar Empréstimos">
    public void listarEmprestimos(){
        if(emprestimos.isEmpty()){
            System.out.println("Nenhum empréstimo encontrado.");
        }else {
            for(Emprestimo emprestimo: emprestimos){
                System.out.println(emprestimo.getId());
                System.out.println(emprestimo.getNomeUsuario());
                System.out.println(emprestimo.getEmailCliente());
                System.out.println(emprestimo.getLivro());
                System.out.println(emprestimo.getDataEmprestimo());
                System.out.println(emprestimo.getDataDevolucao());
            }
        }
    }


    //</editor-fold>

    //<editor-fold desc="Listar Clientes">
    public void listarClientes(){
        System.out.println("Clientes Cadastrados: ");
        for (Cliente cliente: clientes){
            System.out.println(cliente.getNome() + cliente.getEmail() + cliente.getCpf());
        }
    }
    //</editor-fold>
}
