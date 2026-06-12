import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class City {

  InputValidation inVal = new InputValidation();
  Scanner scanner = new Scanner(System.in);
  private String cityName;
  private Map<String, Integer> routes;

  public String getCityName() {
    return this.cityName;
  }

  public void setCityName(String name) {
    this.cityName = inVal.inputLetters(name);
  }

  public Map<String, Integer> getRoutes() {
    return this.routes;
  }

  public City() {
    this.cityName = "Какой-то город";
    this.routes = new HashMap<>();
  }

  public City(String cityName) {
    this.cityName = cityName;
    this.routes = new HashMap<>();
  }

  public void addRoute(String city, int cost) {
    routes.put(city, cost);
  }

  public String getAllRoutes() {
    String allRoutes = "";
    if (routes.isEmpty()) {
      return "Нет связанных городов";
    }
    for (Map.Entry<String, Integer> entry : routes.entrySet()) {
      allRoutes += "*" + entry.getKey() + " Цена: " + entry.getValue() + " ";
    }
    return allRoutes;
  }

  @Override
  public String toString() {
    if (routes.isEmpty()) {
      return "Город: " + this.cityName + "\nСвязанные города:\n  Нет связанных городов";
    }
    String result = "Город: " + this.cityName + "\nСвязанные с ним города: \n";
    for (Map.Entry<String, Integer> entry : routes.entrySet()) {
      result += "*" + entry.getKey() + " Цена: " + entry.getValue() + "\n";
    }
    return result;
  }
}
