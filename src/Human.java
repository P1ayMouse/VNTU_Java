public class Human
{
    String name;
    String surname;

    public Human(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
}

class Student extends Human
{
    double zno;
    double fdp;
    double atestat;
    double rating;

    public Student(String name, String surname, double zno, double fdp, double atestat)
    {
        super(name, surname);
        this.zno = zno;
        this.fdp = fdp;
        this.atestat = atestat;
        this.rating = calculate_rating();
    }

    public Student(String name, String surname, double zno, double atestat)
    {
        super(name, surname);
        this.zno = zno;
        this.atestat = atestat;
        this.rating = calculate_rating();
    }

    private double calculate_rating()
    {
        return (0.6 * zno + 0.2 * fdp + 0.2 * atestat);
    }

    public void print_rating()
    {
        System.out.println("\nПовне імʼя: " + name + " " + surname + "\nРейтинг: " + rating);
    }

    public static void main(String[] args)
    {
        System.out.println("\n\t--- Eighth task ---");
        Student student_1 = new Student("Чорний", "Юрій", 180, 190, 9.5);
        student_1.print_rating();
        Student student_2 = new Student("Риженко", "Артем", 190.5, 195, 10.5);
        student_2.print_rating();
        Student student_3 = new Student("Карпенко", "Ярослав", 185, 200, 10);
        student_3.print_rating();
        Student student_4 = new Student("Мельник", "Вадим", 185.5, 10);
        student_4.print_rating();
    }
}
