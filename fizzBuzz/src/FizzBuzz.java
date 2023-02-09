public class FizzBuzz {
    public static void main(String[] args) {

        int n = 15;
        String output = "";

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                output = "FizzBuzz";
            } else if (i % 3 == 0) {
                output = "Fizz";
            } else if (i % 5 == 0) {
                output = "Buzz";
            } else {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }


    }
}
