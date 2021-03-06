package calculadora;

import java.util.Scanner;

public class MetodosCalculadoraArgumentos {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		// El mensaje tiene que ser operacion numero numero ...
		// Por ejemplo, '+ 7 5'
		System.out.println(seleccionarOperacion(args));
	}

	private static String seleccionarOperacion(String[] elementos) {
		String respuesta="";
		int resultado = Integer.parseInt(elementos[1]);
		boolean error = false;
		switch (elementos[0]) {
		case "+":
			for (int i = 2; i < elementos.length; ++i) {
				resultado = sumar(resultado, Integer.parseInt(elementos[i]));
			}
			break;
		case "-":
			for (int i = 2; i < elementos.length; ++i) {
				resultado = restar(resultado, Integer.parseInt(elementos[i]));
			}
			break;
		case "*":
			for (int i = 2; i < elementos.length; ++i) {
				resultado = multiplicar(resultado, Integer.parseInt(elementos[i]));
			}
			break;
		case "/":
			for (int i = 2; i < elementos.length; ++i) {
				resultado = dividir(resultado, Integer.parseInt(elementos[i]));
			}
			break;
		default:
			error = true;
			break;
		}

		if (error) {
			respuesta="Error: operación no soportada.";
		} else {
			respuesta= String.valueOf(resultado);
		}
		return respuesta;
	}

	private static int sumar(int valor1, int valor2) {
		return valor1 + valor2;
	}

	private static int restar(int valor1, int valor2) {
		return valor1 - valor2;
	}

	private static int multiplicar(int valor1, int valor2) {
		return valor1 * valor2;
	}

	private static int dividir(int valor1, int valor2) {
		return valor1 / valor2;
	}

}
