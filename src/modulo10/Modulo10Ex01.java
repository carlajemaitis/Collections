package modulo10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Modulo10Ex01
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Escreva o nome de uma cor: ");
			cores.add(leia.nextLine());
		}
		System.out.println("As cores escolhidas foram: " + cores);
		
		Collections.sort(cores);
		System.out.println("As cores escolhidas em ordem alfabética: " + cores);
		leia.close();
	}
	
}
