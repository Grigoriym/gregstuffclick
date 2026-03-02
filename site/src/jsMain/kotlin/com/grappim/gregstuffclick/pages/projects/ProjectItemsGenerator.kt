package com.grappim.gregstuffclick.pages.projects

import com.grappim.gregstuffclick.hiorLogoPath
import com.grappim.gregstuffclick.mukkLogoPath
import com.grappim.gregstuffclick.taigaMobileLogoPath

class ProjectItemsGenerator {
    fun generateProjectItems(): List<ProjectItem> = listOf(
        getHior(),
        getMukk(),
        getTaigaMobileNova()
    )

    private fun getHior(): ProjectItem =
        ProjectItem(
            name = "HateItOrRateIt",
            githubLink = "https://github.com/Grigoriym/HateItOrRateIt",
            description = "Track products you love and loathe. Because you forget which coffee brand made you happy.",
            logoPath = hiorLogoPath,
            googlePlayLink = "https://play.google.com/store/apps/details?id=com.grappim.hateitorrateit",
            fdroidLink = "https://f-droid.org/en/packages/com.grappim.hateitorrateit.fdroid/"
        )

    private fun getMukk(): ProjectItem =
        ProjectItem(
            name = "Mukk",
            githubLink = "https://github.com/Grigoriym/Mukk",
            description = "Desktop music player built with Kotlin Multiplatform. Clean UI, actual functionality.",
            logoPath = mukkLogoPath
        )

    private fun getTaigaMobileNova(): ProjectItem =
        ProjectItem(
            name = "TaigaMobileNova",
            githubLink = "https://github.com/Grigoriym/TaigaMobileNova",
            description = "Revived fork of the discontinued Taiga mobile client. Project management without the desktop.",
            logoPath = taigaMobileLogoPath,
            googlePlayLink = "https://play.google.com/store/apps/details?id=com.grappim.taigamobile"
        )
}
