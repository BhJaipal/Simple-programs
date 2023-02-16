import java.util.Scanner;
class Cuboid{
    int len;
    int brea;
    int hei;
    Cuboid(int len, int brea, int hei) {
        this.len = len;
        this.brea= brea;
        this.hei = hei;
    }
    public int cubo_tsa() {
        return 2* (len*brea + brea*hei + hei*len);
    }
    public int cubo_lsa() {
        return 2*(len + brea) *hei;
    }
    public int cubo_vol() {
        return len*brea*hei;
    }
    public double cubo_dia() {
        return Math.sqrt(Math.pow(len, 2) + Math.pow(brea, 2) + Math.pow(hei, 2));
    }
    public void execute() {
        System.out.print("Total Surface area: ");
        System.out.println(cubo_tsa());
        System.out.print("Lateral Surface area: ");
        System.out.println(cubo_lsa());
        System.out.print("Volume: ");
        System.out.println(cubo_vol());
        System.out.print("Length of Diagonal: ");
        System.out.println(cubo_lsa());
    }
};

class Cube{
    int side;
    Cube(int side) {
        this.side= side;
    }
    public int cube_tsa() {
        return 6*side*side;
    }
    public int cube_lsa() {
        return 4*side*side;
    }
    public double cube_vol() {
        return Math.pow(side, 3);
    }
    public double cube_dia() {
        return side* 1.73;
    }
    public void execute() {
        System.out.print("Total Surface area: ");
        System.out.println(cube_tsa());
        System.out.print("Lateral Surface area: ");
        System.out.println(cube_lsa());
        System.out.print("Volume: ");
        System.out.println(cube_vol());
        System.out.print("Length of Diagonal: ");
        System.out.println(cube_dia());
    }
};

class Sphere{
    final double pi= 22/7;
    int rad;
    Sphere(int rad) {
        this.rad = rad;
    }
    public double sphere_sa() {
        return 4*pi* rad*rad;
    }
    public double sphere_volume() {
        return 1.67*pi* Math.pow(rad, 3);
    }
    public void execute() {
        System.out.print("Surface area: ");
        System.out.println(sphere_sa());
        System.out.print("Volume: ");
        System.out.println(sphere_volume());
    }
};

class Cylinder{
    int radi;
    int heig;
    double pi= 22/7;
    Cylinder(int radi, int heig) {
        this.radi= radi;
        this.heig= heig;
    }
    public double cyl_tsa() {
        return 2*pi*radi* (heig + radi);
    }
    public double cyl_csa() {
        return 2*pi* radi*heig;
    }
    public double cyl_vol() {
        return pi* radi*radi*heig;
    }
    public void execute() {
        System.out.print("Total Surface area: ");
        System.out.println(cyl_tsa());
        System.out.print("Curved Surface area: ");
        System.out.println(cyl_csa());
        System.out.print("Volume: ");
        System.out.println(cyl_vol());
    }
};

class Main{
    public static void main_execution() {
        Scanner obj= new Scanner(System.in);
        while (true) {
            System.out.println("Select one:\n1.Sphere\n2.Cube\n3.Cuboid\n4.Cylinder\n5.Exit");
            System.out.print("Enter your choice(1-5): ");
            int choice= obj.nextInt();
            System.out.println();
                if (choice == 1) {
                    int radius = obj.nextInt();
                    Sphere mySphere = new Sphere(radius);
                    mySphere.execute();
                }
                else if (choice == 2) {
                    int sides = obj.nextInt();
                    Cube mycube = new Cube(sides);
                    mycube.execute();
                }
                else if (choice == 3) {
                    int length = obj.nextInt();
                    int breadth= obj.nextInt();
                    int height = obj.nextInt();
                    Cuboid mycuboid = new Cuboid(length, breadth, height);
                    mycuboid.execute();
                }
                else if (choice == 4) {
                    int radii = obj.nextInt();
                    int heigh = obj.nextInt();
                    Cylinder mycylinder = new Cylinder(radii, heigh);
                    mycylinder.execute();
                }
                else if (choice == 5) {
                    break;
                }
                else {
                    System.out.println("Invalid choice");
                }
            System.out.println();
            System.out.print("Do you want to continue: ");
            String cont= obj.next();
            if (cont.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
    }
}
    
    public static void main(String[] args) {
        main_execution();
    }
}