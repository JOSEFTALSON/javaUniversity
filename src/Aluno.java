import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Integer> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(int nota) {
        this.notas.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public List<Integer> getNotas() {
        return notas;
    }
}
