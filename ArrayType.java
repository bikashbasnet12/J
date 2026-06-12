public class ArrayType {
    public static void main(String[] args){
        OneD o = new OneD();
        o.arrayName();
    }
}
class OneD{
    int arr[][]= new int[5][5];
    void arrayName(){
    int arr[][]= {{1,2,3,4,5},{1,1,1}};
   for(int i =0;i<arr.length;i++){
    for(int j = 0;j<arr[i].length;j++){
            System.out.print(" "+arr[i][j]);
        }
        System.out.println(" ");
    }
    
    

}
}