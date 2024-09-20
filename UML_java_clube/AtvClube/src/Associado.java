public class Associado {
    String nome;
    int idade;
    int dataNascimento;
    double idUsuario;

    // getter e setter nome idade nasc id
    void setNome(String nome){
        this.nome = nome;
    }
    String getNome(){
        return nome;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    int getIdade(){
        return idade;
    }
    void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    int getDataNascimento(){
        return dataNascimento;
    }
    void idUsuario(double idUsuario){
        this.idUsuario = idUsuario;
    }
}
