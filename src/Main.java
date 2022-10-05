import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(weather(generateRandomAge(), 15.3));
        System.out.println(weather(generateRandomAge(), 23.1));
        System.out.println(weather(generateRandomAge(), 20.7));
        System.out.println(weather(generateRandomAge(), 35.6));
        System.out.println(weather(generateRandomAge(), 19.2));

    }

    public static String weather(int age, double temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Mozhno idti guliat";

        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Mozhno idti guliat";

        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Mozhno idti guliat";

        } else {
            return "Ostavaites doma";

        }
    }

    public static int generateRandomAge() {

        Random rand = new Random();

        return rand.nextInt(50);

    }

}