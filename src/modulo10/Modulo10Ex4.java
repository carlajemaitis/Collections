package modulo10;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class Modulo10Ex4 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> num = new HashSet<Integer>();
		num.add(28);
		num.add(06);
		num.add(17);
		num.add(22);
		num.add(10);
		num.add(11);
		num.add(26);
		num.add(24);
		num.add(03);
		num.add(20);
		
		System.out.println("Digite um número para conferir se tem na lista: ");
		Integer conferir = leia.nextInt();
		
		if(num.contains(conferir))
			System.out.println("O número " + conferir + " foi encontrado na lista.");
		else
			System.out.println("O númer0 " + conferir + " não foi encontrado na lita.");
	leia.close();
	}

}
