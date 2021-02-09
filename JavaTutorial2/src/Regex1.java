import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex1 {
//case sensitivity matters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc =new Scanner(System.in);) {
			
			while(true) {
				System.out.println("enter regex pattern");
				String regex=sc.next();
				Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher("Welcome to Youtube channel");
			boolean found=false;
			while(matcher.find()) {
				System.out.println("found the text"
						+ matcher.group()
						+"starting at index"
						+matcher.start()
						+"and ending at index"
						+matcher.end());
				found=true;
			}
			
			if(!found)
				System.out.println("match not found");
		}

	}

}
}
