package com.grappim.gregstuffclick.pages.resume

data class ExperienceItem(
    val companyName: String,
    val positions: List<ExperiencePositionItem>
)

data class ExperiencePositionItem(
    val position: String,
    val timeline: String,
    val points: List<String>
)
