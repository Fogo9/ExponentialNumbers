# **EXPONENTIAL NUMBERS**

# Information

* **Program that prints multiples of 5 and 4 up to the entered number.**

# Technologies Used

* **JAVA**

# Contents

* **N** and **I** variables are defined with int.

* Scanner scan class is defined to enable the user to enter numbers.

* Using the for loop twice to calculate multiples of 4 and 5.

<br />

# Codes

```Java

        import java.util.Scanner;

        public class exponentialnumbers{

            public static void main(String[] args) {

                int n, i;

                Scanner scan = new Scanner(System.in);

                System.out.print("Enter The Limit Number : ");

                n = scan.nextInt();

```

```Java

                for(i = 1; i <= n; i *= 4){

                    System.out.println("Multiples of 4 : " + i);

                }

                System.out.println("------------------");

                for(i = 1; i <= n; i *= 5){

                    System.out.println("Multiples of 5 : " + i);

                }
            }
        }

```

```bash

        Enter The Limit Number : 150

        Multiples of 4 : 1
        Multiples of 4 : 4
        Multiples of 4 : 16
        Multiples of 4 : 64
        ------------------
        Multiples of 5 : 1
        Multiples of 5 : 5
        Multiples of 5 : 25
        Multiples of 5 : 125

```

<br />

# LINK

* Click here https://github.com/Fogo9/ExponentialNumbers.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
