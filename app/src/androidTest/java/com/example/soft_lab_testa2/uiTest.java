package com.example.soft_lab_testa2;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class uiTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testShapeInsert(){
        // Type "Circle" into ShapeEditText
        Espresso.onView(ViewMatchers.withId(R.id.vehicleEdtText))
                .perform(ViewActions.typeText("Circle"));

        // Type "Red" into ColorEditText
        Espresso.onView(ViewMatchers.withId(R.id.ColorEditText))
                .perform(ViewActions.typeText("Red"));

        // Click the button
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        // Check if the ShapeTextView displays the correct text
        Espresso.onView(ViewMatchers.withId(R.id.ShapeTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The shape is Circle\nArea is 78.54\nPerimeter is 31.42\n")));

        // Check if the ColorTextView displays the correct text
        Espresso.onView(ViewMatchers.withId(R.id.ColorTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText("The color is Red\n")));
    }
}
