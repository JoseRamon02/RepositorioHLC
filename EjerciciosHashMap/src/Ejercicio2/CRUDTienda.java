package Ejercicio2;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CRUDTienda {

	static Scanner sc = new Scanner(System.in);

	public static void añadir(Map<Integer, Producto> lista, int id, String nombre, int stock, JFrame frame) {

		Producto NuevoProducto = new Producto(id, nombre, stock);
		lista.put(id, NuevoProducto);
		String message = "Producto añadido";
		JOptionPane.showMessageDialog(frame, message);
	}
	
	public static void listar(Map<Integer, Producto> lista, JFrame frame) {
		Iterator<Map.Entry<Integer, Producto>> it = lista.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, Producto> entry = it.next();
			Producto value = entry.getValue();
			String message = "Nombre del Producto: " + value.getNombre() + "\nStock: " + value.getStock();
			JOptionPane.showMessageDialog(frame, message);
		}
	}
	
	public static void vender(Map<Integer, Producto> lista, JFrame frame, int id, int cantidadAvender) {
		if (lista.containsKey(id)) {
			Producto producto = lista.get(id);
			producto.setStock(producto.getStock() - cantidadAvender);

		}

		String message = "Productos vendidos";
		JOptionPane.showMessageDialog(frame, message);
	}
	
	public static void eliminar(Map<Integer, Producto> lista, int id, JFrame frame) {
		if (lista.containsKey(id)) {
			lista.remove(id);
		}

		String message = "Producto eliminado";
		JOptionPane.showMessageDialog(frame, message);
	}
	
	
}
