import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int parametroDois = scanner.nextInt();

            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Os parâmetros fornecidos não são números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}


