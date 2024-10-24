package widgets

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Text

@Composable
fun TextLn(value: String) {
    Text(value)
    Br()
}
