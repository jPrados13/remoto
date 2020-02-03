import java.util.Scanner;

public class software1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del estudiante:");
		String nombre = sc.nextLine();
		System.out.println("Introduzca los apellidos:");
		String apellido = sc.nextLine();
		System.out.println("Fecha de nacimiento:");
		String fecha_nacimiento = sc.nextLine();
		System.out.println("DNI:");
		String dni = sc.nextLine();
		System.out.println("Estudios previos:");
		String estudios = sc.nextLine();
		System.out.println("telefono:");
		String telefono = sc.nextLine();
		System.out.println("Curso actual");
		String curso_actual = sc.nextLine();
		
		System.out.println("El estudiante :" + nombre +" " + apellido + " nacido el : " + fecha_nacimiento + 
							" con dni: " + dni + " estudiando " + curso_actual + " con telefono: " + telefono);
	
	
	}

}
