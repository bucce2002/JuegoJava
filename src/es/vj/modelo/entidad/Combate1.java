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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Combate1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combate1 frame = new Combate1();
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
	public Combate1() {
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
		lblNewLabel.setBounds(0, 32, 192, 27);
		panel.add(lblNewLabel);
		
		JLabel lblJugador = new JLabel("JUGADOR 2");
		lblJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador.setBounds(236, 32, 212, 27);
		panel.add(lblJugador);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 1, 1);
		panel.add(desktopPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.DARK_GRAY);
		textPane.setBounds(184, -20, 53, 286);
		panel.add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione personaje");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 69, 192, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Seleccione personaje");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(236, 69, 212, 21);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Guerrero");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(0, 113, 182, 21);
		panel.add(btnNewButton);
		
		JButton btnCurandero = new JButton("Curandero");
		btnCurandero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCurandero.setBackground(Color.GREEN);
		btnCurandero.setBounds(0, 162, 182, 21);
		panel.add(btnCurandero);
		
		JButton btnNewButton_1_1 = new JButton("Mago");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1_1.setBackground(Color.YELLOW);
		btnNewButton_1_1.setBounds(0, 209, 182, 21);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Guerrero");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(236, 113, 212, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Curandero");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1_2.setBackground(Color.GREEN);
		btnNewButton_1_2.setBounds(236, 162, 212, 21);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Mago");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1_2_1.setBackground(Color.YELLOW);
		btnNewButton_1_2_1.setBounds(236, 209, 212, 21);
		panel.add(btnNewButton_1_2_1);
	}
}
