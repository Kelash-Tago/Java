public class example {

	public static void printNumbers(int... numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public void printNumbers(int... numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};

		example obj = new example();
		obj.printNumbers(numbers);
	}
}