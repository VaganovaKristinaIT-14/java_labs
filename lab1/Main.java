//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Methodes methodes = new Methodes();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите номер задания, которое хотите посмотреть");
    System.out.println("1. Вывод дробной части числа ");
    System.out.println("2. Преобразовать символ в число");
    System.out.println("3. Является ли число двузначным? ");
    System.out.println("4. Входит ли число в диапазон?");
    System.out.println("5. Проверить равенство трех чисел");
    System.out.println("6. Вычислить модуль числа");
    System.out.println("7. Проверить деление на 3 или на 5");
    System.out.println("8. Максимум из 3 чисел");
    System.out.println("9. Сумма двух чисел ");
    System.out.println("10. День недели");
    System.out.println("11. Построить строку от 0 до х");
    System.out.println("12. Построить строку четных чисел от 0 до х");
    System.out.println("13. Длина числа");
    System.out.println("14. Квадрат из звездочек");
    System.out.println("15. Треугольник из звездочек");
    System.out.println("16. Поиск первого вхождения элемента массива");
    System.out.println("17. Поиск максимального по модулю в массиве");
    System.out.println("18. Вставка массива в массив по заданной позиции");
    System.out.println("19. Массив в обратной записи");
    System.out.println("20. Массив индексов всех вхождений Х в массив");

    int number = methodes.inputValid(scanner.nextInt(), 1, 20);
    switch (number) {
      case 1: {
        System.out.println("Введите дробное число (дробнаяя часть через запятую): ");
        double num = scanner.nextDouble();
        System.out.println("Результат: " + methodes.fraction(num));
        break;
      }
      // Z 1.3
      case 2: {
        System.out.println("Введите символ для преобразования в число");
        char sym = scanner.next().charAt(0);
        int result = methodes.charToNum(sym);
        System.out.println("Число : " + result);
        break;
      }
      // Z 1.5
      case 3: {
        System.out.println("Введите число: ");
        int x = methodes.inputValid(scanner.nextInt(), 0, 1000000);
        System.out.println("Результат: " + methodes.is2Digits(x));
        break;
      }
      // Z 1.7
      case 4: {
        System.out.println("Введите границу диапазона (1): ");
        int a = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        System.out.println("Введите границу диапазона (2): ");
        int b = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        System.out.println("Введите число: ");
        int num = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        System.out.println("Результат: " + methodes.isInRange(a, b, num));
        break;
      }
      // Z 1.9
      case 5: {
        System.out.println("Введите 3 числа, чтобы проверить равенство(через enter): ");
        int a = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        int b = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        int c = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        System.out.println("Результат: " + methodes.isEqual(a, b, c));
        break;

      }
      // Z 2.1
      case 6: {
        System.out.println("Введите число, чтобы вычислить модуль");
        int a = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        System.out.println("Результат:" + methodes.abs(a));
        break;
      }
      // Z 2.3
      case 7: {
        System.out.println("Введите число, чтобы проверить деление на 3 или на 5");
        int a = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        System.out.println("Результат:" + methodes.is35(a));
        break;

      }
      // Z 2.5
      case 8: {
        System.out.println("Введите 3 числа, чтобы вычислить максимум(через enter): ");
        int a = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        int b = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        int c = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        System.out.println("Результат: " + methodes.max3(a, b, c));
        break;
      }
      // Z 2.7
      case 9: {
        System.out.println("Введите 2 числа для вычисления суммы (через enter): ");
        int a = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        int b = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        break;

      }
      // Z 2.9
      case 10: {
        System.out.println("Введите день недели ");
        int a = methodes.inputValid(scanner.nextInt(), -10000000, 10000000);
        System.out.println("Результат: " + methodes.day(a));
        break;

      }
      // Z 3.1
      case 11: {
        System.out.println("Построим строку от 0 до х. Введите число х: ");
        int x = methodes.inputValid(scanner.nextInt(), 0, 10000000);
        System.out.println("Результат: " + methodes.listNums(x));
        break;
      }
      // Z 3.3
      case 12: {
        System.out.println("Построим строку четных чисел от 0 до х. Введите число х: ");
        int x = methodes.inputValid(scanner.nextInt(), 0, 10000000);
        System.out.println("Результат: " + methodes.chet(x));
        break;

      }
      // Z 3.5
      case 13: {
        System.out.println("Введите число, длинну которого хотите посчиитать");
        long x = scanner.nextLong();
        System.out.println("Результат: " + methodes.numLen(x));
        break;
      }
      // Z 3.7
      case 14: {
        System.out.println("Введите сторону квадрата");
        int x = methodes.inputValid(scanner.nextInt(), 1, 10000000);
        System.out.println("Результат");
        methodes.square(x);
        break;
      }
      // Z 3.9
      case 15: {
        System.out.println("Введите высоту треугольника");
        int x = methodes.inputValid(scanner.nextInt(), 1, 10000000);
        System.out.println("Результат");
        methodes.rightTriangle(x);
        break;
      }
      // Z 4.1
      case 16: {
        int[] arr = methodes.inputArr(scanner);
        methodes.printArr(arr);

        System.out.println("Введите число, индекс которого надо найти: ");
        int x = scanner.nextInt();
        System.out.println("Индекс " + methodes.findFirst(arr, x));
        ;
        break;
      }
      // Z 4.3
      case 17: {
        int[] arr = methodes.inputArr(scanner);
        methodes.printArr(arr);
        System.out.println("Наибольшее по модулю: " + methodes.maxAbs(arr));
        break;
      }
      // Z 4.5
      case 18: {
        System.out.println("Ввод массива 1: ");
        int arr1[] = methodes.inputArr(scanner);
        methodes.printArr(arr1);

        System.out.println("Ввод массива 2: ");
        int arr2[] = methodes.inputArr(scanner);
        methodes.printArr(arr2);

        System.out.println("Введите номер позиции вставки");
        int pos = methodes.inputValid(scanner.nextInt(), 1, arr1.length);
        methodes.printArr(methodes.add(arr1, arr2, pos));
        break;
      }
      // Z 4.7
      case 19: {
        int[] arr = methodes.inputArr(scanner);
        methodes.printArr(arr);
        System.out.println("Массив наоборот: ");
        methodes.printArr(methodes.reverseBack(arr));
        break;

      }
      // Z 4.9
      case 20: {
        int[] arr = methodes.inputArr(scanner);
        methodes.printArr(arr);

        System.out.println("Введите число, индекс которого надо найти: ");
        int x = scanner.nextInt();
        System.out.println("Массив индексов:");
        int[] result = methodes.findAll(arr, x);
        if (result.length == 0) {
          System.out.println("Массив пуст. Такого числа в массиве нет");
        } else {
          methodes.printArr(result);
        }
        break;
      }
      default:
    }
  }
}
