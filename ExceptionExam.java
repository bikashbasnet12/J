// Q1:public class ExceptionExam {
//     public static void main(String[] args){
//         try{
//             int r = 5/0;//exception here
//         }
//         catch(ArithmeticException e){
//             System.out.println("Error:"+e.getMessage());
//         }
//     }
// }
// Q2:public class ExceptionExam {
//     public static void main(String[] args){
//         try{
//             int arr[] = new int[3];//exception here
//             arr[5] = 10;
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Error:"+e.getMessage());
//         }
//         System.out.println("program continues");
//     }
// }
// Q3:public class ExceptionExam {
//     public static void main(String[] args){
//         try{
//             int arr[] = new int[3];//exception here
//             arr[5] = 10;
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Error:"+e.getMessage());
//         }
//         finally{
//             System.out.println("clean up done");
//         }
//         System.out.println("program continues");
//     }
// }
// q4:public class ExceptionExam {
//     public static void main(String[] args){
//         try{
//            int age=20;
           
//             if(age<18) throw new Exception("error");{
                
//             }
//         }
    
//         catch(Exception e){
//             System.out.println("not eligible");
        
//     }
//     System.out.println("program continues");
// }
// }