package com.grappim.gregstuffclick.pages.projects

data class ProjectItem(
    val name: String,
    val githubLink: String,
    val description: String,
    val googlePlayLink: String? = null
)

