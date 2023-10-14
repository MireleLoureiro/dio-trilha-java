public class Tarefa {
    
    private String descricao;
    private Boolean concluida;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean isConcluida() {
        return concluida;
    }

    public void setconcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + "]";
    }

}