/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }
    
    public LogAnalyzer(String filename)
    {
        hourCounts = new int[24];
        reader = new LogfileReader(filename);
    }
    
    public int numberofAccesses()
    { 
      int total = 0; 
        
      for(int hour = 0; hour < hourCounts.length; hour++) 
      { 
          total = total + hourCounts[hour]; 
      } 
      return total; 
    } 
    
    public int busyHour() 
    { 
         int numOfAccessesAtBusiest = 0; 
         int busyHour = 0; 
         int index = 0; 
          
         while (index < hourCounts.length -1) 
         { 
             if (numOfAccessesAtBusiest < hourCounts[index]) 
             { 
                 busyHour = index; 
                 numOfAccessesAtBusiest = hourCounts[index]; 
                 index++; 
             } 
             else 
             { 
                 index++; 
             } 
         } 
         return busyHour; 
     } 
     
    public int quietHour() { 
        int numOfAccessesAtQuietest = 9999; 
        int quietHour = 0; 
        int index = 0; 
        
        while (index < hourCounts.length -1) 
        {              
            if (numOfAccessesAtQuietest > hourCounts[index])
            {  
               quietHour = index; 
               numOfAccessesAtQuietest = hourCounts[index]; 
               index++; 
            } 
            else 
            { 
               index++; 
            } 
        }          
        return quietHour; 
     } 



    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
