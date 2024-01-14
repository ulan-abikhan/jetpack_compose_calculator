package kz.kazmbs.myfirstapplication.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import kz.kazmbs.myfirstapplication.R

@Composable
fun ImageComponent() {
    val rainbowColorsBrush = remember {
        Brush.horizontalGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }

    Box(modifier = Modifier.size(300.dp).background(Color.Blue)) {
        Text(
            text = "Some words",
            modifier = Modifier
                .align(Alignment.TopStart)
                ,
            color = Color.Yellow
        )

//        Image(
//            painter = painterResource(id = R.drawable.ic_back_icon),
//            contentDescription = "Some Image",
//            modifier = Modifier
//                .size(240.dp)
//                .border(
//                    BorderStroke(5.dp, rainbowColorsBrush),
//                    CircleShape
//                )
//                .zIndex(1f)
//                .clip(CircleShape)
//            ,
//            contentScale = ContentScale.Crop,
//            colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
//        )

        Icon(
            painter = painterResource(id = R.drawable.ic_back_icon),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .padding(20.dp)
                .background(Color.Black, CircleShape)
                .border(
                    BorderStroke(2.dp, Color.White),
                    CircleShape
                )
                .padding(5.dp)
                .border(
                    BorderStroke(2.dp, Color.White),
                    CircleShape
                )
        )

    }

}


@Preview(showBackground = true)
@Composable
fun ImagePreview() {
    ImageComponent()
}