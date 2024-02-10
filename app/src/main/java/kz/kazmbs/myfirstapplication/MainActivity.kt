package kz.kazmbs.myfirstapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.compose.Visibility
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import kz.kazmbs.myfirstapplication.navigation.BottomNav
import kz.kazmbs.myfirstapplication.navigation.RootNavigation
import kz.kazmbs.myfirstapplication.presentation.AnimExample
import kz.kazmbs.myfirstapplication.presentation.AnimationExample
import kz.kazmbs.myfirstapplication.presentation.CalculatorScreen
import kz.kazmbs.myfirstapplication.presentation.InfiniteAnim
import kz.kazmbs.myfirstapplication.presentation.components.AdditionalCalcButton
import kz.kazmbs.myfirstapplication.ui.theme.MyFirstApplicationTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            var darkTheme by remember {
                mutableStateOf(false)
            }

            val context = LocalContext.current

            MyFirstApplicationTheme(darkTheme = darkTheme) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF7EAE2)
                ) {
                    BottomNav(navController = rememberNavController())
                }
            }
        }
    }
}