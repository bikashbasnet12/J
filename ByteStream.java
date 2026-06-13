/*xercise 1 — Byte Stream

Write a program that:

Creates a file called data.bin
Writes these numbers as bytes: 65, 66, 67, 68, 69
Reads them back and prints them

Expected output:
65 66 67 68 69*/
import java.io.*;
public class ByteStream {
    public static void main(String[] args)throws IOException{
    FileOutputStream fos = new FileOutputStream("data.bin");
    int arr[ ] = {65,66,67,68,69};
    for(int i =0;i<arr.length;i++){
        fos.write(arr[i]);
    }
    fos.close();
    FileInputStream fis  = new FileInputStream("data.bin");
    int b = fis.read();
    while((b= fis.read())!=-1){
        System.out.print(b);
    }
    fis.close();

}

}