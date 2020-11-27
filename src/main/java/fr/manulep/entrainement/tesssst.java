import java.util.*;


public static void main( String[] argv ) throws Exception {
       String  line;
       Scanner sc = new Scanner(System.in);
       while(sc.hasNextLine()) {
           line = sc.nextLine();
           /* Lisez les données et effectuez votre traitement */
           int len = line.length();
           int n=0;
           ArrayList<String> liste = new ArrayList<String>;
           char[] split = [len];
           
           for(int i=0; i<len; i++){
               split[i]= line.substring(i);
           }
           
           for(int j=len-5; i<len; i++){
               
                  Pattern p = Pattern.compile("[0-9]");
               Matcher m = p.matcher(new String(split[i]));
               boolean result = m.matches();
               
               if (result = true){
                   n++;
               }
               if (n=5){
                   liste.add(line);
               }
           }
       }
   System.out.println(n);
   System.out.println("Effectivement, les comptes ");
   for(int k=0; k<liste.length(); k++){
       System.out.print(liste);
   }
   System.out.println(" sont suspects, pas les autres.");
   }
