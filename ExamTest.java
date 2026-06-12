//Write a program to input the name of faculty and throw an exception if that input is not “CSIT”.
class Except{
    void show(String n){
        try{
            if (n != "CSIT")
                throw new Exception("not csit");
            else{
                System.out.println("CSIT");
            }

        }
        catch(Exception e){
                System.out.println(e);
            
        }

    }
}
public class ExamTest {
    public static void main(String[] args){
        Except e1 = new Except();
        e1.show("CSIT");
    }
}

