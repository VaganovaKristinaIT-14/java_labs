

public class Cat {

  InputValidation inVal = new InputValidation();
  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = inVal.inputLetters(name);
  }

  public Cat() {
    this.name = "Кот";
  }

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Кот: " + this.name;
  }

  public void may() {
    System.out.println(this.name + ": мяу!");
  }

  public void mayN(int a) {
    System.out.print(this.name + ": ");
    for (int i = 0; i < a - 1; i++) {
      System.out.print("мяу-");
    }
    System.out.print("мяу!");
  }
}
