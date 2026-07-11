Today, I built a Java program to analyze weather files. Here is what I learned:
CSV Tools: I learned that CSVParser is the tool that opens/reads the entire file, while CSVRecord represents just one single row of data inside it.
DRY Principle: I kept my code clean by using helper methods for comparisons instead of repeating loops.Smart Tracking: I used object comparison (minRow == currentRow) to easily find and save the exact file with the lowest values.
Data Cleansing: I learned to drop corrupt data (like -9999 and "N/A") so the program running doesn't crash