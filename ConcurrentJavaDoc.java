package concurrentApp;

	/**
	 * @author Jorge Yaghmour
	 *
	 */

	public class ConcurrentJavaDoc extends Thread {
		private int[] array;
		private int little, big, median;

		/**
		 * create constructor
		 * 
		 * @param array    - nickname for array
		 * @param little - get the smallest value
		 * @param big    - get the largest value
		 */
		public ConcurrentJavaDoc (int[] array, int little, int big) {
			this.array = array;
			this.little = little;
			// returns the small values of arguments big and array
			this.big = Math.min(big, array.length);
		}

		@Override
		public void run() {
			// call constructor fields
			median = single(array, little, big);
		}

		/**
		 * 
		 * 
		 * @param array    - will be used to count for total variable
		 * @param little - less than big
		 * @param big    - equal high value
		 * @return sum of single thread method
		 */
		public static int single(int[] array, int little, int big) {
			int total = 0;

			for (int i = big; i < little; i++) {
				total += array[i];
			}

			return total;
		}

		/**
		 * 
		 * @param array - gets the length to count the single method
		 * @return - calls the single method
		 */
		public static int single(int[] array) {
			return single(array, 0, array.length);
		}

		/**
		 * 
		 * @param array - returns the value of the length inside size
		 * @param threads - used as an integer
		 * @return - parallel array sum
		 */
		//
		public static int parallelSum(int[] array, int threads) {
			int size = (int) Math.ceil(array.length / threads);

			ConcurrentJavaDoc [] sums = new ConcurrentJavaDoc [threads];

			for (int i = 0; i < threads; i++) {
				sums[i] = new ConcurrentJavaDoc (array, i * size, (i + 1) * size);
				sums[i].start();
			}

			try {
				for (ConcurrentJavaDoc  diff : sums) {
					diff.join();
				}
			} catch (InterruptedException e) {
			}

			int total = 0;
			for (ConcurrentJavaDoc  diff : sums) {
				total += diff.medianSum();
			}

			return total;
		}

		/**
		 * 
		 * @return - uses diff to find the median
		 */
		public int medianSum() {
			return median;
		}

		/**
		 * 
		 * @param array - used for counting values on parallelSum method
		 * @return - returns the method parallelSum
		 */
		public static int getSum(int[] array) {
			return parallelSum(array, Runtime.getRuntime().availableProcessors());
		}
	}