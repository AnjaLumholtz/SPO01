package ex01.strings;

public class Value extends Lexer {
	public String value;

	public Value(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("Val: " + value);
	}
}
