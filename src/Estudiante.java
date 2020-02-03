
public class Estudiante {
	private String nombre;
	private String apellidos;
	private String nacimiento;
	private String dni;
	private String estudiosPrevios;
	private String telefono;
	public Estudiante(String nombre, String apellidos, String nacimiento, String dni, String estudiosPrevios,
			String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacimiento = nacimiento;
		this.dni = dni;
		this.estudiosPrevios = estudiosPrevios;
		this.telefono = telefono;
	}
	public Estudiante() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public String getDni() {
		return dni;
	}
	public String getEstudiosPrevios() {
		return estudiosPrevios;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setEstudiosPrevios(String estudiosPrevios) {
		this.estudiosPrevios = estudiosPrevios;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", nacimiento=" + nacimiento + ", dni="
				+ dni + ", estudiosPrevios=" + estudiosPrevios + ", telefono=" + telefono + "]";
	}
	
}
