package Java_Programms;
// hello java how are you
// you are how java hello

public class Example2 {
	static String[] convertCharArray(String str) {
       
        int wordCount = 1; 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println(wordCount);

        
        String[] wordsArray = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                String word = str.substring(startIndex, i);
                if (!word.isEmpty()) {
                    wordsArray[wordIndex++] = word;
                }
                startIndex = i + 1;
            }
        }

        return wordsArray;
    }

    public static void main(String[] args) {
        String string = "hello java how are you";
        String[] wordsArray = convertCharArray(string);

//        for (String word : wordsArray) {
//            System.out.print(word + " ");
//        }
        for(int i=wordsArray.length-1;i>=0;i--) {
        	System.out.print(wordsArray[i]+" ");
        }
    }
}