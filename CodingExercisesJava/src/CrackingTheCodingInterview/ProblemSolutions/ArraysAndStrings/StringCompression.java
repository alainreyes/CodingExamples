package CrackingTheCodingInterview.ProblemSolutions.ArraysAndStrings;

class CharCount
{
    private int compressionChar;
    private int compressionCount;

    public CharCount() {
        compressionCount = 0;
        compressionChar = Integer.MIN_VALUE;
    }

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
                +Integer.toString(compressionCount);
    }
}

//Implement a method to perform basic string compression using the counts of repeated characters.
//For example, the string aabcccccaaa would become a2b1c5a3.
//If the "Compressed" string would not become smaller than the original string, your method should return the original string.
//You can assume the string has only uppercase and lowercase letters (a-z)
public class StringCompression {

    public static String solution000(String stringToCompress)
    {
        var stringToCompressLenght = stringToCompress.length();

        var compressionArray = new CharCount[stringToCompressLenght];
        var compressionArrayIndex = 0;
        var charArrayToCompress = stringToCompress.toCharArray();

        for (var i=0; i<stringToCompressLenght;i++)
        {
            var charToCompress = charArrayToCompress[i];
            var compressionItem = compressionArray[compressionArrayIndex];
            if (compressionItem.getCompressionCount()==0
            && compressionItem.getCompressionChar() == Integer.MIN_VALUE)
            {
                    compressionItem.setCompressionChar(charToCompress);
            }

            //actual compression logic
            if (compressionItem.getCompressionChar() == charToCompress)
            {
                compressionItem.setCompressionCount(compressionItem.getCompressionCount()+1);
            }
            else
            {
            }

        }
    }


    //analyze solution 001 without extra data structures, I just need a char and count holder

}
