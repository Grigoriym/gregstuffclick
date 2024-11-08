package com.grappim.gregstuffclick.pages.resume

class ExperienceItemGenerator {

    private var _items: List<ExperienceItem> = listOf()

    fun generateExperienceItems(): List<ExperienceItem> {
        if (_items.isNotEmpty()) _items
        val result = mutableListOf<ExperienceItem>()

        result.add(getDeliveryHero())
        result.add(getRedlabDev())
        result.add(getHalykBank())
        result.add(getOneTechnologies())
        result.add(getAstanaPlat())

        _items = result
        return _items
    }

    private fun getDeliveryHero(): ExperienceItem =
        ExperienceItem(
            companyName = "Delivery Hero",
            positions = listOf(
                ExperiencePositionItem(
                    position = "Software Engineer II",
                    timeline = "Dec 2022 – Now",
                    points = listOf()
                )
            )
        )

    private fun getRedlabDev(): ExperienceItem =
        ExperienceItem(
            companyName = "redlab.dev",
            positions = listOf(
                ExperiencePositionItem(
                    position = "Android Software Engineer, PharmaHRM",
                    timeline = "Apr 2022 – Aug 2022",
                    points = listOf(
                        "Conducted Android developer interviews and onboarded 1 new hire for the client’s in-house team",
                        "Communicated with a cross-functional team of 15 people: mobile, devops, frontend and backend " +
                                "engineers, and a QA to demystify the work of the whole system",
                        "Upgraded the app to use multi-modular architecture which reduced the tight coupling of the code",
                        "Achieved 4% test coverage by refactoring features and covering code with unit tests"
                    )
                ),
                ExperiencePositionItem(
                    position = "Android Software Engineer, Stocktwits",
                    timeline = "Jan 2022 – Apr 2022",
                    points = listOf(
                        "Eliminated the problem of not saving the UI instance on configuration changes by saving " +
                                "data manually on configuration changes which led to the correct behavior of the app",
                        "Investigated and repaired out-of-memory exceptions and memory leaks because of incorrect " +
                                "usage of image loading library and legacy code which lowered the number of crashes by this problem by 90%"
                    )
                ),
            )
        )

    private fun getHalykBank(): ExperienceItem =
        ExperienceItem(
            companyName = "HalykBank",
            positions = listOf(
                ExperiencePositionItem(
                    position = "Android Developer, HalykTravel",
                    timeline = "Jun 2021 – Jan 2022",
                    points = listOf(
                        "Built and shipped new features: ticket refund, best prices calendar and file upload",
                        "Collaborated with backend engineers to develop REST API contracts for new features"
                    )
                ),
                ExperiencePositionItem(
                    position = "Android Developer, Kino.kz",
                    timeline = "Jun 2021 – Jan 2022",
                    points = listOf(
                        "Redesigned the architecture by introducing modularization, clean architecture, " +
                                "replacing live data from data and domain layers with flow and coroutines for easier testability and usability",
                        " Designed and invented a UI kit module to standardize the UI components while coordinating " +
                                "with the designer to introduce a Light theme which helped to decrease the number of repetitive widgets in the whole app",
                    )
                )
            )
        )

    private fun getOneTechnologies(): ExperienceItem =
        ExperienceItem(
            companyName = "ONE Technologies",
            positions = listOf(
                ExperiencePositionItem(
                    position = "Android Developer, ForteKassa",
                    timeline = "Apr 2019 – Jun 202",
                    points = listOf(
                        "Supervised and trained 2 interns, who were each awarded a job offer",
                        "Conducted android developer interviews and onboarded 2 new hires",
                        "Structured a new architecture by implementing clean architecture, MVVM architecture, coroutines, and enhanced Dagger2 settings to ease the app development",
                        "Improved app’s crash-free rate from 85% to 90% by removing legacy bugs",
                        "Reduced app’s size from 40Mb down to 20Mb by removing unnecessary dependencies and resources",
                        "Engineered the caching mechanism with the help of the WorkManager instead of an old one to unify and simplify the work with synchronization",
                    )
                ),
                ExperiencePositionItem(
                    position = "Android Developer, ForteFood",
                    timeline = "Sep 2020 – Jun 2021",
                    points = listOf(
                        "Released MVP in store using WebView",
                        "Laid out the Android app architecture and defined the tech stack: MVVM, Clean architecture, coroutines, Koin"
                    )
                ),
                ExperiencePositionItem(
                    position = "Android Developer, ForteTravel",
                    timeline = "Jan 2021 – Jun 2021",
                    points = listOf(
                        "Investigated and repaired the app’s removal from the play store because of missing permissions",
                    )
                ),
                ExperiencePositionItem(
                    position = "Android Developer, ForteKassa Boss",
                    timeline = "Apr 2019 – Jun 2021",
                    points = listOf(
                        "Analyzed and refined calculations by changing the double data types to bigdecimal",
                    )
                ),
            )
        )

    private fun getAstanaPlat(): ExperienceItem =
        ExperienceItem(
            companyName = "Astana-Plat",
            positions = listOf(
                ExperiencePositionItem(
                    position = "Android Developer",
                    timeline = "Nov 2018 – Apr 2019",
                    points = listOf(
                        "Worked with different small internal-company apps to elevate and improve the users experience",
                        "Developed an instrument to deobfuscate the crash reports to speed up the bug fixing process by up to 2x times",
                    )
                )
            )
        )
}
