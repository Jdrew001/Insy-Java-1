public class Student
{
    private String name;
    private int average;

    public Student()
    {
        name = "";
        average = 0;
    }

    public Student(String n, int a)
    {
        this.name = n;
        this.average = a;
    }

    //gets and sets
    public String toString()
    {
        return (" Name " + name + " average " + average);
    }
}