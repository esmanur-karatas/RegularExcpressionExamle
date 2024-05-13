import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmailExample {

	private Pattern pattern;
	private Matcher matcher;
	private static final String EMAIL_PATTERN = 
			"^[\\w-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{1,3}$";
	
	public RegExEmailExample() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}
	
	public boolean dogrula(final String text) {
		matcher = pattern.matcher(text);
		return matcher.matches();
	}
	public static void main(String[] args) {
		RegExEmailExample e1 = new RegExEmailExample();
		System.out.println(e1.dogrula("esmanurkaratas0@gmail.com"));
		System.out.println(e1.dogrula("esmanurkara$tas0@gmail.com"));
		
	}

}
