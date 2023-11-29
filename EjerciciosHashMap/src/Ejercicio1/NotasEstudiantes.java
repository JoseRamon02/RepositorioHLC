package Ejercicio1;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NotasEstudiantes {

	static Scanner sc = new Scanner(System.in);

	public static void añadir(Map<Integer, Estudiante> lista, int id, String nombre, double nota, JFrame frame) {

		Estudiante estudianteNuevo = new Estudiante(id, nombre, nota);
		lista.put(id, estudianteNuevo);
		String message = "Estudiante añadido";
		JOptionPane.showMessageDialog(frame, message);
	}

	public static void listar(Map<Integer, Estudiante> lista, JFrame frame) {
		Iterator<Map.Entry<Integer, Estudiante>> it = lista.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, Estudiante> entry = it.next();
			Estudiante value = entry.getValue();
			String message = "Nombre del Alumno: " + value.getNombre() + "\nNota: " + value.getNota();
			JOptionPane.showMessageDialog(frame, message);
		}
	}

	public static void corregir(Map<Integer, Estudiante> lista, JFrame frame, int id, double NuevaNota) {
		if (lista.containsKey(id)) {
			Estudiante estudiante = lista.get(id);
			estudiante.setNota(NuevaNota);

		}

		String message = "Dato modificado";
		JOptionPane.showMessageDialog(frame, message);
	}

	public static void eliminar(Map<Integer, Estudiante> lista, int id, JFrame frame) {
		if (lista.containsKey(id)) {
			lista.remove(id);
		}

		String message = "Alumno eliminado";
		JOptionPane.showMessageDialog(frame, message);
	}

}
