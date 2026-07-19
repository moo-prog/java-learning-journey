
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class BabyBriths{
    public void totalBirths (){
        FileResource fr = new FileResource();
        int numBoys = 0;
        int numGirls = 0;
        // false means the CSV has no header row (Name, Gender, Births)
        for (CSVRecord rec : fr.getCSVParser(false)){
            if (rec.get(1).equals("M")){
                numBoys =numBoys + 1;

            }
            if (rec.get(1).equals("F")){
                numGirls =numGirls + 1;
            }
        }
        int totalbriths = numBoys + numGirls;

        System.out.println("totalBirths " + totalbriths+
            " numGirls " + numGirls +
            " Num Born " + numBoys);
    }

    public int getRank(int year, String name, String gender) {
        FileResource fr = new FileResource();
        int ranke =0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals(gender) ){
                ranke = ranke + 1;
                if(rec.get(0).equals(name) ){
                    return ranke;        
                }
            }

        }
        return -1;
    }

    public String getName(int year, int rank, String gender) {
        FileResource fr = new FileResource();
        int ranke =0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals(gender) ){
                ranke = ranke + 1;
                if(ranke == rank  ){
                    return rec.get(0);        
                }
            }

        }
        return "NO NAME";
    }

    public String whatIsNameInYear (String name, int oldYear,int newYear,  String gender ) {
        int rank=getRank(oldYear , name, gender);
        String newName = getName(newYear, rank, gender);
        return newName;
    }

    public void yearOfHighestRank  (String name, String gender ) {
        DirectoryResource d = new DirectoryResource();
        int currentRank=-1;
        int currentYear =0;
        boolean found=false;
        for (File f : d.selectedFiles()){
            String fileName = f.getName(); 
            int fileYear = Integer.parseInt(fileName.substring(3, 7)); 
            FileResource fr = new FileResource(f);
            int ranke=0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals(gender) ){
                ranke = ranke + 1;
                if(rec.get(0).equals(name) ){
                    found = true;
                    break;        
                }
            }

        }
            if (found == true) {
                if (currentRank == -1 || ranke < currentRank){
                    currentRank = ranke;
                    currentYear = fileYear;
                }
            }

        }
        System.out.println("yearOfHighestRank is " + currentYear);


    }

    public void getAverageRank   (String name, String gender ) {
        DirectoryResource d = new DirectoryResource();
        int currentRank=0;
        int numFile =0;
        boolean found = false;
        for (File f : d.selectedFiles()){
            String fileName = f.getName(); 
            int fileYear = Integer.parseInt(fileName.substring(3, 7));
            FileResource fr = new FileResource(f);
            int ranke=0;
        for (CSVRecord rec : fr.getCSVParser(false)){
            if(rec.get(1).equals(gender) ){
                ranke = ranke + 1;
                if(rec.get(0).equals(name) ){
                    found = true;
                    break;        
                }
            }

        }
            if (found == true){
                currentRank=ranke+currentRank;
            }
            numFile+=1;
        }
        if (currentRank == 0) {
            System.out.println("not found");
        } else {
            System.out.println("AverageRank is " + (double)currentRank / numFile);
        }
    }

    public int getTotalBirthsRankedRankedHigher (int year, String name, String gender ) {
        FileResource fr = new FileResource();
        int sume = 0;
        for (CSVRecord rec : fr.getCSVParser(false)) {
            if (rec.get(1).equals(gender)) {

                if (rec.get(0).equals(name)) {
                    return sume; 
                }

                int numBirths = Integer.parseInt(rec.get(2));
                sume = sume + numBirths;
            }
        }

        return -1;
    }
}