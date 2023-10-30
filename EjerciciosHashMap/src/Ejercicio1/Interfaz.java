package Ejercicio1;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfaz {

    public JFrame frame;

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
        frame = new JFrame("Menú con Botones"); // Utiliza la variable de instancia
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton boton1 = new JButton("Opción 1");
        JButton boton2 = new JButton("Opción 2");
        JButton boton3 = new JButton("Opción 3");
        JButton boton4 = new JButton("Opción 4");

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para la opción 1
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para la opción 1
            }
        });
        
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para la opción 1
            }
        });
        
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para la opción 1
            }
        });
        
    
        
        // Implementa el ActionListener para los otros botones de manera similar

        frame.add(boton1);
        frame.add(boton2);
        frame.add(boton3);
        frame.add(boton4);

        frame.setVisible(true);
    }
}
