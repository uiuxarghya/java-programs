# **Amicable Number**

The **amicable numbers** are two different numbers (a pair of numbers) so related that the sum of the proper divisors (excluding the number itself) of one of the numbers is equal to the other. A proper divisor of a number is a divisor other than the number itself. It is also known as **friendly numbers**.

## **Simply**

> The sum of the divisor of the first number = The sum of the divisor of the second number

> The sum of the divisor of the second number = The sum of the divisor of the first number

The smallest pair of amicable numbers is **(220, 284)**.

**Because :**

1. The divisor of **220** are: **1,2,4,5,10,11,20,22,44,55,and 110**

2. The sum of divisor of **220** is = 284\*\*

3. The divisor of **284** are: **1,2,4,71,142**

4. The sum of divisor of 284 is = 220

We observe that the sum of the divisors of the first number is equal to the second number, and the sum of divisor of the second number is equal to the first number. Hence, the given pair (220, 284) is an **amicable** pair.

## **Amicable Numbers Example**

| **Pair of Numbers** | **Divisors of the First Number**                               | **Sum of Divisors of the First Number** | **Divisors of the Second Number**              | **Sum of Divisors of the Second Number** | **Amicable/ Not Amicable** |
| :------------------ | :------------------------------------------------------------- | :-------------------------------------- | :--------------------------------------------- | :--------------------------------------- | :------------------------- |
| 220, 284            | 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110                        | 284                                     | 1, 2, 4, 71, 142                               | 220                                      | Amicable                   |
| 1184, 1210          | 1, 2, 4, 8, 16, 32, 37, 74, 148, 296, 592                      | 1210                                    | 1, 2, 5, 10, 11, 22, 55, 110, 121, 242, 605    | 1184                                     | Amicable                   |
| 2620, 2924          | 1, 2, 4, 5, 10, 20, 131, 262, 524, 655, 1310                   | 2924                                    | 1, 2, 4, 17, 34, 43, 68, 86, 172, 731, 1462    | 2620                                     | Amicable                   |
| 5020, 5564          | 1, 2, 4, 5, 10, 20, 251, 502, 1004, 1255, 2510                 | 5564                                    | 1, 2, 4, 13, 26, 52, 107, 214, 428, 1391, 2782 | 5020                                     | Amicable                   |
| 6232, 6368          | 1, 2, 4, 8, 19, 38, 41, 76, 82, 152, 164, 328, 779, 1558, 3116 | 6368                                    | 1, 2, 4, 8, 16, 32, 199, 398, 796, 1592, 3184  | 6232                                     | Amicable                   |

Some other amicable pair numbers are (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), and (66928, 66992).

## **Steps to Find Amicable Number**

1. Read or initialize two numbers (N1, N2) from the user.
2. Find the divisor (divOfN1, divOfN2) of both numbers.
3. Find the sum of divisors (sumdiv1, sumdiv2) of both numbers.
4. Check if the sum of divisors of one number is equal to the other number or not.
   - If equal, the pair of numbers is **amicable**.
   - Else, not amicable.
