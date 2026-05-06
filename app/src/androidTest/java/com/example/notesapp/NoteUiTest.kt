package com.example.notesapp

import android.widget.Button
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NoteUiTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun saveNote_displaysNoteOnScreen() {
        onView(withId(R.id.titleEditText))
            .perform(replaceText("buy"))

        onView(withId(R.id.bodyEditText))
            .perform(replaceText("coffee"))

        activityRule.scenario.onActivity { activity ->
            activity.findViewById<Button>(R.id.addNoteButton).performClick()
        }

        onView(withId(R.id.notesTextView))
            .check(matches(withText("buy\ncoffee")))
    }

    @Test
    fun deleteNote_removesNoteFromScreen() {
        onView(withId(R.id.titleEditText))
            .perform(replaceText("run"))

        onView(withId(R.id.bodyEditText))
            .perform(replaceText("2 km"))

        activityRule.scenario.onActivity { activity ->
            activity.findViewById<Button>(R.id.addNoteButton).performClick()
            activity.findViewById<Button>(R.id.deleteNoteButton).performClick()
        }

        onView(withId(R.id.notesTextView))
            .check(matches(withText("Пока заметок нет")))
    }
}