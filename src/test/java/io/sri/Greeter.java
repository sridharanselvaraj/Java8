package io.sri;

public class Greeter {

        public void greet(Greeting greeting){
           // System.out.println("Hello World!");
            greeting.perform();
        }

        public static void main(String arg[])
        {
          Greeter greeter=new Greeter();
          // HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();
           Greeting lambdaGreeting = () -> System.out.println("Hello World!");

          // lambdaGreeting.perform();

           Greeting innerClassGreeting = new Greeting() {
               public void perform() {
                   System.out.println("Hello world!");
                   }
               };


           greeter.greet(innerClassGreeting);
           greeter.greet(lambdaGreeting);

           myLambda addFunction = (int a,int b) -> a + b;

        }



}

interface myLambda{
    int add(int i,int j);
}


//greetFunction = () -> System.out.println("Hello World");
//
//doubleNumberFunction = (int a) -> a*2;
//
//addFunction =(int a,int b) -> a+b;
//
//safeDivideFunction =(int a, int b) ->{
//    if(b==0)return 0;
//    return a/b''
//        };
//
//stringLengthCountFunction = (String s) -> s.length();


