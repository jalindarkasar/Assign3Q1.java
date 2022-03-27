import java.io.*;
class Employee
{
    private int id;
    private String name,department;
    double salary;

    Employee()
    {

    }

    Employee(String name,String department,double salary)
    {
        id++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display()
    {
        System.out.println("```````````````````````````");
        System.out.println("The name is : "+name);
        System.out.println("The department is : "+department);
        System.out.println("The salary is : "+salary);
        System.out.println("```````````````````````````");
    }
}



class Manager extends Employee
{
    private double Bonus;
    double total = 0;

    Manager(String name,String department,double salary,double Bonus)
    {
        super(name,department,salary);
        total = super.salary + Bonus;

    }


    void display()
    {
        super.display();
        System.out.println("Total salary is : "+total);
    }
}


class Assign3Q1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the employee you want to enter :");
        int n = Integer.parseInt(br.readLine());

        Manager m[] = new Manager[n];

        for(int i=0;i<n;i++)
        {
            
            System.out.println("```````````````````````````");
            System.out.println("Enter the name of employee : ");
            String name = br.readLine();

            System.out.println("Enter the department of employee : ");
            String department = br.readLine();
            System.out.println("Enter the salary of employee : ");
            Double salary = Double.parseDouble(br.readLine());

            System.out.println("Enter the Bonus of employee : ");
            Double Bonus = Double.parseDouble(br.readLine());

            m[i] = new Manager(name,department,salary,Bonus);
        }

        for(int i=0;i<n;i++)
        {
            m[i].display();
        }

        double max = m[0].total;
        int maxo = 0;

        for(int i=0;i<n;i++)
        {
            if(max<m[i].total)
            {
                max = m[i].total;
                maxo = i;
            }
        }

        System.out.println("The maximum salary of employee is :");
        m[maxo].display();
    }
}

























































