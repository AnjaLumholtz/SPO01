package ex01.strings;

public class Operator extends Lexer {
	public String op;

	public Operator(String op) {
		this.op = op;
	}

	@Override
	public void print() {
		System.out.println("Op: " + op);
	}
}
