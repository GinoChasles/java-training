package fr.manulep.entrainement;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthSeparatorUI;





//import javax.swing.Spring;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		String message= "";
		if ((name != null) && (name != "")){
		message = "Hello " + name;
		return message;
		}
	
		else { 
		return "Hello World";
		}
	}
	

	public static String[] removeNullElements(String[] array) {
		//2
		String[] liste;
		 ArrayList<String> ex = new ArrayList<String>();
		for (String val : array){
			if (val != null){
				ex.add(val);
			}
		}
			liste = new String[ex.size()];
			
			ex.toArray(liste);
		
		return liste;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3
	
		int len = array.length;
		int liste2[] = new int[len + 1];
		liste2[0]= element;
		for(int i=0; i<len; i++){
			liste2[i+1]=array[i];
		}
		return liste2;
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		int len = array.length;
		int liste2[] = new int[len];
		int arrayEmpty[] = new int[0];

		if (len < 3){
			return arrayEmpty;
		}else if (len >= 3){
			liste2 = new int[len - 3];
			for(int i=0; i<liste2.length; i++){
				liste2[i]=array[i+3];
			}
		}

		return liste2;
	}
	
	public static String getFirstHalf(String word) {
		//5
		int len = word.length();
		int word2 = (len/2);
		if (word2 < 3){
			String word3 = word.substring(0, word2+1);
			return word3;
		} else {
		String word3 = word.substring(0, word2);
		
		return word3;
		}
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		//6
		ArrayList<String> liste2 = new ArrayList<String>();
		String[] array3;
		for(String val : array){
			if(val.startsWith("a")){
				liste2.add(val);
			}
		}
			array3= new String[liste2.size()];
			
			liste2.toArray(array3);

		
		return array3;
	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		
		ArrayList<String> startvowel = new ArrayList<String>();
		// for(String mot: array){
		// 	if (mot != null){
		// 		char firstletter = mot.charAt(0);
		// 		if(firstletter =='a' || firstletter =='e' || firstletter == 'i' || firstletter == 'o' || firstletter == 'u' || firstletter == 'y'){
		// 			startvowel.add(mot);
		// 		}
		// 	}
		// 	return startvowel.toArray(new String[0]);
		// }
		  String[] vowel = {"a", "e", "i", "o", "u", "y"};

		for (String y : array){
			if( y != null){
				for(String s: vowel){
					if(y.startsWith(s)){
						startvowel.add(y);
					}
				}
			}
		}
		return startvowel.toArray(new String[startvowel.size()]);

	
	}
	
	public static String[] reverseOrderInArray(String[]array) {
		//8
		List<String> array2 = Arrays.asList(array);
		Collections.reverse(array2);
		String[] array3 = array2.toArray(array);

		return array3;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9

		int array2[] = new int [array.length+1];  //faire la place pour l'élément
		int len = array.length/2;
	 for (int i=0; i<len; i++){  //première partie de l'array
		 array2[i] = array[i];
	 }
	 array2[len] = element;

	 for(int i=len+1; i<array2.length; i++){ //on part de la position une fois l'element inclus
		 array2[i]= array[i-1];
	 }

		return array2;
	}

	public static String shortestWord(String text) {
		//10
		
		String separe[] = text.split(" ", 0);
		String shortest = "";
		for(int i = 0; i < separe.length-1; i++){
			if (separe[i].length()<separe[i+1].length()){
			shortest = separe[i];
			};
		}
		return shortest;

		
	}

	public static String removeCapitals(String text) {
		//11

		String text2 = text;
		text2 = text2.replaceAll("[A-Z]", "");
		return text2;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		long number3 = number1 + number2;
		return number3;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		long number4 = number1 + number2 + number3;
		return number4;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		
		int somme=0;
		for(int i = 0; i < numbers.length; i++){
			somme = somme + numbers[i]; 
		}	
		 return somme;
	}

	public static float makeNegative(float number) {
		//15
		float numberNegative=0;
		if (number > 0){
			numberNegative= -number;
		}else numberNegative = number;
		return numberNegative;
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		boolean retour;
		Pattern patern = Pattern.compile("[#@%]");
		Matcher match = patern.matcher(string);
		retour = match.find();

		 return retour;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		//char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm'
		//, 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z' };

		// char firstletter = word.charAt(0);
		// String liste= "aeiouy";
		// if (firstletter
		//  return false;
		//String word2 = word.toLowerCase();
		// boolean retour=true;
		Character firstletter = word.charAt(0);
		String firststring = firstletter.toString();
		Pattern p = Pattern.compile("[^aeiouyAEIOUY]");
		Matcher m = p.matcher(firststring);
		boolean retour = m.matches();
		return retour;

	
	}

	public static String getDomainName(String email) {
		//18
		return email.replaceAll("(^.*@|.com$)", "");
		
	}

	public static int[] letterPosition(String name) {
		//19
		
		int len = name.length();
		int num =31;
		int retour[] = new int [len];
		for (int i = 0; i < len; i++){
			retour[i] = name.charAt(i) & num;
		}
		return retour;
	}

	public static boolean isPeer(int number) {
		//20
		int modulo = number%2;
		if(modulo == 0){
			return true;
		}else{
			return false;
		}
	}


}
