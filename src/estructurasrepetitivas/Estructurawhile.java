package estructurasrepetitivas;
import java.util.Scanner;
public class Estructurawhile {

	public static void main(String[] args) {
    //Estructura repetitiva preprueba
	//Estructura while
		Scanner Lector=new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		int edad=Lector.nextInt();
		
		int contador=0;
		while(edad<0) {
			System.out.println("edad incorrecta\t");
			System.out.println("Ingrese su edad: ");
			edad=Lector.nextInt();
		}
		System.out.println("fin del programa");
	}
}
