package sample;

public class FizzBuzz {

    public String convert(int num) {
        /**
         * テストコードとプロダクトコードに自身があるならすぐに書き換えてしまう
         * これを「明白な実装」という
         */
        if(num % 3 == 0) {
            return "Fizz";
        }
        if(num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

}
