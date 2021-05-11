package com.example.dummymovieapp.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.dummymovieapp.R
import com.example.dummymovieapp.ui.home.MainActivity
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class SplashScreenActivityTest{
    @get:Rule
    var activityRule = ActivityScenarioRule(SplashScreenActivity::class.java)

    @Test
    fun loadSplash(){
        onView(ViewMatchers.withId(R.id.imageView)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}