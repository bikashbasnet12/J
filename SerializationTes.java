import java.io.*;
public class SerializationTes{
    public static void main(String[] args){
        try{
        FileOutputStream fis = new FileOutputStream("Student.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fis);
        Student st = new Student("Dhan",85);
        oos.writeObject(st);
        oos.close();
        fis.close();
        FileInputStream fos = new FileInputStream("Student.dat");
        ObjectInputStream ois = new ObjectInputStream(fos);
        Student s = (Student)ois.readObject();
        System.out.print(s.toString());
        ois.close();
        fos.close();
        }   
        catch(FileNotFoundException e){
        System.out.print(e);


        }     
        catch(Exception e){
            System.out.println(e);

        }
    }
}
class Student implements Serializable{
    String name;
    int marks;
    Student(String n, int m){
        name = n;
        marks = m;

    }
     public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }
    
}