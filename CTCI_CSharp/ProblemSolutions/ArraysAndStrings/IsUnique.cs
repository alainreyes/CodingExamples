using System;

namespace ProblemSolutions.ArraysAndStrings
{
    //Implement an algorithm to determine if a string has all unique characters.
    //what if you cannot use additional data structures

    //Q001 what does mean "cannot use ADDITIONAL data structures"? I'll assume means no language built in
    //like Array, List, the ones on Collections, etc
    public class IsUnique
    {

        public static int GetFirstChar()
        {
            return 0x20;
        }

        public static int GetLastChar()
        {
            return 0x7E;
        }
        
        
        public static int CharDictionarySize()
        {
            return GetLastChar() - GetFirstChar()+1;
        }
        
        //this is the version that assumes the printable chars that go from 20hex to 7Ehex as per
        //https://en.wikipedia.org/wiki/ASCII
        public static bool Solution001_JustASCII(string stringToTest)
        {
            int[] allPossibleUniqueChars = new int[CharDictionarySize()];
            
            foreach (var individualChar in stringToTest.ToCharArray())
            {
                int position = (int) individualChar - GetFirstChar();
                if (position >= allPossibleUniqueChars.Length)
                    throw new ArgumentException($"Non valid input {individualChar}, should be chars from {(char)GetFirstChar()} to {(char)GetLastChar()}");

                if (allPossibleUniqueChars[position] == 0)
                {
                    allPossibleUniqueChars[position]++;
                }
                else
                {
                    return false;
                }
            }

            return true;
        }
    }
}