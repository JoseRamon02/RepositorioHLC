package Ejercicio2;

public class Producto {

	public int Id;
	public String Nombre;
	public int Stock;
	
	
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
	public int getStock() {
		return this.Stock;
	}
	public void setStock(int stock) {
		this.Stock = stock;
	}
	
	public Producto() {
		super();
	}
	
	public Producto(int id, String nombre, int stock) {
		super();
		this.Id = id;
		this.Nombre = nombre;
		this.Stock = stock;
	}
	
	
}
