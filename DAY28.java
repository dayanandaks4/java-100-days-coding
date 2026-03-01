 /* What is a Checked Exception?
Checked Exceptions are exceptions checked at compile time.
The compiler forces us to handle them using try-catch or throws.
  
Example: IOException, FileNotFoundException.
*/



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileReaderExample {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("B:\\movies\\OneDrive\\Desktop\\text.txt");
            System.out.println("File Read Succesfully");
            BufferedReader br =new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File is not There check the file...");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("We always Run I dont care about Others..");
        }
    }
}
