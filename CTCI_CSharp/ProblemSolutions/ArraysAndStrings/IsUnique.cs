using System;

namespace ProblemSolutions.ArraysAndStrings
{
    //Implement an algorithm to determine if a string has all unique characters.
    //what if you cannot use additional data structures

    //Q001 what does mean "cannot use ADDITIONAL data structures"? I'll assume means no language built in
    //like Array, List, the ones on Collections, etc
    public class IsUnique
    {
        //this is the version that assumes the printable chars that go from 20hex to 7Ehex as per
        //https://en.wikipedia.org/wiki/ASCII
        //as 7Eh - 20h = 54h = 94d
        public static bool Solution001_JustASCII(string stringToTest)
        {
            int[] allPossibleUniqueChars = new int[94];
            
            foreach (var individualChar in stringToTest.ToCharArray())
            {
                int position = (int) individualChar - 0x20;
                if (position >= allPossibleUniqueChars.Length)
                    throw new ArgumentException($"Non valid input {individualChar}, should be chars from 20h to 7Eh");

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