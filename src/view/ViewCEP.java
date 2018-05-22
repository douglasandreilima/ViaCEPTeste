package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import br.com.parg.viacep.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCEP extends JFrame {

	private JPanel contentPane;
	private JTextField txtCEP;
	private JButton btnBuscar;
	private JTextField txtRua;
	private JLabel lblRua;
	private JLabel lblBairro;
	private JTextField txtBairro;
	private JLabel lblCidade;
	private JTextField txtCidade;
	private JLabel lblUf;
	private JTextField txtUF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCEP frame = new ViewCEP();
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
	public ViewCEP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtCEP());
		contentPane.add(getBtnBuscar());
		contentPane.add(getTxtRua());
		contentPane.add(getLblRua());
		contentPane.add(getLblBairro());
		contentPane.add(getTxtBairro());
		contentPane.add(getLblCidade());
		contentPane.add(getTxtCidade());
		contentPane.add(getLblUf());
		contentPane.add(getTxtUF());
	}
	private JTextField getTxtCEP() {
		if (txtCEP == null) {
			txtCEP = new JTextField();
			txtCEP.setBounds(110, 46, 155, 20);
			txtCEP.setColumns(10);
		}
		return txtCEP;
	}
	private JButton getBtnBuscar() {
		if (btnBuscar == null) {
			btnBuscar = new JButton("BUSCAR");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					ViaCEP viaCep = new ViaCEP();
					try {
						viaCep.buscar(txtCEP.getText());			
						txtRua.setText(viaCep.getLogradouro());
						txtBairro.setText(viaCep.getBairro());
						txtCidade.setText(viaCep.getLocalidade());
						txtUF.setText(viaCep.getUf());
					} catch (ViaCEPException e) {
						System.out.println("error : "+e);
						//e.printStackTrace();
					}
					
				}
			});
			btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnBuscar.setBounds(144, 106, 89, 23);
		}
		return btnBuscar;
	}
	private JTextField getTxtRua() {
		if (txtRua == null) {
			txtRua = new JTextField();
			txtRua.setBounds(73, 170, 218, 20);
			txtRua.setColumns(10);
		}
		return txtRua;
	}
	private JLabel getLblRua() {
		if (lblRua == null) {
			lblRua = new JLabel("Rua");
			lblRua.setBounds(73, 145, 46, 14);
		}
		return lblRua;
	}
	private JLabel getLblBairro() {
		if (lblBairro == null) {
			lblBairro = new JLabel("Bairro");
			lblBairro.setBounds(73, 201, 46, 14);
		}
		return lblBairro;
	}
	private JTextField getTxtBairro() {
		if (txtBairro == null) {
			txtBairro = new JTextField();
			txtBairro.setBounds(73, 226, 218, 20);
			txtBairro.setColumns(10);
		}
		return txtBairro;
	}
	private JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade");
			lblCidade.setBounds(73, 257, 46, 14);
		}
		return lblCidade;
	}
	private JTextField getTxtCidade() {
		if (txtCidade == null) {
			txtCidade = new JTextField();
			txtCidade.setBounds(73, 282, 218, 20);
			txtCidade.setColumns(10);
		}
		return txtCidade;
	}
	private JLabel getLblUf() {
		if (lblUf == null) {
			lblUf = new JLabel("UF");
			lblUf.setBounds(73, 313, 46, 14);
		}
		return lblUf;
	}
	private JTextField getTxtUF() {
		if (txtUF == null) {
			txtUF = new JTextField();
			txtUF.setBounds(73, 344, 218, 20);
			txtUF.setColumns(10);
		}
		return txtUF;
	}
}
