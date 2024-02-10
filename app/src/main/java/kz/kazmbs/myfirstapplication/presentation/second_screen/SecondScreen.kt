package kz.kazmbs.myfirstapplication.presentation.second_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kz.kazmbs.myfirstapplication.R

@Composable
fun SecondScreen(
    onBackPressed: () -> Unit,
    navigateToNext: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        IconButton(onClick = onBackPressed, modifier = Modifier
            .align(Alignment.TopStart)
            .padding(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back_icon),
                contentDescription = null
            )
        }

        Button(onClick = navigateToNext, modifier = Modifier.align(Alignment.Center)) {
            Text(text = "Navigate to next")
        }
    }
}

@Composable
fun ThirdScreen(
    word: String,
    onBackPressed: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        IconButton(onClick = onBackPressed, modifier = Modifier
            .align(Alignment.TopStart)
            .padding(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back_icon),
                contentDescription = null
            )
        }

        Text(text = word, modifier = Modifier.align(Alignment.Center))
    }
}