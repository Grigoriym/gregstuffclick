package com.grappim.gregstuffclick

sealed class Routes {

    data object Home : Routes() {
        const val path: String = "/"
    }

    data object Resume : Routes() {
        const val path: String = "/resume"
    }

    data object AboutMe : Routes() {
        const val path: String = "/aboutme"
    }

    data object Projects : Routes() {
        const val path: String = "/projects"
    }

    data object Blog : Routes() {
        const val path: String = "/blog"
    }
}
