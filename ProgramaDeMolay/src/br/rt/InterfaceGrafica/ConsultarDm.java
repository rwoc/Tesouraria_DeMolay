package br.rt.InterfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

import br.rt.DeMolay.Membro;

import javax.swing.JRadioButton;

public class ConsultarDm extends JInternalFrame {
	private static JTextField caixaPesquisa;
	private static int tipoPesquisa;
	private JRadioButton rdbtnPesquisaId;
	private JRadioButton rdbtnPesquisaNome;
	private static final boolean EDITAVEL_CONSULTA = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarDm frame = new ConsultarDm();
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
	public ConsultarDm() {
		setClosable(true);
		setTitle("Consultar DeMolay");
		setBounds(235, 180, 387, 357);
		getContentPane().setLayout(null);
		
		JLabel lblPesquisa = new JLabel("Pesquisa:");
		lblPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPesquisa.setBounds(37, 159, 58, 14);
		getContentPane().add(lblPesquisa);
		
		caixaPesquisa = new JTextField();
		caixaPesquisa.setBounds(37, 184, 306, 20);
		getContentPane().add(caixaPesquisa);
		caixaPesquisa.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceGrafica.mostrarTela(caixaPesquisa.getText(), tipoPesquisa);
				dispose();
			}
		});
		btnConsultar.setForeground(new Color(255, 0, 0));
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConsultar.setBounds(99, 262, 170, 46);
		getContentPane().add(btnConsultar);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Search-icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(117, 11, 139, 139);
		getContentPane().add(lblNewLabel);
		
		rdbtnPesquisaId = new JRadioButton("Pesquisa ID");
		rdbtnPesquisaId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnPesquisaId.setSelected(true);
				rdbtnPesquisaNome.setSelected(false);
				tipoPesquisa = 1;
			}
		});
		rdbtnPesquisaId.setBounds(51, 211, 109, 23);
		getContentPane().add(rdbtnPesquisaId);
		
		rdbtnPesquisaNome = new JRadioButton("Pesquisa nome");
		rdbtnPesquisaNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPesquisaId.setSelected(false);
				rdbtnPesquisaNome.setSelected(true);
				tipoPesquisa = 2;
			}
		});
		rdbtnPesquisaNome.setBounds(211, 211, 128, 23);
		getContentPane().add(rdbtnPesquisaNome);

	}
	
	
	public static ResultadoPesquisa resultadoPesquisa(boolean editavel){
		Membro m = InterfaceGrafica.gerenciador.ConsultarMembro(caixaPesquisa.getText(), tipoPesquisa);
		ResultadoPesquisa resultadoPesquisa = new ResultadoPesquisa();
		resultadoPesquisa.setCaixaPesquisaConsultaDm(caixaPesquisa.getText());
		resultadoPesquisa.setTipoPesquisa(tipoPesquisa);
		
		resultadoPesquisa.getCaixaId().setText(m.getId());
		resultadoPesquisa.getCaixaId().setEditable(editavel);
		resultadoPesquisa.getCaixaNomeCompleto().setText(m.getNome());
		resultadoPesquisa.getCaixaNomeCompleto().setEditable(editavel);
		resultadoPesquisa.getCaixaDataDeNascimento().setText(m.getDataDeNascimento());
		resultadoPesquisa.getCaixaDataDeNascimento().setEditable(editavel);
		resultadoPesquisa.getCaixaNomeDaMae().setText(m.getNomeDaMae());
		resultadoPesquisa.getCaixaNomeDaMae().setEditable(editavel);
		resultadoPesquisa.getCaixaNomeDoPai().setText(m.getNomeDoPai());
		resultadoPesquisa.getCaixaNomeDoPai().setEditable(editavel);
		resultadoPesquisa.getCaixaNomeDoCapitulo().setText(m.getNomeCapitulo());
		resultadoPesquisa.getCaixaNomeDoCapitulo().setEditable(editavel);
		resultadoPesquisa.getCaixaBairro().setText(m.getBairro());
		resultadoPesquisa.getCaixaBairro().setEditable(editavel);
		resultadoPesquisa.getCaixaEndereco().setText(m.getEndereco());
		resultadoPesquisa.getCaixaEndereco().setEditable(editavel);
		resultadoPesquisa.getCaixaNumeroEndereco().setText(m.getNumeroCasa());
		resultadoPesquisa.getCaixaNumeroEndereco().setEditable(editavel);
		resultadoPesquisa.getCaixaTelefone().setText(m.getTelefone());
		resultadoPesquisa.getCaixaTelefone().setEditable(editavel);
		resultadoPesquisa.getCaixaCelular().setText(m.getCelular());
		resultadoPesquisa.getCaixaCelular().setEditable(editavel);
		resultadoPesquisa.getCaixaEmail().setText(m.getEmail());
		resultadoPesquisa.getCaixaEmail().setEditable(editavel);
		resultadoPesquisa.getCaixaCidade().setText(m.getNomeCidade());
		resultadoPesquisa.getCaixaCidade().setEditable(editavel);
		resultadoPesquisa.getCaixaApelido().setText(m.getApelido());
		resultadoPesquisa.getCaixaApelido().setEditable(editavel);
		resultadoPesquisa.getNumeroCapitulo().setToolTipText("884");
		resultadoPesquisa.getNumeroCapitulo().setEditable(editavel);
		
		if(m.getGrau() == 'D'){
			resultadoPesquisa.getButtonDeMolay().setSelected(!editavel);
		} else if(m.getGrau() == 'I'){
			resultadoPesquisa.getButtonIniciatico().setSelected(!editavel);
		} else if(m.getGrau() == 'S'){
			resultadoPesquisa.getButtonSenior().setSelected(!editavel);
		}
		resultadoPesquisa.getButtonDeMolay().setEnabled(editavel);
		resultadoPesquisa.getButtonIniciatico().setEnabled(editavel);
		resultadoPesquisa.getButtonSenior().setEnabled(editavel);
		
		return resultadoPesquisa;
		
	}
	
}
