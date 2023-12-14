package com.example.unittest.exercise1

import com.example.unittest.PositiveNumberValidator
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PositiveNumberValidatorTest {

    private lateinit var SUT: PositiveNumberValidator

    @Before
    fun setup() {
        SUT = PositiveNumberValidator()
    }

    @Test
    fun test_PositiveNumberValidator_isPositive_negative_number() {
        val result = SUT.isPositive(-1)
        Assert.assertEquals(false, result)
    }

    @Test
    fun test_PositiveNumberValidator_isPositive_zero() {
        val result = SUT.isPositive(0)
        Assert.assertEquals(false, result)
    }

    @Test
    fun test_PositiveNumberValidator_isPositive_positive_number() {
        val result = SUT.isPositive(2)
        Assert.assertEquals(true, result)
    }
}