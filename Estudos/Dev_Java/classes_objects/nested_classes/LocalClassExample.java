public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(
        String phoneNumber_1,
        String phoneNumber_2
    ) {
        int numberLength = 10;

        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(
                    regularExpression,
                    ""
                );

                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            public void printOriginalNumbers() {
                IO.println(
                    "\nOriginal numbers are " +
                        phoneNumber_1 +
                        "\nand " +
                        phoneNumber_2 +
                        "\n"
                );
            }
        }

        PhoneNumber myNumber_1 = new PhoneNumber(phoneNumber_1);

        PhoneNumber myNumber_2 = new PhoneNumber(phoneNumber_2);

        myNumber_1.printOriginalNumbers();

        if (myNumber_1.getNumber() == null) {
            IO.println("First number is invalid");
        } else {
            IO.println("First Number is " + myNumber_1.getNumber());
        }

        if (myNumber_2.getNumber() == null) {
            IO.println("Second number is invalid");
        } else {
            IO.println("Second number is " + myNumber_2.getNumber());
        }
    }
}
