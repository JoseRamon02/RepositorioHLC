package Ejercicio1;

public class Estudiante {

	public int Id;
	public String Nombre;
	public double Nota;
	
	public String getId() {
		return this.Nombre;
	}
	public void setId(int id) {
		this.Id = id;
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public double getNota() {
		return this.Nota;
	}
	public void setNota(double nota) {
		this.Nota = nota;
	}
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(int id, String nombre, double nota) {
		super();
		this.Id = id;
		this.Nombre = nombre;
		this.Nota = nota;
	}
	
	
	
}
