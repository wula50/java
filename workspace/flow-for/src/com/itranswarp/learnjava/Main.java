package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		double pi = 0;
		for (int i = 1; i < 100000000; i ++) {
			// TODO:
			
			if(i%2!=0) {
				pi+=1.0/(2*i-1);
			}else {
				pi-=1.0/(2*i-1);
			}
		}
		pi*=4;
		System.out.println(pi);
	}

}
