public class GradesArray
{
    public static void main(String args[])
    {
        String grades[][] = {{"Jones", "90", "80", "70", "60"}, 
                            {"Drew", "90", "80", "50", "60"}, 
                            {"Larry", "100", "80", "70", "60"}};

        
    }

    public static void grades(String[][] g)
    {
        int average;
        int total = 0;

        for(int i = 0; i < g.length; i++)
        {
            total = 0;
            for(int j = 0; j < g[i].length; j++)
                total += Integer.parseInt(g[i][j]);

            average = total / g[i].length;
            System.out.println("Student " + i + " grades is " + average);
        }
    }
}