
public class Operaciones {

	public static int doble (int num) {
		int resultado;
		resultado = 2 * num;
		return resultado;
	}
	
	public static void main(String[] args) {
		int num1;
		int num2, num3 = 6;
		num1 = doble (num3);
		num2 = doble (num1);
		System.out.printf("Num1: %d, Num2: %d, Num3: %d", num1, num2, num3);
	}
}
