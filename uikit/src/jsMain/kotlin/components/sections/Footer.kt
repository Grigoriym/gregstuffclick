package components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UncoloredLinkVariant
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun Footer(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.px,
            Alignment.CenterVertically
        )
    ) {

        Row (
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(
                16.px,
                Alignment.CenterHorizontally
            )
        ) {
            FooterLink("https://github.com/Grigoriym") {
                FaGithub(
                    size = IconSize.XXL
                )
            }
            FooterLink("https://www.linkedin.com/in/grigoriy-mikhalchuk-v/") {
                FaLinkedin(
                    size = IconSize.XXL
                )
            }
        }

        Text("© 2024, Mikhalchuk Grigoriy")
    }
}

@Composable
private fun FooterLink(href: String, content: @Composable () -> Unit) {
    Link(href, variant = UncoloredLinkVariant, content = content)
}
