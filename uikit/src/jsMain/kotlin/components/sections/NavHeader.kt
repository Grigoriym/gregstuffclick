package components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.grappim.gregstuffclick.Routes
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderBottom
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaHouse
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.border
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text
import widgets.IconButton

val NavHeaderStyle = CssStyle.base {
    Modifier.fillMaxWidth()
        .padding(left = 1.cssRem, right = 1.cssRem, top = 1.cssRem, bottom = 1.cssRem)
        .borderBottom(width = 1.px, style = LineStyle.Solid, color = colorMode.toPalette().border)
}

@Composable
fun NavHeader(modifier: Modifier = Modifier) {
    val ctx = rememberPageContext()
    Box(
        modifier = modifier.then(NavHeaderStyle.toModifier())
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.px)
        ) {
            Button(onClick = {
                ctx.router.navigateTo(Routes.Home.path)
            }, content = {
                FaHouse()
            })
            Button(onClick = {
                ctx.router.navigateTo(Routes.Resume.path)
            }, content = {
                Text("Resume")
            })
            Button(onClick = {
                ctx.router.navigateTo(Routes.Projects.path)
            }, content = {
                Text("Projects")
            })

            Spacer()

            ColorModeButton()
        }
    }
}

@Composable
private fun ColorModeButton(modifier: Modifier = Modifier) {
    var colorMode by ColorMode.currentState
    IconButton(
        modifier = modifier,
        onClick = {
            colorMode = colorMode.opposite
        }
    ) {
        when (colorMode) {
            ColorMode.DARK -> FaSun()
            ColorMode.LIGHT -> FaMoon()
        }
    }
}