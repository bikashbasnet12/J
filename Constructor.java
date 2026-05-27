/*
Create a Student class with data:
String name;
int marks;
Make a constructor that sets name and marks.

Then create 3 student objects from main and print their details.
*/

public class Constructor {
    public static void main(String[] args){
        Studentsh s = new Studentsh();
        s.name = "bikash";
        s.marks = 40;
        s.display();
    }
}
class Studentsh{
    String name;
    int marks;
    Studentsh(){//default not neccessary to write
    }
    void display(){
            System.out.println(name+marks);

        }
}