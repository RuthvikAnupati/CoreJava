package com.javafundamentals;

public class Literals_5_10 {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // 1. Decimal integer value assigned to float
        // ---------------------------------------------------------
        float f1 = 123;

        // 123 is an integer literal (int).
        // An int value can be automatically converted to float
        // because float can represent a wider range of values.
        // Therefore, this is CORRECT.
        // Output: 123.0


        // ---------------------------------------------------------
        // 2. Octal integer value assigned to float
        // ---------------------------------------------------------
        float f2 = 0123;

        // A number starting with 0 is treated as an OCTAL number.
        // 0123 (octal) = 83 (decimal).
        // The integer value 83 can be automatically converted to float.
        // Therefore, this is CORRECT.
        // Output: 83.0


        // ---------------------------------------------------------
        // 3. Hexadecimal integer value assigned to float
        // ---------------------------------------------------------
        float f3 = 0x123;

        // 0x means the number is HEXADECIMAL.
        // 0x123 (hexadecimal) = 291 (decimal).
        // The integer value can be automatically converted to float.
        // Therefore, this is CORRECT.
        // Output: 291.0


        // ---------------------------------------------------------
        // 4. Decimal floating-point value WITHOUT F
        // ---------------------------------------------------------
        // float f4 = 0123.5;

        // 0123.5 is a floating-point literal.
        // By default, decimal floating-point literals are of type double.
        //
        // So Java sees:
        //     double value = 0123.5;
        //
        // But we are trying to store it in:
        //     float f4
        //
        // double -> float is NOT automatic because it may lose precision.
        // Therefore, this gives a COMPILATION ERROR.
        //
        // We need F/f at the end:
        //     float f4 = 0123.5F;


        // ---------------------------------------------------------
        // 5. Decimal floating-point value WITH F
        // ---------------------------------------------------------
        float f5 = 0123.5F;

        // F means this is a FLOAT literal instead of double.
        // Therefore, the value can directly be assigned to float.
        // Hence, this is CORRECT.
        // Output: 83.5


        // ---------------------------------------------------------
        // 6. Hexadecimal floating-point literal
        // ---------------------------------------------------------
        // float f6 = 0x123.5F;

        // This is NOT a valid hexadecimal floating-point literal.
        //
        // IMPORTANT:
        // Java DOES support hexadecimal floating-point literals,
        // but they MUST contain a binary exponent using 'p' or 'P'.
        //
        // Example:
        //     float f6 = 0x123.5p2F;
        //
        // So:
        //     0x123.5F
        // is INVALID because it does not contain p/P.
        //
        // Therefore, this gives a COMPILATION ERROR.


        // ---------------------------------------------------------
        // 7. Octal-looking value with F
        // ---------------------------------------------------------
        float f7 = 0345F;

        // 0345 starts with 0, so normally it represents an OCTAL number.
        //
        // But because F is added at the end, Java treats this as
        // a floating-point literal.
        //
        // 0345F = 345.0F
        //
        // Here the digits 0345 are interpreted as the floating-point
        // value 345.0, not as octal integer 229.
        //
        // Therefore, this is CORRECT.
        // Output: 345.0


        // ---------------------------------------------------------
        // 8. Hexadecimal-looking value with F
        // ---------------------------------------------------------
        float f8 = 0x345F;

        // 0x means HEXADECIMAL.
        // 0x345F is a hexadecimal INTEGER literal.
        //
        // It can be automatically converted from int to float.
        //
        // 0x345F = 13407 in decimal.
        //
        // Therefore, this is CORRECT.
        // Output: 13407.0


        // ---------------------------------------------------------
        // 9. Decimal floating-point value with F
        // ---------------------------------------------------------
        float f9 = 567F;

        // F tells Java that 567 is a FLOAT literal.
        // Therefore, it can be directly assigned to float.
        // This is CORRECT.
        // Output: 567.0


        // ---------------------------------------------------------
        // 10. Decimal floating-point value with decimal point and F
        // ---------------------------------------------------------
        float f10 = 123.9F;

        // F means this is a float literal.
        // 123.9F is directly compatible with float.
        // Therefore, this is CORRECT.
        // Output: 123.9


        // ---------------------------------------------------------
        // 11. Octal-looking value with F
        // ---------------------------------------------------------
        float f11 = 0456F;

        // F makes this a floating-point literal.
        // Therefore, it is treated as 456.0F.
        // It is NOT treated as the octal integer 0456.
        //
        // Hence, this is CORRECT.
        // Output: 456.0


        // ---------------------------------------------------------
        // PRINTING THE VALUES
        // ---------------------------------------------------------

        System.out.println(f1);   // 123.0
        System.out.println(f2);   // 83.0
        System.out.println(f3);   // 291.0

        // System.out.println(f4); // Compilation Error because f4 declaration is invalid

        System.out.println(f5);   // 83.5

        // System.out.println(f6); // Compilation Error because 0x123.5F is invalid

        System.out.println(f7);   // 345.0
        System.out.println(f8);   // 133? 
        System.out.println(f9);   // 567.0
        System.out.println(f10);  // 123.9
        System.out.println(f11);  // 456.0
    }
}