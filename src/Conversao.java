public class Conversao {
    public Conversao() {
    }

    public static void main(String[] args) {
        double temperaturaCelsius = 30.2;
        double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32.0;
        String mensagem = String.format("A temperatura em Celsius é de %f e convertida para Fahrenheit vira %f", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);
        int temperaturaIntFahrenheit = (int)temperaturaFahrenheit;
        System.out.println("Agora seu valor em inteiro é " + temperaturaIntFahrenheit);
    }
}
