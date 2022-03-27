import java.io.*;

abstract class Staff
{
    String name,address;
}

class FullTimeStaff extends Staff
{
    String name,department;
    double salary;

    FullTimeStaff()
    {

    }

    FullTimeStaff(String name,String department,double salary)
    {
        this.name = name;
        this.department = department;
        this.salary = salary;

    }


    void display()
    {
        System.out.println("The name is :"+name);
        System.out.println("The department is :"+department);
        System.out.println("The salary is :"+salary);
    }
}




class PartTimeStaff extends Staff
{
    double hours,rate;

    PartTimeStaff()
    {

    }

    PartTimeStaff(double hours,double rate)
    {
        this.hours = hours;
        this.rate = rate;
    }

    void display()
    {
        System.out.println("The staff work  is (hours) :"+hours);
        System.out.println("The rate per hours :"+rate);
    }

}










public class Assig3Q3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("```````````````````````````");
        System.out.println("Enter the name of employee : ");
        String name = br.readLine();

        System.out.println("Enter the address of employee : ");
        String address = br.readLine();

        System.out.println("Enter the department of employee : ");
        String department = br.readLine();

        System.out.println("Enter the salary of employee : ");
        Double salary = Double.parseDouble(br.readLine());

        System.out.println("Enter the Option :- 1: Fulltime Staff // 2: PartTime Staff : ");
        int ch = Integer.parseInt(br.readLine());


        switch(ch)
        {
            case 1 : 
            
                        FullTimeStaff fs = new FullTimeStaff(name,department,salary);
                        fs.display();
                        break;

            case 2 : 
            
                        System.out.println("Enter hours :");
                        double hours = Double.parseDouble(br.readLine());

                        System.out.println("Enter the rate :");
                        double rate = Double.parseDouble(br.readLine());

                        PartTimeStaff ps = new PartTimeStaff(hours,rate);
                        ps.display();
                        break;


        }


    }
}
