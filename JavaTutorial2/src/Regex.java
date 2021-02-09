import java.util.regex.*;
public class Regex {
    //1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern=Pattern.compile("....xx..");
		Matcher matcher=pattern.matcher("12aBxxx/");
		System.out.println(matcher.matches());

	
	//2.e notes
	
		System.out.println(Pattern.matches("[xyz]", "xwbcd"));
		//false(as not x or y or z)
		System.out.println(Pattern.matches("[xyz]", "x"));
		//true (as among x or y or z)
		System.out.println(Pattern.matches("[xyz]", "xxyyyy"));
		//false(x and y comes more than once)
		
	//3.f  regexQuantifiers
		System.out.println("? Quantifier...");//occurs one or not at all
        System.out.println(Pattern.matches("[ayz]?", "a"));
        //true(a or y or z comes one time)
        System.out.println(Pattern.matches("[ayz]?", "aaa"));
		//false(a comes more than one time)
        System.out.println(Pattern.matches("[ayz]?", "ayyyzz"));
        //false(a y and z comes more than one time)
        System.out.println(Pattern.matches("[ayz]?", "amnt"));
        //false (m & n& t are not matching pattern)******************
        System.out.println(Pattern.matches("[ayz]?", "ayz"));
  //****false(only one of the character should be there like either if a,y,z
        
        
        System.out.println("+ Quantifier...");//occurs one or more times
        System.out.println(Pattern.matches("[ayz]+", "a"));
        //true(a or y or z comes one time)
        System.out.println(Pattern.matches("[ayz]+", "aaa"));
		//true(a comes more than one time)
        System.out.println(Pattern.matches("[ayz]+", "ayyyzz"));
        //true(a y and z comes more than one time)
        System.out.println(Pattern.matches("[ayz]+", "amnt"));
        //false (m & n& t are not matching pattern)******************
        System.out.println(Pattern.matches("[ayz]+", "ayz"));
        //true(a or y or z must come one time)
        
        System.out.println("* Quantifier...");//occurs zero or more times
        System.out.println(Pattern.matches("[ayz]*", "ayyyza"));
        //true(a y and z may come zero or  more than one time)
        
        
        //4.g
        System.out.println("metacharacters d....");//represents any digits
        System.out.println(Pattern.matches("d","abc"));
        //false(non digit)
        System.out.println(Pattern.matches("d","1"));
        //true(digit &come once)
        System.out.println(Pattern.matches("d","4443"));
        //false(digit comes more than  once)
        System.out.println(Pattern.matches("d","323abc"));
        //false(digit &char)
        
        System.out.println("metacharacters D....");//represents non- digits
        System.out.println(Pattern.matches("D","abc"));
        //false(non digit but comes more than once)
        System.out.println(Pattern.matches("D","1"));
        //false( digit)
        System.out.println(Pattern.matches("D","4443"));
        //false(digit )
        System.out.println(Pattern.matches("D","323abc"));
        //false(digit &char)
        System.out.println(Pattern.matches("D","m"));
        //true(non-digit & comes once
        
        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("D*","abc"));
        //true(non-digit &may occur any times)BUT GETTING FALSE
        
        //
	}

}
