import java.util.Scanner;

public class Program {

	public static void printStars(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("*");

		}
		System.out.println("");
	}

	public static void printSquare(int size) {
		for(int i = 0; i < size; i++) {
			printStars(size);
		}

	}
	
	public static void printRectangle(int width, int height) {
		for(int i = 0; i < height; i++) {
			printStars(width);
		}
	}
	
	public static void printTriangle(int size) {
		for(int i = 1; i <= size; i++) {
			printStars(i);
		}
	}
	
	public static void printSpaces(int number) {
		for(int i = 0; i < number; i++) {
			System.out.print(" ");
		}
	}
	
	public static void printRightTriangle(int size) {
		for(int i = 1; i <= size; i++) {
			printSpaces(size - i);
			printStars(i);
		}

	}
	
	public static void christmasTree(int height) {
		for(int i = 0; i < height; i++) {
			printSpaces(height - 1 - i);
			printStars(i * 2 + 1);
		}
		for(int i = 0; i < 2; i++) {
			printSpaces(height - 2);
			printStars(3);
		}
	} 

	public static void main(String[] args) {
	    printStars(5);
	    printStars(3);
	    printStars(9);
	    printSquare(4);
		printRectangle(14,3);
		printTriangle(4);
		printRightTriangle(4);
		christmasTree(10);
	}
}
