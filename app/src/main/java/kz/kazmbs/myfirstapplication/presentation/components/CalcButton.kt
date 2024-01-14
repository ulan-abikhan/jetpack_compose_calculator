package kz.kazmbs.myfirstapplication.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CalcButton(
    width: Dp = 62.dp,
    height: Dp = 62.dp,
    withShadow: Boolean = false,
    symbol: String,
    containerColor: Color,
    contentColor: Color,
) {

    val mod = if (withShadow) Modifier
        .size(width, height)
        .background(containerColor, MaterialTheme.shapes.medium)
        .shadow(elevation = 23.dp, spotColor = Color(0xA600A3FF), ambientColor = Color(0xA600A3FF))
        .clip(MaterialTheme.shapes.medium)
        .clickable {

        } else Modifier
        .size(width, height)
        .background(containerColor, MaterialTheme.shapes.medium)
        .clip(MaterialTheme.shapes.medium)
        .clickable {

        }

    Box(
        modifier = mod
    ) {

        Text(
            text = symbol,
            color = contentColor,
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.align(
                Alignment.Center
            )
        )

    }

}