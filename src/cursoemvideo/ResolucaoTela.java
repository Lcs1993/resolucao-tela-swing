/*
 * Created by JFormDesigner on Wed Jul 21 09:09:52 BRT 2021
 */

package cursoemvideo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author lucas
 */
public class ResolucaoTela extends JFrame {
	public ResolucaoTela() {
		initComponents();
	}

	private void btnCliqueActionPerformed(ActionEvent e) {
		Dimension dimensao = Toolkit.getDefaultToolkit().getScreenSize();
	    String resolucao = dimensao.width+" x "+dimensao.height;
	    lblResolucao.setText(resolucao);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - lucas
		label2 = new JLabel();
		label1 = new JLabel();
		lblResolucao = new JLabel();
		btnClique = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label2 ----
		label2.setText("Resolucao da Tela:");
		contentPane.add(label2, "cell 4 2");

		//---- label1 ----
		label1.setIcon(new ImageIcon(getClass().getResource("/imagens/images.jpg")));
		contentPane.add(label1, "cell 1 3");

		//---- lblResolucao ----
		lblResolucao.setText("Clique no Botao");
		lblResolucao.setForeground(Color.gray);
		lblResolucao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblResolucao, "cell 4 3");

		//---- btnClique ----
		btnClique.setText("Clique Aqui");
		btnClique.addActionListener(e -> btnCliqueActionPerformed(e));
		contentPane.add(btnClique, "cell 4 4");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - lucas
	private JLabel label2;
	private JLabel label1;
	private JLabel lblResolucao;
	private JButton btnClique;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	public static void main(String[] args ) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 ResolucaoTela GUI = new ResolucaoTela();
                 GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 GUI.setVisible(true);
            }
        });
}
}
