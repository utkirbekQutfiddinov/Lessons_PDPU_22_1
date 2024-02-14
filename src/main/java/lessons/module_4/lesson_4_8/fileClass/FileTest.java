package main.java.lessons.module_4.lesson_4_8.fileClass;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
//       fileCRud();


//        folderCRUD();
    }

    private static void folderCRUD() {
        File file=new File("U:\\02. PDP\\01. Java\\02. Groups\\BE-22-1\\module 4\\Lessons_PDPU-22-1\\src\\main.java.lessons.module_4\\lesson_4_8\\fileIO");
//        System.out.println(file.getPath());
        for (int i = 0; i < file.list().length; i++) {
            File f1=file.listFiles()[i];
            if (!f1.getName().endsWith(".java")) {
                f1.delete();
            }
        }
//        System.out.println(file.length());

        //java Test copy result.txt result1.txt
        //java Test remove result.txt
        //java Test create result.txt asahbsaj ajsavshja
        //java Test update result.txt asahbsaj ajsavshja
        //java Test read result.txt
    }

    public static void fileCRud(){
        File file=new File("result1.txt");
        System.out.println(file.length());
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.delete();
    }
}
