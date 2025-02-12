package b_operator;

import java.util.Scanner;

public class choice {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 3개를 적어주세요");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if( a >= b)
		{
			if(a >= c)
			{
				if(b>=c)
				{
					System.out.println(b);
				}
				else
				{
					System.out.println(c);
				}
			}
			else
			{
				if (b>=c)
				{
					System.out.println(c);
				}
				else
				{
					System.out.println(b);
				}
			}
		}
		else
		{
			if (a >= c)
			{
				System.out.println(a);
			}
			else
			{
				if(b >=c)
				{
					System.out.println(c);
				}
				else
				{
					System.out.println(b);
				}
			}
		}

	}
}

