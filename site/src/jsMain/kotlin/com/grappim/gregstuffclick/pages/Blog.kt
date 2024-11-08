package com.grappim.gregstuffclick.pages

import androidx.compose.runtime.Composable
import com.grappim.gregstuffclick.Routes
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.core.Page
import components.layouts.PageLayout
import org.jetbrains.compose.web.dom.H1
import widgets.TextLn

@Page(routeOverride = Routes.Blog.path)
@Composable
fun BlogPage() {
    PageLayout("Blog") {
        Column {
            H1 {
                TextLn("Blog")
            }
        }
    }
}
