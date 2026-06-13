/*Create a class Distance with private variables feet of type integer and inches of type floating point. Use suitable constructor, and methods for adding and comparing two distance objects. [Hint: 1 feet = 12 inches] */
class Dist{
    private int feet;
    private float inches;
    Dist(int f,float i){
        feet = f;
        inches = i;
    }
    void add(Dist d){
        float totalfeet = (feet + d.feet);
        float totalinches = (inches+d.inches);
        if(totalinches>=12){
            totalfeet++;
            totalinches -= 12;
        }
        System.out.println("sum of two dist:"+totalfeet+"ft "+totalinches+"inch");
    }
    void compare(Dist d){
        float di= (12*feet+inches);
        float di1 = (12*d.feet)+(d.inches);
        if(di>di1){
            System.out.println("di is greatest"+di+"inches");
        }
        else{
            System.out.println("di1 is greatest"+di1+"inches");

        }
    }
}
public class Distance {
    public static void main(String[] args){
        Dist d = new Dist(5,6);
        Dist d1 = new Dist(6,7);
        d.add(d1);
        d.compare(d1);
    }
}
