import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExample {

	public static void main(String[] args) {
//		Bir string değerinin içinde arama yapmamızı sağlar.
//		^ işareti satırın başlangıcını temsil ediyor. Yani şapka işareti koyulduğunda bu satır örneğin esmanur ile başlıyor  mu? Bazen dışında anlamında da kullanabiliyoruz.
//		a-z a ve z arasındaki harfler
//		0 - 9 arasındaki rakamları içeriyor mu?
//		- _ içeriyor mu?
//		3-12 karakter uzunluğında mı? yani en az 3 en fazla 12 karakter uzunluğunda olması lazım.
//		$ satırın sonu demek.
//		[abc] a ya da b ya da c harfleri
//		[^abc] a ya da b ya da c harfleri dışında bir harf mi?
//		[a-zA-Z] a-z ya da A-Z harfleri arasında 
//		[a-e[p-t]] a-e ya da p-t arasında
//		[a-f&&[^bc]] a harfi ya da d-z arasında
//		[a-z &&[^c-g]] c-g dışındaki harfler
//		find() ve matches() metotları bulmamızı sağlıyor.
		Pattern pattern;
		Matcher matcher;
		
		String aranacakKelime= "Esmanur";
		String metin = "Esmanur Karataş";
		pattern = Pattern.compile(aranacakKelime, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(metin);
		
		if(matcher.find()) {
			System.out.println(aranacakKelime + " - " + metin + " -metinin içerisinde bulundu! ");
		}else {
			System.out.println(aranacakKelime + " - " + " - metninin içerisinde bulunamadı!");
		}
		System.out.println(Pattern.matches(aranacakKelime, metin));
		System.out.println(Pattern.matches(metin, metin));

		String ifade = "kedi|kopek|maymun|inek";
		String regex = "\\|"; //| özel karakteri normal karaktere çevirmek için \\ kullandık.
		
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(ifade);
		
		if(matcher.find()) {
			String[] kelimeler = ifade.split(regex);
			for(String kelime : kelimeler) {
				System.out.print(kelime + "\t");
			}
		}else {
			System.out.println(aranacakKelime + "Karakter olmadığından kelimeler ayrılamadı!");
		}
		
//		. karakteri - herhangi bir harf
		
		pattern = Pattern.compile(".al..");
		matcher = pattern.matcher("Kalem");
		
		System.out.println("\n\n5 harfli kalem kelimesinde 2. harf a ve 3.harf l mi? " + matcher.find());
		
		ifade = "b";
	    regex = "[abc]" ;
	    pattern = Pattern.compile(regex);
	    matcher = pattern.matcher(ifade);
	    System.out.println("\nabc Harflerinden Biri mi? " + matcher.matches() + " Evet: " + ifade);
	    
		ifade = "d";
	    matcher = pattern.matcher(ifade);
	    System.out.println("\nabc Harflerinden Biri mi? " + matcher.matches() + " " + ifade);
	    
		ifade = "j";
	    regex = "[^abc]" ;
	    pattern = Pattern.compile(regex);
	    matcher = pattern.matcher(ifade);
	    System.out.println("\nabc Harfleri Dışında Bir Harf mi? " + matcher.matches() + " " + ifade);
	    
	    ifade = "c";
	    matcher = pattern.matcher(ifade);
	    System.out.println("\nabc Harfleri Dışında Bir Harf mi? " + matcher.find() + " " + ifade);
	    
	    regex = "[a-zA-Z]";
	    ifade = "e";
	    pattern = Pattern.compile(regex);
	    matcher = pattern.matcher(ifade);
	    System.out.println("\nBüyük ya da küçük bir harf mi? " + matcher.matches() + " " + ifade);
	    
	    ifade = "1";
	    matcher = pattern.matcher(ifade);
	    System.out.println("\nBüyük ya da küçük bir harf mi? " + matcher.matches() + " " + ifade);
	    
	    regex= "[a-z&&[f-k]]";
	    ifade = "t";
	    pattern = Pattern.compile(regex);
	    matcher = pattern.matcher(ifade);
	    System.out.println("\na-z arasında ve k-y arası dışında bir harf mı? " + matcher.find() + " " + ifade);
	    
	    ifade = "A";
	    matcher = pattern.matcher(ifade);
	    System.out.println("\na-e arasında ya da k-y arasında mı? " + matcher.find() + " "  + ifade);
	    
	    regex= "[a-e[k-y]]";
	    ifade = "v";
	    pattern = Pattern.compile(regex);
	    matcher = pattern.matcher(ifade);
	    System.out.println("\na-e arasında ya da k-y arasında mı? " + " " + ifade);
	    
	    ifade = "A";
	    matcher = pattern.matcher(ifade);
	    System.out.println("\na-e arasında ya da k-y arasında mı? " + " " + ifade);
	    
	    System.out.println("\na-e arasında ya da k-y arasında mı? " + Pattern.matches(regex, ifade) + " " + ifade);
	    
	    regex= "[abc]?";
	    System.out.println("\n[abc]? a ya da b ya da c harflerinden bir var ya da hiç yok mu? " + Pattern.matches(regex, ifade) + " " + ifade);
	    System.out.println("[abc]? a ya da b ya da c harflerinden bir var ya da hiç yok mu? " + Pattern.matches(regex, "b") + " " + "b");
	    System.out.println("[abc]? a ya da b ya da c harflerinden bir var ya da hiç yok mu? " + Pattern.matches(regex, " "));
	
	    regex= "[abc]+";
	    System.out.println("\n[abc]? a ya da b ya da c harfleri bir var ya da birden fazla var mı? " + Pattern.matches(regex, ifade) + " " + ifade);
	    System.out.println("[abc]? a ya da b ya da c harflerinden bir ya da birden fazla var mı? " + Pattern.matches(regex, "b") + " " + "b");
	    System.out.println("[abc]? a ya da b ya da c harflerinden bir ya da birden fazla var mı? " + Pattern.matches(regex, "aa"));
	
	
	}

}
