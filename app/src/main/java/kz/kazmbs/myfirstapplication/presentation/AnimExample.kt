package kz.kazmbs.myfirstapplication.presentation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp

@Composable
fun AnimExample(

) {

    var state: UiState by remember {
        mutableStateOf(UiState.Loading)
    }

    val progressVal by animateFloatAsState(
        targetValue = 1f,
        label = "alpha",
        animationSpec = tween(durationMillis = 5000, easing = LinearEasing)
    )

    AnimatedContent(
        state,
        transitionSpec = {
            fadeIn(
                animationSpec = tween(1000)
            ) togetherWith fadeOut(animationSpec = tween(1000))
        },
        modifier = Modifier.clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null
        ) {
            state = when (state) {
                UiState.Loading -> UiState.Loaded
                UiState.Loaded -> UiState.Error
                UiState.Error -> UiState.Loading
            }
        },
        label = "Animated Content"
    ) { targetState ->
        when (targetState) {
            UiState.Loading -> {
                Box(
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
//                    LinearProgressIndicator(trackColor = Color.Black, color = Color.White)
                    LinearProgressIndicator(
                        progress = progressVal,
                        trackColor = Color.Transparent,
                        color = Color.Black,
                        strokeCap = StrokeCap.Round
                    )
                }
//                LoadingScreen()
            }

            UiState.Loaded -> {
                Text(text = "Success")
//                LoadedScreen()
            }

            UiState.Error -> {
                Text(text = "Error")
//                ErrorScreen()
            }
        }
    }

}

sealed class UiState {
    object Loading : UiState()

    object Loaded : UiState()

    object Error : UiState()
}