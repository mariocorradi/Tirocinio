package objects;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import parser.general.GeneraleParser;
import parser.spanish.SpanishParser;

public class LanguageFunctions{
	
	public static int getRealParserValue(GeneraleParser parser, String name) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		return parser.getClass().getField(name).getInt(new Object());
	}
	
}
