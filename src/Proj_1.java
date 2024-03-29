import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proj_1 {
    public static void pair_nonpair_indexes(Scanner scanner)
    {
        System.out.println("\n\n\n\t--- First task ---");
        System.out.print("\nВведіть число: ");
        int number = scanner.nextInt();

        String number_string = Integer.toString(number);

        System.out.print("Числа із парним індексом: ");
        for (int i = 0; i < number_string.length(); i++) {
            if (i % 2 == 0)
            {
                System.out.print(number_string.charAt(i));
            }
        }

        System.out.print("\nЧисла із непапарними індексами: ");
        for (int i = 0; i < number_string.length(); i++) {
            if (i % 2 != 0)
            {
                System.out.print(number_string.charAt(i));
            }
        }
    }

    public static void identical_symbols()
    {
        System.out.println("\n\n\n\t--- Second task ---");
        System.out.print("\nВведіть текст: ");
        String str = "Hello world! My name is Artem";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int char_value = 0;
            for (int j = 0; j < str.length(); j++) {
                if (c == str.charAt(j)) {
                    char_value ++;
                }
            }
            System.out.print("\nСимвол " + str.charAt(i) + ": " + char_value);
        }
    }

    public static void lived_days(Scanner scanner)
    {
        System.out.println("\n\n\n\t--- Third task ---");
        System.out.print("\nВведіть рік: ");
        int year = scanner.nextInt();
        System.out.print("Введіть місяць: ");
        int month = scanner.nextInt();
        System.out.print("Введіть день: ");
        int day = scanner.nextInt();

        LocalDate birth_date = LocalDate.of(year, month, day);
        LocalDate current_date = LocalDate.now();
        long days_lived = ChronoUnit.DAYS.between(birth_date, current_date);
        System.out.println("Кількість прожитих днів: " + days_lived);
    }

    public static void letters_and_numbers()
    {
        System.out.println("\n\n\n\t--- Fourth task ---");
        String input_string = "asdrftgyuhi2jkopl34fdsvsd358fkhviuh4x38c9ad7538ewhfjhsd9f0sdsjf";
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < input_string.length(); i++) {
            if (Character.isLetter(input_string.charAt(i))) {
                letters.append(input_string.charAt(i));
            }
            else if (Character.isDigit(input_string.charAt(i))) {
                numbers.append(input_string.charAt(i));
            }
        }

        int i;
        System.out.println("\nБуквенні символи: ");
        for (i = 0; i < letters.length() - 10; i += 10) {
            System.out.println(letters.substring(i, i + 10));
        }
        if (i < letters.length()) {
            System.out.println(letters.substring(i));
        }

        System.out.println("\nЦифри: ");
        System.out.println(numbers);
    }

    public static void pair_nonpair_numbers(Scanner scanner)
    {
        System.out.println("\n\n\n\t--- Fifth task ---");
        System.out.print("\nВведіть число: ");
        int number = scanner.nextInt();

        int sum_even = 0;
        int sum_odd = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum_even += digit;
            }
            else
            {
                sum_odd += digit;
            }
            number /= 10;
        }

        System.out.println("Сума парних чисел: " + sum_even);
        System.out.println("Сума непарних чисел: " + sum_odd);
    }

    public static void math_and_exception(Scanner scanner)
    {
        System.out.println("\n\n\n\t--- Sixth task ---");
        System.out.println("\nВведіть три числа розділених пробілом: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        try {
            double num1 = Double.parseDouble(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            double num3 = Double.parseDouble(numbers[2]);

            if (num3 < 0) {
                throw new IllegalArgumentException("Третє число мусить бути не відʼємним");
            }

            double result = Math.pow(Math.pow(num1, num2), 1/num3);

            System.out.println("Результат: " + result);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Не правильно введено числа. " +
                    "Введіть три числа через пробіл, де друге число є цілим, а третє - додатнім");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pair_nonpair_indexes(scanner);
        identical_symbols();
        lived_days(scanner);
        letters_and_numbers();
        pair_nonpair_numbers(scanner);
        math_and_exception(scanner);
        scanner.close();
    }
}

