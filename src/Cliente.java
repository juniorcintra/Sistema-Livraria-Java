import java.time.LocalDate;

public class Cliente extends Usuario{
    public Cliente(String nome, String cpf, String email, LocalDate dataNascimento) {
        super(nome, cpf, email, dataNascimento);

    }

    @Override
    public String toString(){
        return "Cliente{" +
                "nome= '" + getNome() + "' " +
                ", cpf= '" + getCpf() + "' " +
                ", email= '" + getEmail() + "'" +
                ", dataNascimento= '"+ getDataNascimento() + "}";
    }
}
