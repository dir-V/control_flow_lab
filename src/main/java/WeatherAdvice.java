import java.util.Scanner;
public class WeatherAdvice {
    public static void main(String[] args) {
//      Prompt for user initial input
        System.out.println("What's the weather like today? Is it rainy, snowy, sunny or cloudy?");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
//      Changes the weather input to lowercase, allowing for case in-sensitive input
        weather = weather.toLowerCase();


        System.out.println("What is the temperature today?");
        int temperature = reader.nextInt();


//      if statement which with AND + OR operators to determine which item of clothing to wear
//      If the user does not input a weather or temperature that is viable then the program will output an error.

        if (temperature < 8 && weather.equals("rainy") || weather.equals("snowy")){
            System.out.println("Dress up warm, put on a winter jacket.");
        }else if (temperature < 18 && weather.equals("cloudy") || weather.equals("rainy") || weather.equals("sunny")){
            System.out.println("Wear a light jacket");
        } else if (temperature < 28 && weather.equals("sunny") || weather.equals("cloudy")) {
            System.out.println("Enjoy the sun, dress light. Put on Suncream");
        } else{
            System.out.println("Please input a valid weather and temperature");
        }
    }
}
