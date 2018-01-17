public class Student 
{
    String gradeLevel;
    String name;
    int studentId;
    double gradePointAverage;

    public Student()
    {
        gradeLevel = "freshmen";
        name = "";
        studentId = 10000;
        gradePointAverage = 0.0;
    }

    //Constructor that sets

    public String toString()
    {
        return ("");
    }

    //gets and sets
    public void setGradePointAverage(double g)
    {
        if(g < 0)
            this.gradeLevel = g;
    }
}