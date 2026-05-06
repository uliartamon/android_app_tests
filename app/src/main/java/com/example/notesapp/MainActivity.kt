package com.example.notesapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val prefs = getSharedPreferences("notes", MODE_PRIVATE)

        val addButton = findViewById<Button>(R.id.addNoteButton)
        val deleteButton = findViewById<Button>(R.id.deleteNoteButton)
        val titleInput = findViewById<EditText>(R.id.titleEditText)
        val bodyInput = findViewById<EditText>(R.id.bodyEditText)
        val notesText = findViewById<TextView>(R.id.notesTextView)

        notesText.text = prefs.getString("saved_note", "Пока заметок нет")

        addButton.setOnClickListener {
            val title = titleInput.text.toString()
            val body = bodyInput.text.toString()

            val note = "$title\n$body"

            notesText.text = note

            prefs.edit()
                .putString("saved_note", note)
                .apply()
        }

        deleteButton.setOnClickListener {
            prefs.edit()
                .remove("saved_note")
                .apply()

            notesText.text = "Пока заметок нет"
        }
    }
}