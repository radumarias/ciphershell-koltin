package rs.xor.rencfs.krencfs.ui.customcomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import rs.xor.rencfs.krencfs.ui.customcomponents.AutoDismissibleSnackBar
import rs.xor.rencfs.krencfs.ui.RencfsMaterialDarkTheme
import rs.xor.rencfs.krencfs.ui.branding.DesignSystem
import rs.xor.rencfs.krencfs.ui.branding.backgroundAngularGradient


@Preview
@Composable
fun Preview_AutoDismissibleSnackBar_SnackySnack() {
    RencfsMaterialDarkTheme {
        Box {
            AutoDismissibleSnackBar(
                modifier = Modifier
                    .padding(8.dp)
                    .backgroundAngularGradient(DesignSystem.Colors.Gradient.Oxidized_Copper)
                    .wrapContentSize()
                    .align(alignment = Alignment.BottomCenter),
                message = "Snacky Snack >= Multiplatform"
            )
        }
    }
}
