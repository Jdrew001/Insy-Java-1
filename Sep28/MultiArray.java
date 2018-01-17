public class MultiArray 
{
    

    public static void main(String args[])
    {
        int grades[][] = {{90,80,84,30}, {67,87,98,100}, {100,100,100,100}};

        calculateAverage(grades);
    }

    private static void calculateAverage(int[][] g)
    {
        double average;
        int total = 0;
        for(int i = 0; i < g.length; i++)
        {
            for(int j = 0; j < g[i].length; j++)
            {
                total += g[i][j];
            }

            average = total / g[i].length;
            System.out.println("Student " + i + " grade is " + average);
            total = 0;
            
        }
    }
}