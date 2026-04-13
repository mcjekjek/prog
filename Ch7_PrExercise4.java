import java.util.*;

public class Ch7_PrExercise4 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("-PART A-");
    System.out.println("one(6,8) = " +one(6,8));
    System.out.println("one(8,6) = " +one(8,6));

    System.out.println("\n-PART B-");
    System.out.println("two(6, 6.7) = " + two(6, 6.7));

    }

    public static int one (int x, int y){
        if (x > y)
        return    x + y;
        else
        return x - 2 * y;

    }

    public static double two (int x, double a){
         int first;
        double z;

    
        System.out.print("Enter a number for z: ");
        z = input.nextDouble();

        z = z + a;

        first = one(6, 8);

       
        first = first + x;

        if (z > 2 * first)
            return z;
        else
            return 2 * first - z;



    }

}
