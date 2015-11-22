package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JButton;

public class UsuarioBoundary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPerfil;
	private JComboBox comboBox;
	private JLabel lblNome;
	private JTextField textField_1;
	private JLabel lblApelido;
	private JTextField textField_2;
	private JLabel lblSenha;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;
	private JTextField textField_4;
	private JLabel lblCamposCom;
	private JTable table;
	private JPanel paneNavegacao;
	private JPanel paneEdicao;
	private JButton btnPrimeiro;
	private JButton btnAnterior;
	private JButton btnProximo;
	private JButton btnUltimo;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnExcluir;
	private JButton btnEditar;
	private JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioBoundary frame = new UsuarioBoundary();
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
	public UsuarioBoundary() {
		setTitle("Usuário");
		setBackground(new Color(100, 149, 237));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("ID Usu\u00E1rio : *");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblPerfil = new JLabel("Perfil :");
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.anchor = GridBagConstraints.EAST;
		gbc_lblPerfil.gridx = 2;
		gbc_lblPerfil.gridy = 1;
		contentPane.add(lblPerfil, gbc_lblPerfil);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		
		lblNome = new JLabel("Nome : *");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 2;
		contentPane.add(lblNome, gbc_lblNome);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblApelido = new JLabel("Sobrenome : *");
		GridBagConstraints gbc_lblApelido = new GridBagConstraints();
		gbc_lblApelido.anchor = GridBagConstraints.EAST;
		gbc_lblApelido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApelido.gridx = 0;
		gbc_lblApelido.gridy = 3;
		contentPane.add(lblApelido, gbc_lblApelido);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		lblSenha = new JLabel("Senha : *");
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.anchor = GridBagConstraints.EAST;
		gbc_lblSenha.insets = new Insets(0, 0, 5, 5);
		gbc_lblSenha.gridx = 0;
		gbc_lblSenha.gridy = 4;
		contentPane.add(lblSenha, gbc_lblSenha);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Confirma\u00E7\u00E3o de senha: *");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 4;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		lblCamposCom = new JLabel("Campos com * s\u00E3o obrigat\u00F3rios");
		lblCamposCom.setForeground(Color.RED);
		lblCamposCom.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_lblCamposCom = new GridBagConstraints();
		gbc_lblCamposCom.anchor = GridBagConstraints.WEST;
		gbc_lblCamposCom.gridwidth = 2;
		gbc_lblCamposCom.insets = new Insets(0, 0, 5, 5);
		gbc_lblCamposCom.gridx = 0;
		gbc_lblCamposCom.gridy = 5;
		contentPane.add(lblCamposCom, gbc_lblCamposCom);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridheight = 2;
		gbc_table.insets = new Insets(0, 0, 5, 0);
		gbc_table.gridwidth = 4;
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 6;
		contentPane.add(table, gbc_table);
		
		paneNavegacao = new JPanel();
		GridBagConstraints gbc_paneNavegacao = new GridBagConstraints();
		gbc_paneNavegacao.anchor = GridBagConstraints.NORTH;
		gbc_paneNavegacao.gridwidth = 2;
		gbc_paneNavegacao.insets = new Insets(0, 0, 0, 5);
		gbc_paneNavegacao.gridx = 0;
		gbc_paneNavegacao.gridy = 8;
		contentPane.add(paneNavegacao, gbc_paneNavegacao);
		GridBagLayout gbl_paneNavegacao = new GridBagLayout();
		gbl_paneNavegacao.columnWidths = new int[] {0, 0, 0, 0, 0};
		gbl_paneNavegacao.rowHeights = new int[]{0, 0, 0, 0};
		gbl_paneNavegacao.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_paneNavegacao.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		paneNavegacao.setLayout(gbl_paneNavegacao);
		
		btnPrimeiro = new JButton("Primeiro");
		GridBagConstraints gbc_btnPrimeiro = new GridBagConstraints();
		gbc_btnPrimeiro.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrimeiro.gridx = 0;
		gbc_btnPrimeiro.gridy = 1;
		paneNavegacao.add(btnPrimeiro, gbc_btnPrimeiro);
		
		btnAnterior = new JButton("Anterior");
		GridBagConstraints gbc_btnAnterior = new GridBagConstraints();
		gbc_btnAnterior.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnterior.gridx = 1;
		gbc_btnAnterior.gridy = 1;
		paneNavegacao.add(btnAnterior, gbc_btnAnterior);
		
		btnProximo = new JButton("Proximo");
		GridBagConstraints gbc_btnProximo = new GridBagConstraints();
		gbc_btnProximo.insets = new Insets(0, 0, 5, 5);
		gbc_btnProximo.gridx = 2;
		gbc_btnProximo.gridy = 1;
		paneNavegacao.add(btnProximo, gbc_btnProximo);
		
		btnUltimo = new JButton("Ultimo");
		GridBagConstraints gbc_btnUltimo = new GridBagConstraints();
		gbc_btnUltimo.insets = new Insets(0, 0, 5, 0);
		gbc_btnUltimo.gridx = 3;
		gbc_btnUltimo.gridy = 1;
		paneNavegacao.add(btnUltimo, gbc_btnUltimo);
		
		paneEdicao = new JPanel();
		GridBagConstraints gbc_paneEdicao = new GridBagConstraints();
		gbc_paneEdicao.gridwidth = 2;
		gbc_paneEdicao.insets = new Insets(0, 0, 0, 5);
		gbc_paneEdicao.fill = GridBagConstraints.BOTH;
		gbc_paneEdicao.gridx = 2;
		gbc_paneEdicao.gridy = 8;
		contentPane.add(paneEdicao, gbc_paneEdicao);
		GridBagLayout gbl_paneEdicao = new GridBagLayout();
		gbl_paneEdicao.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_paneEdicao.rowHeights = new int[]{0, 0, 0};
		gbl_paneEdicao.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_paneEdicao.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		paneEdicao.setLayout(gbl_paneEdicao);
		
		btnNovo = new JButton("Novo");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.insets = new Insets(0, 0, 0, 5);
		gbc_btnNovo.gridx = 1;
		gbc_btnNovo.gridy = 1;
		paneEdicao.add(btnNovo, gbc_btnNovo);
		
		btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridx = 2;
		gbc_btnSalvar.gridy = 1;
		paneEdicao.add(btnSalvar, gbc_btnSalvar);
		
		btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.insets = new Insets(0, 0, 0, 5);
		gbc_btnExcluir.gridx = 3;
		gbc_btnExcluir.gridy = 1;
		paneEdicao.add(btnExcluir, gbc_btnExcluir);
		
		btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditar.gridx = 4;
		gbc_btnEditar.gridy = 1;
		paneEdicao.add(btnEditar, gbc_btnEditar);
		
		btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.gridx = 5;
		gbc_btnBuscar.gridy = 1;
		paneEdicao.add(btnBuscar, gbc_btnBuscar);
	}

}
