import java.util.Scanner;

public class Name {

  InputValidation inVal = new InputValidation();
  Scanner scanner = new Scanner(System.in);
  private String lastName;
  private String firstName;
  private String patronymic;

  public String getLastName() {
    return this.lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getPatronymic() {
    return this.patronymic;
  }

  public void setLastName(String lastName) {
    this.lastName = inVal.inputLetters(lastName);
  }

  public void setFirstName(String firstName) {
    this.firstName = inVal.inputLetters(firstName);
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = inVal.inputLetters(patronymic);
  }

  public Name() {
    this.lastName = "Иванов";
    this.firstName = "Иван";
    this.patronymic = "Иванович";
  }

  public Name(String firstName) {
    this.lastName = "";
    this.firstName = firstName;
    this.patronymic = "";
  }

  public Name(String firstName, String lastName) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.patronymic = "";
  }

  public Name(String firstName, String lastName, String patronymic) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.patronymic = patronymic;
  }

  @Override
  public String toString() {
    String result = "";
    // Случай, когда полное ФИО
    if (lastName != null && !lastName.isEmpty() &&
        firstName != null && !firstName.isEmpty() &&
        patronymic != null && !patronymic.isEmpty()) {
      return lastName + " " + firstName + " " + patronymic;
    }
    //Остальные случаи
    if (firstName != null && !firstName.isEmpty()) {
      result += firstName + " ";
    }
    if (lastName != null && !lastName.isEmpty()) {
      result += lastName + " ";
    }

    if (patronymic != null && !patronymic.isEmpty()) {
      result += patronymic + " ";
    }
    return result.trim();
  }
}
