package codesolutions.arraysandstrings;

class CharCount {
    private int compressionChar = 0;
    private int compressionCount = Integer.MIN_VALUE;

    public int getCompressionChar() {
        return compressionChar;
    }

    public void setCompressionChar(char compressionChar) {
        this.compressionChar = compressionChar;
    }

    public int getCompressionCount() {
        return compressionCount;
    }

    public void setCompressionCount(int compressionCount) {
        this.compressionCount = compressionCount;
    }

    @Override
    public String toString() {
        return Character.toString(compressionChar)
                + Integer.toString(compressionCount);
    }
}

//Implement a method to perform basic string compression using the counts of repeated characters.
//For example, the string aabcccccaaa would become a2b1c5a3.
//If the "Compressed" string would not become smaller than the original string, your method should return the original string.
//You can assume the string has only uppercase and lowercase letters (a-z)
public class StringCompression {

    public static String solution000(String stringToCompress) {
        var stringToCompressLenght = stringToCompress.length();

        var compressionArray = new CharCount[stringToCompressLenght];
        for (var i=0;i<stringToCompressLenght;i++)
        {
            compressionArray[i] = new CharCount();
        }

        var compressionArrayIndex = 0;
        var charArrayToCompress = stringToCompress.toCharArray();

        for (var i = 0; i < stringToCompressLenght; i++) {
            var charToCompress = charArrayToCompress[i];
            var compressionItem = compressionArray[compressionArrayIndex];
            if (compressionItem.getCompressionCount() == Integer.MIN_VALUE
                    && compressionItem.getCompressionChar() == 0) {
                compressionItem.setCompressionChar(charToCompress);
                compressionItem.setCompressionCount(0);
            }

            //actual compression logic
            if (compressionItem.getCompressionChar() == charToCompress) {
                compressionItem.setCompressionCount(compressionItem.getCompressionCount() + 1);
            } else {
                compressionArrayIndex++;
                compressionItem = compressionArray[compressionArrayIndex];
                compressionItem.setCompressionChar(charToCompress);
                compressionItem.setCompressionCount(1);
            }
        }

        var dictionaryResult = new StringBuilder();
        for (var compressionItem:compressionArray
             ) {
            if (compressionItem.getCompressionCount()>0)
            {
                dictionaryResult.append(compressionItem.toString());
            }
        }

        var compressedResult = dictionaryResult.toString();
        if (compressedResult.length()<=stringToCompressLenght)
        {
            return compressedResult;
        }

        return stringToCompress;
    }


    //analyze solution 001 without extra data structures, I just need a char and count holder

}
