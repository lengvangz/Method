/*
 * This program prints "*" and " " different amount of times depending on the method.
 * As a result the stars will create different shape and sizes
 * 
 */

public class Program {
	
	//this method prints stars then finally a new line
	public static void printStars(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("*");

		}
		System.out.println("");
	}
	
	/*
	 *this method print stars in a square shape 
	 *by printing stars and a new line 
	 *in a finite amount of times
	 */
	public static void printSquare(int size) {
		for (int i = 0; i < size; i++) {
			printStars(size);
		}

	}

	/*
	 * prints stars in a rectangle shape
	 * prints number of stars based on width
	 * and iterate it based on height 
	 */
	public static void printRectangle(int width, int height) {
		for (int i = 0; i < height; i++) {
			printStars(width);
		}
	}
	
	/*
	 * prints stars shape of a triangle
	 * prints stars based on the variable i
	 */
	public static void printTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			printStars(i);
		}
	}
	
	/*
	 * prints an empty space, needed for printRightTriangle()
	 * and christTree()
	 */
	public static void printSpaces(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print(" ");
		}
	}
	
	/*
	 * prints stars of a shape of right triangle by printing
	 * spaces and stars based on the variable i
	 */
	public static void printRightTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			printSpaces(size - i);
			printStars(i);
		}

	}
	
	/*
	 * prints stars a shape of a christmas tree
	 * 
	 */
	public static void christmasTree(int height) {
		for (int i = 0; i < height; i++) {
			printSpaces(height - 1 - i);
			printStars(i * 2 + 1);
		}
		for (int i = 0; i < 2; i++) {
			printSpaces(height - 2);
			printStars(3);
		}
	}

	public static void main(String[] args) {
		printStars(5);
		printStars(3);
		printStars(9);
		printSquare(4);
		printRectangle(14, 3);
		printTriangle(4);
		printRightTriangle(4);
		christmasTree(10);
	}
}
