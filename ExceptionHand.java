public class ExceptionHand {
    public static void main(String[]args){
        try{
            ExceptionTest obj = new ExceptionTest();
            obj.show1();
        }
        catch(ArithmeticException e){
            System.out.println("Error : divide by zero"+e);
        }

    }

}
class ExceptionTest {
    void show() throws ArithmeticException{
       
            int s4 = 7/0;//exception occurs
    }
    void show1(){
        show();
    }
}
