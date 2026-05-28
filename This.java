/*Create a Student class with name and marks. Use a constructor with the same parameter names as the instance variables, and use this to assign values. Create two objects and print their details.*/
public class This {
    public static void main(String[]args){
        Std s1 = new Std("bikash",100);
        Std s2 = new Std("bisal",10);
        s1.Show();
        s2.Show(); 
        BankAccount b = new BankAccount("Hari",15000);
        b.deposit(10000);
        b.withdraw(5000);
        b.disp();
    }
}
class Std{
        String name;
        int marks;
        Std(String name,int marks){
            this.name=name;
            this.marks = marks;

        }
        void Show(){
            System.out.println(name+"="+marks);
        }
}
//Create a Car class with brand, model, and price. Use a constructor with the same parameter names as the instance variables, and use this to assign values. Create two objects and display their details.å
class Car1{
    String brand;
    String model;
    int price;
    //similar as above onl diff is parameter+1


}
//Create a BankAccount class with account holder name and balance. Use this in the constructor. Add deposit, withdraw, and display methods. In main, perform multiple deposits and withdrawals, then print the final account details.
class BankAccount{
    String name;
    int balance;
    BankAccount(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    void deposit(int balance){
        this.balance = this.balance+balance;
        System.out.println("Rs:"+balance +" "+ "depsoited");
    }
    void withdraw(int balance){
        this.balance = this.balance - balance;
        System.out.println("Rs:"+balance + " "+"Withdrawn");
    }
    void disp(){
        System.out.print(name +" " +  "balance:" +  " " + balance);
    }
}