import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileHandler f = new FileHandler();
        f.readFile();
        ArrayList<Covid19Data> dataList = f.readFile();
        
        System.out.println(dataList.toString());
  
    }
}