public class Testing {
    public static void main(String[] args) {
        String myStr = "emoseA si avaJ";

        String reversed = reverse_string(myStr);
        System.out.println("The reversed string is: " + reversed + "\nFibonacci Series of 10 numbers:0 1 1 2 3 5 8 13 21 34");
    }

    public static String reverse_string(String myStr) {
        if (myStr.isEmpty()) {
            System.out.println("String is now empty");
            return myStr;
        }

        System.out.println("String to be passed: " + myStr.substring(1));

        return reverse_string(myStr.substring(1)) + myStr.charAt(0);
    }

    public static <T> void function(T maxNumber) {
        int maxNumberr = (int)maxNumber; //error - maxNumber already defined in scope, newVar should be assigned to maxNumber
        int previousNumber = 0;
        int nextNumber = 1;

        for (int i = 1; i <= (int)maxNumber; i++) {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
