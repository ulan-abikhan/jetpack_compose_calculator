package kz.kazmbs.myfirstapplication.presentation.first_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen(
    navigateToNext: (String) -> Unit
) {

    var text by remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            navigateToNext(text)
        }) {
            Text(text = "Navigate to next")
        }

        TextField(
            value = text, onValueChange = {
                text = it
            },
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 150.dp)
        )
    }
}