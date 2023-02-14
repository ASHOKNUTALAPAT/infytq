/*
 * Question 1: Biggest Meatball
Problem Statement – Bhojon is a restaurant company and has started a new wing in a city. They have every type of cook except the meatball artist. They had fired their last cook because the sale of meatballs in their restaurant is really great, and they can’t afford to make meatballs again and again every time their stock gets empty. They have arranged a hiring program, where you can apply with their meatball.
They will add the meatball in their seekh (a queue) and everytime they cut the meatball they take it and cut it on the day’s quantity and then re-add the meatball in the seekh. You are the hiring manager there and you are going to say who is gonna be hired.

Day’s quantity means, on that very day the company sells only that kg of meatballs to every packet.

If someone has less than a day’s quantity, it will be counted as a sell.

Function Description:

Complete the function with the following parameters:
Parameters:

Name	Type	Description
N	Integer	How many people are participating in the hiring process.
D	Integer	Day’s quantity, how many grams of meatball is being sold    to every packet.
Array[ ]	Integer array	Array of integers, the weight of meatballs everyone came with.
 

Return:

The ith person whose meat is served at last.
Constraints:

1 <= N <= 10^3
1 <= D <= 10^3
1 <= Array[i] <= 10^3
Input Format:

First line contains N.
Second line contains D.
After that N lines contain The ith person’s meatball weight.
 

Output Format: The 1 based index of the man whose meatball is served at the last.

 

Sample Input 1:

4

2
 */

/*
 * Question 2: Self Sufficient
Problem Statement –  Abhijeet is one of those students who tries to get his own money by part time jobs in various places to fill up the expenses for buying books. He is not placed in one place, so what he does, he tries to allocate how much the book he needs will cost, and then work to earn that much money only. He works and then buys the book respectively. Sometimes he gets more money than he needs so the money is saved for the next book. Sometimes he doesn’t. In that time, if he has stored money from previous books, he can afford it, otherwise he needs money from his parents.

Now His parents go to work and he can’t contact them amid a day. You are his friend, and you have to find how much money minimum he can borrow from his parents so that he can buy all the books.

He can Buy the book in any order.

 

Function Description:

Complete the function with the following parameters:

Name			Type			Description
N				Integer			How many Books he has to buy that day.
EarnArray[ ]	Integer array	Array of his earnings for the ith book
CostArray[ ]	Integer array	Array of the actual cost of the ith book.

Constraints:

1 <= N <= 10^3
1 <= EarnArray[i] <= 10^3
1 <=  CostArray[i] <= 10^3
 

Input Format:

First line contains N.
Second N lines contain The ith earning for the ith book.
After that N lines contain The cost of the ith book.
 

Output Format: The minimum money he needs to cover the total expense.

 

Sample Input 1:

3

[3 4 2]

[5 3 4]

 

Sample Output 1:

3
 */

package infytq;

import java.util.Scanner;

public class MeatBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int m[]=new int[n];
		for(int i=0;i<n;i++)
			m[i]=sc.nextInt();
		
		int maxn=-1;
		int maxi=-1;
		for(int i=0;i<n;i++) {
			if(m[i]>maxn && m[i]>q) {
				maxn=m[i];
				maxi=i+1;
			}
		}
		System.out.println(maxi);
			

	}

}
