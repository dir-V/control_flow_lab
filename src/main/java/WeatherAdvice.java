import java.util.Scanner;
public class WeatherAdvice {
    public static void main(String[] args) {
        System.out.println("What's the weather like today? Is it rainy, snowy, sunny or cloudy?");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
        weather = weather.toLowerCase();


        System.out.println("What is the temperature today?");
        int temperature = reader.nextInt();



        if (temperature < 8 && weather.equals("rainy") || weather.equals("snowy")){
            System.out.println("Dress up warm, put on a winter jacket.");
        }else if (temperature < 18 && weather.equals("cloudy") || weather.equals("rainy") || weather.equals("sunny")){
            System.out.println("Wear a light jacket");
        } else if (temperature < 28 && weather.equals("sunny") || weather.equals("cloudy")) {
            System.out.println("Enjoy the sun, dress light");
        } else{
            System.out.println("Please input a valid weather and temperature");
        }
    }
}
