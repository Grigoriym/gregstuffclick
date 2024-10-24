package com.grappim.gregstuffclick.pages

import androidx.compose.runtime.Composable
import components.layouts.PageLayout
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.px
import widgets.TextLn

@Page
@Composable
fun HomePage() {
    PageLayout("Main") {
        Column(
            modifier = Modifier
                .padding(16.px)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextLn("Hello There, I am")
            TextLn("Grigoriy")
            TextLn("Android Software Engineer")
            TextLn("With Flutter and Golang experience")
            TextLn("Right now I live in Berlin, Germany")
            TextLn("But I am from Kazakhstan, Taraz")
        }
    }
}
