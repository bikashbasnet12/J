public class Practice {
    public static void main(String[] args){
        /*
        Create an array of 5 integers. Use a for-each loop to print all numbers.

Create an array of 5 integers. Find the sum of all numbers using a for-each loop.

Create a Book class with title, author, and price. Create 2 book objects and print their information using a method called display().

Create an array of student marks. Find the highest mark.

Create a Car class with brand, color, and speed. Add a method drive() that prints "Car is driving" with the brand name.

Create an array of 5 names. Use a for-each loop to print only names whose length is greater than 4.

Create a Person class with name and age. Create 3 objects and print only the people whose age is greater than 18.

Create an integer array and count how many numbers are even and how many are odd.

Create a Mobile class with brand and price. Create 3 mobile objects, then print the mobile with the highest price.
         */
        Q2 a= new Q2();
        
        for(int i:a.arr){
            System.out.println(i);
        }
        Q3 b= new Q3();
        int sum=0;
        for(int i:b.arr){
            sum = sum+i;
        }
         System.out.println(sum);

        Book c1 = new Book();
        Book c2  = new Book();
        c1.title ="java";
        c1.Author = "bikash";
        c1.price = 100;
        c2.title = "c";
        c2.Author = "bisay";
        c2.price = 300;
        c1.Display();
        c2.Display();

        Students s1 = new Students();
        int max = s1.marks[0];
        for(int i:s1.marks){
            if(i>max)
                max=i;
        
    }
    System.out.println(max);
    Car c = new Car();
    c.brand = "Suzuki";
    c.drive(c.brand);

    Name n = new Name();
    for(String i:n.name){
        if(i.length()>4){
            System.out.println(i);
        }
    }
}
}
class Q2{
    int arr[] = {1,2,3,4,5};
}
class Q3{
    int arr[]={10,20,30,40,50};
}
/*Create a Book class with title, author, and price. Create 2 book objects and print their information using a method called display().*/
class Book{
    String title;
    String Author;
    int price;
    void Display(){
        System.out.println("Title = "+title);
        System.out.println("Author = "+Author);
        System.out.println("Price = "+price);
    }
}
//Create an array of student marks. Find the highest mark.
class Students{
    int marks[]= {40,50,20,30};

}
//Create a Car class with brand, color, and speed. Add a method drive() that prints "Car is driving" with the brand name.
class Car{
    String brand;
    String color;
    float speed;
    public void drive(String x){
        System.out.println("car is driving"+x);
    }
}
//reate an array of 5 names. Use a for-each loop to print only names whose length is greater than 4.
class Name{
    String name[]= {"dipti","anuska","tripti","hina","ruby"};
}