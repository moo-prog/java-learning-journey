import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;
public class WeatherAnalysis {
    //temperature 
    public CSVRecord coldestTemp(CSVRecord currentRow, CSVRecord minRow){
        // Ignore the fake error temperature value (-9999)
        if (currentRow.get("TemperatureF").equals("-9999")) {
            return minRow;
        }
        if(minRow == null){
            minRow = currentRow;
        }else {
            double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            double minTemp = Double.parseDouble(minRow.get("TemperatureF"));

            if( minTemp> currentTemp){
                minRow = currentRow  ; 
            }
        }
        return minRow;
    }
    //Humidity
    public CSVRecord minHumidity(CSVRecord currentRow, CSVRecord minRow){
        // Ignore "N/A" values so the code does not crash
        if (currentRow.get("Humidity").equals("N/A")) {
            return minRow;
        }
        if(minRow == null){
            minRow = currentRow;
        }else {
            double currentHumidity = Double.parseDouble(currentRow.get("Humidity"));
            double minHumidity = Double.parseDouble(minRow.get("Humidity"));

            if( minHumidity> currentHumidity){
                minRow = currentRow  ; 
            }
        }
        return minRow;
    }

    public CSVRecord coldestHourInFile (CSVParser parser){
        // minRow keeps the coldest row found in this file so far
        CSVRecord minRow = null; 

        // Loop through the file row by row
        for (CSVRecord currentRow : parser ){
            minRow =coldestTemp(currentRow,minRow);
        }
        return minRow;
    }

    public CSVRecord lowestHumidityInFile (CSVParser parser){
        CSVRecord minRow = null; 

        for (CSVRecord currentRow : parser ){
            minRow =minHumidity(currentRow,minRow);
        }
        return minRow;
    }
    // temperature Test one single file 
    public void testColdestHourInFile(){
        CSVRecord coldestTemp = null;
        FileResource fr = new FileResource("C:/Users/Moo/Desktop/coursera/Solving Problems with Software/nc_weather/nc_weather/2014/weather-2014-04-01.csv"); 
        coldestTemp = coldestHourInFile(fr.getCSVParser());
        // Check if the file uses Summer time (TimeEDT) or Winter time (TimeEST) so the code doesn't crash
        String time;
        if (coldestTemp.isMapped("TimeEDT")) {
            time = coldestTemp.get("TimeEDT");
        } else {
            time = coldestTemp.get("TimeEST");
        }

        System.out.println("Coldest temperature was " + coldestTemp.get("TemperatureF") + " at " + time);
    }

    // temperature Test multiple files inside a folder
    public void testColdestHourInDirectory(){
        DirectoryResource d = new DirectoryResource();
        double coldest;       
        double currenTemp;

        CSVRecord minRow = null;
        File coldestFile = null; // Saves the current file to get its name later

        for (File f : d.selectedFiles()){
            FileResource fr = new FileResource(f);
            CSVRecord currentRow = coldestHourInFile(fr.getCSVParser());
            minRow =coldestTemp(currentRow,minRow);
            // If minRow becomes equal to currentRow, it means the new row (e.g. 80) won against the old one (e.g. 100).
            // This proves the current file is the coldest so far, so we save it.
            if (coldestFile == null || minRow == currentRow) { 
                coldestFile = f;  
            }
        }
        System.out.println("The Coldest temperature is in " + coldestFile.getName() + 
            " Coldest temperature was " + minRow.get("TemperatureF") +
            " at " + minRow.get("TimeEST") );
    }

    // Humidity Test one single file 
    public void testHumidityInFile(){
        CSVRecord lowestHumid = null;
        FileResource fr = new FileResource("C:/Users/Moo/Desktop/coursera/Solving Problems with Software/nc_weather/nc_weather/2014/weather-2014-04-01.csv"); 
        lowestHumid = lowestHumidityInFile(fr.getCSVParser());
        
        System.out.println("Lowest Humidity was " + lowestHumid.get("Humidity") +
            " at " + lowestHumid.get("DateUTC"));
    }

    // Humidity Test multiple files inside a folder
    public void testHumidityInDirectory(){
        DirectoryResource d = new DirectoryResource();
        double lowest;       
        double currentHumid;

        CSVRecord minRow = null;
        File lowestHumidFile = null; // Saves the current file to get its name later

        for (File f : d.selectedFiles()){
            FileResource fr = new FileResource(f);
            CSVRecord currentRow = lowestHumidityInFile(fr.getCSVParser());
            minRow =minHumidity(currentRow,minRow);
            // If minRow becomes equal to currentRow, it means the new row (e.g. 80) won against the old one (e.g. 100).
            // This proves the current file is the coldest so far, so we save it.
            if (lowestHumidFile == null || minRow == currentRow) { 
                lowestHumidFile = f;
            }
        }
        System.out.println("The Lowest Humidity is in " + lowestHumidFile.getName() + 
            " Lowest Humidity was " + minRow.get("Humidity") +
            " at " + minRow.get("DateUTC") );
    }

    // Calculate average temperature in one file
    public double averageTemperatureInFile(CSVParser parser){
        double totalTemp = 0;
        int count = 0;

        for(CSVRecord currentRow : parser){
            double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            totalTemp = totalTemp + currentTemp;
            count = count + 1;
        }

        return totalTemp / count;

    }

    // Test average temperature
    public void testAverageTemperatureInFile(){
        FileResource fr = new FileResource("C:/Users/Moo/Desktop/coursera/Solving Problems with Software/nc_weather/nc_weather/2014/weather-2014-06-01.csv"); 
        double average = averageTemperatureInFile(fr.getCSVParser());
        System.out.println("Average temperature in file is " + average);
    }

    // Calculate average temperature when humidity >= value
    public double averageTemperatureWithHighHumidityInFile(CSVParser parser, int value){
        double totalTemp = 0;
        int count = 0;

        for(CSVRecord currentRow : parser){
            // Ignore "N/A" humidity rows safely
            if (currentRow.get("Humidity").equals("N/A")) {
                continue; // Skip this row and look at the next one
            }

            double currentHumidity = Double.parseDouble(currentRow.get("Humidity"));

            if(currentHumidity >= value){
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                totalTemp = totalTemp + currentTemp;
                count = count + 1;
            }
        }
        //zero error
        if(count == 0){
            return 0;
        }

        return totalTemp / count;
    }

    // Test average temperature with high humidity
    public void testAverageTemperatureWithHighHumidityInFile(){
        FileResource fr = new FileResource("C:/Users/Moo/Desktop/coursera/Solving Problems with Software/nc_weather/nc_weather/2014/weather-2014-03-30.csv"); 
        // Testing with humidity value >= 80 as requested
        double average = averageTemperatureWithHighHumidityInFile(fr.getCSVParser(), 80);

        if(average == 0){
            System.out.println("No temperatures with that humidity");
        } else {
            System.out.println("Average Temp when humidity is high is " + average);
        }
    }
}

