package fundamentos;

import javax.swing.JOptionPane;

public class Boletim {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String ano = JOptionPane.showInputDialog("Digite o ano do aluno:");
        String sala = JOptionPane.showInputDialog("Digite a sala do aluno (A, B, C, D):");

        String[] opcoes = {"Média Aritmética", "Média Ponderada"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de média:", "Seleção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        String nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota:");
        String nota4 = JOptionPane.showInputDialog("Digite a quarta nota:");

        double n1 = Double.parseDouble(nota1);
        double n2 = Double.parseDouble(nota2);
        double n3 = Double.parseDouble(nota3);
        double n4 = Double.parseDouble(nota4);

        double mediaFinal;

        if (escolha == 0) {
            double mediaAritmetica = (n1 + n2 + n3 + n4) / 4;
            mediaFinal = mediaAritmetica;
            JOptionPane.showMessageDialog(null, "A média aritmética das notas é: " + String.format("%.1f", mediaAritmetica));
        } else {
            String peso1 = JOptionPane.showInputDialog("Digite o peso da primeira nota:");
            String peso2 = JOptionPane.showInputDialog("Digite o peso da segunda nota:");
            String peso3 = JOptionPane.showInputDialog("Digite o peso da terceira nota:");
            String peso4 = JOptionPane.showInputDialog("Digite o peso da quarta nota:");

            double p1 = Double.parseDouble(peso1);
            double p2 = Double.parseDouble(peso2);
            double p3 = Double.parseDouble(peso3);
            double p4 = Double.parseDouble(peso4);

            double somaPesos = p1 + p2 + p3 + p4;
            double mediaPonderada = (n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4) / somaPesos;
            mediaFinal = mediaPonderada;

            JOptionPane.showMessageDialog(null, "A média ponderada das notas é: " + String.format("%.1f", mediaPonderada));
        }

        String situacao = (mediaFinal >= 7) ? "Aprovado ⭐" : "Reprovado 😓";

        String resultadoFinal = "Nome: " + nome + "\n" +
                                "Ano: " + ano + "\n" +
                                "Sala: " + sala + "\n" +
                                "Média Final: " + String.format("%.1f", mediaFinal) + "\n" +
                                "Situação: " + situacao;

        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}

