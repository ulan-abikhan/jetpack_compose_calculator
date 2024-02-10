package kz.kazmbs.myfirstapplication.presentation

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextMotion
import kz.kazmbs.myfirstapplication.R

@Composable
fun InfiniteAnim(

) {
    val infiniteTransition = rememberInfiniteTransition(label = "infinite transition")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 4f,
        animationSpec = infiniteRepeatable(tween(1000), RepeatMode.Reverse),
        label = "scale"
    )
    Box(modifier = Modifier.fillMaxSize()) {
//        Text(
//            text = "Hello",
//            modifier = Modifier
//                .graphicsLayer {
//                    scaleX = scale
//                    scaleY = scale
//                    transformOrigin = TransformOrigin.Center
//                }
//                .align(Alignment.Center),
//            // Text composable does not take TextMotion as a parameter.
//            // Provide it via style argument but make sure that we are copying from current theme
//            style = LocalTextStyle.current.copy(textMotion = TextMotion.Animated)
//        )
        Image(
            painter = painterResource(id = R.drawable.scorpion),
            contentDescription = null,
            modifier = Modifier
                .clipToBounds()
                .graphicsLayer {
                    scaleX = scale
                    scaleY = scale
                    transformOrigin = TransformOrigin.Center
                }
                .align(Alignment.Center)
        )
    }
}