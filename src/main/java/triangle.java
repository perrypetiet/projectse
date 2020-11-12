// Perry Petiet
// 483554@student.saxion.nl

public class triangle {
    double side1;
    double side2;
    double side3;

    double a;
    double b;
    double c;

    public triangle(double side1, double side2, double side3){
        this.side1 = side1; //a
        this.side2 = side2; //b
        this.side3 = side3; //c

        //calculate alpha
        a = Math.toDegrees(
                Math.acos(( (side2*side2 + side3*side3 - side1*side1) / (2*side2*side3)) )
        );

        b = Math.toDegrees(
                Math.acos(( (side1*side1 + side3*side3 - side2*side2) / (2*side1*side3)) )
        );

        c = Math.toDegrees(
                Math.acos(( (side1*side1 + side2*side2 - side3*side3) / (2*side1*side2)) )
        );
    }


    public int getType(){
        //equilateral
        if(Math.round(side1) == Math.round(side2) && Math.round(side1) == Math.round(side3)){
            return 1;
        }
        //right angle
        else if(Math.round(a) == 90 || Math.round(b) == 90 || Math.round(c) == 90){
            return 2;
        }
        //scalene
        else if(Math.round(side1) != Math.round(side2) && Math.round(side1) != Math.round(side3) && Math.round(side2) != Math.round(side3)
                && Math.round(a) != Math.round(b) && Math.round(a) != Math.round(c) && Math.round(b) != Math.round(c)){
            return 3;
        }
        //isosceles
        else if(Math.round(a) == Math.round(b) || Math.round(a) == Math.round(c) || Math.round(b) == Math.round(c) &&
                Math.round(side1) == Math.round(side2) || Math.round(side1) == Math.round(side3) || Math.round(side2) == Math.round(side3)){
            return 4;
        }
        else
            return 0;
    }

}
