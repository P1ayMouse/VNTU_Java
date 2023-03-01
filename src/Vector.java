import java.text.DecimalFormat;

public class Vector {
    double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double dot_product(Vector other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector cross_product(Vector other) {
        double new_x = y*other.z - z*other.y;
        double new_y = z*other.x - x*other.z;
        double new_z = x*other.y - y*other.x;
        return new Vector(new_x, new_y, new_z);
    }

    public static void main(String[] args) {
        System.out.println("\n\n\t--- Seventh task ---");
        DecimalFormat dF = new DecimalFormat( "#.###" );
        Vector vector_1 = new Vector(3, 4, 6);
        Vector vector_2 = new Vector(1, 8, 2);
        System.out.print("\nДовжина вектора: ");
        System.out.println(dF.format(vector_1.length()));
        System.out.print("\nСкалярний добуток двох векторів: ");
        System.out.println(dF.format(vector_1.dot_product(vector_2)));
        Vector vector_3 = vector_1.cross_product(vector_2);
        System.out.println("\nВекторний добуток двох векторів: ");
        System.out.println("x: " + vector_3.x + "; y: " + vector_3.y + "; z: " + vector_3.z);
    }
}