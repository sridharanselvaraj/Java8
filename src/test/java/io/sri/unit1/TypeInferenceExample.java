package io.sri.unit1;

public class TypeInferenceExample {

    public static void main(String[] args) {
//        StringLenghtLambda myLambda=s-> s.length();
//        System.out.println(myLambda.getLength("Hello World!"));

        printLambda(s-> s.length());
    }

public static void printLambda(StringLenghtLambda l)
{
    System.out.println(l.getLength("Hello Lambda"));
}


interface StringLenghtLambda{
    int getLength(String s);
}
}
