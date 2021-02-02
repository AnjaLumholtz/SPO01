package ex01.strings;
import java.util.*;

class Program {
	public static void main(String[] args) {
		Scanner userObj = new Scanner(System.in);

		System.out.println("Enter something mathematical:");
		String input = userObj.nextLine();
		System.out.println();

		MyScanner sc = new MyScanner(input);
		List<Lexer> l = sc.GetLexers();
		for (Lexer le: l) {
			le.print();
		}
	}
}
