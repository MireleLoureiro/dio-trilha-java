import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    private Set<Aluno> listaAlunoSet;

    public GerenciadorAlunos(Set<Aluno> listaAlunoSet) {
        this.listaAlunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        listaAlunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!listaAlunoSet.isEmpty()) {
            for (Aluno aluno : listaAlunoSet) {
                if (aluno.getMatricula() == matricula) {
                    alunoParaRemover = aluno;
                    break;
                }
            }
            listaAlunoSet.remove(alunoParaRemover);   
        }
        else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
        
    }
    
    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunoSet);
        if (!listaAlunoSet.isEmpty()) {
            System.out.println(alunosPorNome);
        }
        else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!listaAlunoSet.isEmpty()) {
            alunosPorNota.addAll(listaAlunoSet);
            System.out.println(alunosPorNota);
        }
        else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
