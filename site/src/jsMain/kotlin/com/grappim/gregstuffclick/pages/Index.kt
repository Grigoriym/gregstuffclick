package com.grappim.gregstuffclick.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
import components.layouts.PageLayout
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import widgets.TextLn

@Page
@Composable
fun HomePage() {
    PageLayout("Home") {
        Column(
            modifier = Modifier
                .padding(16.px)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextLn("Hello There, I am Grigoriy")
            TextLn("Android Software Engineer")
            TextLn("With Flutter and Golang experience")
            TextLn("Right now I live in Berlin, Germany")
            TextLn("I am from Kazakhstan, Taraz")

            Span {
                Text("This website is done with the help of ")
                Link("https://github.com/varabyte/kobweb", "Kobweb")
                Text(", which means it is written in Kotlin. This is the ")
                Link("https://github.com/Grigoriym/gregstuffclick", "Github repo")
                Text(" of this website")
            }
        }
    }
}
