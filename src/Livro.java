import java.time.LocalDate;
import java.util.Scanner;

public class Livro {

    //<editor-fold desc="Atributos">
    private int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;
    Scanner scanner = new Scanner(System.in);
    //</editor-fold>



    //<editor-fold desc="Construtor">

    public Livro(int id, String titulo, Autor autor, boolean disponivel, LocalDate dataCadastro, LocalDate dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;

    }

    public Livro() {

    }

    //</editor-fold>

    //<editor-fold desc="Getters and Settters">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String disponibilidade(){
        return disponivel ? "Disponível" : "Indisponível";
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    //</editor-fold>

    @Override
    public String toString(){
        return "Livro{" +
                "id= " + id +
                ", titulo= '" + titulo + "'" +
                ", Autor= " + autor +
                ", disponivel= "+ disponivel +
                ", dataCadastro= "+ dataCadastro +
                ", dataAtualizacao= "+ dataAtualizacao + "}";
    }

}
