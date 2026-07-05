package basic.numberlogic;

public class sumOfDigits {
    public static void main(String[] args) {
        int number=-456;
        System.out.println("Given number is "+number+" and reverse number is "+reverseNumber(number));
        reverseNumberUsingString(number);

    }

    private static void reverseNumberUsingString(int number) {

    }

    /***
     * num =123
     * divide and reminder
     *
     * Logic:
     *
     *
     *
     *
     * @param number
     */
    private static int reverseNumber(int number) {

        int rev=0,reminder;
        while(number>0){
            reminder= number%10;
            rev=(rev*10)+reminder;
            number= number/10;
        }
        System.out.println("reverse number is "+rev);
        return rev;
    }
}
