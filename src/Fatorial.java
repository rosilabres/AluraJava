public class Fatorial {

	public static void main(String[] args) {
		
		long fatorial = 1;

		for (int i = 1; i <= 20; i++)
		{
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + ": " + fatorial);
		
		}
	}

}
