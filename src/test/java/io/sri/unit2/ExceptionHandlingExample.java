package io.sri.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] someNumber = {1, 2, 3, 5, 4};
        int key = 0;

        process(someNumber, key,wrapperLambda((v, k) ->
                System.out.println(v / k)));

    }

    private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumber) {
                consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer)
    {
        return (v,k)-> {
            try {
                consumer.accept(v, k);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Exception caught in wrapper lambda");
            }
        };
    }

}
