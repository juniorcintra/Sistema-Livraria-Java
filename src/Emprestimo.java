import java.time.LocalDate;

public class Emprestimo {

    //<editor-fold desc="Atributos">
    private int id;
    private static int contadorId = 1;
    private Livro livro;
    private String nomeUsuario;
    private String emailCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean ativo;
    //</editor-fold>

    //<editor-fold desc="Construtor">
    public Emprestimo(int id, Livro livro, String nomeUsuario, String emailCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao, boolean ativo) {
        this.id = id;
        this.livro = livro;
        this.nomeUsuario = nomeUsuario;
        this.emailCliente = emailCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.ativo = ativo;
    }

    public Emprestimo() {

    }

    public Emprestimo(String idLivroEmprestimo, String nomeCliente, String emailCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
    }


    //</editor-fold>

    //<editor-fold desc="Getters and Setters">


    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Emprestimo.contadorId = contadorId;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", livro=" + livro +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", emailCliente= '" + emailCliente + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", ativo=" + ativo +
                '}';
    }
}
