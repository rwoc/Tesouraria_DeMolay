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

import br.rt.DeMolay.Membro;

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
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultadoPesquisa extends JInternalFrame {
	private JTextField CaixaNomeCompleto;
	
	public JTextField getCaixaNomeCompleto() {
		return CaixaNomeCompleto;
	}

	public JTextField getCaixaDataDeNascimento() {
		return caixaDataDeNascimento;
	}

	public void setCaixaDataDeNascimento(JTextField caixaDataDeNascimento) {
		this.caixaDataDeNascimento = caixaDataDeNascimento;
	}

	public JTextField getCaixaId() {
		return caixaId;
	}

	public void setCaixaId(JTextField caixaId) {
		this.caixaId = caixaId;
	}

	public JTextField getCaixaNomeDoPai() {
		return caixaNomeDoPai;
	}

	public void setCaixaNomeDoPai(JTextField caixaNomeDoPai) {
		this.caixaNomeDoPai = caixaNomeDoPai;
	}

	public JTextField getCaixaCidade() {
		return caixaCidade;
	}

	public void setCaixaCidade(JTextField caixaCidade) {
		this.caixaCidade = caixaCidade;
	}

	public JTextField getCaixaBairro() {
		return caixaBairro;
	}

	public void setCaixaBairro(JTextField caixaBairro) {
		this.caixaBairro = caixaBairro;
	}

	public JTextField getCaixaEndereco() {
		return caixaEndereco;
	}

	public void setCaixaEndereco(JTextField caixaEndereco) {
		this.caixaEndereco = caixaEndereco;
	}

	public JTextField getCaixaNumeroEndereco() {
		return caixaNumeroEndereco;
	}

	public void setCaixaNumeroEndereco(JTextField caixaNumeroEndereco) {
		this.caixaNumeroEndereco = caixaNumeroEndereco;
	}

	public JTextField getCaixaTelefone() {
		return caixaTelefone;
	}

	public void setCaixaTelefone(JTextField caixaTelefone) {
		this.caixaTelefone = caixaTelefone;
	}

	public JTextField getCaixaCelular() {
		return caixaCelular;
	}

	public void setCaixaCelular(JTextField caixaCelular) {
		this.caixaCelular = caixaCelular;
	}

	public JTextField getCaixaEmail() {
		return caixaEmail;
	}

	public void setCaixaEmail(JTextField caixaEmail) {
		this.caixaEmail = caixaEmail;
	}

	public JTextField getCaixaNomeDoCapitulo() {
		return CaixaNomeDoCapitulo;
	}

	public void setCaixaNomeDoCapitulo(JTextField caixaNomeDoCapitulo) {
		CaixaNomeDoCapitulo = caixaNomeDoCapitulo;
	}

	public JTextField getNumeroCapitulo() {
		return numeroCapitulo;
	}

	public void setNumeroCapitulo(JTextField numeroCapitulo) {
		this.numeroCapitulo = numeroCapitulo;
	}

	public JRadioButton getButtonIniciatico() {
		return ButtonIniciatico;
	}

	public void setButtonIniciatico(JRadioButton buttonIniciatico) {
		ButtonIniciatico = buttonIniciatico;
	}

	public JRadioButton getButtonDeMolay() {
		return ButtonDeMolay;
	}

	public void setButtonDeMolay(JRadioButton buttonDeMolay) {
		ButtonDeMolay = buttonDeMolay;
	}

	public boolean isBotaoDM() {
		return botaoDM;
	}

	public void setBotaoDM(boolean botaoDM) {
		this.botaoDM = botaoDM;
	}

	public boolean isBotaoIniciatico() {
		return botaoIniciatico;
	}

	public void setBotaoIniciatico(boolean botaoIniciatico) {
		this.botaoIniciatico = botaoIniciatico;
	}

	public boolean isBotaoSenior() {
		return botaoSenior;
	}

	public void setBotaoSenior(boolean botaoSenior) {
		this.botaoSenior = botaoSenior;
	}

	public JRadioButton getButtonSenior() {
		return ButtonSenior;
	}

	public void setButtonSenior(JRadioButton buttonSenior) {
		ButtonSenior = buttonSenior;
	}

	public JTextField getCaixaApelido() {
		return caixaApelido;
	}

	public void setCaixaApelido(JTextField textField) {
		this.caixaApelido = textField;
	}

	public void setCaixaNomeCompleto(JTextField caixaNomeCompleto) {
		CaixaNomeCompleto = caixaNomeCompleto;
	}

	public JTextField getCaixaNomeDaMae() {
		return caixaNomeDaMae;
	}

	public void setCaixaNomeDaMae(JTextField caixaNomeDaMae) {
		this.caixaNomeDaMae = caixaNomeDaMae;
	}

	private JTextField caixaDataDeNascimento;
	private  JTextField caixaId;
	private JTextField caixaNomeDaMae;
	private JTextField caixaNomeDoPai;
	private JTextField caixaCidade;
	private JTextField caixaBairro;
	private JTextField caixaEndereco;
	private JTextField caixaNumeroEndereco;
	private JTextField caixaTelefone;
	private JTextField caixaCelular;
	private JTextField caixaEmail;
	private JTextField CaixaNomeDoCapitulo;
	private JTextField numeroCapitulo;
	private JRadioButton ButtonIniciatico;
	private JRadioButton ButtonDeMolay;
	private boolean botaoDM;
	private boolean botaoIniciatico;
	private boolean botaoSenior;
	private JRadioButton ButtonSenior;
	private JTextField caixaApelido;
	private String caixaPesquisaConsultaDm;
	private int tipoPesquisa;
	private JButton btnSalvar;
	private JButton btnAdicionarMensalidade;
	
	
	public String getCaixaPesquisaConsultaDm() {
		return caixaPesquisaConsultaDm;
	}

	public void setCaixaPesquisaConsultaDm(String caixaPesquisaConsultaDm) {
		this.caixaPesquisaConsultaDm = caixaPesquisaConsultaDm;
	}

	public int getTipoPesquisa() {
		return tipoPesquisa;
	}

	public void setTipoPesquisa(int tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

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
	public ResultadoPesquisa() {
		setClosable(true);
		setForeground(UIManager.getColor("Button.background"));
		setBackground(UIManager.getColor("Button.background"));
		setTitle("Consulta");
		setBounds(200, 50, 436, 640);
		getContentPane().setLayout(null);
		
		CaixaNomeCompleto = new JTextField();
		CaixaNomeCompleto.setEditable(false);
		CaixaNomeCompleto.setBounds(10, 36, 267, 20);
		getContentPane().add(CaixaNomeCompleto);
		CaixaNomeCompleto.setColumns(10);
		
		caixaDataDeNascimento = new JTextField();
		caixaDataDeNascimento.setEditable(false);
		caixaDataDeNascimento.setBounds(10, 92, 137, 20);
		getContentPane().add(caixaDataDeNascimento);
		caixaDataDeNascimento.setColumns(10);
		
		caixaId = new JTextField();
		caixaId.setEditable(false);
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
		caixaNomeDaMae.setEditable(false);
		caixaNomeDaMae.setBounds(10, 148, 283, 20);
		getContentPane().add(caixaNomeDaMae);
		caixaNomeDaMae.setColumns(10);
		
		JLabel lblNomeDoPai = new JLabel("Nome do Pai");
		lblNomeDoPai.setBounds(10, 179, 102, 14);
		getContentPane().add(lblNomeDoPai);
		
		caixaNomeDoPai = new JTextField();
		caixaNomeDoPai.setEditable(false);
		caixaNomeDoPai.setBounds(10, 204, 283, 20);
		getContentPane().add(caixaNomeDoPai);
		caixaNomeDoPai.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 291, 46, 14);
		getContentPane().add(lblCidade);
		
		caixaCidade = new JTextField();
		caixaCidade.setEditable(false);
		caixaCidade.setBounds(10, 316, 137, 20);
		getContentPane().add(caixaCidade);
		caixaCidade.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(177, 291, 46, 14);
		getContentPane().add(lblBairro);
		
		caixaBairro = new JTextField();
		caixaBairro.setEditable(false);
		caixaBairro.setBounds(177, 316, 86, 20);
		getContentPane().add(caixaBairro);
		caixaBairro.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 347, 79, 14);
		getContentPane().add(lblEndereo);
		
		caixaEndereco = new JTextField();
		caixaEndereco.setEditable(false);
		caixaEndereco.setBounds(10, 372, 169, 20);
		getContentPane().add(caixaEndereco);
		caixaEndereco.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setBounds(217, 347, 46, 14);
		getContentPane().add(lblNumero);
		
		caixaNumeroEndereco = new JTextField();
		caixaNumeroEndereco.setEditable(false);
		caixaNumeroEndereco.setBounds(209, 372, 54, 20);
		getContentPane().add(caixaNumeroEndereco);
		caixaNumeroEndereco.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 404, 61, 14);
		getContentPane().add(lblTelefone);
		
		caixaTelefone = new JTextField();
		caixaTelefone.setEditable(false);
		caixaTelefone.setBounds(10, 429, 102, 20);
		getContentPane().add(caixaTelefone);
		caixaTelefone.setColumns(10);
		
		caixaCelular = new JTextField();
		caixaCelular.setEditable(false);
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
		caixaEmail.setEditable(false);
		caixaEmail.setBounds(10, 485, 234, 20);
		getContentPane().add(caixaEmail);
		caixaEmail.setColumns(10);
		
		JLabel lblNomeDoCaptulo = new JLabel("Nome do Cap\u00EDtulo");
		lblNomeDoCaptulo.setBounds(10, 235, 102, 14);
		getContentPane().add(lblNomeDoCaptulo);
		
		CaixaNomeDoCapitulo = new JTextField();
		CaixaNomeDoCapitulo.setEditable(false);
		CaixaNomeDoCapitulo.setBounds(10, 260, 283, 20);
		getContentPane().add(CaixaNomeDoCapitulo);
		CaixaNomeDoCapitulo.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(322, 235, 46, 14);
		getContentPane().add(lblNmero);
		
		numeroCapitulo = new JTextField();
		numeroCapitulo.setEditable(false);
		numeroCapitulo.setBounds(322, 260, 55, 20);
		getContentPane().add(numeroCapitulo);
		numeroCapitulo.setColumns(10);
		
		JLabel label_1 = new JLabel("*");
		label_1.setBounds(287, 39, 14, 14);
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
		
		ButtonDeMolay = new JRadioButton("DeMolay");
		ButtonDeMolay.setEnabled(false);
		ButtonDeMolay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonDeMolay.setSelected(true);
				ButtonIniciatico.setSelected(false);
				ButtonSenior.setSelected(false);
				botaoDM = true;
				botaoIniciatico = false;
				botaoSenior = false;
			}
		});
		ButtonDeMolay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ButtonDeMolay.setBounds(123, 512, 89, 23);
		getContentPane().add(ButtonDeMolay);
		
		
		ButtonIniciatico = new JRadioButton("Inici\u00E1tico");
		ButtonIniciatico.setEnabled(false);
		ButtonIniciatico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonIniciatico.setSelected(true);
				ButtonDeMolay.setSelected(false);
				ButtonSenior.setSelected(false);
				botaoIniciatico = true;
				botaoDM = false;
				botaoSenior = false;
			}
		});
		ButtonIniciatico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ButtonIniciatico.setBounds(10, 512, 79, 23);
		getContentPane().add(ButtonIniciatico);
		
		ButtonSenior = new JRadioButton("S\u00EAnior");
		ButtonSenior.setEnabled(false);
		ButtonSenior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonSenior.setSelected(true);
				ButtonIniciatico.setSelected(false);
				ButtonDeMolay.setSelected(false);
				botaoSenior = true;
				botaoIniciatico = false;
				botaoDM = false;
			}
		});
		ButtonSenior.setBounds(246, 512, 109, 23);
		getContentPane().add(ButtonSenior);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceGrafica.mostrarTelaEditavel();
				btnSalvar.setEnabled(true);
				btnAdicionarMensalidade.setEnabled(false);

			}
		});
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEditar.setBounds(167, 556, 110, 39);
		getContentPane().add(btnEditar);
		
		JLabel lblApelido = new JLabel("Apelido");
		lblApelido.setBounds(309, 11, 59, 14);
		getContentPane().add(lblApelido);
		
		caixaApelido = new JTextField();
		caixaApelido.setEditable(false);
		caixaApelido.setBounds(311, 36, 86, 20);
		getContentPane().add(caixaApelido);
		caixaApelido.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setEnabled(false);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceGrafica.salvarAlteracao();
				InterfaceGrafica.resultadoPesquisa.setVisible(false);
				InterfaceGrafica.telaImutavel();
				btnSalvar.setEnabled(false);
				btnAdicionarMensalidade.setEnabled(true);

			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalvar.setBounds(292, 556, 110, 39);
		getContentPane().add(btnSalvar);
		
		btnAdicionarMensalidade = new JButton("Mensalidade");
		btnAdicionarMensalidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceGrafica.telaPagamento();
				
			}
		});
		btnAdicionarMensalidade.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdicionarMensalidade.setBounds(15, 556, 137, 39);
		getContentPane().add(btnAdicionarMensalidade);

	}
}
