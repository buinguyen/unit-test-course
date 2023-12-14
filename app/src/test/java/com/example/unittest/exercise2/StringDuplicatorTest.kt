package com.example.unittest.exercise2

import com.example.unittest.StringDuplicator
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StringDuplicatorTest {

    private lateinit var SUT: StringDuplicator

    @Before
    fun setup() {
        SUT = StringDuplicator()
    }

    @Test
    fun test_StringDuplicator_duplicate_inputEmptyString() {
        val input = ""
        val expected = ""
        val actual = SUT.duplicate(input)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test_StringDuplicator_duplicate_inputOneCharacter() {
        val input = "a"
        val expected = "aa"
        val actual = SUT.duplicate(input)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test_StringDuplicator_duplicate_inputMultipleCharacters() {
        val input = "Alan Bui"
        val expected = "Alan BuiAlan Bui"
        val actual = SUT.duplicate(input)
        Assert.assertEquals(expected, actual)
    }
}