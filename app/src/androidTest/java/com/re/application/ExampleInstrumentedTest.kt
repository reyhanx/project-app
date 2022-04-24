package com.re.application

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule()
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun click_cardKotlin() {
        onView(withId(R.id.title))
            .check(matches(withText("Kotlin")))
        onView(withId(R.id.cardID)).perform(click())
    }

    @Test
    fun click_cardAndroid() {
        onView(withId(R.id.title2))
            .check(matches(withText("Android Dasar")))
        onView(withId(R.id.cardID2)).perform(click())
    }
}