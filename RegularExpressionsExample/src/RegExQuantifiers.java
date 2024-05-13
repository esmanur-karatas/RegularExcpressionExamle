import java.util.regex.Pattern;

public class RegExQuantifiers {

	public static void main(String[] args) {
		System.out.println("RexEx Quantifiers");
		
//		a? a bir defa vardır ya da hiç yoktur.
		System.out.println("\na var mı? " + Pattern.matches("a?", "a"));
		System.out.println("a var mı? " + Pattern.matches("a?", "b"));
		
//		a+ a bir ya da birden fazla vardır.
		System.out.println("\na birden fazla var mı? " + Pattern.matches("a+", "aa"));
		System.out.println("a birden fazla var mı? " + Pattern.matches("a+", "c")); 
		
//		a* a ya hiç yok ya da bir ve birden fazla var
		System.out.println("\na ya hiç yok ya da birden fazla var mı? " + Pattern.matches("a*", "aa"));
		System.out.println("a ya hiç yok ya da birden fazla var mı? " + Pattern.matches("a*", "c")); 
		
//		a{n} a sadece n defa tekrar eder.
		System.out.println("\n6 tane a var mı? " + Pattern.matches("a{6}", "aaaaaa"));
		System.out.println("6 tane a var mı? " + Pattern.matches("a{6}", "c")); 
		
//		a{n,} a en az n defa ya da daha fazla tekrar edebilir.
		System.out.println("\n2 veya daha fazla a var mı? " + Pattern.matches("a{2,}", "aa"));
		System.out.println("2 veya daha fazla a var mı? " + Pattern.matches("a{2,}", "c")); 
		
//		a{n,m} a en az n defa en fazla m defa tekrar edebilir.
		System.out.println("\nen az 2 en fazla 4 tane a var mı? " + Pattern.matches("a{2,4}", "aa"));
		System.out.println("en az 2 en fazla 4 tane a var mı?  " + Pattern.matches("a{2,4}", "c")); 
		
	}

}
