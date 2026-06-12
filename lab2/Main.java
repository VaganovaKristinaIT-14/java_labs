import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    InputValidation inVal = new InputValidation();
    System.out.println("Введите номер сущности, которую хотите посмотреть");
    System.out.println("1. Сущность город");
    System.out.println("2. Сущность имя");
    System.out.println("3. Сущность человек");
    System.out.println("4.Сущность кот");
    int choice = inVal.inputValid(scanner.nextInt(), 1, 4);
    switch (choice) {
      case 1: {
        City city1 = new City("A");
        city1.addRoute("F", 1);
        city1.addRoute("D", 6);
        city1.addRoute("B", 5);

        City city2 = new City("B");
        city2.addRoute("A", 5);
        city2.addRoute("C", 3);

        City city3 = new City("C");
        city3.addRoute("B", 3);
        city3.addRoute("D", 4);

        City city4 = new City("D");
        city4.addRoute("C", 4);
        city4.addRoute("E", 2);
        city4.addRoute("A", 6);

        City city5 = new City("E");
        city5.addRoute("F", 2);

        City city6 = new City("F");
        city6.addRoute("E", 2);
        city6.addRoute("B", 1);

        System.out.println("Созданы города: ");
        System.out.println(city1.toString());
        System.out.println(city2.toString());
        System.out.println(city3.toString());
        System.out.println(city4.toString());
        System.out.println(city5.toString());
        System.out.println(city6.toString());

        break;
      }
      case 2: {
        System.out.println("Сущность имя. Задание 1.3");
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Владимир", "Маяковский");
        System.out.println("Созданы имена:");
        System.out.println(name1.toString());
        System.out.println(name2.toString());
        System.out.println(name3.toString());
        System.out.println();
        System.out.println("Сущность имя. Задание 4.5");
        Name name4 = new Name("Клеопатра");
        Name name5 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name6 = new Name("Владимир", "Маяковский");
        Name name7 = new Name("Христофор", "Бонифатьевич");
        System.out.println("Созданы имена:");
        System.out.println(name4.toString());
        System.out.println(name5.toString());
        System.out.println(name6.toString());
        System.out.println(name7.toString());

        break;
      }
      case 3: {
        System.out.println("Сущность человек. Задание 2.2");
        Name name1 = new Name("Клеопатра");
        Human human1 = new Human(name1, 152);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Human human2 = new Human(name2, 167);
        Name name3 = new Name("Владимир", "Маяковский");
        Human human3 = new Human(name3, 189);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        System.out.println("Сущность Человек. Задание 2.3");
        Human petr = new Human(new Name("Петр", "Чудов"), 195);
        Human ivan = new Human(new Name("Иван", "Чудов"), 170);
        Human boris = new Human(new Name("Борис"), 180);

        petr.setFather(ivan);
        boris.setFather(petr);
        System.out.println(petr);
        System.out.println(ivan);
        System.out.println(boris);

        System.out.println();
        System.out.println("Сущность человек. Задание 4.6");
        Human lev = new Human("Лев", 170);
        Human sergey = new Human(new Name("Сергей", "Пушкин"), 168, lev);
        Human alex = new Human("Александр", 167, sergey);

        System.out.println(lev);
        System.out.println(sergey);
        System.out.println(alex);
        break;
      }
      case 4: {
        Cat cat1 = new Cat("Барсик");
        System.out.println("Cоздана сущность " + cat1.toString());
        cat1.may();
        cat1.mayN(3);
        break;
      }

    }


  }
}
