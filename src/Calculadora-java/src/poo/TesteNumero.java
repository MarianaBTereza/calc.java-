package poo;

import java.util.HashMap;
import java.util.Scanner;

public class TesteNumero {
    public static void main(String[] args) {
        Numero n = new Numero();

        boolean continuar = true;

        Scanner scan = new Scanner(System.in);
        while (continuar) {
            System.out.println("Digite a operação que deseja realizar:\n"
                    + "1 para soma\n"
                    + "2 para subtração\n"
                    + "3 para multiplicação\n"
                    + "4 para divisão\n"
                    + "0 para terminar o programa"
            );

            int operacao = scan.nextInt();
            scan.nextLine();  // Consome a nova linha pendente

            if (operacao == 0) {
                continuar = false;
                break;
            }

            System.out.println("Informe o valor do primeiro numero:");
            double x = scan.nextDouble();
            System.out.println("Informe o valor do segundo numero:");
            double y = scan.nextDouble();

            try {
                switch (operacao) {
                    case 1:
                        imprimeCalculadora(operacao, n.soma(x, y), x, y);
                        break;
                    case 2:
                        imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                        break;
                    case 3:
                        imprimeCalculadora(operacao, n.mutplicacao(x, y), x, y);
                        break;
                    case 4:
                        imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                        break;
                    default:
                        System.out.println("Operação inválida.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scan.close();
    }

    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, "somando");
        mapOperacao.put(2, "subtração");
        mapOperacao.put(3, "multiplicação");
        mapOperacao.put(4, "divisão");

        System.out.println("\nO resultado de " + x + " " + mapOperacao.get(operacao) + " por " + y + " é igual a " + resultado + "\n");
    }
}