/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
public class AddTwoFractions {

  public static int[] addFractions( int[] fraction1, int[] fraction2 ){
    if( ( fraction1.length != 2 ) || ( fraction2.length != 2 ) ) {
      throw new IllegalArgumentException( "Arguments passed should be two-element arrays" );
    }

    int numerator1 = fraction1[ 0 ];
    int numerator2 = fraction2[ 0 ];
    int denominator1 = fraction1[ 1 ];
    int denominator2 = fraction2[ 1 ];

    int resultNumerator = 0;
    int resultDenominator = 1;

    if( denominator1 == 0 || denominator2 == 0 ) {
      throw new IllegalArgumentException( "Denominator in at least one of the input fractions is zero, which is not allowed." );
    } else {
      resultNumerator = ( numerator1 * denominator2 ) + ( numerator2 * denominator1 );
      resultDenominator = ( denominator1 * denominator2 );
    }
    if( resultNumerator == 0 ) {
      return ( new int[]{ 0, 1 } );
    }

    int gcd = findGCD(resultNumerator, resultDenominator);
    return( new int[]{ resultNumerator / gcd, resultDenominator / gcd } );
  }

  public static int findGCD( int a, int b ){

    // Everything divides 0  
    if (a == 0 || b == 0) 
       return 0; 
  
    // base case 
    if (a == b) 
        return a; 
  
    // a is greater 
    if (a > b) 
        return findGCD(a-b, b); 
    return findGCD(a, b-a); 
  }

  public static void main( String[] args ) {

int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );

    if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
      System.out.println( "Test passed." );
     // return true;
    } else {
      System.out.println( "Test failed." );
      //return false;
    }


  }
}