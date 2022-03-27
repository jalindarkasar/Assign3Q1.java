import java.io.*;
abstract class Shape
{
    abstract double cal_area();
    abstract double cal_volume();
    final double pi = 3.14f;
}


class Sphere extends Shape
{
    double radius;
    Sphere()
    {

    }

    Sphere(double radius)
    {
        this.radius = radius;
    }

    double cal_area()
    {
        return 4*pi*this.radius*this.radius;
    }

    double cal_volume()
    {
        return 1.3333*pi*this.radius*this.radius*this.radius;
    }

    void display()
    {
        System.out.println("The area of sphere is :"+cal_area());
        System.out.println("The volume of sphere is :"+cal_volume());

    }

}



class Cone extends Sphere
{
    double radius,height;
    Cone()
    {

    }

    Cone(double radius,double height)
    {
        this.radius = radius;
        this.height = height;
    }

    double cal_area()
    {
        double sq = this.height*this.height + this.radius*this.radius;
        return pi*this.radius*(this.radius+java.long.Math.sqrt(sq));
    }

    double cal_volume()
    {
        return pi*this.radius*this.radius*(this.height/3);
    }

    void display()
    {
        System.out.println("The area of Cone is :"+cal_area());
        System.out.println("The volume of Cone is :"+cal_volume());
    }
}


class Cylinder extends Shape
{
    double radius,height;

    Cylinder()
    {

    }

    Cylinder(double radius,double height)
    {
        this.radius = radius;
        this.height = height;
    }

    double cal_area()
    {
        return ((2*pi*this.radius*this.height) + (2*pi*this.radius*this.radius));
    }

    double cal_volume()
    {
        return pi*this.radius*this.radius*this.height;
    }

    void display()
    {
        System.out.println("The area of Cylinder is :"+cal_area());
        System.out.println("The volume of Cylinder is :"+cal_volume());
    }

}




class Box extends Shape
{
    double length;
    double breadth;
    double height;

    Box()
    {

    }

    Box(double length,double breadth,double height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double cal_area()
    {
        return 2*((this.length*this.breadth) + (this.length*this.height) + (this.height*this.breadth));
    }

    double cal_volume()
    {
        return this.length*this.breadth*this.height;
    }

    void display()
    {
        System.out.println("The area of Box is :"+cal_area());
        System.out.println("The volume of Box is :"+cal_volume());
    }

}




public class Assig3Q2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sradius,cradius,cheight;
        while(true)
        {
            System.out.println("Please enter the radius for sphere shape :");
            sradius = Double.parseDouble(br.readLine());

            if(sradius > 0)
                break;

            else
            {
                System.out.println("Enter valid inpute :");
            }
        }

        Sphere s = new Sphere(sradius);
        s.display();



        while(true)
        {
            System.out.println("Please enter the radius for Cone Shape:");
            cradius = Double.parseDouble(br.readLine());

            System.out.println("Please enter the height for Cone Shape :");
            cheight = Double.parseDouble(br.readLine());

            if(cradius > 0 && cheight > 0)
                break;

            else
            {
                System.out.println("Enter valid inpute :");
            }
        }


        Cone c = new Cone(cradius,cheight);
        c.display();


        

        Cylinder cy = new Cylinder(cheight,sradius);
        cy.display();

        

        System.out.println("Please enter the length for Box Shape :");
        double blength = Double.parseDouble(br.readLine());


        System.out.println("Please enter the Breadth for Box Shape :");
        double bbreadth = Double.parseDouble(br.readLine());

        System.out.println("Please enter the height for Box Shape :");
        double bheight = Double.parseDouble(br.readLine());

      
        Box b = new Box(blength,bbreadth,bheight);
        b.display();

    }
}
