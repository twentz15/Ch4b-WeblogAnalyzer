Project: weblog-analyzer
Athors: David J. Barnes and Michael Kölling
Assignment: Bill Crosbie

This project is part of the material for chapter 4 of the book

   Objects First with Java - A Practical Introduction using BlueJ
   Fifth edition
   David J. Barnes and Michael Kölling
   Pearson Education, 2012


Purpose of project: To provide an illustration of the use of arrays.
How to start this project: Create a LogAnalyzer object.

The LogfileReader expects to read a file, weblog.txt,
containing lines of data in the format:

    year month day hour minute

month values are in the range 1-12 and day values in the range 1-31.
If the sample file cannot be found, the reader will create some simulated
data. Alternatively, use the LogfileCreator to create some random data.
Use its createFile method to give a file name and the number of entries
to create.

------------------
For the assignment:
Working from Pages 149 and 150

4.72 - modify the LogAnalyzer so that it can take a String, which is the name of a log file. Details on page 149

4.74 - Add the numberOfAccesses method to your LogAnalyzer. you can test it by opening the log file in Notepad++ and seeing the number of lines in the file

4.75 - Add a busiestHour method. Which hour is the busiest over a year?

4.76 - Add a quietestHour  method. Which hour is the quietest over a year?

4.78 - Add a busiestTwoHour method to the logAnalyzer - so from midnight-2am, 1am-3am, 2am-4am, ... 10pm midnight, 11pm-1am

4.79 - Add methods to analyze quietestDay, busiestDay, totalAccessesPerMonth and modify the LogfileCreator to make a 5 year logfile and look for trends over Months from year to year.