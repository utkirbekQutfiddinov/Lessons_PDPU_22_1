package lessons.module_4.lesson_4_8.homework;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Project {
    /**
     * 1) "create folder" cmd
     * 2) "create file" cmd
     * 3) write to file
     * 4) read from file
     * 5) delete folder/file
     * 6) rename file/folder
     */
    static Path currentPath = Path.of("C:/");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome! ");
        //1. Windows
        //2. linux

        String cmd = "";
        while (!cmd.equals("quit") && !cmd.equals("exit")) {
            System.out.print(currentPath.toString() + " : ");
            cmd = sc.nextLine();
            switch (cmd) {
                case "dir" -> {
                    File file=new File(currentPath.toString());
                    String[] files=file.list();

                    for (int i = 0; i < files.length; i++) {
                        System.out.println(files[i]);
                    }
                }
                default -> {
                    if(cmd.startsWith("cd ")){
                        String subFolder = cmd.split(" ")[1];

                        if(subFolder.startsWith("..")){
                            currentPath=currentPath.getParent();
                        }else {
                            gotoFolder(subFolder);
                        }

                    }
                }
            }
        }
        System.out.println("Good bye!");
    }

    private static void gotoFolder(String subFolder) {

        Path subPath=currentPath.resolve(subFolder);

        if (!subPath.isAbsolute()) {
            System.out.println("Error");
        }else {
            currentPath=subPath;
        }
    }

    public static void copy(String source, String destination) {
        InputStream in=null;
        OutputStream out=null;
        try {
            in = new FileInputStream(source);

            out=new FileOutputStream(destination);
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

}
