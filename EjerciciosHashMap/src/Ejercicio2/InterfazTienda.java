package Ejercicio2;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfazTienda {

	private JFrame frame;
	static Map<Integer, Producto> list = new HashMap<Integer, Producto>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazTienda window = new InterfazTienda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazTienda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton botonAñadir = new JButton("Añadir");
		JButton botonListar = new JButton("Listar");
		JButton botonVender = new JButton("Vender");
		JButton botonEliminar = new JButton("Eliminar");
		
		botonAñadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id;
				String nombre;
				int stock;

				try {
					id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce el ID del producto:"));
					nombre = JOptionPane.showInputDialog(frame, "Introduce el nombre del producto:");
					stock = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce el stock del producto:"));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Error: Ingresa datos válidos.");
					return;
				}

				CRUDTienda.añadir(list, id, nombre, stock, frame);
			}
		});
		
		
		botonListar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CRUDTienda.listar(list, frame);
			}
		});
		
		
		botonVender.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id;
				int cantAVender;

				try {
					id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce la ID del producto a vender:"));
					cantAVender = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce la cantidad vendida:"));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Error: Ingresa datos válidos.");
					return;
				}

				CRUDTienda.vender(list, frame, id, cantAVender);
			}
		});
		
		botonEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id;

				try {
					id = Integer.parseInt(JOptionPane.showInputDialog(frame, "Introduce la ID del producto a eliminar:"));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Error: Ingresa un ID válido.");
					return;
				}

				CRUDTienda.eliminar(list, id, frame);
			}
		});
		
		frame.add(botonAñadir);
		frame.add(botonListar);
		frame.add(botonVender);
		frame.add(botonEliminar);

		frame.setVisible(true);
		
	}

}
