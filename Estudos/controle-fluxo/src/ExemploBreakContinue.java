/*// class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)// ele vai parar quando chegar no 3
			break;
		
		System.out.println(numero);
		
	}
	Qual a saída no console ?

    }
} */
public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;// ele entra no continue, mas não imprime

            System.out.println(numero);

        }
        // Qual a saída no console ?

    }
}
