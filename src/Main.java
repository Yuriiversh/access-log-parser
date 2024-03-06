import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            System.out.println("Введите путь к файлу");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (fileExists && !isDirectory) {
                System.out.println("Путь указан верно");
                count++;
                System.out.println("Это файл " + count);
            } else {
                System.out.println("Путь к файлу не правильный");
                //continue;
            }
        }
    }
}