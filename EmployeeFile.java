import java.io.*;
import java.util.Scanner;
public class EmployeeFile {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("how many emploees?:");
            int n= sc.nextInt();
            sc.nextLine();
            FileWriter fw = new FileWriter("Emp.doc");
            for(int i =1;i<=n;i++){
                System.out.println("Employee:\n"+i);
                String name =sc.nextLine();
                System.out.println("Name:\n"+name);
                int salary = sc.nextInt();
                sc.nextLine();
                System.out.println("Salary:\n "+salary);
                fw.write("Employee:"+i);
            fw.write(name);
            fw.write(String.valueOf(salary));
  
            }
            
            fw.close();
            BufferedReader br =new BufferedReader(new FileReader("Emp.doc"));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
