package controller;

public class ThreadVet extends Thread {

	private int total = 0;

	public ThreadVet(int[] tVet) {
		for (int somar : tVet) {
			total += somar;
		}
	}

	@Override
	public void run() {
		System.out.println("TID #" + getId() + "Soma = " + total);
	}

}
