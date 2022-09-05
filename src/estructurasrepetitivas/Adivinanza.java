package estructurasrepetitivas;
import java.util.Scanner;
public class Adivinanza {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int intento=1;
		long num=Math.round(Math.random()*10);
		System.out.println("Adivine un numero entre 0 y 10");
		int resp=lec.nextInt();
		while(num != resp) {
			System.out.println("Numero incorrecto, intentelo de nuevo");
			System.out.println("Adivine un numero entre 0 y 10");
			resp=lec.nextInt();
			intento++;
			
			if(intento==3) {
				System.out.println("No puede continuar");
				System.exit(intento);
			}
		}
System.out.println("Game Over");
System.out.println("La respuesta era: "+num);
lec.close();
	}
}
