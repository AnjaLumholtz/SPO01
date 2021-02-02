package ex01.strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MyScanner {
	private List<String> symbols;
	private List<Lexer> lexers = new ArrayList<Lexer>();
	private Pattern val = Pattern.compile("[a-zA-Z0-9]");
	private Pattern op = Pattern.compile("[+|-|*|/]");

	public MyScanner(String s) {
		splitString(s);
		beginScan();
	}
	
	private void splitString(String s) {
		String str[] = s.split("");
		symbols = Arrays.asList(str);
	}

	private void beginScan() {
		for(String s: symbols) {
			Matcher value = val.matcher(s);
			if (value.matches()) {
				Value v = new Value(s);
				lexers.add(v);
			}

			Matcher operator = op.matcher(s);
			if (operator.matches()) {
				Operator o = new Operator(s);
				lexers.add(o);
			}
		}
	}

	public List<Lexer> GetLexers() {
		return lexers;
	}
}
