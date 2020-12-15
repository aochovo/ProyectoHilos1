package proyectoHilos;

import java.util.ArrayList;

public class Contador extends Thread{
	
	private int n;
	
	private static void contarPares(int n)
	{
		
		ArrayList<Integer> lista_pares=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int resultado=i%2;
			if (resultado==0) {
				lista_pares.add(resultado);
			}
		}
		System.out.println("Los numeros pares hasta el "+n+" son: ");
		for (Integer integer : lista_pares) {
			System.out.println(integer);
		}
	}
	@Override
	public void run() {
		contarPares(n);
	}

}
