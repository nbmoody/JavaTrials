package TryThings;// Created by natha on 7/20/2017.


public class TryExceptions {

    public static void main(String args[]){


        try{
            test();
        }catch(ArithmeticException x){
            System.out.println("Catch.");
        }catch(Exception x){
            System.out.println("ArithmeticException.");
        }
        finally{
            System.out.println("Finally.");
        }
    }


    public static void test()throws ArithmeticException{
        System.out.println("I'm running at position:" + 1/0);
    }
}


