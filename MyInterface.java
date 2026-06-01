public class MyInterface {
    public static void main(String[] args){
        ColoredShape l = new Circle();
        l.FillColor();
        l.draw();
    }
    
}

interface Shape{
    void draw();
}
interface Color{
    void FillColor();
}
interface ColoredShape extends Shape,Color{

}
class Circle implements ColoredShape{
    public void draw(){
        System.out.println("drawing circle");
    }
    public void FillColor(){
        System.out.println("colored");

    }
}