public class ContatoPessoal extends Contato {
    private String dataAniversario;
    private String parentesco;

    public ContatoPessoal(String nome, String email, String telefone, String dataAniversario, String parentesco){
        super(nome, email, telefone);
        this.dataAniversario = dataAniversario;
        this.parentesco = parentesco;
    }

    public void setData(String data) {dataAniversario = data;}
    public String getData(){return dataAniversario;}

    public void setParentesco(String parentesco) {this.parentesco = parentesco;}
    public String getParentesco(){return parentesco;}

    public void exibeContatoP(){
        super.exibeContato();
        System.out.println("Data de Aniversario: " + getData());
        System.out.println("Parentesco: " + getParentesco());
    }
}
