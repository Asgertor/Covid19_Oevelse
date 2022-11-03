import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileHandler f = new FileHandler();
        ArrayList<Covid19Data> dataList = f.readFile();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("""
                Menu options:
                    1. Sort by Region
                    2. Sort by Age
                """);
        
        int userInput = sc.nextInt();
    
        switch (userInput) {
            case 1 -> Collections.sort(dataList, new RegionComparator());
            case 2 -> Collections.sort(dataList, new AldersgruppeComparator());
        }
        System.out.println(dataList);
        
  
    }
}