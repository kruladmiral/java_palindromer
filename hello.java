import java.util.Scanner;


public class hello {
    public static void main(String[] args) {
        System.out.println("podaj hasełko");
		Scanner scanner = new  Scanner(System.in);
		String input = scanner.nextLine();
        printLenght(input);
        printIfPalindrom(input);
        System.out.println("odwrócona wersja twojego hasełka to: " + getReversed(input));
    }
    public static void printLenght(String x) {
		System.out.println("Długośc twojego hasełka to: " + x.length() );
	}

	private static String getReversed(String string ) {
		char[] reversed = new char[string.length()] ;
		for (int i = string.length()-1;i>=0;i--) {
			reversed[i]=string.charAt(string.length()-1-i);
			
		}
		String wynik = "";
		for (int i = 0; i <=reversed.length-1;i++) {
			wynik += reversed[i];
		}
		return wynik;
	}
	
	private static void printIfPalindrom(String x){
		if(checkIfPalondorne(x)) {
			System.out.println("Twoje hasełko jest palindromem!");
		} else System.out.println("Twoje hasełko to nie palindrom.");
	}
	
	private static boolean checkIfPalondorne(String string) {
		char[] d = toLowerCaseandRemoveSpaces(string).toCharArray();
		char[] dx = toLowerCaseandRemoveSpaces(getReversed(string)).toCharArray();
		for(int i = 0; i<d.length -1;i++ ) {
			
			if (d[i] !=dx[i]) {
				return false;
			}
		}
		return true;
		}
	
	
	//jak input jest zdaniem usuwa spacje i duze litery
	private static String removeSpacesFromString(String string) {
		char[]x = string.toCharArray();
		String result = "";
		
		for(int i = 0; i <=x.length-1; i++) {
			if(!Character.isWhitespace(x[i])) {
				result +=x[i];
			}
		}return result;
	}
	
	
	private static String toLowerCaseandRemoveSpaces(String string) {
		return removeSpacesFromString(string.toLowerCase());
	}
}


