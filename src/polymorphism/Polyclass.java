package polymorphism;
//complied time polymorphsam
//method overiding
public class Polyclass {
    public int add(int a, int b) {
        System.out.println("add the number");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("add this number double");
        return a + b;
    }

    public float add(float a, float b) {
        System.out.println("add this number float ");
        return a + b;
    }

    public static void main(String[] args) {
        Polyclass obj = new Polyclass();

        int result1 = obj.add(12, 11);
        double result2 = obj.add(11.7, 11.5);
        float result3 = obj.add(11.2f, 33.f);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
