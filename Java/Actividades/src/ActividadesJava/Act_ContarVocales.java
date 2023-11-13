package ActividadesJava;

public class Act_ContarVocales {
    public static void main(String[] args) {

        String frase = "Hola Mundo A";
        char[] array = frase.toCharArray();
        int vocales = 0;
        
        for(int i = 0; i < array.length; i++) {

            if (array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u') 
            {
                vocales++;
            }
            
        }
        System.out.println("Hay " +vocales+ " vocales");

    }
}