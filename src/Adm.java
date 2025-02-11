import java.time.LocalDate;

public class Adm extends Usuario{
    public Adm(String nome, String cpf, String email, LocalDate dataNascimento) {
        super(nome, cpf, email, dataNascimento);

    }

    String senha = "Adm123";

    public Adm(String nome, String cpf, String email, LocalDate dataNascimento, String senha) {
        super(nome, cpf, email, dataNascimento);
        this.senha = senha;
    }

    public Adm() {
        super();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString(){
        return "Adm{" +
                "nome= '" + getNome() + "' " +
                ", senha= " + getSenha() + "' " +
                ", cpf= '" + getCpf() + "' " +
                ", email= '" + getEmail() + "'" +
                ", dataNascimento= '"+ getDataNascimento() + "}";
    }
}
