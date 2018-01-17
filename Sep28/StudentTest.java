public class StudentTest
{
    public static void main(String args[])
    {
        Student studentArray[] = new Student[3];

        studentArray[0] = new Student("Jones", 95);
        studentArray[1] = new Student("Smith", 80);
        studentArray[2] = new Student("Dale", 76);

        for (int i = 0; i < studentArray.length; i++)
        {
            System.out.println(studentArray[i].toString());
        }
    }
}