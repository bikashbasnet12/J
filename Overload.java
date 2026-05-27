/*Create a class Calculator with overloaded add methods:
add(int a, int b)
add(int a, int b, int c)
add(double a, double b). Call all three methods from main and print the answers.*/
public class Overload {
    public static void main(String[] args){
        Calculator c = new Calculator();
        int sum =c.add(5,6);
        int sum1 = c.add(1,2,3);
       double sum2 =  c.add(3.0,5.6);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        Printer p = new Printer();
        System.out.print("Name:");
        p.printInfo("Asus");
        p.printInfo("Asus",15);
        p.printInfo("Asus",15,"itahar");
    }
}
class Calculator{
    int add(int a ,int b){
        int sum;
        sum = a+b;
        //System.out.println(sum);
        return sum;

    }

    int add(int a,int b,int c){
        int sum;
        sum = a+b+c;
        //System.out.println(sum);

       return sum;
    }
    double add(double a ,double b){
        double sum;
        sum = a+b;
        //System.out.println(sum);
        return sum;
    }
}
/*Create a class Printer with overloaded printInfo methods:
printInfo(String name)
printInfo(String name, int age)
printInfo(String name, int age, String city)*/
class Printer{
   void printInfo(String name){
        System.out.println(name);

    }
    void printInfo(String name, int age){
        System.out.println("Name:"+name+
        "age:"+age);


}
    void printInfo(String name, int age, String city){
        System.out.println(name+ age +city);

}

}