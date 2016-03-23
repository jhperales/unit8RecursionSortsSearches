import java.io.*;

public class WC 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int char_count = 0;
        int words = 0;
        int lines = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter file name: ");
        
        File input = new File(s.next());
        Scanner inLine = new Scanner(input);
        Scanner inWord = new Scanner(input);
        Scanner inChar = new Scanner(input);
        
        while (inLine.hasNextLine())
        {
            lines++;
            inLine.nextLine();
        }
        while (inWord.hasNext())
        {
            words++;
            inWord.next();
        }
        
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}
