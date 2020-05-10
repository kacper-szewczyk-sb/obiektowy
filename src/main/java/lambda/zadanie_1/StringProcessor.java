package lambda.zadanie_1;

public class StringProcessor {
    private static StringOperation stringOperation;
    private static StringTwoParamsOperation stringTwoParamsOperation;

    public static void setStringOperation(
            StringOperation stringOperation) {
        StringProcessor.stringOperation = stringOperation;
    }

    private static String process(String input) {
        return stringOperation.operation(input);
    }

    private static String process(String input, int value) {
        return stringTwoParamsOperation.operation(input, value);
    }

    public static void main(String[] args) {
        changeToUpperCaseAndTest();
        useSetterAndTest();
        getThreeFirstLettersAndTest();
        getNFirstLettersAndTest();
    }

    private static void getNFirstLettersAndTest() {
        stringTwoParamsOperation = (str, value ) -> {
            if (str.length() > value) {
                return str.substring(0, value);
            }
            else {
                return str;
            }
        };
        testStrings2();
    }

    private static void getThreeFirstLettersAndTest() {
        stringOperation = (str) -> {
            if (str.length() > 3) {
                return str.substring(0,3);
            }
            else {
                return str;
            }
        };
        testStrings();
    }

    private static void useSetterAndTest() {
        setStringOperation((str) -> {
            return str.toLowerCase();
        });
        testStrings();
    }

    private static void changeToUpperCaseAndTest() {
        stringOperation = (str) -> {
          return str.toUpperCase();
        };
        testStrings();
    }

    private static void testStrings() {
        System.out.println(process("abcdef"));
        System.out.println(process("CC"));
        System.out.println(process("LSasLLsdoaodia"));
        System.out.println();
    }

    private static void testStrings2() {
        System.out.println(process("abcdef",5));
        System.out.println(process("CC",1));
        System.out.println(process("LSasLLsdoaodia",4));
        System.out.println();
    }
}
