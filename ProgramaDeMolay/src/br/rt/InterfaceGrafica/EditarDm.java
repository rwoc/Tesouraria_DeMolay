package br.rt.InterfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import java.awt.List;
import java.awt.Choice;
import javax.swing.JMenu;
import java.awt.Checkbox;
import javax.swing.JTree;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class EditarDm extends JInternalFrame {
	private JTextField CaixaNomeCompleto;
	private JTextField caixaDataDeNascimento;
	private JTextField caixaId;
	private JTextField caixaNomeDaMae;
	private JTextField caixaNomeDoPai;
	private JTextField caixaCidade;
	private JTextField caixaBairro;
	private JTextField caixaEndereco;
	private JTextField caixaNumeroEndereco;
	private JTextField caixaTelefone;
	private JTextField caixaCelular;
	private JTextField caixaEmail;
	private JTextField txtDefensoresDoRio;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarDm frame = new CadastrarDm();
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
	public EditarDm() {
		setForeground(UIManager.getColor("Button.background"));
		setBackground(UIManager.getColor("Button.background"));
		setTitle("Cadastrar DeMolay");
		setBounds(200, 50, 431, 636);
		getContentPane().setLayout(null);
		
		CaixaNomeCompleto = new JTextField();
		CaixaNomeCompleto.setBounds(10, 36, 283, 20);
		getContentPane().add(CaixaNomeCompleto);
		CaixaNomeCompleto.setColumns(10);
		
		caixaDataDeNascimento = new JTextField();
		caixaDataDeNascimento.setBounds(10, 92, 137, 20);
		getContentPane().add(caixaDataDeNascimento);
		caixaDataDeNascimento.setColumns(10);
		
		caixaId = new JTextField();
		caixaId.setBounds(177, 92, 37, 20);
		getContentPane().add(caixaId);
		caixaId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome Completo");
		lblNome.setBounds(10, 11, 137, 14);
		getContentPane().add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Data de Nascimento");
		lblNewLabel.setBounds(10, 67, 137, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(185, 67, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNomeDaMe = new JLabel("Nome da M\u00E3e");
		lblNomeDaMe.setBounds(10, 123, 102, 14);
		getContentPane().add(lblNomeDaMe);
		
		caixaNomeDaMae = new JTextField();
		caixaNomeDaMae.setBounds(10, 148, 283, 20);
		getContentPane().add(caixaNomeDaMae);
		caixaNomeDaMae.setColumns(10);
		
		JLabel lblNomeDoPai = new JLabel("Nome do Pai");
		lblNomeDoPai.setBounds(10, 179, 102, 14);
		getContentPane().add(lblNomeDoPai);
		
		caixaNomeDoPai = new JTextField();
		caixaNomeDoPai.setBounds(10, 204, 283, 20);
		getContentPane().add(caixaNomeDoPai);
		caixaNomeDoPai.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 291, 46, 14);
		getContentPane().add(lblCidade);
		
		caixaCidade = new JTextField();
		caixaCidade.setBounds(10, 316, 137, 20);
		getContentPane().add(caixaCidade);
		caixaCidade.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(177, 291, 46, 14);
		getContentPane().add(lblBairro);
		
		caixaBairro = new JTextField();
		caixaBairro.setBounds(177, 316, 86, 20);
		getContentPane().add(caixaBairro);
		caixaBairro.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 347, 79, 14);
		getContentPane().add(lblEndereo);
		
		caixaEndereco = new JTextField();
		caixaEndereco.setBounds(10, 372, 169, 20);
		getContentPane().add(caixaEndereco);
		caixaEndereco.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setBounds(217, 347, 46, 14);
		getContentPane().add(lblNumero);
		
		caixaNumeroEndereco = new JTextField();
		caixaNumeroEndereco.setBounds(209, 372, 54, 20);
		getContentPane().add(caixaNumeroEndereco);
		caixaNumeroEndereco.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 404, 61, 14);
		getContentPane().add(lblTelefone);
		
		caixaTelefone = new JTextField();
		caixaTelefone.setBounds(10, 429, 102, 20);
		getContentPane().add(caixaTelefone);
		caixaTelefone.setColumns(10);
		
		caixaCelular = new JTextField();
		caixaCelular.setColumns(10);
		caixaCelular.setBounds(142, 429, 102, 20);
		getContentPane().add(caixaCelular);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(142, 404, 46, 14);
		getContentPane().add(lblCelular);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 460, 46, 14);
		getContentPane().add(lblEmail);
		
		caixaEmail = new JTextField();
		caixaEmail.setBounds(10, 485, 234, 20);
		getContentPane().add(caixaEmail);
		caixaEmail.setColumns(10);
		
		JLabel lblNomeDoCaptulo = new JLabel("Nome do Cap\u00EDtulo");
		lblNomeDoCaptulo.setBounds(10, 235, 102, 14);
		getContentPane().add(lblNomeDoCaptulo);
		
		txtDefensoresDoRio = new JTextField();
		txtDefensoresDoRio.setBounds(10, 260, 283, 20);
		getContentPane().add(txtDefensoresDoRio);
		txtDefensoresDoRio.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(322, 235, 46, 14);
		getContentPane().add(lblNmero);
		
		textField_1 = new JTextField();
		textField_1.setBounds(322, 260, 55, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("*");
		label_1.setBounds(300, 39, 14, 14);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setBounds(153, 95, 14, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setBounds(217, 95, 14, 14);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setBounds(300, 151, 14, 14);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setBounds(300, 207, 14, 14);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setBounds(300, 263, 14, 14);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setBounds(387, 263, 14, 14);
		getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("*");
		label_8.setBounds(153, 319, 14, 14);
		getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("*");
		label_9.setBounds(273, 319, 14, 14);
		getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("*");
		label_10.setBounds(185, 375, 14, 14);
		getContentPane().add(label_10);
		
		JRadioButton radioButton = new JRadioButton("DeMolay");
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		radioButton.setBounds(125, 512, 89, 23);
		getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Inici\u00E1tico");
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		radioButton_1.setBounds(10, 512, 79, 23);
		getContentPane().add(radioButton_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnCancelar.setForeground(new Color(255, 0, 0));
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setBounds(72, 557, 116, 39);
		getContentPane().add(btnCancelar);
		
		JButton btnSalvarAlterao = new JButton("Salvar Altera\u00E7\u00E3o");
		btnSalvarAlterao.setForeground(new Color(255, 0, 0));
		btnSalvarAlterao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvarAlterao.setBounds(217, 557, 131, 39);
		getContentPane().add(btnSalvarAlterao);

	}
}
