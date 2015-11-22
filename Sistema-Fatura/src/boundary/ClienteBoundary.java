package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;

public class ClienteBoundary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblIdentificao;
	private JTextField textField_1;
	private JLabel lblNome;
	private JTextField textField_2;
	private JLabel lblSobrenome;
	private JTextField textField_3;
	private JLabel lblEndereo;
	private JTextField textField_4;
	private JLabel lblTelefone;
	private JLabel lblDistrito;
	private JComboBox comboBox;
	private JLabel lblCamposObrigatrios;
	private JTable table;
	private JPanel panel;
	private JPanel panel_1;
	private JTextField textField_5;
	private JLabel lblDataDeNasc;
	private JButton btnPrimeiro;
	private JButton btnAnterior;
	private JButton btnProximo;
	private JButton btnUltimo;
	private JTextField textField_6;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnEditar;
	private JButton btnExcluir;
	private JButton btnPesquisar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteBoundary frame = new ClienteBoundary();
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
	public ClienteBoundary() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 197, 0, 0, 0, 0, 50, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblIdCliente = new JLabel("ID Cliente : *");
		GridBagConstraints gbc_lblIdCliente = new GridBagConstraints();
		gbc_lblIdCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdCliente.anchor = GridBagConstraints.EAST;
		gbc_lblIdCliente.gridx = 0;
		gbc_lblIdCliente.gridy = 1;
		contentPane.add(lblIdCliente, gbc_lblIdCliente);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblIdentificao = new JLabel("Identifica\u00E7\u00E3o : *");
		GridBagConstraints gbc_lblIdentificao = new GridBagConstraints();
		gbc_lblIdentificao.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificao.anchor = GridBagConstraints.EAST;
		gbc_lblIdentificao.gridx = 5;
		gbc_lblIdentificao.gridy = 1;
		contentPane.add(lblIdentificao, gbc_lblIdentificao);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 6;
		gbc_textField_1.gridy = 1;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblNome = new JLabel("Nome : *");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 2;
		contentPane.add(lblNome, gbc_lblNome);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 8;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		lblSobrenome = new JLabel("Sobrenome : *");
		GridBagConstraints gbc_lblSobrenome = new GridBagConstraints();
		gbc_lblSobrenome.anchor = GridBagConstraints.EAST;
		gbc_lblSobrenome.insets = new Insets(0, 0, 5, 5);
		gbc_lblSobrenome.gridx = 0;
		gbc_lblSobrenome.gridy = 3;
		contentPane.add(lblSobrenome, gbc_lblSobrenome);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 8;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		lblEndereo = new JLabel("Endere\u00E7o : *");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 0;
		gbc_lblEndereo.gridy = 4;
		contentPane.add(lblEndereo, gbc_lblEndereo);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 8;
		gbc_textField_4.anchor = GridBagConstraints.SOUTH;
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		lblTelefone = new JLabel("Telefone : *");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 5;
		contentPane.add(lblTelefone, gbc_lblTelefone);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 4;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		contentPane.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		lblDistrito = new JLabel("Estado : *");
		GridBagConstraints gbc_lblDistrito = new GridBagConstraints();
		gbc_lblDistrito.anchor = GridBagConstraints.EAST;
		gbc_lblDistrito.insets = new Insets(0, 0, 5, 5);
		gbc_lblDistrito.gridx = 5;
		gbc_lblDistrito.gridy = 5;
		contentPane.add(lblDistrito, gbc_lblDistrito);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 6;
		gbc_comboBox.gridy = 5;
		contentPane.add(comboBox, gbc_comboBox);
		
		lblDataDeNasc = new JLabel("Data de Nasc : *");
		GridBagConstraints gbc_lblDataDeNasc = new GridBagConstraints();
		gbc_lblDataDeNasc.anchor = GridBagConstraints.EAST;
		gbc_lblDataDeNasc.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNasc.gridx = 0;
		gbc_lblDataDeNasc.gridy = 6;
		contentPane.add(lblDataDeNasc, gbc_lblDataDeNasc);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		contentPane.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		lblCamposObrigatrios = new JLabel("* Campos obrigat\u00F3rios");
		lblCamposObrigatrios.setForeground(Color.BLUE);
		GridBagConstraints gbc_lblCamposObrigatrios = new GridBagConstraints();
		gbc_lblCamposObrigatrios.gridwidth = 2;
		gbc_lblCamposObrigatrios.insets = new Insets(0, 0, 5, 5);
		gbc_lblCamposObrigatrios.gridx = 0;
		gbc_lblCamposObrigatrios.gridy = 7;
		contentPane.add(lblCamposObrigatrios, gbc_lblCamposObrigatrios);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 0);
		gbc_table.gridheight = 4;
		gbc_table.gridwidth = 9;
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 8;
		contentPane.add(table, gbc_table);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 12;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		btnPrimeiro = new JButton("Primeiro");
		GridBagConstraints gbc_btnPrimeiro = new GridBagConstraints();
		gbc_btnPrimeiro.insets = new Insets(0, 0, 0, 5);
		gbc_btnPrimeiro.gridx = 1;
		gbc_btnPrimeiro.gridy = 1;
		panel.add(btnPrimeiro, gbc_btnPrimeiro);
		
		btnAnterior = new JButton("Anterior");
		GridBagConstraints gbc_btnAnterior = new GridBagConstraints();
		gbc_btnAnterior.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnterior.gridx = 2;
		gbc_btnAnterior.gridy = 1;
		panel.add(btnAnterior, gbc_btnAnterior);
		
		btnProximo = new JButton("Proximo");
		GridBagConstraints gbc_btnProximo = new GridBagConstraints();
		gbc_btnProximo.insets = new Insets(0, 0, 0, 5);
		gbc_btnProximo.gridx = 3;
		gbc_btnProximo.gridy = 1;
		panel.add(btnProximo, gbc_btnProximo);
		
		btnUltimo = new JButton("Ultimo");
		GridBagConstraints gbc_btnUltimo = new GridBagConstraints();
		gbc_btnUltimo.gridx = 4;
		gbc_btnUltimo.gridy = 1;
		panel.add(btnUltimo, gbc_btnUltimo);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 7;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 12;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		btnNovo = new JButton("Novo");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.insets = new Insets(0, 0, 0, 5);
		gbc_btnNovo.gridx = 0;
		gbc_btnNovo.gridy = 1;
		panel_1.add(btnNovo, gbc_btnNovo);
		
		btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridx = 1;
		gbc_btnSalvar.gridy = 1;
		panel_1.add(btnSalvar, gbc_btnSalvar);
		
		btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.insets = new Insets(0, 0, 0, 5);
		gbc_btnExcluir.gridx = 2;
		gbc_btnExcluir.gridy = 1;
		panel_1.add(btnExcluir, gbc_btnExcluir);
		
		btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditar.gridx = 3;
		gbc_btnEditar.gridy = 1;
		panel_1.add(btnEditar, gbc_btnEditar);
		
		btnPesquisar = new JButton("Pesquisar");
		GridBagConstraints gbc_btnPesquisar = new GridBagConstraints();
		gbc_btnPesquisar.gridx = 4;
		gbc_btnPesquisar.gridy = 1;
		panel_1.add(btnPesquisar, gbc_btnPesquisar);
	}

}
