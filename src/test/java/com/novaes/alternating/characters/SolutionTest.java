/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.alternating.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author kbos
 */
public class SolutionTest {

    @Test
    public void test1() {
        Assert.assertSame(Solution.alternatingCharacters("AAAA"), 3);
        Assert.assertSame(Solution.alternatingCharacters("BBBBB"), 4);
        Assert.assertSame(Solution.alternatingCharacters("ABABABAB"), 0);
        Assert.assertSame(Solution.alternatingCharacters("BABABA"), 0);
        Assert.assertSame(Solution.alternatingCharacters("AAABBB"), 4);
    }

}
