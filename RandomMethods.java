public class RandomMethods {

  /*****
   * A variation of the function used in https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-7.php
   * Find the number of days in a month for a particular year.
   * @param month - the month number, e.g. 6 = June
   * @param year - the year number since a leap year will change the number of days in February
   * @return returnValue - a string indicating how many days are in a given month for a particular year
  *****/
  public String daysInMonth( int month, int year ) {
    String returnValue = "";

    switch( month ) {
      case 1:
        returnValue = "January " + year + " has 31 days";
        break;
      case 2: 
        returnValue = "February " + year + " has ";
        /* If the year is a leap year, February has 29 days instead of 28 days */
        if( (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ) {
          returnValue += "29 days";
        } else {
          returnValue += "28 days";
        }
        break;
      case 3:
        returnValue = "March " + year + " has 31 days";
        break;
      case 4:
        returnValue = "April " + year + " has 30 days";
        break;
      case 5:
        returnValue = "May " + year + " has 31 days";
        break;
      case 6:
        returnValue = "June " + year + " has 30 days";
        break;
      case 7:
        returnValue = "July " + year + " has 31 days";
        break;
      case 8:
        returnValue = "August " + year + " has 31 days";
        break;
      case 9:
        returnValue = "September " + year + " has 30 days";
        break;
      case 10:
        returnValue = "October " + year + " has 31 days";
        break;
      case 11:
        returnValue = "November " + year + " has 30 days";
        break;
      case 12:
        returnValue = "December " + year + " has 31 days";
        break;
      default:
        returnValue = "Unknown month number";
    }
    return returnValue;
  }

  /*****
   * Given three numbers, find the largest value.
   * @param number1 - One of the values to be compared
   * @param number2 - One of the values to be compared
   * @param number3 - One of the values to be compared
   * @return returnValue - the value of the largest number
  *****/
  public double largestNumber( double number1, double number2, double number3 ) {
    double returnValue = 0.0;

    /* Add functionaltiy here */
    if(number1 > number2 && number1 > number3){
      returnValue = number1;
    }
    else if(number2 > number1 && number2 > number3){
      returnValue = number2;
    }
    else
      returnValue = number3;

    return returnValue;
  }

  /*****
   * Check to see if the given number is negative ( < 0 ) or positive ( > 0 )
   * @param number - integer that the function needs to determine whether it is negative or positive
   * @return returnValue - 'true' if number is negative. 'false' if number is positive
  *****/
  public boolean isNegative( int number ) {
    boolean returnValue = false;

    /* Add functionaltiy here */
    if(number < 0){
      returnValue = true;
    }
    else if(number > 0){
      returnValue = false;
    }
    else
      returnValue = 0;

    return returnValue;
  }

  /*****
   * Use a while loop to go through the given input string and count the number of vowels(a, e, i, o, u) in it
   * For example, "The quick brown fox jumps over the lazy dog."
   *      Function should return 11
   * @param input - input that is passed into the function
   * @return returnValue - the number of vowels in the input string
  *****/
  public int stringLength( String input ) {
    int returnValue = 0;

    /* Add functionaltiy here */
    int index = 0;
    while(index < input.length()){
      if(input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i' || input.charAt(index) == 'o' || input.charAt(index) == 'u'){
        returnValue++;
      }
    }
    return returnValue;
  }
}