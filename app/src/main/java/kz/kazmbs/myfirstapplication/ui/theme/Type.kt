package kz.kazmbs.myfirstapplication.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kz.kazmbs.myfirstapplication.R

val inter = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_semi_bold, FontWeight.SemiBold),
    Font(R.font.inter_bold, FontWeight.Bold)
)

val poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
)

val Typography = Typography(
    headlineMedium = TextStyle(
        fontSize = 24.sp,
        fontFamily = poppins,
        fontWeight = FontWeight.Normal
    ),
    headlineLarge = TextStyle(
        fontSize = 48.sp,
        fontFamily = poppins,
        fontWeight = FontWeight.Medium
    ),
    labelMedium = TextStyle(
        fontSize = 32.sp,
        fontFamily = poppins,
        fontWeight = FontWeight.Medium
    ),

    bodyLarge = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        letterSpacing = 1.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
    )
)