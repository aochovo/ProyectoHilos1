package proyectoHilos;

import java.util.Scanner;

public class EntradaSalida {
	public static int pedirNumero()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Hasta que numero quiere?");
		int id=sc.nextInt();
		return id;
	}
}
