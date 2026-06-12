interface HI{
    void add();
}
abstract class Hello implements HI{
    void sum(){
        System.out.println("this is sum method");
    }
    }
class Hey extends Hello{
    public void add(){
        System.out.println("this is add method");

    }
}


public class InterfacePrac{
    public static void main(String[] args){
        Hey j = new Hey();
        j.add();
        j.sum();
    }
}
