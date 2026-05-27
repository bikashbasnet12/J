public class First{
    public static void main(String args[]){
        int a[][]=new int [2][2];//multidimensional array
        a[0][0]=2;
        a[1][0]=4;
        a[1][1]=6;
        a[0][1]=8;
        for(int i =0;i<a.length;i++){
            for(int j=0;j<=1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    int b[]={1,2,3,4};
        for(int i:b){//foreachloop
            System.out.println(i);
        
     }
    Student s1= new Student();
     s1.name ="raj";
    s1.marks=50;
     System.out.println("Name:"+s1.name);
     System.out.print("Marks:"+s1.marks);


    }
    //Create a Student class with name and marks. Create 3 student objects and print their details.
   
}
  class Student{
        String name;
        int marks;

    }