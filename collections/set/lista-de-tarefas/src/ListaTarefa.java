import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

    private Set<Tarefa> listaTarefaSet;

    public ListaTarefa(Set<Tarefa> listaTarefaSet) {
        this.listaTarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaTarefaSet.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao) {
        Tarefa removerTarefas = null;
        if (!listaTarefaSet.isEmpty()) {  
            for (Tarefa tarefa : listaTarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    removerTarefas = tarefa;
                    break;
                }
            }
            listaTarefaSet.remove(removerTarefas);              
        }
        else {
            System.out.println("O conjunto está vazio!");
        }
        if (removerTarefas == null) {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas() {
        if (!listaTarefaSet.isEmpty()) {
            System.out.println(listaTarefaSet);
        }
        else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public int contarTarefas() {
       return listaTarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : listaTarefaSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas; 
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : listaTarefaSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes; 
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : listaTarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setconcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefasPendentes = null;
        for (Tarefa tarefa : listaTarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasPendentes = tarefa;
                break;
            }
        }
        if (tarefasPendentes != null) {
            if (tarefasPendentes.isConcluida()) {
                tarefasPendentes.setconcluida(false);
            }
            else {
                System.out.println("Tarefa não encontrada na lista.");
            }
        }
    }

    public void limparListaTarefas() {
        if (listaTarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        }
        else {
            listaTarefaSet.clear();
        }
    }
}