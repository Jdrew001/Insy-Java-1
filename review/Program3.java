public class Program3 
{
    public void main(String args[])
    {
        int number = 7;

        if(number == 5)
        {
            number *= 2;
        } 
        else if(number == 7)
        {
            number /= 3;
        }
        else if(number == 2 || number == 6)
        {
            number += 1;
        }
        else if (number != 4 && number > 10)
        {
            number += 2;
        }
    }
}