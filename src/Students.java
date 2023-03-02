public class Students {
    String surname;
    double average_mark;
    int number_of_absences;
    int age;
    char gender;
    boolean has_scholarship;
    boolean is_military_service_required;

    public Students(String surname, double average_mark, int number_of_absences, int age, char gender)
    {
        this.surname = surname;
        this.average_mark = average_mark;
        this.number_of_absences = number_of_absences;
        this.age = age;
        this.gender = gender;

        class MilitaryServiceChecker
        {
            boolean check()
            {
                return gender == 'M' && age > 18;
            }
        }

        MilitaryServiceChecker military_service_checker = new MilitaryServiceChecker();
        this.is_military_service_required = military_service_checker.check();

        class Scholarship {
            boolean calculate() {
                return average_mark >= 4.5 && number_of_absences < 10;
            }
        }

        Scholarship scholarship = new Scholarship();
        this.has_scholarship = scholarship.calculate();
    }

    public void print_student()
    {
        System.out.println("\nПрізвище: " + surname +
                "\nСередній бал: " + average_mark +
                "\nкількість пропусків: " + number_of_absences +
                "\nВік: " + age +
                "\nСтать: " + gender +
                "\nОтримання стипендії: " + has_scholarship +
                "\nНеобхідність у військовому обліку: " + is_military_service_required);
    }

    public static void main(String[] args)
    {
        System.out.println("\n\t--- Eleventh task ---");
        Students student_1 = new Students("Риженко", 4.6, 8, 17, 'M');
        student_1.print_student();
        Students student_2 = new Students("Чорний", 4, 26, 19, 'M');
        student_2.print_student();
        Students student_3 = new Students("Паламарчук", 3, 5, 21, 'F');
        student_3.print_student();
        Students student_4 = new Students("Карпенко", 4.5, 9, 20, 'M');
        student_4.print_student();
    }
}
