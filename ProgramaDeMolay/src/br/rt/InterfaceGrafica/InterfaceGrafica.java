package br.rt.InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.rt.DeMolay.Gerenciador;
import br.rt.DeMolay.Membro;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class InterfaceGrafica extends JFrame {

	private JPanel contentPane;
	private JMenu mnMenu;
	private static JDesktopPane desktopPane;
	private JLabel lblSaldo;
	private String saldo;
	public static Gerenciador gerenciador;
	public static ResultadoPesquisa resultadoPesquisa;
	private static final boolean editavel =  true;

	public static Membro m;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica frame = new InterfaceGrafica();
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
	public InterfaceGrafica() {
		gerenciador = new Gerenciador();
		resultadoPesquisa = new ResultadoPesquisa();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 800, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		

		
		JMenuItem mntmCadastrarDm = new JMenuItem("Cadastrar DM");
		mntmCadastrarDm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarDm objCadastrar = new CadastrarDm();
				desktopPane.add(objCadastrar);
				objCadastrar.setVisible(true);
			}
		});
		mnMenu.add(mntmCadastrarDm);
		
		
		JMenuItem mntmConsultaDm = new JMenuItem("Consultar DM");
		mntmConsultaDm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarDm objConsultar = new ConsultarDm();
				desktopPane.add(objConsultar);
				objConsultar.setVisible(true);
			}
		});
		mnMenu.add(mntmConsultaDm);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnMenu.add(mntmSair);
		

		
		JMenu mnFinanas = new JMenu("Finan\u00E7as");
		menuBar.add(mnFinanas);
		
		JMenuItem mntmNovoPagamento = new JMenuItem("Novo pagamento");
		mnFinanas.add(mntmNovoPagamento);
		
		JMenuItem mntmNovaDoao = new JMenuItem("Nova doa\u00E7\u00E3o");
		mnFinanas.add(mntmNovaDoao);
		
		JMenuItem mntmNovaCaptao = new JMenuItem("Nova capta\u00E7\u00E3o");
		mnFinanas.add(mntmNovaCaptao);
		
		JMenuItem mntmCosultarCaptao = new JMenuItem("Cosultar capta\u00E7\u00E3o");
		mnFinanas.add(mntmCosultarCaptao);
		
		JMenuItem mntmPagamentosPendentes = new JMenuItem("Pagamentos pendentes");
		mnFinanas.add(mntmPagamentosPendentes);
		
		JMenu mnRelatrio = new JMenu("Relat\u00F3rio");
		menuBar.add(mnRelatrio);
		
		JMenuItem mntmNovoRelatrio = new JMenuItem("Novo Relat\u00F3rio");
		mntmNovoRelatrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				relatorio Relatorio = new relatorio();
				desktopPane.add(Relatorio);
				Relatorio.setVisible(true);
			}
		});
		mnRelatrio.add(mntmNovoRelatrio);
		
		JMenuItem mntmEditarRelatrio = new JMenuItem("Editar Relat\u00F3rio");
		mnRelatrio.add(mntmEditarRelatrio);
		
		JMenuItem mntmImprimir = new JMenuItem("Imprimir");
		mnRelatrio.add(mntmImprimir);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre...");
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 250, 250));
		desktopPane.setBounds(0, 0, 784, 741);
		contentPane.add(desktopPane);
		
		JLabel labelimagen = new JLabel("");
		labelimagen.setIcon(new ImageIcon("C:\\Users\\S\u00E9rgio Ewerton\\workspace\\ProgramaDeMolay\\img\\logoDRV884.jpg"));
		labelimagen.setBounds(204, 133, 402, 435);
		desktopPane.add(labelimagen);
		
		JLabel lblCaptuloDefensoresDo = new JLabel("Cap\u00EDtulo Defensores Do Rio Vermelho N\u00BA 884");
		lblCaptuloDefensoresDo.setForeground(Color.BLACK);
		lblCaptuloDefensoresDo.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblCaptuloDefensoresDo.setBounds(28, 62, 774, 60);
		desktopPane.add(lblCaptuloDefensoresDo);
		
		saldo = "Saldo: 300,00";
		lblSaldo = new JLabel(saldo);
		lblSaldo.setForeground(Color.BLACK);
		lblSaldo.setFont(new Font("Perpetua Titling MT", Font.BOLD, 36));
		lblSaldo.setBounds(257, 620, 555, 79);
		desktopPane.add(lblSaldo);
		
		desktopPane.add(resultadoPesquisa);
	}
	
	public static void mostrarTela(String nomeMembro, int tipoPesquisa){
		m = gerenciador.ConsultarMembro(nomeMembro, tipoPesquisa);
		
		resultadoPesquisa.getCaixaId().setText(m.getId());
		resultadoPesquisa.getCaixaNomeCompleto().setText(m.getNome());
		resultadoPesquisa.getCaixaDataDeNascimento().setText(m.getDataDeNascimento());
		resultadoPesquisa.getCaixaNomeDaMae().setText(m.getNomeDaMae());
		resultadoPesquisa.getCaixaNomeDoPai().setText(m.getNomeDoPai());
		resultadoPesquisa.getCaixaNomeDoCapitulo().setText(m.getNomeCapitulo());
		resultadoPesquisa.getCaixaBairro().setText(m.getBairro());
		resultadoPesquisa.getCaixaEndereco().setText(m.getEndereco());
		resultadoPesquisa.getCaixaNumeroEndereco().setText(m.getNumeroCasa());
		resultadoPesquisa.getCaixaTelefone().setText(m.getTelefone());
		resultadoPesquisa.getCaixaCelular().setText(m.getCelular());
		resultadoPesquisa.getCaixaEmail().setText(m.getEmail());
		resultadoPesquisa.getCaixaCidade().setText(m.getNomeCidade());
		resultadoPesquisa.getCaixaApelido().setText(m.getApelido());
		resultadoPesquisa.getNumeroCapitulo().setToolTipText("884");
		
		if(m.getGrau() == 'D'){
			resultadoPesquisa.getButtonDeMolay().setSelected(editavel);
		} else if(m.getGrau() == 'I'){
			resultadoPesquisa.getButtonIniciatico().setSelected(editavel);
		} else if(m.getGrau() == 'S'){
			resultadoPesquisa.getButtonSenior().setSelected(editavel);
		}
		
		resultadoPesquisa.setVisible(editavel);

	}
	
	public static void salvarAlteracao(){
		m.setId(resultadoPesquisa.getCaixaId().getText());
		m.setNome(resultadoPesquisa.getCaixaNomeCompleto().getText());
		m.setDataDeNascimento(resultadoPesquisa.getCaixaDataDeNascimento().getText());
		m.setNomeDaMae(resultadoPesquisa.getCaixaNomeDaMae().getText());
		m.setNomeDoPai(resultadoPesquisa.getCaixaNomeDoPai().getText());
		m.setNomeCapitulo(resultadoPesquisa.getCaixaNomeDoCapitulo().getText());
		m.setBairro(resultadoPesquisa.getCaixaBairro().getText());
		m.setEndereco(resultadoPesquisa.getCaixaEndereco().getText());
		m.setNumeroDoEndereco(resultadoPesquisa.getCaixaNumeroEndereco().getText());
		m.setTelefone(resultadoPesquisa.getCaixaTelefone().getText());
		m.setCelular(resultadoPesquisa.getCaixaCelular().getText());
		m.setEmail(resultadoPesquisa.getCaixaEmail().getText());
		m.setNomeCidade(resultadoPesquisa.getCaixaCidade().getText());
		m.setApelido(resultadoPesquisa.getCaixaApelido().getText());
		m.setNomeCapitulo(resultadoPesquisa.getNumeroCapitulo().getText());
		
		if(resultadoPesquisa.isBotaoDM()){
			m.setGrau('D');
		}else if(resultadoPesquisa.isBotaoIniciatico()){
			m.setGrau('I');
		}else if(resultadoPesquisa.isBotaoSenior()){
			m.setGrau('S');			
		}
	}
	
	public static void mostrarTelaEditavel (){

		resultadoPesquisa.getCaixaId().setEditable(editavel);
		resultadoPesquisa.getCaixaNomeCompleto().setEditable(editavel);
		resultadoPesquisa.getCaixaDataDeNascimento().setEditable(editavel);
		resultadoPesquisa.getCaixaNomeDaMae().setEditable(editavel);
		resultadoPesquisa.getCaixaNomeDoPai().setEditable(editavel);
		resultadoPesquisa.getCaixaNomeDoCapitulo().setEditable(editavel);
		resultadoPesquisa.getCaixaBairro().setEditable(editavel);
		resultadoPesquisa.getCaixaEndereco().setEditable(editavel);
		resultadoPesquisa.getCaixaNumeroEndereco().setEditable(editavel);
		resultadoPesquisa.getCaixaTelefone().setEditable(editavel);
		resultadoPesquisa.getCaixaCelular().setEditable(editavel);
		resultadoPesquisa.getCaixaEmail().setEditable(editavel);
		resultadoPesquisa.getCaixaCidade().setEditable(editavel);
		resultadoPesquisa.getCaixaApelido().setEditable(editavel);
		resultadoPesquisa.getNumeroCapitulo().setEditable(editavel);
		resultadoPesquisa.getButtonDeMolay().setEnabled(editavel);
		resultadoPesquisa.getButtonIniciatico().setEnabled(editavel);
		resultadoPesquisa.getButtonSenior().setEnabled(editavel);
	}
	
	public static void telaImutavel(){

		resultadoPesquisa.getCaixaId().setEditable(!editavel);
		resultadoPesquisa.getCaixaNomeCompleto().setEditable(!editavel);
		resultadoPesquisa.getCaixaDataDeNascimento().setEditable(!editavel);
		resultadoPesquisa.getCaixaNomeDaMae().setEditable(!editavel);
		resultadoPesquisa.getCaixaNomeDoPai().setEditable(!editavel);
		resultadoPesquisa.getCaixaNomeDoCapitulo().setEditable(!editavel);
		resultadoPesquisa.getCaixaBairro().setEditable(!editavel);
		resultadoPesquisa.getCaixaEndereco().setEditable(!editavel);
		resultadoPesquisa.getCaixaNumeroEndereco().setEditable(!editavel);
		resultadoPesquisa.getCaixaTelefone().setEditable(!editavel);
		resultadoPesquisa.getCaixaCelular().setEditable(!editavel);
		resultadoPesquisa.getCaixaEmail().setEditable(!editavel);
		resultadoPesquisa.getCaixaCidade().setEditable(!editavel);
		resultadoPesquisa.getCaixaApelido().setEditable(!editavel);
		resultadoPesquisa.getNumeroCapitulo().setEditable(!editavel);
		resultadoPesquisa.getButtonDeMolay().setEnabled(!editavel);
		resultadoPesquisa.getButtonIniciatico().setEnabled(!editavel);
		resultadoPesquisa.getButtonSenior().setEnabled(!editavel);	
		}
	
	public static void telaPagamento(){
		PagamentoIG pagamento = new PagamentoIG();
		desktopPane.add(pagamento);
		pagamento.setVisible(true);
				
	}

	
}
