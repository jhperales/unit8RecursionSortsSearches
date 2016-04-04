import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   public static final double LIMIT = 50;
   public static final double BOYS_TOTAL = 19229058;
   public static final double GIRLS_TOTAL = 18450257;

   public static void main(String[] args) throws FileNotFoundException
   {  
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a file name: ");
      File inputFile = new File(s.next());
      Scanner in = new Scanner(inputFile);
      
         
      RecordReader boys = new RecordReader(LIMIT, BOYS_TOTAL);
      RecordReader girls = new RecordReader(LIMIT, GIRLS_TOTAL);
      
      while ()
      {
         int rank = in.nextInt();
         System.out.print(rank + " ");
         boys.processBo(in);
         girls.process(in);
         System.out.println();
      }

      in.close();
   }
}	
