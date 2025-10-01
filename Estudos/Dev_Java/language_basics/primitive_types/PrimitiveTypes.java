package primitive_types;

public class PrimitiveTypes {
    public static void main(
        String[] args
    ) {
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10_000;
        int i = 100_000;

        // decimal - 26 number
        int decimalValue = 26;

        // hexadecimal - 26 number
        int hexadecimalValue = 0x1a;

        // binary - 26 number
        int binaryValue = 0b11010;

        double d1 = 123.4;

        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1 = 123.4f;

        // sublinhado
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bites = 0b11010010_01101001_10010100_10010010;
    }
}
