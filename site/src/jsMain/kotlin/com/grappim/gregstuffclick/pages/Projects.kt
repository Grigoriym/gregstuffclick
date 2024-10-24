package com.grappim.gregstuffclick.pages

import androidx.compose.runtime.Composable
import com.grappim.gregstuffclick.Routes
import com.varabyte.kobweb.core.Page
import components.layouts.PageLayout
import org.jetbrains.compose.web.dom.Text

@Page(routeOverride = Routes.Projects.path)
@Composable
fun ProjectsPage() {
    PageLayout("Projects") {
        Text("Projects page")
    }
}