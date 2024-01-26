package module_4.lesson_4_8.fileIO;

import java.io.*;
import java.util.Scanner;

public class FileIOTest {
    public static void main(String[] args) {
        InputStream in=null;
        OutputStream out=null;
        try {
            in = new FileInputStream("U:\\02. PDP\\01. Java\\02. Groups\\BE-22-1\\module 4\\Lessons_PDPU-22-1\\src\\module_4\\lesson_4_8\\fileIO\\video.mp4");

//            while(in.available()>0){
//                System.out.print((char)in.read());
//            }

        out=new FileOutputStream("video1.mp4");
            int a;
            while((a=in.read())!=-1){
                out.write((char)a);
            }




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sum(){
//        Scanner sc=new Scanner(in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        Integer c=a+b;
//        String str=c.toString();
//
//        out=new FileOutputStream("result.txt");
//
//
//        for (int i = 0; i < str.length(); i++) {
//            out.write(str.charAt(i));
//        }
    }
}
