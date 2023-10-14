import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        }
        else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String pesquisa = dicionarioMap.get(palavra);
        if (pesquisa != null) {
            return pesquisa;
        }
        else {
            return "Linguagem não encontrada no dicionário.";
        }
    }
}
