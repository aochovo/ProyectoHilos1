package proyectoHilos;

public class ClasePrincipal {

	public static void main(String[] args) {
		int n=EntradaSalida.pedirNumero();
		Contador c=new Contador();
		c.start();

	}

}
