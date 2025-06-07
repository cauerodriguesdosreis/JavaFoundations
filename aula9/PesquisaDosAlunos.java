package aula9;

public class PesquisaDosAlunos {

	public static void main(String[] args) {
		int[] respostas = { 1, 2, 3, 4, 3, 7, 2, 6, 9, 1, 10 };

		int[] frequencia = new int[5];
		
		//Para cada resposta, seleciona elemento de respostas e utiliza esse valor 
		// como índice de frequência para determinar o elemento a incrementar
		for (int resp = 0; resp < respostas.length; resp++) {

			try {
				++frequencia[respostas[resp]];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.printf("	Respostas[%d] = %d\n\n", resp, respostas[resp]);
			}
		}
		
		
		System.out.printf("%s%12s\n", "Conceito", "Frequência");
		
		// Gera saída do valor de cada elemento do array frequência
		for (int nota = 1; nota < frequencia.length; nota++) {
			System.out.printf("%5d%10d\n", nota, frequencia[nota]);
		}

	}

}
