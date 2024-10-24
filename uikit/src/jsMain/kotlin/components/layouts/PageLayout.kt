package components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import components.sections.Footer
import components.sections.NavHeader
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.padding
import kotlinx.browser.document
import org.jetbrains.compose.web.css.px

@Composable
fun PageLayout(title: String, content: @Composable () -> Unit) {
    LaunchedEffect(title) {
        document.title = title
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(16.px),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            NavHeader()
            Box(modifier = Modifier.fillMaxSize()) {
                content()
            }
            Footer()
        }
    }
}