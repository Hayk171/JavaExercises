public class Exercises {
    public static void main(String[] ex) {

        //exercise 1
        int h = 5;
        if (h == 1 || h == 3 || h == 5){
            System.out.println("We have lesson.");
        } else if (h == 2 || h == 4 || h ==6){
            System.out.println("We haven't lesson.");
        } else if (h == 7){
            System.out.println("Today is sunday");
        } else {
            System.out.println("There is no day of the week like that.");
        }





        // exercise 24  option 1
        int a = 2;
        int b = 4;
        int c = 1;

        if (a == 2 && b == 2 && c !=2){
            System.out.println(true);
        } else if(a == 2 && b != 2 && c == 2){
            System.out.println(true);
        } else if(a != 2 && b == 2 && c == 2){
            System.out.println(true);
        } else{
            System.out.println(false);
        }


        // exercise 24  option 2

        if ((a == 2 && b == 2 && c !=2) || (a == 2 && b != 2 && c == 2) || (a != 2 && b == 2 && c == 2)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }




        // exercise 27
        int a1 = 1;
        int b1 = 3;
        int c1 = 5;
        if(c1 - b1 == b1 - a1){
            System.out.println(true);
        } else{
            System.out.println(false);
        }


        // exercise 28
        int a2 = 2;
        int b2 = 5;
        int c2 = 13;
        if ((c2 / b2 == b2 / a2) && (c2 % b2 == b2 % a2)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }



        // exercise 29
        int a3 = 5, b3 = 2, c3 = 8;

        if (a3 >= b3 && b3 >= c3){
            System.out.println(c3 + " " + b3 + " " + a3);
        } else if (a3 >= b3 && b3 <= c3 && a3 >= c3){
            System.out.println(b3 + " " + c3 + " " + a3);
        } else if (a3 >= b3 && b3 <= c3 && a3 <= c3) {
            System.out.println(b3 + " " + a3 + " " + c3);
        } else if (a3 <= b3 && b3 <= c3){
            System.out.println(a3 + " " + b3 + " " + c3);
        } else if (a3 <= b3 && b3 >= c3 && a3 >= c3){
            System.out.println(c3 + " " + a3 + " " + b3);
        }else {
            System.out.println(a3 + " " + c3 + " " + b3);
        }


        int row = 3;
        int elem = 3;

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        // exercise 30

        int a4 = 2, b4 = -1, c4 = 0;

        if (a4 >= b4 && b4 >= c4){
            System.out.println(a4 + " " + b4 + " " + c4);
        } else if (a4 >= b4 && b4 <= c4 && a4 >= c4){
            System.out.println(a4 + " " + c4 + " " + b4);
        } else if (a4 >= b4 && b4 <= c4 && a4 <= c4) {
            System.out.println(c4 + " " + a4 + " " + b4);
        } else if (a4 <= b4 && b4 <= c4){
            System.out.println(c4 + " " + b4 + " " + a4);
        } else if (a4 <= b4 && b4 >= c4 && a4 >= c4){
            System.out.println(b4 + " " + a4 + " " + c4);
        }else {
            System.out.println(b4 + " " + c4 + " " + a4);
        }




        // exercise 31

        int a6 = 4, b6 = 7, c6 = 10, d6 = 40;

        if (a6 >= b6 && a6 >= c6 && a6 >= d6) {
            System.out.println("Maximum is: " + a6);
        } else if (b6 >= a6 && b6 >= c6 && b6 >= d6) {
            System.out.println("Maximum is: " + b6);
        } else if (c6 >= a6 && c6 >= b6 && c6 >= d6) {
            System.out.println("Maximum is: " + c6);
        } else if (d6 >= a6 && d6 >= b6 && d6 >= c6) {
            System.out.println("Maximum is: " + d6);
        }

        // exercise 32

        int a7 = -4, b7 = 14, c7 = 47, d7 = 7;

        if (a7 <= b7 && a7 <= c7 && a7 <= d7) {
            System.out.println("Minimum is: " + a7);
        } else if (b7 <= a7 && b7 <= c7 && b7 <= d7) {
            System.out.println("Minimum is: " + b7);
        } else if (c7 <= a7 && c7 <= b7 && c7 <= d7) {
            System.out.println("Minimum is: " + c7);
        } else if (d7 <= a7 && d7 <= b7 && d7 <= c7) {
            System.out.println("Minimum is: " + d7);
        }




        // exercise 33
        int a8 = 7, b8 = 5, c8 = 7, d8 = -5;

        if (a8 == 1 || b8 == 1 || c8 == 1 || d8 == 1){
            System.out.println(true);
        } else{
            System.out.println(false);
        }




        // exercise 34
        int a9 = 9, b9 = 6, c9 = 0, d9 = 3;

        if ((a9 + b9 == c9 + d9) || (a9 + c9 == b9 + d9) || (a9 + d9 == b9 + c9)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



        // exercise 35
        int aa = 7, bb = 2, cc = 3, dd = 12;

        if ((aa == bb + cc + dd) || (bb == aa + cc + dd) || (cc == aa + bb + dd) || (dd == aa + bb + cc)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }



        // exercise 36
        int a10 = 4, b10 = 5, c10 = 3, d10 = 6;





        //exercise 37
        int v1 = -3, v2= 0, v3 = 3, v4 = 6;

        if((v4 - v3 == v3 - v2) && (v3 - v2 == v2 - v1)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }





        // exercise 38
        int e1 = 2, e2 = 4, e3 = 8, e4 = 16;

        if((e4 / e3 == e3 / e2) && (e3 / e2 == e2 / e1) && (e4 % e3 == e3 % e2) && (e3 % e2 == e2 % e1)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }



        // exercise 39 kisat
        int x = 3, y = 5, z = 2, k = 1;

        if (x >= y && y >= z && z >= k) {
            System.out.println(k + "," + z + "," + y + "," + x);
        } else if (x >= y && y >= z && z <= k && y >= k) {
            System.out.println(z + "," + k + "," + y + "," + x);
        } else if (x >= y && y >= z && z <= k && y <= k) {
            System.out.println(z + "," + y + "," + k + "," + x);
        } else if (x >= y && y <= z && z <= k && x >= k) {
            System.out.println(y + "," + z + "," + k + "," + x);
        } else if (x >= y && y <= z && z <= k && x <= k) {
            System.out.println(y + "," + z + "," + x + "," + k);
        } else if (x <= y && y <= z && z <= k) {
            System.out.println(x + "," + y + "," + z + "," + k);
        } else if (x <= y && y <= z && z >= k && y <= k) {
            System.out.println(x + "," + y + "," + k + "," + z);
        } else if (x <= y && y <= z && z >= k && y >= k && x<=k) {
            System.out.println(x + "," + k + "," + y + "," + z);
        } else if (x <= y && y >= z && z >= k && x <= z && x <= k) {
            System.out.println(x + "," + k + "," + z + "," + y);
        } else if (x <= y && y >= z && z >= k && x <= z && x >= k) {
            System.out.println(k + "," + x + "," + z + "," + y);
        } else if (x <= y && y >= z && z >= k && x >= z) {
            System.out.println(k + "," + z + "," + x + "," + y);
        } else if (x >= y && y <= z && z >= k && x>=z && x>=k && y>= k) {
            System.out.println(k + "," + y + "," + z + "," + x);
        } else if (x >= y && y <= z && z >= k && x<=z && x<=k && y<= k) {
            System.out.println(k + "," + y + "," + z + "," + x);
        } else if (x >= y && y <= z && z >= k && x>=z && x>=k && y<= k) {
            System.out.println(y + "," + k + "," + z + "," + x);
        } else if (x >= y && y <= z && z >= k && x>=k && x<=z && y<= k) {
            System.out.println(y + "," + k + "," + x + "," + z);
        } else if (x >= y && y <= z && z >= k && x<=z && x>=k && y>= k) {
            System.out.println(k + "," + y + "," + x + "," + z);
        } else if (x <= y && y >= z && z <= k && x>=z && x<=k && y<= k) {
            System.out.println(z + "," + x + "," + y + "," + k);
        } else if (x <= y && y >= z && z <= k && x>=z && x>=k && y>= k) {
            System.out.println(z + "," + k + "," + x + "," + y);
        } else if (x <= y && y >= z && z <= k && x<=z && x>=k && y>= k) {
            System.out.println(k + "," + x + "," + z + "," + y);
        } else if (x <= y && y >= z && z <= k && x<=z && x<=k && y<= k) {
            System.out.println(x + "," + z + "," + y + "," + k);
        } else if (x <= y && y >= z && z <= k && x<=z && x<=k &&y>= k) {
            System.out.println(x + "," + z + "," + k + "," + y);
        } else if (x <= y && y >= z && z <= k && x>=z && x<=k &&y>= k) {
            System.out.println(z + "," + x + "," + k + "," + y);
        }







    }

}