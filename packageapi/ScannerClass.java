package packageapi;

import java.util.Scanner;

public class ScannerClass {
    Scanner sc = new Scanner(System.in);
    private String fileName;
    private int fileSize;
    private String type;
    private String path;
    public void scan() {
        System.out.println("Enter the name of the file: ");
        fileName = sc.nextLine();
        System.out.println("Enter the size of the file: ");
        fileSize = sc.nextInt();
        System.out.println("Enter the type of file: ");
        type = sc.next();
        System.out.println("Enter the path of the file: ");
        path = sc.next();

    }
    public void print(){
        System.out.println("File name is : "+fileName+ "Size is : "+fileSize+"Type is : "+type);
        System.out.println("File path is : "+path+"Type is : "+type);
    }
}
