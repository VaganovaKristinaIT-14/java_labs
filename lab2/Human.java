import java.util.Scanner;

public class Human {

  InputValidation inVal = new InputValidation();
  private Name name;
  private int height;
  private Human father;

  public Name getName() {
    return this.name;
  }

  public int getHeight() {
    return this.height;
  }

  public Human getFather() {
    return this.father;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public void setHeight(int height) {
    this.height = inVal.inputValid(height, 100, 300);
  }

  public void setFather(Human father) {
    this.father = father;
  }

  public Human(Name name, int height, Human father) {
    this.name = name;
    this.height = height;
    this.father = father;
    correctName();
  }

  public Human() {
    this(new Name(), 100, null);
  }

  public Human(String firstName, int height) {
    this(new Name(firstName), height, null);
  }

  public Human(String firstName, int height, Human father) {
    this(new Name(firstName), height, father);
  }

  public Human(Name name, int height) {
    this(name, height, null);
  }

  private void correctName() {
    if (father != null) {
      Name fatherName = father.getName();

      // Если у человека нет фамилии, а у отца есть
      if ((name.getLastName() == null || name.getLastName().isEmpty())
          && fatherName.getLastName() != null && !fatherName.getLastName().isEmpty()) {
        name.setLastName(fatherName.getLastName());
      }

      // Если у человека нет отчества, а у отца есть имя
      if ((name.getPatronymic() == null || name.getPatronymic().isEmpty())
          && fatherName.getFirstName() != null && !fatherName.getFirstName().isEmpty()) {
        String fatherFirstName = fatherName.getFirstName();
        String patronimic = generatePatronymic(fatherFirstName);
        name.setPatronymic(patronimic);
      }
    }
  }

  private String generatePatronymic(String fatherName) {
    if (fatherName == null || fatherName.isEmpty()) {
      return "";
    }
    switch (fatherName) {
      case "Лев":
        return "Львович";
      case "Илья":
        return "Ильич";
      case "Пётр":
        return "Петрович";
      case "Павел":
        return "Павлович";
      case "Сергей":
        return "Сергеевич";
      default:
        return fatherName + "ович";
    }
  }

  @Override
  public String toString() {
    return this.name + ", рост: " + this.height;
  }
}
