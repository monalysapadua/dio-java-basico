public class ResultadoEscolarTernaria {
	public static void main(String[] args) {
		int nota = 5;

		String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
		// ele faz o mesmo serviço do if e else
		System.out.println(resultado);
	}
}