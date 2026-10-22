public class ContatoEmergencia extends Contato {
    private int grauPrioridade;
    private String observacao;

    public ContatoEmergencia(String nome, String email, String telefone, int grau, String observacao){
        super(nome, email, telefone);
        grauPrioridade = grau;
        this.observacao = observacao;
    }

    public void setGrau(int grau) {grauPrioridade = grau;}
    public int getGrau(){return grauPrioridade;}

    public void setObservacao(String obs) {observacao = obs;}
    public String getObservacao(){return observacao;}

    public void exibeContatoE(){
        super.exibeContato();
        System.out.println("Grau de Prioridade: " + getGrau());
        System.out.println("Observacao: " + getObservacao());
    }
    
}
