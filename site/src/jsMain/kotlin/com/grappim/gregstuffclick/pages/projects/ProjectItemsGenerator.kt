package com.grappim.gregstuffclick.pages.projects

class ProjectItemsGenerator {
    fun generateProjectItems(): List<ProjectItem> {
        val result = mutableListOf<ProjectItem>()

        result.add(getHior())
        result.add(getGregstuffclick())
        result.add(getAipal())
        result.add(getDocuVault())

        return result.toList()
    }

    private fun getHior(): ProjectItem =
        ProjectItem(
            name = "HateItOrRateIt",
            githubLink = "https://github.com/Grigoriym/HateItOrRateIt",
            description = "Application to track the products you like/dislike",
            googlePlayLink = "https://play.google.com/store/apps/details?id=com.grappim.hateitorrateit",
            fdroidLink = "https://f-droid.org/en/packages/com.grappim.hateitorrateit.fdroid/"
        )

    private fun getGregstuffclick(): ProjectItem =
        ProjectItem(
            name = "gregstuffclick",
            githubLink = "https://github.com/Grigoriym/gregstuffclick",
            description = "This website",
        )

    private fun getAipal(): ProjectItem =
        ProjectItem(
            name = "AiPal",
            githubLink = "https://github.com/Grigoriym/AiPal",
            description = "Your personal AI friend to learn a language",
        )

    private fun getDocuVault(): ProjectItem =
        ProjectItem(
            name = "DocuVault",
            githubLink = "https://github.com/Grigoriym/DocuVault",
            description = "App to store the documents ",
        )
}
