package lab8.dictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //service.findWord(word)
        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
        Scanner scanner = new Scanner(System.in);
        while( true ) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if( word.equalsIgnoreCase( "end")){
                break;
            }
            System.out.println(" Find(" + word + "): " + service.findWord(word));
        }

        // service.findWordsFile("text_to_find.txt")
        DictionaryService service2 = new DictionaryService(DictionaryType.ARRAY_LIST);
        System.out.println("Unknown words from a file: ");
        System.out.println( service.findWordsFile( "text_to_find.txt"));


    }
    }

