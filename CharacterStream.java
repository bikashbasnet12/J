
import java.io.*;
public class CharacterStream {
    public static void main(String[] args){
        try{
            FileWriter fw =new FileWriter("notes.txt");
            String s = "hello from java";
            fw.write(s);
            fw.close();
            FileReader fr = new FileReader("notes.txt");
            char c[] = new char[100];
            fr.read(c);
            for(char i:c){
                System.out.print(i);
            }
            fr.close();

        }
        catch(IOException e){
                System.out.print(e);

        }
    }
}
