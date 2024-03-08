
/*
 * class Calculator { // class Defined
    int a;

    public int add(int n1, int n2) { // Defined Properties
        int r = n1 + n2;
        return r;
    }
}
*/

import java.util.HashMap;

// class Computer /// class defined..
// {
//     public void playMusic() // method created
//     {
//         System.out.println("Music Playing");
//     }

//     public String getMePen(int cost) {
//         return "Hello";
//     }
// }

//Method Overloading....
// class Calculator {
//     public int add(int n1, int n2, int n3) {
//         return n1 + n2 + n3;
//     }

//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }

//     public double add(double n1, int n2) {
//         return n1 + n2;
//     }
// }

//Creating an instance ...

import java.util.HashMap;

class Student {
    int rollno;
    String name;
    int marks;
}

class Hello {
    public static void main(String args[]) {
        // Data types in Java...
        // Boolean * Int * Float * Character

        // literals...
        // char c = 'a';
        // c++;

        // integers
        // int num1 = 3;
        // int num2 = 4;
        // int results = num1 + num2;

        // double
        // double x = 3.5;

        // byte
        // byte b = 125;
        // int c = b;

        // Float
        /*
         * float f = 5.6f;
         * int t = (int) f;
         */

        // Casting in Java
        /*
         * int z = 3;
         * int b = z;
         */

        // Operations
        /*
         * int x = 4;
         * int k = 5;
         * int result = x * k;
         * 
         * //Addition.
         * int x = 4;
         * int k = 5;
         * int result = x + k;
         * 
         * 
         * // Subtraction..
         * int x = 10;
         * int k = 5;
         * int result = x - k;
         * 
         * 
         * // division
         * int x = 7;
         * int k = 5;
         * int result = x / k;
         * 
         * 
         * // modulus operators...
         * int x = 7;
         * int k = 5;
         * int result = x % k;
         * 
         * 
         * // increment x by 2...
         * int x = 7;
         * x += 2;
         * 
         * 
         * // decrease by 2..
         * int x = 7;
         * x -= 2;
         * 
         * 
         * // multiplication
         * int x = 7;
         * x *= 8;
         * 
         * 
         * // increment by 0ne...
         * int x = 7;
         * x++;
         * 
         * // ++x and x++ are not the same...
         * int x = 7;
         * int y = ++x;
         * 
         * int x = 7;
         * int y = x++;
         * 
         * // Comparison operators...
         * int a = 5;
         * int b = 10;
         * 
         * boolean result = a > b;
         * 
         * int a = 5;
         * int b = 10;
         * 
         * boolean result = a < b;
         * 
         * int x = 10;
         * int y = 20;
         * boolean k = x != y;
         * 
         * 
         * int x = 5;
         * int y = 3;
         * boolean k = x == y;
         * 
         * int x = 5;
         * int y = 5;
         * boolean k = x == y;
         * 
         * 
         * // Logical Operators...
         * // && == and || == OR ! == NOT
         * 
         * int a = 7;
         * int b = 5;
         * int c = 5;
         * int d = 9;
         * boolean result = a > b && c < d;
         * 
         * int a = 7;
         * int b = 5;
         * int c = 5;
         * int d = 9;
         * boolean result = a > b || c > d;
         * 
         * 
         * int a = 7;
         * int b = 5;
         * int c = 5;
         * int d = 9;
         * boolean result = a < b || c < d || a > 1;
         * 
         * 
         * int a = 7;
         * int b = 5;
         * 
         * boolean result = a != b;
         * 
         * 
         * // conditional Statements...
         * int x = 18;
         * if (x < 10) {
         * System.out.println("Hello");
         * } else {
         * System.out.println("Good day!");
         * }
         * 
         * int x = 28;
         * if (x > 10 && x <= 18)
         * System.out.println("Hello");
         * else
         * System.out.println("Bye");
         * 
         * 
         * int x = 8;
         * int y = 7;
         * int z = 9;
         * 
         * if (x > y && x > z)
         * System.out.println(x);
         * else if (y > x && y > z)
         * System.out.println(y);
         * else
         * System.out.println(z);
         * 
         * 
         * int x = 5;
         * int result = 0;
         * if (x % 2 == 0)
         * result = 10;
         * else
         * result = 20;
         * System.out.println(result);
         * 
         * // Using Ternary Operator
         * int x = 4;
         * int result = 0;
         * 
         * result = x % 2 == 0 ? 10 : 20;
         * System.out.println(result);
         * 
         * // Switch Statements
         * int n = 6;
         * switch (n) {
         * case 1:
         * System.out.println("Monday");
         * break;
         * case 2:
         * System.out.println("Tuesday");
         * break;
         * case 3:
         * System.out.println("Wednesday");
         * break;
         * case 4:
         * System.out.println("Thursday");
         * break;
         * case 5:
         * System.out.println("Friday");
         * break;
         * case 6:
         * System.out.println("Saturday");
         * break;
         * case 7:
         * System.out.println("Sunday");
         * default:
         * System.out.println("Invalid Day!");
         * }
         * 
         * 
         * // Using Loop Statements
         * int x = 1;
         * while (x <= 5) {
         * System.out.println("Hi " + x);
         * x++;
         * }
         * 
         * int x = 1;
         * while (x <= 4) {
         * System.out.println("Hi" + x);
         * int j = 1; // Nested loop
         * while (j <= 3) {
         * System.out.println("Hello " + j);
         * j++;
         * } // End of Nested Loop
         * x++;
         * }
         * 
         * // For Loop
         * for (int i = 4; i >= 1; i--) {
         * System.out.println("Hi " + i);
         * }
         * 
         * for (int x = 0; x < 6; x++) {
         * System.out.println(x);
         * }
         * 
         * // Calendar...
         * for (int i = 1; i <= 5; i++) {
         * System.out.println("DAY " + i);
         * // using nested loop..
         * for (int j = 1; j <= 9; j++) {
         * System.out.println(" " + (j + 8) + "---" + (j + 9));
         * }
         * }
         * ;
         */

        // Java Objects and Class
        /*
         * int num1 = 4;
         * int num2 = 5;
         * 
         * Calculator calc = new Calculator(); // instance of the the class Object...
         * 
         * int result = calc.add(num1, num2); // assigned arguments with object
         * reference...
         * 
         * System.out.println(result);
         */

        // Computer obj = new Computer(); // Created an instance of the object
        // obj.playMusic();
        // String str = obj.getMePen(10);
        // System.out.println(str);

        // Calculator obj = new Calculator();
        // var result = obj.add(3, 4);
        // System.out.println(result);

        // Array
        // int nums[] = { 3, 7, 5, 1 };

        // System.out.println(nums[1]);
        // }

        // int nums[] = new int[4]; // Array that takes 4 elements...
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for (int i = 0; i < 4; i++) {
        // System.out.println(nums[i]);
        // }

        // nested arrays in an array...
        // int nums[][] = new int[3][4];

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.println(nums[i][j]);
        // }
        // }

        // Generating random numbers...
        // int nums[][] = new int[3][4];

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // nums[i][j] = (int) (Math.random() * 100);
        // // System.out.println(nums[i][j]);
        // }
        // }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {

        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Jagged array
        // int numbs[][] = new int[3][]; // jagged array..
        // numbs[0] = new int[3];
        // numbs[1] = new int[4];
        // numbs[2] = new int[2];

        // for (int a = 0; a < numbs.length; a++) {

        // for (int b = 0; b < numbs[a].length; b++) {
        // numbs[a][b] = (int) (Math.random() * 10);
        // }
        // }

        // for (int n[] : numbs) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        // String array..
        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "Addition";
        // s1.marks = 98;

        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "Mike";
        // s2.marks = 88;

        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "John";
        // s3.marks = 77;

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + ":" + students[i].marks);
        // }

        // for each loop...4:30

        // INTERVIEW QUESTIONS........
        // using for loop

        // int numbs[] = {7, 2, 3, 4, 2, 6, 7, 3, 8, 9};

        // int[] counts = new int[10];

        // for (int num : numbs) {
        // counts[num]++;
        // }

        // for (int i = 0; i < counts.length; i++) {
        // if (counts[i] > 0) {
        // System.out.println("Number " + i + " occurs " + counts[i] + " times.");
        // }
        // }

        // second method......

        // public class NumberOccurrences {
        // public static void main(String[] args) {
        // int numbs[] = { 7, 2, 3, 4, 2, 6, 7, 3, 8, 9 };

        // for (int i = 0; i < numbs.length; i++) {
        // int num = numbs[i];
        // int count = 0;

        // for (int j = 0; j < numbs.length; j++) {
        // if (numbs[j] == num) {
        // count++;
        // }
        // }

        // System.out.println("Number " + num + " occurs " + count + " times.");
        // }

        // int numbs[] = { 7, 2, 3, 2, 6, 7, 3, 8 };
        // // ,
        // HashMap<Integer, Integer> counts = new HashMap<>();
        // //
        // for (int num : numbs) {
        // if (counts.containsKey(num)) {
        // counts.put(num, counts.get(num) + 1);
        // } else {
        // counts.put(num, 1);
        // }
        // }

        // for (int key : counts.keySet()) {
        // int count = counts.get(key);
        // System.out.println("Number " + key + " occurs " + count + " times.");
        // }

        // int numbs[] = { 7, 2, 3, 2, 6, 7, 3, 8 };

        // for (int i = 0; i < numbs.length; i++) {
        // int num = numbs[i];

        // if (num == -1) {
        // continue;
        // }

        // int count = 1;

        // for (int j = i + 1; j < numbs.length; j++) {
        // if (numbs[j] == num) {
        // count++;
        // numbs[j] = -1;
        // }
        // }

        // System.out.println("Number " + num + " occurs " + count + " times.");
        // }

        //

        // int numbs[] = { 7, 2, 3, 2, 6, 7, 3, 8 };

        // for (int i = 0; i < numbs.length; i++) {
        // int num = numbs[i];

        // if (num == -1.0) {
        // continue;
        // }

        // int me = 1;

        // for (int j = i + 1; j < numbs.length; j++) {
        // if (numbs[j] == num) {
        // me++;
        // numbs[j] = -1;
        // }
        // }

        // System.out.println("Number " + num + " occurs " + me + " times.");

        // numbs[i] = -1;
        // }

        // Continuation of Learning...`

        String name = new String("Addition");

        System.out.println("Hello " + name);
        System.out.println(name.charAt(1));

    }
}
