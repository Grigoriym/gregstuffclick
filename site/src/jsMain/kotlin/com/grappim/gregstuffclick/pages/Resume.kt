package com.grappim.gregstuffclick.pages

import androidx.compose.runtime.Composable
import components.layouts.PageLayout
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.core.Page
import com.grappim.gregstuffclick.Routes
import org.jetbrains.compose.web.dom.Text

@Page(routeOverride = Routes.Resume.path)
@Composable
fun ResumePage() {
    PageLayout("Resume") {
        Column {
            Text("Resume page")
        }
    }
}
