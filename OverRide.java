public class OverRide {
    public static void main(String[] args){
        Over1 o = new Over1();
        o.show();

    }
}
class Over{
    void show(){
        System.out.println("this is show");

    }
}
class Over1 extends Over{
     void show(){
        System.out.println("this is show of over1");

    }
}