public class reverseTheGivenNumber {

    public static void main(String[] args) {
        int number=4564545;
       // reverseNumber(number);
        reverseNumberUsingString(number);
    }

    public static void reverseNumberUsingString(int number) {
        String input = String.valueOf(number);
        System.out.println(input);
        StringBuilder builder = new StringBuilder(input);
       String output= builder.reverse().toString();
       int reverseNumber = Integer.parseInt(output);
        System.out.println("reverse Number is  "+reverseNumber);
    }

    // Remember for mulitiply with 10 for reversed value not reminder
    public static int reverseNumber(int number) {
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
