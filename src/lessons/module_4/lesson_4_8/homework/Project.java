package lessons.module_4.lesson_4_8.homework;

import java.io.*;
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
    static StringBuilder currentPath = new StringBuilder("C:/");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome! ");

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

                        if(subFolder.equals("../")){
                            int last = currentPath.lastIndexOf("/");

                            currentPath=new StringBuilder(currentPath.toString().substring(0,last));
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
        File file=new File(currentPath+"/"+ subFolder);


        if (!file.isDirectory()) {
            System.out.println("Error");
        }else {
            currentPath.append("/").append(subFolder);
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
