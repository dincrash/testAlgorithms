package Algorithms;

public class PalindromeNumber {


//
//    Palindrome number algorithm
//    Get the number to check for palindrome
//    Hold the number in temporary variable
//    Reverse the number
//    Compare the temporary number with reversed number
//    If both numbers are same, print "palindrome number"
//    Else print "not palindrome number"
    public PalindromeNumber(int n) {

        int r,sum=0,temp;

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
