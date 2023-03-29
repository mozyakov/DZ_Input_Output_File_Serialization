import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] products = {"Хлеб", "Квас", "Мясо"};
    static int[] prices = {10, 20, 30};

    public static void main(String[] args) {
        Basket basket = new Basket(products, prices);

        while(true) {
            showPrice();
            System.out.println("Выберите товар через кол-во и пробел или введите 'end'");
            String input = scanner.nextLine(); //юзер вводит данные
            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split(" ");

        }




    }
}
