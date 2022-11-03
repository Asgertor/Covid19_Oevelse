import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FileHandler {
    public ArrayList<Covid19Data> readFile() throws IOException {
        Scanner sc = new Scanner(new File("11_noegletal_pr_region_pr_aldersgruppe.csv"), StandardCharsets.ISO_8859_1);
        ArrayList<Covid19Data> covidDataList = new ArrayList<>();
        
        while (sc.hasNext()) {
            String data = sc.nextLine();
            String[] attributes = data.split(";");
            Covid19Data covid19Data = new Covid19Data(
                    attributes[0],
                    attributes[1],
                    Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[4]),
                    Integer.parseInt(attributes[5]),
                    attributes[6]);
            covidDataList.add(covid19Data);
        }
        return covidDataList;
        
    }
}



