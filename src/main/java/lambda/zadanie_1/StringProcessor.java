package lambda.zadanie_1;

public class StringProcessor {
    private static StringOperation stringOperation;

    public static void setStringOperation(
            StringOperation stringOperation) {
        StringProcessor.stringOperation = stringOperation;
    }

    private static String process(String input) {
        return stringOperation.operation(input);
    }

    public static void main(String[] args) {
        changeToUpperCaseAndTest();
        useSetterAndTest();
        getThreeFirstLettersAndTest();
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
}
