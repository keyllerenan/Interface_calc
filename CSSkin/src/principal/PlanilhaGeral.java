package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class PlanilhaGeral {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double csgoEmpire = 0.005820; //Representa €0,01 
		double csgoPolygon = 0.000741; //Representa $0,01
		double valorEmpire, valorcsgoPolygon; 
		double dolar = 1.05;
		double euro = 1.00;
		double real = 5.29;
		
		String dado1 = JOptionPane.showInputDialog(
				"Conversão para CsgoPolygon: "); 
					dado1 = dado1.replace(",", "."); 
						valorEmpire = Double.parseDouble(dado1);
						
		double conv = valorEmpire * csgoEmpire / 0.01;
		valorcsgoPolygon = conv * dolar / euro;
		double csPolygon = 1350 * valorcsgoPolygon;
		float csEmpire = (float) (csPolygon * csgoPolygon / 0.582);
		
//		System.out.printf("Valor da Skin na Empire em Euro €: %.2f\n", conv);
//		System.out.printf("Valor da Skin em Dolar $: %.2f\n", valorcsgoPolygon);
//		System.out.printf("Valor de venda na Polygon: %.0f", csPolygon);
		
		// Crie uma mensagem com os resultados
        String mensagem = "Valor em Euro €: " + String.format("%.2f", conv) + "\n" +
                "Valor em Dolar $: " + String.format("%.2f", valorcsgoPolygon) + "\n" +
                "Valor de venda na Polygon: " + String.format("%.0f", csPolygon) + "\n" + 
                "Valor de venda na Empire: " + String.format("%.2f", csEmpire);

        // Exiba a mensagem em uma janela de diálogo
        JOptionPane.showMessageDialog(null, mensagem, "Preço", JOptionPane.INFORMATION_MESSAGE);
		
		
		entrada.close();
	}
}
