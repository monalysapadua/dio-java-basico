public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 3;

        if (nota >= 7)
            System.out.println("Parabéns! Vc está Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Cuidado, você está em Recuperação");
        else
            System.out.println("Que pena, você foi Reprovado");
    }
}
