//Programa que cria uma janela c/ botoões de rádio como exemplo

package aula10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiRadio extends JPanel {

	private JLabel lbSexo;
	private JButton btVerificar;
	private JRadioButton rbMasculino, rbFeminino;
	private ButtonGroup buttonGroup;

	public GuiRadio() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setLayout(null);
		btVerificar = new JButton("Verificar");
		rbMasculino = new JRadioButton("Masculino");
		rbFeminino = new JRadioButton("Feminino");
		lbSexo = new JLabel("Selecione o sexo: ");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rbMasculino);
		buttonGroup.add(rbFeminino);
		btVerificar.setBounds(55, 105, 100, 20);
		rbMasculino.setBounds(55, 45, 100, 25);
		rbFeminino.setBounds(55, 70, 100, 25);
		lbSexo.setBounds(55, 10, 105, 30);
		rbMasculino.setSelected(true);
		add(btVerificar);
		add(rbMasculino);
		add(rbFeminino);
		add(lbSexo);
	}

	private void definirEventos() {
		btVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rbMasculino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Masculino selecionado");
				}

				else if (rbFeminino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Feminino selecionado");
				}
			}
		});
	}
}
