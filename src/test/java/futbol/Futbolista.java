package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		setNombre(nombre);
		setEdad(edad);
		this.posicion=posicion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+".";
	}
	
	public boolean equals(Futbolista f) {
		return this.equals(f);
	}
	
	public abstract boolean jugarConLasManos();
	
}
