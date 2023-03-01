public class Package
{
    double width;
    double height;
    double depth;
    int id;

    static int num_of_packages = 0;

    public Package(double width, double depth, double height)
    {
        this.width = width;
        this.depth = depth;
        this.height = height;

        this.id = ++num_of_packages;
    }

    public double get_volume()
    {
        return width * depth * height;
    }
    public static int get_num_of_packages()
    {
        return num_of_packages;
    }
}

class PackageArray
{
    Package[] packages;

    public PackageArray(int size)
    {
        this.packages = new Package[size];
    }

    public void add_package(Package pkg)
    {
        for (int i = 0; i < packages.length; i++) {
            if (packages[i] == null) {
                packages[i] = pkg;
                return;
            }
        }
    }

    public Package get_smallest_package()
    {
        Package smallest = packages[0];
        for (int i = 1; i < packages.length; i++) {
            if (packages[i] != null && packages[i].get_volume() < smallest.get_volume()) {
                smallest = packages[i];
            }
        }
        return smallest;
    }
}

class Main
{
    public static void main(String[] args)
    {
        PackageArray package_array = new PackageArray(5);
        package_array.add_package(new Package(5, 5, 5));
        package_array.add_package(new Package(4, 4, 4));
        package_array.add_package(new Package(3, 3, 3));
        package_array.add_package(new Package(2, 2, 2));
        package_array.add_package(new Package(1, 1, 1));

        Package smallest_package = package_array.get_smallest_package();
        System.out.println("Найменший пакет із id " + smallest_package.id);

        int package_count = Package.get_num_of_packages();
        if (package_count > 10) {
            System.out.println("\nКількість пакетів мусить бути не більше 10");
        }
    }
}