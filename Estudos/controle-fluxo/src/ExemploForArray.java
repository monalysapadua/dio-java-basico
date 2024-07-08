public class ExemploForArray {
    public static void main(String[] args) {
        // em array, o índice incicia em 0
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS", "MONALYSA" };

        for (int x = 0; x < alunos.length; x++) {

            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);

        }

    }
}
