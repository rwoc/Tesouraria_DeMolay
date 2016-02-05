package br.rt.InterfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Choice;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Button;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.List;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class PagamentoIG extends JInternalFrame {
	private JComboBox comboBoxMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagamentoIG frame = new PagamentoIG();
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
	public PagamentoIG() {
		setClosable(true);
		setTitle("Pagamento");
		setBounds(200, 50, 436, 356);
		getContentPane().setLayout(null);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setForeground(Color.RED);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceGrafica.telaPagamento();
			}
		});
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdicionar.setBounds(23, 253, 128, 43);
		getContentPane().add(btnAdicionar);
		
		comboBoxMes = new JComboBox();
		comboBoxMes.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBoxMes.setBounds(174, 253, 95, 43);
		comboBoxMes.addItem("Janeiro");
		comboBoxMes.addItem("Fevereiro");
		comboBoxMes.addItem("Março");
		comboBoxMes.addItem("Abril");
		comboBoxMes.addItem("Maio");
		comboBoxMes.addItem("Junho");
		comboBoxMes.addItem("Julho");
		comboBoxMes.addItem("Agosto");
		comboBoxMes.addItem("Setembro");
		comboBoxMes.addItem("Outubro");
		comboBoxMes.addItem("Novembro");
		comboBoxMes.addItem("Dezembro");
		getContentPane().add(comboBoxMes);
		
		JComboBox comboBoxAno = new JComboBox();
		comboBoxAno.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBoxAno.setBounds(292, 253, 95, 43);
		comboBoxAno.addItem("2016");
		comboBoxAno.addItem("2017");
		comboBoxAno.addItem("2018");
		comboBoxAno.addItem("2019");
		comboBoxAno.addItem("2020");

		
		getContentPane().add(comboBoxAno);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/cash-icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(61, 0, 289, 225);
		getContentPane().add(lblNewLabel);
		

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
