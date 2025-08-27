import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String nome;
    private Map<String, Double> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new HashMap<>();
    }

    public void adicionarNota(String materia, Double nota) {
        this.notas.put(materia, nota);
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Double> getNotas() {
        return notas;
    }
}
