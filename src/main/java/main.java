import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {


    public static void main(String[] args) {

        final Logger logger = Logger.getLogger("Logger");

        Scanner scanner = new Scanner(System.in);

        double side1;
        double side2;
        double side3;

        logger.log(Level.INFO,"Welcome to the Triangle type calculator. \n Enter side1: ");
        side1 = scanner.nextInt();
        logger.log(Level.INFO,"Enter side 2: ");
        side2 = scanner.nextInt();
        logger.log(Level.INFO,"Enter side 3: ");
        side3 = scanner.nextInt();


        Triangle triangle = new Triangle(side1,side2,side3);

        if (triangle.getType() == 1){
            logger.log(Level.INFO,"The Triangle is equilateral!");
        }
        else if (triangle.getType() == 2){
            logger.log(Level.INFO,"The Triangle is right angle!");
        }
        else if (triangle.getType() == 3){
            logger.log(Level.INFO,"The Triangle is scalene!");
        }
        else if (triangle.getType() == 4) {
            logger.log(Level.INFO,"The Triangle is isosceles!");
        }
        else {
            logger.log(Level.INFO,"Unknown Triangle!");
        }


    }

}
