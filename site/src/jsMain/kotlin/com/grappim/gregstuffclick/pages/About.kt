package com.grappim.gregstuffclick.pages

import androidx.compose.runtime.Composable
import com.grappim.gregstuffclick.Routes
import components.layouts.PageLayout
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text

@Page(routeOverride = Routes.AboutMe.path)
@Composable
fun AboutPage() {
    PageLayout("About me") {
        Text("About page")
    }
}