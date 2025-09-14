package com.grappim.gregstuffclick.pages.projects

import androidx.compose.runtime.Composable
import com.grappim.gregstuffclick.Routes
import com.grappim.gregstuffclick.di.DiContainer
import com.grappim.gregstuffclick.di.projectItemsGenerator
import com.grappim.gregstuffclick.fdroidBadgeImagePath
import com.grappim.gregstuffclick.googleBadgeImagePath
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import components.layouts.PageLayout
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*
import widgets.CiceroCard
import widgets.CiceroSpacer

@Page(routeOverride = Routes.Projects.path)
@Composable
fun ProjectsPage() {
    DiContainer.register(projectItemsGenerator, ProjectItemsGenerator())
    PageLayout("Projects") {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            H1 {
                Text("Projects")
            }

            ProjectItems(DiContainer.resolve<ProjectItemsGenerator>(projectItemsGenerator).generateProjectItems())
        }
    }
}

@Composable
private fun ColumnScope.ProjectItems(items: List<ProjectItem>) {
    items.forEach { projectItem ->
        CiceroCard(
            modifier = Modifier
                .padding(16.px),
            borderRadius = 16.px,
            borderWidth = 2.px
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    H2 {
                        Text(projectItem.name)
                    }
                    CiceroSpacer(width = 16.px)
                    Link(
                        projectItem.githubLink,
                        variant = UncoloredLinkVariant
                    ) {
                        FaGithub(size = IconSize.XXL)
                    }
                }

                Text(projectItem.description)

                if (!projectItem.googlePlayLink.isNullOrEmpty()) {
                    Link(
                        projectItem.googlePlayLink,
                        variant = UncoloredLinkVariant
                    ) {
                        Image(src = googleBadgeImagePath, height = 80)
                    }
                }

                if (!projectItem.fdroidLink.isNullOrEmpty()) {
                    Link(
                        projectItem.fdroidLink,
                        variant = UncoloredLinkVariant
                    ) {
                        Image(src = fdroidBadgeImagePath, height = 80)
                    }
                }
            }
        }
        CiceroSpacer(height = 16.px)
    }
}