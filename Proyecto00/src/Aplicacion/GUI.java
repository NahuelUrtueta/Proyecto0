package Aplicacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GUI {

	private JFrame frame;
	private JTextField Excelente;
	private JLabel panelImagen;
	private JButton botonImagen ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 601, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		OyenteBoton oye=new OyenteBoton();
		
		
		botonImagen = new JButton("Presione");
		botonImagen.setFont(new Font("Tahoma", Font.PLAIN, 19));
		botonImagen.setForeground(Color.BLACK);
		botonImagen.setBackground(Color.WHITE);
		botonImagen.setBounds(0, 0, 259, 91);
		botonImagen.addActionListener(oye);
		frame.getContentPane().add(botonImagen);
		
		Excelente = new JTextField();
		Excelente.setHorizontalAlignment(SwingConstants.CENTER);
		Excelente.setEditable(false);
		Excelente.setBackground(new Color(255, 255, 255));
		Excelente.setBounds(33, 180, 193, 71);
		frame.getContentPane().add(Excelente);
		Excelente.setColumns(10);
		
		panelImagen = new JLabel("");
		panelImagen.setBounds(268, 38, 317, 397);
		frame.getContentPane().add(panelImagen);
	}
	
	 class OyenteBoton implements ActionListener{
	        public void actionPerformed(ActionEvent event){
	        	Excelente.setText("Excelente");            
	        	ImageIcon imagen = new ImageIcon(getClass().getResource("imagenes/mr_burns.png"));
	        	panelImagen.setIcon(imagen);
	        }
	    }
}
