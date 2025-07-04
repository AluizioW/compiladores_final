package dl;

import java.io.File;

import lexer.Lexer;
import parser.Parser;

public class DL {
	public static void main(String[] args) {
		//Análise
		Lexer l = new Lexer(
				new File("compiladores_final/prog.dl"));		
		Parser p = new Parser(l);
		p.parse();

		//Imprimindo a árvore sintática
		System.out.println(p.parseTree());
		System.out.println("finalizado");
	}
}
