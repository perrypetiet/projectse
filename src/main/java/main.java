import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double side1;
        double side2;
        double side3;

        System.out.println("Welcome to the triangle type calculator. \n Enter side1: ");
        side1 = scanner.nextInt();
        System.out.println("Enter side 2: ");
        side2 = scanner.nextInt();
        System.out.println("Enter side 3: ");
        side3 = scanner.nextInt();


        triangle Triangle = new triangle(side1,side2,side3);

        if (Triangle.getType() == 1){
            System.out.println("The triangle is equilateral!");
        }
        else if (Triangle.getType() == 2){
            System.out.println("The triangle is right angle!");
        }
        else if (Triangle.getType() == 3){
            System.out.println("The triangle is scalene!");
        }
        else if (Triangle.getType() == 4) {
            System.out.println("The triangle is isosceles!");
        }
        else {
            System.out.println("Unknown triangle!");
        }


    }

}
