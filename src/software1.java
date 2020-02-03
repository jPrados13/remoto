import java.util.ArrayList;
import java.util.Scanner;

public class software1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> datos = new ArrayList<String>();
		
		System.out.println("Introduzca el nombre del estudiante:");
		datos.add(sc.nextLine());
		System.out.println("Introduzca los apellidos:");
		datos.add(sc.nextLine());
		System.out.println("Fecha de nacimiento:");
		datos.add(sc.nextLine());
		System.out.println("DNI:");
		datos.add(sc.nextLine());
		System.out.println("Estudios previos:");
		datos.add(sc.nextLine());
		System.out.println("telefono:");
		datos.add(sc.nextLine());
		System.out.println("Curso actual");
		datos.add(sc.nextLine());
		
		System.out.println("El estudiante :" + datos.get(0) +" " + datos.get(1) + " nacido el : " + datos.get(2) + 
							" con dni: " + datos.get(3) + " estudiando " + datos.get(6) + " con telefono: " + datos.get(5));
	
	
	}

}
