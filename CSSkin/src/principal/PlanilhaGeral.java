package principal;

import javax.swing.*;

public class PlanilhaGeral {
    
	public static void main(String[] args) {
        // Cria um JFrame
        JFrame frame = new JFrame("Conversão de Moedas");

        // Cria um painel
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Define o layout do painel
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Cria componentes
        JLabel label = new JLabel("Insira o valor em Euro €:");
        JTextField valorField = new JTextField(10);
        JButton calcularButton = new JButton("Calcular");

        // Adiciona componentes ao layout
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(label)
                .addComponent(valorField)
                .addComponent(calcularButton)
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(valorField)
                        .addComponent(calcularButton))
        );

        // Adiciona a ação do botão
        calcularButton.addActionListener(e -> {
            try {
                String dado1 = valorField.getText().replace(",", ".");
                double valorEmpire = Double.parseDouble(dado1);

                // Realize os cálculos
                double csEmpire = 0.005820;
                double dolar = 1.05;
                double euro = 1.00;
                double conv = valorEmpire * csEmpire / 0.01;
                double valorcsgoPolygon = conv * dolar / euro;
                double csPolygon = 1350 * valorcsgoPolygon;

                // Exibe os resultados em uma janela de diálogo
                JOptionPane.showMessageDialog(frame,
                        "Valor da Skin na Empire em Euro €: " + String.format("%.2f", conv) + "\n" +
                                "Valor da Skin em Dolar $: " + String.format("%.2f", valorcsgoPolygon) + "\n" +
                                "Valor de venda na Polygon: " + String.format("%.0f", csPolygon),
                        "Resultados",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame,
                        "Por favor, insira um valor válido em Euro.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Configurações do frame
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
