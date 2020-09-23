package com.company;
import java.util.Scanner;
//class Int{
    //int i = 1;
    //int j = 2;

    //public Int(){}
    //public Int(int i){
      //  this.i = i;
    //}
   // public void display(){
     //   System.out.println(this.i);
    //}
//}

public class main {
        public static void main(String[] args){
            System.out.println("toto");

           int Index = (int) (Math.random()*100);
           int monNb;

            do {

                Scanner myNb = new Scanner(System.in);
                System.out.println("Entre ton nombre");
                monNb = myNb.nextInt();

                if (monNb < Index) {
                    System.out.println("c'est plus");
                }

                else if (monNb > Index) {
                    System.out.println("c'est moins");
                }
            }

            while (monNb != Index);
            System.out.println("Bravo");



            // Int a = new Int();
            //Int b = new Int(4);

            //  System.out.println(a.i);
            //        a.display();
            //      b.display();

//write your code here

        }

    private static void main() {
    }
}
