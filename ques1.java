import java.util.Scanner;

class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double costPerKm;

    BoxWeight(double w, double h, double d, double cost) {
        super(w, h, d);
        costPerKm = cost;
    }

    double shippingCost(double distance) {
        return distance * volume() * costPerKm;
    }
}

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width height depth: ");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.print("Enter cost per km: ");
        double cost = sc.nextDouble();

        System.out.print("Enter distance: ");
        double distance = sc.nextDouble();

        Box obj = new BoxWeight(w, h, d, cost);

        BoxWeight bw = (BoxWeight) obj;
        System.out.println("Volume of Box: " + bw.volume());
        System.out.println("Shipping Cost: " + bw.shippingCost(distance));
    }
}
