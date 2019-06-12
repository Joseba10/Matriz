import java.util.Random;

public class Matriz {

	private static int[][] matrizarray;
	private static int[] matrizdiagonal;

	public static void main(String[] args) {

		Matriz matriz = new Matriz();
		matriz.cargar();
		matriz.imprimirArrayMulti(matrizarray);
		matriz.ComprobarMatriz(matrizarray);
		matriz.imprimirArray(matrizdiagonal);

	}

	public static int[] imprimirArray(int[] arrayEnteros) {
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.print(arrayEnteros[i]);
		}
		return arrayEnteros;
	}

	public void cargar() {

		String mensajefilas = ObtencionTeclado.recogerStringTeclado("Cuantas fila tiene la matriz: \n");
		int filas = Integer.parseInt(mensajefilas);

		String mensajecolumnas = ObtencionTeclado.recogerStringTeclado("Cuantas columnas tiene la matriz:\n");
		System.out.println(mensajecolumnas);
		int columnas = Integer.parseInt(mensajecolumnas);
		System.out.println(columnas);
		matrizarray = new int[filas][columnas];

		for (int i = 0; i < matrizarray.length; i++) {

			for (int j = 0; j < matrizarray[i].length; j++) {

				int random = (int) (Math.random() * 9 + 1);
				matrizarray[i][j] = random;
			}
		}

	}

	public static void imprimirArrayMulti(int[][] matrizarray) {
		for (int i = 0; i < matrizarray.length; i++) {

			for (int j = 0; j < matrizarray.length; j++) {
				System.out.print(" " + matrizarray[i][j]);

			}
			System.out.println();
		}

	}

	public int[] ComprobarMatriz(int[][] matrizarray) {

		for (int i = 0; i < matrizarray.length; i++) {

			matrizdiagonal[i] = matrizarray[i][i];

		}
		return matrizdiagonal;
	}
}
