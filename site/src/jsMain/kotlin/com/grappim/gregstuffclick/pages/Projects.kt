package com.grappim.gregstuffclick.pages

import androidx.compose.runtime.Composable
import com.grappim.gregstuffclick.Routes
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import components.layouts.PageLayout
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@Page(routeOverride = Routes.Projects.path)
@Composable
fun ProjectsPage() {
    PageLayout("Projects") {
        Column(
            modifier = Modifier
        ) {
            H1 {
                Text("Projects")
            }

            ProjectItem()
        }
    }
}

@Composable
private fun ProjectItem() {
    Div(
        Modifier.fillMaxWidth()
            .padding(16.px)
            .border(2.px, LineStyle.Solid)
            .borderRadius(16.px)
            .toAttrs()
    ) {
        H2 {
            Text("HateItOrRateIt")
        }
        Link(
            "https://play.google.com/store/apps/details?id=com.grappim.hateitorrateit",
            variant = UncoloredLinkVariant
        ) {
            Image(src = "/google-badge.png", height = 80)
        }
    }
}