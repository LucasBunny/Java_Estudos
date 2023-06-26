public class operacoes_aritmeticas {
    public static void main(String[] args) {

        int soma = 15 + 25;
        int subtracao = 35 - 20;

        int multiplicacao = 2 * 5;
        float divisao = 1 / 3;

        float modulo = 24 % 5;

        System.out.printf("Exemplos de Operadores Aritméticos\n");

        System.out.printf("Soma: 15 + 25 = %d\n", soma);
        System.out.printf("Subtração: 35 + 20 = %d\n\n", subtracao);

        System.out.printf("Multiplicação: 2 * 5 = %d\n", multiplicacao);
        System.out.printf("Divisão: 1 / 3 = %.2f\n\n", divisao);

        System.out.printf("Módulo: 24 mod 5 = %.2f\n", modulo);

    }
}
