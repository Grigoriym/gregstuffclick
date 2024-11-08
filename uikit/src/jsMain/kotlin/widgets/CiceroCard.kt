package widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.CSSLengthValue
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
fun CiceroCard(
    modifier: Modifier,
    borderRadius: CSSLengthValue = 16.px,
    borderWidth: CSSLengthValue = 2.px,
    content: ContentBuilder<HTMLDivElement>
) {
    Div(
        modifier.border(borderWidth, LineStyle.Solid)
            .borderRadius(borderRadius)
            .toAttrs()
    ) {
        content()
    }
}
