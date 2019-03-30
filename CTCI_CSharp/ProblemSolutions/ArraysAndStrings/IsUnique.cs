using System;
using System.Reflection.Emit;

namespace ProblemSolutions.ArraysAndStrings
{
    //Implement an algorithm to determine if a string has all unique characters.
    //what if you cannot use additional data structures

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
        public static bool Solution000_JustASCII(string stringToTest)
        {
            if (stringToTest.Length > CharDictionarySize())
            {
                return false;
            }
            
            var allPossibleUniqueChars = new int[CharDictionarySize()];
            
            foreach (var individualChar in stringToTest.ToCharArray())
            {
                var position = (int) individualChar - GetFirstChar();
                if (position >= allPossibleUniqueChars.Length)
                {
                    throw new ArgumentException(
                        $"Non valid input {individualChar}, should be chars from {(char) GetFirstChar()} to {(char) GetLastChar()}");
                }

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
        
        //this is the version that do the job without using any extra data structure
        //it also works without the restriction the other one has on the dictionary of values but it's more
        //cpu costly while being O(0) space costly.
        public static bool Solution001_JustASCII(string stringToTest)
        {
            for (var i = 0; i < stringToTest.Length - 1; i++)
            {
                var charToTest = stringToTest.ToCharArray()[i];
                for (var j = i+1; j < stringToTest.Length; j++)
                {
                    var charToCompare = stringToTest.ToCharArray()[j];
                    if (charToTest == charToCompare)
                    {
                        return false;
                    }
                } 
            }
            return true;
        }        
    }
}