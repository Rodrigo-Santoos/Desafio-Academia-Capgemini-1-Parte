import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        		Scanner entrada = new Scanner(System.in);
		System.out.print("Favor informar o valor investido em reais (R$):");

		double valor = entrada.nextDouble();
		double quantVisualizacoes = 0;
		double quantTotal = 0;
		double quantCliques = 0;
		double quantCompartilhamentos = 0;
		if (valor > 0) {
			quantVisualizacoes = valor * 30;
			quantTotal = quantTotal + quantVisualizacoes;
			for (int i = 0; i < 4; i++) {
				quantCliques = calcularCliques(quantVisualizacoes);
				quantCompartilhamentos = calcularCompartilhamentos(quantCliques);
				quantVisualizacoes = quantCompartilhamentos * 40;
				quantTotal = quantTotal + quantVisualizacoes;
			}

		}

		System.out.printf("A quantidade máxima aproximada de pessoas que visualizarão o "
				+ "anúncio, considerando o valor investido de R$ %s, é de: %s ",valor,quantTotal);

		entrada.close();
	}

	private static double calcularCliques(double quantVisualizacoes) {
		return (quantVisualizacoes /100 * 12);
		//return Math.round(quantVisualizacoes /100 * 12);
	}

	private static double calcularCompartilhamentos(double quantClique) {
		return (quantClique / 20 * 3);
		//return Math.round(quantClique / 20 * 3);
		//double quantNovasVisualizacoes = (quantCompartilhamentos * 40);
	}
}
