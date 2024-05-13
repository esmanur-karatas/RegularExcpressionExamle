import java.util.regex.Pattern;

public class RegExMetacharacters {

	public static void main(String[] args) {
//		. herhangi bir karakter
		System.out.println("herhangi bir karakter olduğunu kontrol eder." + Pattern.matches(".", "a"));
		System.out.println("herhangi bir karakter olduğunu kontrol eder." + Pattern.matches("//.", "a"));

//		d rakam olan karakter (digit)
		String regex = "\\d";
		System.out.println("\nRakam mı? " + Pattern.matches(regex, "123"));
		System.out.println("Rakam mı? " + Pattern.matches(regex, "1"));
		
		//bütün stringin rakam olup olmadığını kontrol etmek istersek * koymalıyız.
		regex = "\\d*";
		System.out.println("\nRakam mı? " + Pattern.matches(regex, "123"));
		
//		D rakam olmayan karakter (non-digit)
		regex = "\\D";
		System.out.println("\nRakam değil mi? " + Pattern.matches(regex, "a"));
		System.out.println("Rakam değil mi? " + Pattern.matches(regex, "1"));
		
//		s boşluk olan karakter
		regex = "\\s";
		System.out.println("\nBoşluk var mı? " + Pattern.matches(regex," "));
		System.out.println("Boşluk var mı? " + Pattern.matches(regex,"dsfe"));
		System.out.println("Boşluk var mı? " + Pattern.matches(regex+"*"," drg "));
		
//		S boşluk olmayan karakter
		regex = "\\S";
		System.out.println("\nBoşluk var mı? " + Pattern.matches(regex," "));
		System.out.println("Boşluk var mı? " + Pattern.matches(regex,"a"));
		System.out.println("Boşluk var mı? " + Pattern.matches(regex+"*"," drg "));
		
//		w kelime karakteri [a-zA-z_0-9]
		regex = "\\w";
		System.out.println("\nKelime Karakteri var mı? " + Pattern.matches(regex,"e"));
		System.out.println("Kelime Karakteri var mı? " + Pattern.matches(regex,"8"));
		System.out.println("Kelime Karakteri var mı? " + Pattern.matches(regex+"*"," esmanur karatas "));
		
//		W kelime karakter değil.
		regex = "\\W";
		System.out.println("\nKelime Karakteri var mı? " + Pattern.matches(regex,"!"));
		System.out.println("Kelime Karakteri var mı? " + Pattern.matches(regex," "));
		System.out.println("Kelime Karakteri var mı? " + Pattern.matches(regex+"*"," drg "));
		
//		b kelime karakteri olan sınır kontrolü
		regex = "\\bAHMET\\b";
		System.out.println("\nkelime karakteri olan sınır kontrolü: " + Pattern.matches(regex,"Ahmet"));
		System.out.println("kelime karakteri olan sınır kontrolü: " + Pattern.matches(regex,"AHMET"));
		System.out.println("kelime karakteri olan sınır kontrolü: " + Pattern.matches(regex+"*","ahmet"));
		
//		B kelime karakteri olmayan sınır kontrolü
		regex = "\\B%Ahmet%\\B";
		System.out.println("\nkelime karakteri olmayan sınır kontrolü: " + Pattern.matches(regex,"%Ahmet%"));
		System.out.println("kelime karakteri olmayan sınır kontrolü: " + Pattern.matches(regex,"%AHMET%"));
		System.out.println("kelime karakteri olmayan sınır kontrolü: " + Pattern.matches(regex+"*","ahmet"));
		
		
		
		
		
	}

}
