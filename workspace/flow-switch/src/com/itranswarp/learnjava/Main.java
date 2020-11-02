package com.itranswarp.learnjava;


import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner scanner=new Scanner(System.in);
		int choice = scanner.nextInt();
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) Math.random() * 3;
		System.out.println(random);
		switch (choice) {
		// TODO:
		case 1:switch (random) {
		case 1:
			System.out.println("pingju");
			break;
		case 2:
			System.out.println("yingle");
			break;
		case 3:
			System.out.println("shule");
			break;
		}	break;
		case 2:switch (random) {
		case 1:
			System.out.println("shule");
			break;
		case 2:
			System.out.println("pingju");
			break;
		case 3:
			System.out.println("yingle");
			break;
		}	break;
		case 3:switch (random) {
		case 1:
			System.out.println("yingle");
			break;
		case 2:
			System.out.println("shule");
			break;
		case 3:
			System.out.println("pingju");
			break;
		}	break;
		}
	}

}
