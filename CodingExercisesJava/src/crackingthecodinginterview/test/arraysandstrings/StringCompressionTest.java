package crackingthecodinginterview.test.arraysandstrings;

import crackingthecodinginterview.codesolutions.arraysandstrings.StringCompression;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class StringCompressionTest {

    @Test
    void solution000_exampleProvidedString_returnCompressedResult() {
        //arrange
        var compressor = new StringCompression();

        //act
        var res = compressor.solution000("aabcccccaaa");

        //assert
        Assert.assertEquals("a2b1c5a3", res);
    }

    @Test
    void solution000_allUniqueCharacters_returnOriginalString() {
        //arrange
        var compressor = new StringCompression();

        //act
        var res = compressor.solution000("abcdefghijkl");

        //assert
        Assert.assertEquals("abcdefghijkl", res);
    }

}