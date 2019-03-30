using System;
using System.Text;
using NUnit.Framework;
using ProblemSolutions.ArraysAndStrings;

namespace ProblemSolutions_Tests
{
    [TestFixture]
    public class TestsApproach001
    {
        #region PositiveTests

        [Test]
        public void IsUnique_UniqueStringProvided_ReturnTrue()
        {
            //Arrange
            var stringToTest = "asdfgHJKL";

            //Act
            var res = IsUnique.Solution001_JustASCII(stringToTest);

            //Assert
            Assert.IsTrue(res);
        }

        #endregion

        #region BoundaryTests

        [Test]
        public void IsUnique_BoundaryStringProvided_ReturnTrue()
        {
            //Arrange
            var stringToTest = ((char)IsUnique.GetFirstChar()).ToString()
                               +((char)IsUnique.GetLastChar()).ToString();

            //Act
            var res = IsUnique.Solution001_JustASCII(stringToTest);

            //Assert
            Assert.IsTrue(res);
        }

        [Test]
        public void IsUnique_BiggestPossibleString_ReturnTrue()
        {
            //Arrange
            var builder = new StringBuilder();
            for (int i = IsUnique.GetFirstChar() ; i <= IsUnique.GetLastChar(); i++)
            {
                builder.Append((char)i);
            }
            var stringToTest = builder.ToString();

            //Act
            var res = IsUnique.Solution001_JustASCII(stringToTest);

            //Assert
            Assert.IsTrue(res);
        }
        
        #endregion

        #region NegativeTests

        [Test]
        public void IsUnique_NonUniqueStringProvided_ReturnFalse()
        {
            //Arrange
            var stringToTest = "asdfgHJKLa";

            //Act
            var res = IsUnique.Solution001_JustASCII(stringToTest);

            //Assert
            Assert.IsFalse(res);
        }

        #endregion
    }
}