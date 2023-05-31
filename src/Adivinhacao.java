import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public Adivinhacao() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;
        int numAleatorio = (new Random()).nextInt(100);

        while(tentativas < 5) {
            System.out.println("Tente acertar o número de 1 a 100 guardado na minha memória");
            int adivinhacao = leitura.nextInt();
            ++tentativas;
            if (adivinhacao == numAleatorio) {
                System.out.println("Você acertou o valor!");
                break;
            }

            if (adivinhacao > numAleatorio) {
                System.out.println("O valor é menor!");
            } else {
                System.out.println("O valor é maior");
            }
        }

        if (tentativas == 5) {
            System.out.println("Não foi dessa vez, mas você tentou :)");
        }

    }
}
