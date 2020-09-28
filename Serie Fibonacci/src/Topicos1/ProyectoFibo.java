package Topicos1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ProyectoFibo extends JFrame {

	private JPanel contentPane;
	private JTextField txtSerie;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoFibo frame = new ProyectoFibo();
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
	public ProyectoFibo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUMERO DESIGNADO PARA LA SERIE: ");
		lblNewLabel.setBounds(10, 27, 299, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalcularSerie();
			}
			void CalcularSerie() {
				int n;
				n = Integer.parseInt(txtSerie.getText());
				int a=0, b=1, c=0, i=1;
				while (i<n) {
		            c = a + b;
		            a = b;
		            b = c;
		            i++;
		            txtArea.append(c + " ");
			}
		}
		});
		btnCalcular.setBounds(166, 131, 96, 47);
		contentPane.add(btnCalcular);
		
		txtSerie = new JTextField();
		txtSerie.setBounds(319, 29, 96, 19);
		contentPane.add(txtSerie);
		txtSerie.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("RESULTADO: ");
		lblNewLabel_1.setBounds(10, 69, 112, 22);
		contentPane.add(lblNewLabel_1);
		
		txtArea = new JTextArea();
		txtArea.setBounds(150, 68, 265, 22);
		contentPane.add(txtArea);
	}

}
