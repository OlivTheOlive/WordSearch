public class WordSearch {
    // private static final int GRID_SIZE = 10;

    private static final char[][] CHARS = {
        {'r','e','t','p','o','c','i','l','e','h'},	 
        {'t','f','s','r','r','c','y','d','x','n'},
        {'g','z','v','p','j','y','k','u','o','x'},
        {'i','c','c','w','l','l','f','r','y','p'},
        {'x','u','a','g','k','a','c','u','w','w'},
        {'m','p','t','h','o','l','m','j','r','l'},
        {'z','t','y','p','t','d','r','i','h','q'},
        {'w','e','k','a','n','s','r','e','n','w'},
        {'y','e','v','p','f','a','a','n','l','a'},
        {'k','b','k','q','c','s','f','f','f','b'}};

    public static void main(String[] args) {
        char [][] wordSearch = CHARS;

        String [] wordsToFind= {"animal", "car", "cat", "dog", "helicopter", "snake"};

        for (String word : wordsToFind) {
            for (int i = 0; i < wordSearch.length; i++) {
                for (int j = 0; j < wordSearch[i].length; j++) {
                    boolean wordFound = true;
                    for (int k = 0; k < word.length(); k++) {
                        int row = i, col= j, wordLength = k;
                        if (row + wordLength >= wordSearch.length || wordSearch[row + wordLength][col] != word.charAt(wordLength)) {
                            // Check down
                            wordFound = false;
                            break;
                        }
                        if (col + wordLength >= wordSearch.length || wordSearch[row][col+wordLength] != word.charAt(wordLength)) {
                            // Check right
                            wordFound = false;
                            break;
                        }
                        if (row + wordLength >= wordSearch.length || wordSearch[row + wordLength][col+wordLength] != word.charAt(wordLength)) {
                            // Check down right
                            wordFound = false;
                            break;
                        }
                        if (row + wordLength >= wordSearch.length || wordSearch[row - wordLength][col+wordLength] != word.charAt(wordLength)) {
                            // Check up right
                            wordFound = false;
                            break;
                        }
                        

                        
                    }
                }
            }
        }
    }
}