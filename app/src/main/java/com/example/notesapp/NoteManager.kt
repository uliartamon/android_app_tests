package com.example.notesapp

class NoteManager {

    fun createNote(title: String, body: String): String {
        return "$title\n$body"
    }

    fun editNote(title: String, body: String): String {
        return "$title\n$body"
    }

    fun deleteNote(): String {
        return "Пока заметок нет"
    }

    fun isNoteValid(title: String, body: String): Boolean {
        return title.isNotBlank() && body.isNotBlank()
    }
}