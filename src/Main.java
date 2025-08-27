import java.util.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Alice");

        aluno.adicionarNota("Matemática", 85.6);
        aluno.adicionarNota("Física", 92.0);
        aluno.adicionarNota("Química", 78.5);

        Map<String, Double> notas = aluno.getNotas();
        double soma = 0.0;
        double maxNota = Double.MIN_VALUE;
        double minNota = Double.MAX_VALUE;
        String materiaMax = "", materiaMin = "";

        for (Map.Entry<String, Double> entrada : notas.entrySet()) {
            double nota = entrada.getValue();
            soma += nota;

            if (nota > maxNota) {
                maxNota = nota;
                materiaMax = entrada.getKey();
            }

            if (nota < minNota) {
                minNota = nota;
                materiaMin = entrada.getKey();
            }
        }

        double media = soma / notas.size();
        String status = media >= 70.0 ? "Aprovado" : "Reprovado";

        // Ordenar notas decrescentemente
        List<Map.Entry<String, Double>> listaNotas = new ArrayList<>(notas.entrySet());
        listaNotas.sort(Map.Entry.<String, Double>comparingByValue().reversed());

        System.out.println("Notas de " + aluno.getNome() + " em ordem decrescente:");
        for (Map.Entry<String, Double> entrada : listaNotas) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " pontos");
        }

        System.out.println("\nMédia: " + media);
        System.out.println("Status: " + status);
        System.out.println("Nota mais alta: " + materiaMax + " (" + maxNota + ")");
        System.out.println("Nota mais baixa: " + materiaMin + " (" + minNota + ")");
    }
}
