import java.util.Scanner;
import java.io.*;

public class WC 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter file name: ");
        File f = new File(s.next());
        try
        {
            Scanner file_scan = new Scanner(f);
        }
        catch (IOException i)
        {
            System.out.println("Le error has occured");
        }	

        int char_count = 0;
        try
        {
            while (file_scan.hasNext())
            {
                char_count += 1;
            }
        }
        finally
        {
            System.out.println(char_count);
        }
    }
}
