
public class Programa {

	public static void main (String[] args)
	{
		int idade = 19;
		int idoso = 50;
		boolean amigoDoDono = true;
		
		if (idoso > 60)
		{
			System.out.println("Aproveite melhor idade");
		} else if (idade > 18 && !amigoDoDono) {
		    System.out.println("Pode entrar");
		}
		else {
		    System.out.println("Não pode entrar");
		}
	}
}
