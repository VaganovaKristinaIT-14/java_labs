//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Methodes {

  Scanner scanner;

  public Methodes() {
    this.scanner = new Scanner(System.in);
  }

  public int inputValid(int a, int min, int max) {
    int digit = a;

    while (digit < min || digit > max) {
      System.out.println("Число вне диапазона (" + min + "-" + max + "). Повторите ввод: ");
      digit = this.scanner.nextInt();
    }

    return digit;
  }

  public double fraction(double x) {
    int intPart = (int) x;
    double result = x - intPart;
    return Math.round(result * 10000000000.0) / 10000000000.0;
  }

  public int charToNum(char x) {
    if (x >= '0' && x <= '9') {
      return x - '0';
    } else {
      System.out.println("Ошибка. Это не символ от 0 до 9");
      return -1;
    }
  }

  public boolean is2Digits(int x) {
    return x > 9 && x < 100;
  }

  public boolean isInRange(int a, int b, int num) {
    if (a > b) {
      return num >= b && num <= a;
    } else if (a == b) {
      return num == a;
    } else {
      return num >= a && num <= b;
    }
  }

  public boolean isEqual(int a, int b, int c) {
    if (a == b && b == c) {
      return true;
    } else {
      return false;
    }
  }

  public int abs(int x) {
    if (x < 0) {
      return x * -1;
    } else {
      return x;
    }
  }

  public boolean is35(int x) {
    if (x % 3 == 0 || x % 5 == 0) {
      if (x % 3 == 0 && x % 5 == 0) {
        return false;
      } else {
        return true;
      }
    } else {
      return false;
    }
  }

  public int max3(int x, int y, int z) {
    if (x >= y && x >= z) {
      return x;
    }
    if (y >= x && y >= z) {
      return y;
    }
    return z;
  }

  public int sum2(int x, int y) {
    int sum = x + y;
    if (sum >= 10 && sum <= 19) {
      return 20;
    }
    return sum;
  }

  public String day(int x) {
    switch (x) {
      case 1:
        return "понедельник";
      case 2:
        return "вторник";
      case 3:
        return "среда";
      case 4:
        return "четверг";
      case 5:
        return "пятница";
      case 6:
        return "суббота";
      case 7:
        return "воскресенье";
      default:
        return "это не день недели";
    }
  }

  public String listNums(int x) {
    String result = "";
    for (int i = 0; i <= x; i++) {
      result += i + " ";
    }
    return result;
  }

  public String chet(int x) {
    String result = "";
    for (int i = 0; i <= x; i += 2) {
      result += i + " ";
    }
    return result;
  }

  public int numLen(long x) {
    long a = x;
    if (x == 0) {
      return 1;
    }
    int cnt = 0;
    while (a != 0) {
      a = a / 10;
      cnt++;
    }
    return cnt;
  }

  public void square(int x) {
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public void rightTriangle(int x) {
    for (int i = 1; i <= x; i++) {
      for (int j = 0; j < x - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public int findFirst(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public int[] inputArr(Scanner scanner) {
    System.out.println("Введите размер массива: ");
    int size = inputValid(scanner.nextInt(), 1, 10000000);
    int arr[] = new int[size];
    System.out.println("Введите элементы массива: ");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  public void printArr(int[] arr) {
    System.out.println("Массив: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }

  public int maxAbs(int[] arr) {
    int max = arr[1];
    for (int i = 0; i < arr.length; i++) {
      if (Math.abs(max) < Math.abs(arr[i])) {
        max = arr[i];
      }
    }
    return max;

  }

  public int[] add(int[] arr, int[] ins, int pos) {
    int[] result = new int[arr.length + ins.length];
    for (int i = 0; i < pos; i++) {
      result[i] = arr[i];
    }
    for (int i = 0; i < ins.length; i++) {
      result[pos + i] = ins[i];
    }
    for (int i = pos; i < arr.length; i++) {
      result[ins.length + i] = arr[i];
    }
    return result;

  }

  public int[] reverseBack(int[] arr) {
    int[] arrReverse = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arrReverse[i] = arr[arr.length - 1 - i];
    }
    return arrReverse;
  }

  public int[] findAll(int[] arr, int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        count++;
      }
    }
    int[] arrIndex = new int[count];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        arrIndex[index] = i;
        index++;
      }
    }
    return arrIndex;


  }


}
