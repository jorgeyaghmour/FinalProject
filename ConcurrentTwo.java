package concurrentApp;

import java.util.Random;

	public class ConcurrentTwo extends Thread {

		/**
		 * This is to calculate random numbers between 1 and 10
		 * 
		 * @param args - this string array will store arguments passed by command line
		 *             while starting a program
		 */
		public static void main(String[] args) {
			Random rand = new Random();
			int[] arr = new int[200000000];

			for (int i = 0; i < 11; i++) {
				arr[i] = rand.nextInt();
			}

			long time = System.currentTimeMillis();

			ConcurrentJavaDoc.single(arr);
			System.out.println("Single: " + (System.currentTimeMillis() - time));
			time = System.currentTimeMillis();
			System.out.println(time + "mls");

			System.out.println();

			ConcurrentJavaDoc.getSum(arr);
			System.out.println("Parallel: " + (System.currentTimeMillis() - time));
			System.out.println(time + "mls");

		}
	}