import java.util.Random;

public class Matriz {
public static void main(String[] args) {
	

	int NUMERO_ELEMENTOS = 4;
	int VALOR_MAXIMO = ObtencionTeclado.recogerEnteroTeclado("Dame el valor máximo: ");

	
	int[] arrayEnterosAleatorios = generarArrayEnterosAleatorios(NUMERO_ELEMENTOS, VALOR_MAXIMO);
	int[][] matriz =  new int[4][4];
	System.out.println("ELEMENTOS DEL ARRAY");
	imprimirArray(arrayEnterosAleatorios);
}

private static int[] generarArrayEnterosAleatorios(int numeroelementos, int valormax) {
	Random random = new Random();
	int[] arrayEnteros = new int[numeroelementos];
	for (int i = 0; i < arrayEnteros.length; i++) {
		arrayEnteros[i] = random.nextInt(valormax + 1);
	}
	return arrayEnteros;
}

public static int[] imprimirArray(int[] arrayEnteros) {
	for (int i = 0; i < arrayEnteros.length; i++) {
		System.out.print(arrayEnteros[i]);
	}
	return arrayEnteros;
}
}
