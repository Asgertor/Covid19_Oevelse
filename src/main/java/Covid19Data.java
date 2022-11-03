import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Covid19Data implements  Comparable<Covid19Data>{
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfældeIAlt;
    private int døde;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;
    
    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfældeIAlt, int døde, int indlagteIntensiv, int indlagte, String dato) throws FileNotFoundException {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }
    
    public String getRegion() {
        return region;
    }
    public String getAldersgruppe() {
        return aldersgruppe;
    }
    public int getBekræftedeTilfældeIAlt() {
        return bekræftedeTilfældeIAlt;
    }
    public int getDøde() {
        return døde;
    }
    public int getIndlagteIntensiv() {
        return indlagteIntensiv;
    }
    public int getIndlagte() {
        return indlagte;
    }
    
    @Override
    public String toString() {
        return  " region= " + region +
                ", aldersgruppe= " + aldersgruppe +
                ", bekræftedeTilfældeIAlt= " + bekræftedeTilfældeIAlt +
                ", døde= " + døde +
                ", indlagteIntensiv= " + indlagteIntensiv +
                ", indlagte= " + indlagte +
                ", dato= " + dato + '\n';
    }
    @Override
    public int compareTo(Covid19Data c){
        return region.compareTo(c.getRegion());
    }
}
