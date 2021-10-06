package es.vj.modelo.entidad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Combate3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combate3 frame = new Combate3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Combate3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 438, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JUGADOR 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 32, 184, 27);
		panel.add(lblNewLabel);
		
		JLabel lblJugador = new JLabel("JUGADOR 2");
		lblJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador.setBounds(236, 32, 202, 27);
		panel.add(lblJugador);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 1, 1);
		panel.add(desktopPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.DARK_GRAY);
		textPane.setBounds(184, -20, 53, 286);
		panel.add(textPane);
		
		JButton btnNewButton = new JButton("Atacar");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(0, 99, 184, 50);
		panel.add(btnNewButton);
		
		JButton btnBloquear = new JButton("Bloquear");
		btnBloquear.setBackground(Color.GREEN);
		btnBloquear.setBounds(0, 183, 184, 50);
		panel.add(btnBloquear);
		
		JButton btnNewButton_1 = new JButton("Atacar");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(236, 99, 202, 50);
		panel.add(btnNewButton_1);
		
		JButton btnBloquear_1 = new JButton("Bloquear");
		btnBloquear_1.setBackground(Color.GREEN);
		btnBloquear_1.setBounds(236, 183, 202, 50);
		panel.add(btnBloquear_1);
	}
}
