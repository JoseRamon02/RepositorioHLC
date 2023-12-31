package Ejercicio1;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Interfaz {

	public JFrame frame;
	static Map<Integer, Estudiante> list = new HashMap<Integer, Estudiante>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Menú con Botones");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		JButton botonAñadir = new JButton("Añadir");
		JButton botonListar = new JButton("Listar");
		JButton botonCorregir = new JButton("Corregir");
		JButton botonEliminar = new JButton("Eliminar");

		botonAñadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id;
				String nombre;
				double nota;

				try {
					id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce el ID del estudiante:"));
					nombre = JOptionPane.showInputDialog(frame, "Introduce el nombre del estudiante:");
					nota = Double.parseDouble(JOptionPane.showInputDialog(frame, "Introduce la nota del estudiante:"));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Error: Ingresa datos válidos.");
					return;
				}

				NotasEstudiantes.añadir(list, id, nombre, nota, frame);
			}
		});

		botonListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NotasEstudiantes.listar(list, frame);
			}
		});

		botonCorregir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id;
				double nuevaNota;

				try {
					id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce la ID del alumno a corregir:"));
					nuevaNota = Double.parseDouble(JOptionPane.showInputDialog(frame, "Introduce la nueva nota:"));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Error: Ingresa datos válidos.");
					return;
				}

				NotasEstudiantes.corregir(list, frame, id, nuevaNota);
			}
		});

		botonEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id;

				try {
					id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce la ID del alumno a eliminar:"));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Error: Ingresa un ID válido.");
					return;
				}

				NotasEstudiantes.eliminar(list, id, frame);
			}
		});

		frame.add(botonAñadir);
		frame.add(botonListar);
		frame.add(botonCorregir);
		frame.add(botonEliminar);

		frame.setVisible(true);
	}
}
