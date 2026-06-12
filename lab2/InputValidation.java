import java.util.Scanner;

public class InputValidation {

  Scanner scanner = new Scanner(System.in);

  //Проверка целых чисел
  public int inputValid(int test, int min, int max) {
    int input = test;
    while (true) {
      if (input >= min && input <= max) {
        return input;
      } else {
        System.out.println("Число должно быть в диапазоне от " + min + " до " + max + "!");
        if (scanner.hasNextInt()) {
          input = scanner.nextInt();
        } else {
          System.out.println("Ошибка ввода! Пожалуйста, введите целое число.");
          scanner.nextLine(); // очистка некорректного ввода
        }
      }
    }
  }

  //Проверка строки на буквы
  public String inputLetters(String test) {
    String input = test.trim();
    while (true) {

      boolean isValid = true;
      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        boolean isEnglishLetter = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
        boolean isRussianLetter =
            (c >= 'а' && c <= 'я') || (c >= 'А' && c <= 'Я') || c == 'ё' || c == 'Ё';
        boolean isSpace = c == ' ';

        if (!isEnglishLetter && !isRussianLetter && !isSpace) {
          isValid = false;
          break;
        }
      }

      if (isValid) {
        return input;
      } else {
        System.out.println("Ошибка: разрешены только английские и русские буквы и пробелы!");
        input = scanner.nextLine();
      }
    }
  }


}
