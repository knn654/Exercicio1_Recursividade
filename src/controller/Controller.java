package controller;

public class Controller {

	public static int somaNaturais(int num) {
		// Condição de parada, se o número for menor que zero
		if (num < 0) {
			return 0;
		} else { // Chamada dos passos
			return num + somaNaturais(num - 1);
		}
	}
}
