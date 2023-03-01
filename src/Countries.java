public class Countries {
    String name;
    String capital;
    int population;
    String currency;

    public Countries(String name, String capital, int population, String currency)
    {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.currency = currency;
    }

    public void set_name(String name)
    {
        this.name = name;
    }

    public void set_capital(String capital)
    {
        this.capital = capital;
    }

    public void set_population(int population)
    {
        this.population = population;
    }

    public void set_currency(String currency)
    {
        this.currency = currency;
    }

    public String country_information()
    {
        return "\n\tКраїна: " + name + "\n\tСтолиця: " + capital + "\n\tНаселення: " + population
                + "\n\tГрошова одиниця: " + currency;
    }

    public static String get_larger_population(Countries country_1, Countries country_2) {
        if (country_1.population > country_2.population)
        {
            return country_1.name;
        }
        else
        {
            return country_2.name;
        }
    }

    public static void main(String[] args) {
        Countries usa = new Countries("Сполучені Штати Америки",
                "Вашингтон", 328_200_000, "USD");
        Countries india = new Countries("Індія", "Нью-Делі", 1_408_000_000, "USD");

        System.out.println("Країна з найбільшим населенням: " + Countries.get_larger_population(usa, india));

        Countries germany = new Countries("Німеччина", "Берлін", 83_100_000, "EUR");

        Countries country_1 = usa;
        Countries country_2 = india;
        Countries country_3 = germany;

        country_3.set_capital("Франкфурт");

        System.out.println(country_3.country_information());
    }
}
