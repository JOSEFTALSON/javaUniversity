public class Main {
    public static void main(String[] args) {
        // Criar aluno com nome "Alice"
        Aluno aluno = new Aluno("Alice");

        // Adicionar notas: Matemática, Física, Química
        aluno.adicionarNota(85); // Matemática
        aluno.adicionarNota(92); // Física
        aluno.adicionarNota(78); // Química

        // Exibir as notas
        System.out.println("Notas de " + aluno.getNome() + ":");
        System.out.println("Matemática: " + aluno.getNotas().get(0));
        System.out.println("Física: " + aluno.getNotas().get(1));
        System.out.println("Química: " + aluno.getNotas().get(2));
    }
}
