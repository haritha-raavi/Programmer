import java.util.*;

public class CircleRadius {
    int radius;
    double calculateArea(int r)
    {
        return (Math.PI*Math.pow(r,2));
    }
    CircleRadius(int radius)
    {
        this.radius=radius;
    }
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        CircleRadius obj = new CircleRadius(scanner.nextInt());
        scanner.close();
        System.out.println(obj.calculateArea(obj.radius));
    }
    
}
