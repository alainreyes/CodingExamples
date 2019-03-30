package CrackingTheCodingInterview.ProblemSolutions.ArraysAndStrings;

public class CharCount
{
    private char compressionChar;
    private int compressionCount;

    public char getCompressionChar() {
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
        return (string)compressionChar+compressionCount.toString();
    }
}

//Implement a method to perform basic string compression using the counts of repeated characters.
//For example, the string aabcccccaaa would become a2b1c5a3.
//If the "Compressed" string would not become smaller than the original string, your method should return the original string.
//You can assume the string has only uppercase and lowercase letters (a-z)
public class StringCompression {

    public static string solution000(string stringToCompress)
    {

    }

}
