package view;

import java.util.Random;

import controller.ThreadVet;

public class Principal {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		int[] aux = new int[5];
		Random rnd = new Random();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = rnd.nextInt(10);
				aux[j] = matriz[i][j];
			}
			
			Thread tVet = new ThreadVet(aux);
			tVet.start();

		}
	}

}
