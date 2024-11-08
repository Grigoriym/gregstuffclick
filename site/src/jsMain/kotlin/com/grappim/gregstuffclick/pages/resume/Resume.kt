package com.grappim.gregstuffclick.pages.resume

import androidx.compose.runtime.Composable
import com.grappim.gregstuffclick.Routes
import com.grappim.gregstuffclick.di.DiContainer
import com.grappim.gregstuffclick.di.experienceItemGenerator
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import components.layouts.PageLayout
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*
import widgets.TextLn

@Page(routeOverride = Routes.Resume.path)
@Composable
fun ResumePage() {
    DiContainer.register(experienceItemGenerator, ExperienceItemGenerator())
    PageLayout("Resume") {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            H2 {
                TextLn("Grigoriy Mikhalchuk")
            }
            Text("Germany, Berlin | +49 1520 672 6697 | grigoriymikhalchuk@gmail.com")

            H2 {
                TextLn("Work Experience")
            }

            ExperienceContentItem(
                DiContainer.resolve<ExperienceItemGenerator>(experienceItemGenerator).generateExperienceItems()
            )
        }
    }
}

@Composable
private fun ColumnScope.ExperienceContentItem(items: List<ExperienceItem>) {
    items.forEach { item ->
        H2 {
            TextLn(item.companyName)
        }

        item.positions.forEach { position ->
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(leftRight = 32.px),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                H3 {
                    Text(position.position)
                }
                H3 {
                    Text(position.timeline)
                }
            }
            Ul {
                position.points.forEach { point ->
                    Li {
                        Text(point)
                    }
                }
            }
        }
    }
}
