package com.example.notesapp

import org.junit.Assert.*
import org.junit.Test

class NoteManagerTest {

    private val noteManager = NoteManager()

    @Test
    fun createNote_returnsTitleAndBody() {
        val result = noteManager.createNote("buy", "coffee")

        assertEquals("buy\ncoffee", result)
    }

    @Test
    fun editNote_returnsUpdatedTitleAndBody() {
        val result = noteManager.editNote("run", "2 km")

        assertEquals("run\n2 km", result)
    }

    @Test
    fun deleteNote_returnsEmptyMessage() {
        val result = noteManager.deleteNote()

        assertEquals("Пока заметок нет", result)
    }

    @Test
    fun isNoteValid_returnsTrueForFilledNote() {
        val result = noteManager.isNoteValid("title", "text")

        assertTrue(result)
    }

    @Test
    fun isNoteValid_returnsFalseForEmptyTitle() {
        val result = noteManager.isNoteValid("", "text")

        assertFalse(result)
    }
}