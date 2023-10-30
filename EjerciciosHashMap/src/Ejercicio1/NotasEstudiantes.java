package Ejercicio1;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NotasEstudiantes {

	static Scanner sc = new Scanner(System.in);

	static Estudiante estudiante1 = new Estudiante(1, "Jose", 7.0);
	static Estudiante estudiante2 = new Estudiante(2, "Rafa", 5.0);

	static Map<Integer, Estudiante> list = new HashMap<Integer, Estudiante>();

	public void añadir(int id, String nombre, double nota, JFrame frame) {

		Estudiante estudianteNuevo = new Estudiante(id, nombre, nota);
		list.put(id, estudianteNuevo);
		String message = "Estudiante añadido";
		JOptionPane.showMessageDialog(frame, message);
	}

	public void listar(Map<Integer, Estudiante> lista, JFrame frame) {

		Iterator<Map.Entry<Integer, Estudiante>> it = lista.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, Estudiante> entry = it.next();
			Integer key = entry.getKey();
			Estudiante value = entry.getValue();
			String message = "Nombre del Alumno: " + value.getNombre() + "/nNota: " + value.getNota();
			JOptionPane.showMessageDialog(frame, message);
		}

	}

	public void corregir(Map<Integer, Estudiante> lista, JFrame frame, int id, int opcion,String NuevoNombre,double NuevaNota) {

		int idComp = Integer.parseInt(lista.get(id).getId());

		if (id == idComp) {
			switch (opcion) {
			case 1: {
				lista.get(id).setNombre(NuevoNombre);
			}
			case 2: {
				lista.get(id).setNota(NuevaNota);
			}
			
			}
		}
		String message = "Dato modificado";
		JOptionPane.showMessageDialog(frame, message);
	}

	public void eliminar(Map<Integer, Estudiante> lista,int id,JFrame frame) {
		if(lista.containsKey(id)){
            lista.remove(id);
        }
		
		String message = "Alumno eliminado";
		JOptionPane.showMessageDialog(frame, message);
	}

}
