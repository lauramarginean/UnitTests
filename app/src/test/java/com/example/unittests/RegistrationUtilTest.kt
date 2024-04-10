package com.example.unittests

import org.junit.Test
import org.junit.Assert.*

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun `correct username return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Philipp",
            "123",
            "123"
        )
        assertTrue(result)
    }

    @Test
    fun `username already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Andrei",
            "123",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun `incorrect confirm password  return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Philipp",
            "123",
            "abc"
        )
        assertFalse(result)
    }

    @Test
    fun `less than 2 digits pass  return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Philipp",
            "1abcd",
            "1abcd"
        )
        assertFalse(result)
    }

}
