package com.careerit.jfs.cj.day19;

interface Operation{
    int perform(int a,int b);
}
class MyMath {
    public int calculate(int a,int b,Operation operation){
        return operation.perform(a,b);
    }
}


interface NumberOperations{
    boolean isPalindrome(int num);
    default int gcdOfThreeNumbers(int a,int b, int c){
        return gcd(gcd(a,b),c);
    }
    private int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    default int reverseNumber(int num){
        int rev = 0;
        while(num != 0){
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        return rev;
    }
    private int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

public class Manager {

  public static void main(String[] args) {

        MyMath myMath = new MyMath();
        int a = 10, b = 20;
        int res = myMath.calculate(a, b, (n,m)-> n + m);
        int mul = myMath.calculate(a, b, (n,m)-> n * m);
        int biggest = myMath.calculate(a, b, (n,m)-> n > m ? n : m);

  }
}

// q: functional interface ?
// a: interface with only one abstract method is called functional interface