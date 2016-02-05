package br.rt.InterfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;

public class relatorio extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					relatorio frame = new relatorio();
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
	public relatorio() {
		setBounds(200, 50, 431, 636);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 415, 544);
		getContentPane().add(scrollPane);
		
		JTextArea txtrBreba = new JTextArea();
		txtrBreba.setText("breba");
		scrollPane.setViewportView(txtrBreba);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 15));
		btnCancelar.setBounds(67, 555, 106, 41);
		getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 15));
		btnSalvar.setBounds(240, 555, 106, 41);
		getContentPane().add(btnSalvar);

	}
}
