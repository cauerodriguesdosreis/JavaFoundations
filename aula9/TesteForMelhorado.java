package aula9;
// Utilizando a instrução for melhorada para somar inteiros em um array
public class TesteForMelhorado {

    public static void main(String[] args) {
        int[] exemplo = {87, 68, 94, 100, 83, 78, 85, 91, 76, 89};

        int total = 0;

        // Adiciona o valor de cada elemento a variável total
        for (int numero : exemplo)
            total += numero;

        // Saída
        System.out.printf("Total dos elementos do array: %d\n", total);
    }
}
