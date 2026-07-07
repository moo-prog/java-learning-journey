import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport {

   public void tester(){
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        
        System.out.println("Testing countryInfo ");
        String info = countryInfo(parser, "Nauru");
        System.out.println(info);
        
        // Reset the parser because the previous method read through the entire file. 
        // This moves the pointer back to the beginning of the file for the next method.
        parser = fr.getCSVParser();
        
        System.out.println("\nTesting listExportersTwoProducts ");
        listExportersTwoProducts(parser, "fish", "nuts");
        
        parser = fr.getCSVParser();
        
        System.out.println("\nTesting numberOfExporters ");
        int num = numberOfExporters(parser, "gold");
        System.out.println("Number of countries exporting gold: " + num);
        
        parser = fr.getCSVParser();
        
        System.out.println("\nTesting bigExporters ");
        bigExporters(parser, "$999,999,999,999");
    }
    
    public String countryInfo(CSVParser parser, String country){
        for (CSVRecord record : parser){
            //use trim() to Remove extra spaces from the text to make sure the names match perfectly.
            String currentCountry = record.get("Country").trim();
            if(currentCountry.equalsIgnoreCase(country)){
                String exports = record.get("Exports");
                String value = record.get("Value (dollars)");
                return currentCountry + ": " + exports + ": " + value;
            }
        }
        return "NOT FOUND";
    }
    public void listExportersTwoProducts(CSVParser parser,
                        String exportItem1, String exportItem2){
     for (CSVRecord record : parser){
            String exports = record.get("Exports");
            if(exports.contains(exportItem1) && exports.contains(exportItem2)) {
                String currentCountry = record.get("Country");
                System.out.println(currentCountry);
            }
        }
    }
        public int numberOfExporters(CSVParser parser,
                        String exportItem){
                            int count= 0;
     for (CSVRecord record : parser){
            String exports = record.get("Exports");
            if(exports.contains(exportItem)) {
                String currentCountry = record.get("Country");
                count++;
                
            }
        }
        return count;
    }
    public void bigExporters(CSVParser parser, String amount) {
        for (CSVRecord record : parser) {
            String value = record.get("Value (dollars)");
            if (value.length() > amount.length()) {
                String country = record.get("Country");
                System.out.println(country + " " + value);
            }
        }
    }
}
