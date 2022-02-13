public class DemoApp {
    public static void main (String[] args) {
        //start aplikacji
        //psmv
        //sout
        //to copy a code ctrl D on a line to repeat it
        // to comment the line control + /

        //typy danych
        System.out.println("hello world Im trying for 2h already to push you");
        System.out.println(10);
        System.out.println(10.6);
        System.out.println('a');
        System.out.println(true);
        System.out.println(false);

        //zmienne
        int number10 = 10;
        System.out.println(number10);

        //byte
        //short
        //int
        //long 10000000000L


        double numbercoma = 10.6;
        System.out.println(numbercoma);

        //float
        //double - domyśnie

        String someText = "bla";
        System.out.println(someText);

        char someChar = 's';
        System.out.println(someChar);

        boolean trueValue = true;
        System.out.println(trueValue);

        boolean falseValue = false;
        System.out.println(falseValue);


        //operatory matematyczne
        // + - * /
        // 10/4 = 2 bo liczba całkowita
        // właściwe 10.0/4.0 = 2.5
        //albo nadanie zmiennych double i wtedy winik juz też double

        //operatory porównania

        int numOne = 1;
        int numTwo = 2;
        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);


        //operatory logiczne
        //  || - lub
        System.out.println(numOne > numTwo || numOne == 1);

        // && - oraz

        System.out.println(numOne < numTwo && numTwo == 2);


    }

}