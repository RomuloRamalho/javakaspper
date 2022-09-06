package ex1ao10;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {

		int dias;
		int idEmDias = 0;
		int idEmAno = 0;
		int idEmMes = 0;
		final int Ano = 365;
		final int Mes = 30;

		String nome = JOptionPane.showInputDialog("Oi, qual seu nome? ");

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));

		idEmAno = idEmDias / idEmAno;
		idEmMes = ((idEmDias % idEmAno) / idEmMes);
		idEmDias = ((idEmDias % idEmAno) % idEmMes);

		System.out.println("Sua idade é " + ano + " anos, " + mes + " meses e " + dias + " dias.");

//		JOptionPane.showMessageDialog(null,"Sua idade é " + idEmAno + " anos, " + idEmMes + " meses e " + idEmDias + " dias.");

	}
}
