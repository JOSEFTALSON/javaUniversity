import java.util.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Alice");

        // Adicionar notas com nome da matéria
        aluno.adicionarNota("Matemática", 85.6);
        aluno.adicionarNota("Física", 92.0);
        aluno.adicionarNota("Química", 78.5);

        // Ordenar as matérias por nota decrescente
        List<Map.Entry<String, Double>> listaNotas = new ArrayList<>(aluno.getNotas().entrySet());
        listaNotas.sort(Map.Entry.<String, Double>comparingByValue().reversed());

        // Exibir as notas ordenadas
        System.out.println("Notas de " + aluno.getNome() + " em ordem decrescente:");
        for (Map.Entry<String, Double> entrada : listaNotas) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " pontos");
        }
    }
}
