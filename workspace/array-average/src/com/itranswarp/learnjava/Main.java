package com.itranswarp.learnjava;


//import java.util.Arrays;

//import javax.management.monitor.CounterMonitorMBean;

/**
 * 二维数组
 */
public class Main {
	public static void main(String[] args) {
		// 用二维数组表示的学生成绩:
		int[][] scores = { //
				{ 82, 90, 91 }, //
				{ 68, 72, 64 }, //
				{ 95, 91, 89 }, //
				{ 67, 52, 60 }, //
				{ 79, 81, 85 }, //
		};
		//System.out.println(Arrays.toString(scores[0]));
		// TODO:
		double average = 0;
		for(int i=0;i<scores.length;i++) {
			double sumj=0;
			
			for(int j=0;j<scores[i].length;j++) {
				sumj+=scores[i][j];
			}
			average+=(sumj/scores[i].length)/scores.length;
			
		}
		//System.out.println(scores.length);
		System.out.println(average);
		if (Math.abs(average - 77.733333) < 0.000001) {
			System.out.println("测试成功");
		} else {
			System.out.println("测试失败");
		}
	}
}
