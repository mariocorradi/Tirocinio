import gestioneLingua.lingue.Spanish;
import objects.output.JsonOutput;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.spanish.SpanishLexer;
import parser.spanish.SpanishParser;
import walker.SpanishWalker;

public class start {

	private static String input = "src/prova.txt";
	
	public static void main(String[] args) {
		try {
			Spanish language = new Spanish();
			SpanishLexer lexer = new SpanishLexer(new ANTLRFileStream(input, "UTF-8"));
			SpanishParser parser = new SpanishParser(new CommonTokenStream(lexer));
			ParserRuleContext tree = parser.page(); // parse
			ParseTreeWalker walker = new ParseTreeWalker();
			JsonOutput output = new JsonOutput();
			output.newPage("Prova");
			walker.walk(new SpanishWalker(language, parser, output), tree);
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
