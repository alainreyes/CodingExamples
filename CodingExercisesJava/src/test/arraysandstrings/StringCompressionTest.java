package test.arraysandstrings;

import org.junit.Assert;

import codesolutions.arraysandstrings.StringCompression;

class StringCompressionTest {

    @org.junit.jupiter.api.Test
    void solution000() {
        //arrange
        var compressor = new StringCompression();

        //act
        var res = compressor.solution000("aabcccccaaa");

        //assert
        Assert.assertTrue(res.equals("a2b1c5a3"));
    }
}