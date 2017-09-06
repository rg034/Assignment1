/*
* Class Name: Errors
****************************
* Author: Raelene Gomes
****************************
* This class contains all of the error messages for the different
* possible errors. Each catch throughout the program calls one of
* these methods in order to display the correct error message
****************************
* Sept 01, 2017
* Sept 05, 2017 - add method for mean error
*/

/**
 *
 * @author rg034
 */
public class Errors {
    
    /*
    Method name: numFormatError
    ***********************************
    Author: Raelene Gomes
    ***********************************
    This method returns a string value containing an error message for 
    when a catch occured due to a number format error.
    ***********************************
    Date: Sept 01, 2017
    */
    public String numFormatError()
    {
        String error = "Please enter an integer value only. \n";
        return error;
    }
    
    /*
    Method name: otherError
    ***********************************
    Author: Raelene Gomes
    ***********************************
    This method returns a string value containing an error message for 
    when a catch occured due to an unspecified error.
    ***********************************
    Date: Sept 01, 2017
    */
    public String otherError()
    {
        String error = "Invalid entry. Please enter integer values. \n";
        return error;
    }
    
    /*
    Method name: stdDevErrorError
    ***********************************
    Author: Raelene Gomes
    ***********************************
    This method returns a string value containing an error message for 
    when a catch occured when attempting to calculate the standard deviation.
    ***********************************
    Date: Sept 01, 2017
    */
    public String stdDevError()
    {
        String error = "Error calculating standard deviation \n";
        return error;
    }
    
    /*
    Method name: meanError
    ***********************************
    Author: Raelene Gomes
    ***********************************
    This method returns a string value containing an error message for 
    when a catch occured when attempting to calculate the mean.
    ***********************************
    Date: Sept 05, 2017
    */
    public String meanError()
    {
        String error = "Error calculating mean \n";
        return error;
    }
}
