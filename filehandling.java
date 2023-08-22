import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {
        //This code is for creating a file, here an object of class File is created an then operations are performed on it.
        // we can create different objects for different operations like read,write and delete or we can perform all the operation with the same object
        //In ever object created path of the file is passes as an argument
        File myFile = new File("abc.txt");
        try {
            myFile.createNewFile();//This creates a new file
        } catch (IOException e) {
            System.out.println("Unable to create file");
        }
        // This code is for writting in a file
        try {
            FileWriter mu = new FileWriter("abc.txt");
            mu.write("This is the first line\nThis is the second line");// for writting in a new line use \n.
            mu.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        //This code is for reading the content of file
        File  a=new File("abc.txt");
        try{
            Scanner sc=new Scanner(a);
            while(sc.hasNextLine())
            {
                String p=sc.nextLine();
                System.out.println(p);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        //This code is for deleting the file
        if(a.delete())
        {
            System.out.println("File deleted succesfully");
        }
        else
        {
            System.out.println("Some error occured while deleting the file");
        }

    }
}
