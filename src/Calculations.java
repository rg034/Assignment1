/*
* Class Name: Calculations
****************************
* Author: Raelene Gomes
****************************
* This class contains all of the calculations made in the program. It
* currently has methods to calculate the mean and the standard deviation
* of an array of values. 
****************************
* Sept 01, 2017
*/


/**
 *
 * @author rg034
 */
public class Calculations {
    Errors error = new Errors();
    double mean = 0;
    int total = 0;
    double [] deviations = new double[10];
    double[] squares = new double[10];
    double squareTotal = 0;
    double result;
    double stdDev = 0;
    
        /*
    Method name: mean(int[] input)
    ***********************************
    Author: Raelene Gomes
    ***********************************
    This method accepts an array of integers. It then calculates and returns 
    the mean of those integers. If there is an error, it returns -10000.
    ***********************************
    Sept 01, 2017
    Sept 05, 2017 - add try/catch
    */
    public double mean(int[] input)
    {
        try
        {
            for(int i = 0; i < input.length; i++)
            {
                total += input[i];
            }
            mean = (total / input.length);

            return mean;
        }
        catch(Exception e)
        {
            return -10000;
        }
    }
    
        /*
    Method name: stdDev(int[] input)
    ***********************************
    Author: Raelene Gomes
    ***********************************
    This method accepts an array of integer values. It then calculates and 
    returns the standard deviation of those values. If there is an error, it
    returns the value -10000
    ***********************************
    Date: Sept 01, 2017
    */
    public double stdDev(int[] input)
    {
        try
        {
            //get devation for each input value
            for(int i = 0; i < input.length; i++) 
            {
                deviations[i] = input[i] - mean ; 
            }

            //get square of each deviation
            for(int i = 0; i< squares.length; i++) 
            {
                squares[i] = deviations[i] * deviations[i];    
            }

            //get the sum of the squares
            for(int i = 0; i< squares.length; i++) 
            {
                squareTotal += squares[i];
            }

            // divide the total by one less than total number of numbers
            result = squareTotal / (input.length - 1);

            //get standard deviation
            stdDev = Math.sqrt(result);

            return stdDev;
        }
        catch(Exception e)
        {
            return -10000;      
        }
    }
        
}
