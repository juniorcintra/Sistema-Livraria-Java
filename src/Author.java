import java.time.LocalDate;

public class Author {

    //<editor-fold desc="Atributos">
    private int idAuthor;
    private String nome;
    private LocalDate dataNascimento;
    //</editor-fold>

    //<editor-fold desc="Construtor">

    public Author(int idAuthor, String nome, LocalDate dataNascimento) {
        this.idAuthor = idAuthor;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Author() {

    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters">

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //</editor-fold>

    @Override
    public String toString(){
        return "Author{" +
                "id =" + idAuthor +
                ", nome = '" +
                '\'' + ", dataNascimento = "+ dataNascimento + "}";
    }
}
