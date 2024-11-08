package widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.CSSLengthValue
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun CiceroSpacer(
    width: CSSLengthValue = 0.px,
    height: CSSLengthValue = 0.px,
) {
    Div(
        Modifier
            .width(width)
            .height(height).toAttrs()
    )
}
