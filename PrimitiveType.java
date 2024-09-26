public class PrimitiveType {
    public static void main(String[] args) {
        // TIPOS PRIMITIVOS:
        boolean tipo_boolean = true; // 1 bits

        byte tipo_byte = 127; // 8 bits -> -128 até 127
        short tipo_short = 32767; // 16 bits -> -32768 até 32767
        int inteiro = 2147483647; // 32 bits -> -2147483648 até 2147483647
        long tipo_long = 9223372036854775807L; // 64 bits -> -9223372036854775808 até 9223372036854775807

        float tipo_float = 3.40282346638528860e+38f; // 32 bits -> ±1,40129846432481707e-45 a 3,40282346638528860e+38
        double tipo_double = 1.79769313486231570e+308; // 64 bits -> ±4,94065645841246544e-324 a 1,79769313486231570e+308

        char tipo_char = 'a'; // 16 bits

        System.out.println(tipo_boolean);
    }
}
