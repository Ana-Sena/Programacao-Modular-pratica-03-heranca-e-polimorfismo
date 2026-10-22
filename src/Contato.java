public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(){

    }

    public Contato(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void setNome(String nome) {this.nome = nome;}
    public String getNome(){return nome;}

    public void setEmail(String email) {this.email = email;}
    public String getEmail(){return email;}

    public void setTelefone(String telefone) {this.telefone = telefone;}
    public String getTelefone(){return telefone;}

    public void exibeContato(){
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
    }
}
