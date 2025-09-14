package com.grappim.gregstuffclick.pages.resume

import androidx.compose.runtime.Composable
import com.grappim.gregstuffclick.Routes
import com.grappim.gregstuffclick.di.DiContainer
import com.grappim.gregstuffclick.di.experienceItemGenerator
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import components.layouts.PageLayout
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*
import widgets.TextLn

@Page(routeOverride = Routes.Resume.path)
@Composable
fun ResumePage() {
    DiContainer.register(experienceItemGenerator, ExperienceItemGenerator())
    PageLayout("Resume") {
        Column(
            modifier = Modifier.fillMaxWidth()
                .margin(top = 24.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                H1(
                    attrs = Modifier.margin(bottom = 8.px).toAttrs()
                ) {
                    TextLn("Grigoriy Mikhalchuk")
                }
                P(
                    attrs = Modifier.fontSize(16.px).color(Colors.Gray).toAttrs()
                ) {
                    Text("Software Engineer | Germany, Berlin")
                }
                P(
                    attrs = Modifier.fontSize(14.px).color(Colors.Gray).toAttrs()
                ) {
                    Text("grigoriymikhalchuk@gmail.com")
                }
            }
            H2(
                attrs = Modifier.margin(bottom = 16.px).toAttrs()
            ) {
                TextLn("Work Experience")
            }

            ExperienceContentItem(
                DiContainer.resolve<ExperienceItemGenerator>(experienceItemGenerator).generateExperienceItems()
            )
        }
    }
}

@Composable
private fun ExperienceContentItem(items: List<ExperienceItem>) {
    Column(
        modifier = Modifier.fillMaxWidth().maxWidth(800.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items.forEachIndexed { index, item ->
            Column(
                modifier = Modifier.fillMaxWidth().padding(leftRight = 16.px)
                    .margin(bottom = if (index < items.size - 1) 40.px else 0.px)
            ) {
                H2(
                    attrs = Modifier.margin(bottom = 8.px).fontSize(24.px)
                        .borderBottom(1.px, LineStyle.Solid, Colors.LightGray)
                        .padding(bottom = 8.px).toAttrs()
                ) {
                    TextLn(item.companyName)
                }

                item.positions.forEach { position ->
                    Column(
                        modifier = Modifier.fillMaxWidth().margin(bottom = 16.px).padding(top = 8.px)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().margin(bottom = 8.px),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            H3(
                                attrs = Modifier.fontSize(18.px).fontWeight(600).toAttrs()
                            ) {
                                Text(position.position)
                            }
                            P(
                                attrs = Modifier.fontSize(16.px).color(Colors.Gray).fontWeight(500).toAttrs()
                            ) {
                                Text(position.timeline)
                            }
                        }

                        if (position.points.isNotEmpty()) {
                            Ul(
                                attrs = Modifier.margin(left = 16.px).toAttrs()
                            ) {
                                position.points.forEach { point ->
                                    Li(
                                        attrs = Modifier.margin(bottom = 6.px).toAttrs()
                                    ) {
                                        P(
                                            attrs = Modifier.fontSize(16.px).lineHeight(1.4).toAttrs()
                                        ) {
                                            Text(point)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
