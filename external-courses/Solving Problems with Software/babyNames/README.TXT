# Baby Births Data Analysis Project

This repository contains the complete Java solution for the **"Baby Births" Mini-Project** from **Duke University's** Java Programming course.

## 🚀 Features Implemented
* `totalBirths`: Analyzes files to count total names and gender distributions.
* `getRank` & `getName`: Resolves individual name popularity positions for any given year.
* `whatIsNameInYear`: Determines what a name would be in a different year based on relative popularity.
* `yearOfHighestRank`: Scans multiple datasets via `DirectoryResource` to find the peak popularity year for a specific name.
* `getAverageRank`: Calculates the exact average rank of a name across a selected timeframe.
* `getTotalBirthsRankedHigher`: Accumulates the total number of births for all names ranked higher than the chosen target.

## 🛠️ Technologies Used
* **Java SE**
* **Apache Commons CSV** (for robust dataset parsing)
* **Duke Coursera Library** (`FileResource` & `DirectoryResource`)

## 📊 Test Datasets
For testing and verification, the `data` folder includes the following short datasets:
* `example-small.csv`: Standard baseline test file containing a small sample of names.
* `yob2014-small.csv`: A reduced sample dataset specifically representing the year 2014 for ranking validations.