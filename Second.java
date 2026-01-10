public class Second {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Add: " + (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.println("Mul: " + (a * b));
        System.out.println("Div: " + (a / b));

        // Relational
        System.out.println(a > b);
        System.out.println(a == b);

        // Logical
        System.out.println((a > b) && (b > 0));
        System.out.println((a < b) || (b > 0));
    }
}

