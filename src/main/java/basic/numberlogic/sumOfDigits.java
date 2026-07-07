package basic.numberlogic;

public class sumOfDigits {
    public static void main(String[] args) {
        int number=456;
        /***
         * Apprach 1 - Numbers logic
         *  reminder= number%10;    6   5          65        654
         *  rev=(rev*10)+reminder;  6   (6*10)+5  (65*10)+4
         *  number= number/10;      45  4          0
         *
         */
        System.out.println("Given number is "+number+" and reverse number is "+reverseNumber(number));

        /***
         * Approach 2 - > Convert number into String and then using reverse() method
         */
        reverseNumberUsingString(number);


    }

    private static void reverseNumberUsingString(int number) {
        // Convert Integer to String
        String value = String.valueOf(number);
        System.out.println(value);
        // Using string builder convert string
        StringBuilder builder = new StringBuilder(value);
        //using reverse method and convert this string into Integer again
        int output = Integer.parseInt(builder.reverse().toString());
        System.out.println(output);
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
