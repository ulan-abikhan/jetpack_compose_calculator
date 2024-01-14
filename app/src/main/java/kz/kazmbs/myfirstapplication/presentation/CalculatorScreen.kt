package kz.kazmbs.myfirstapplication.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kz.kazmbs.myfirstapplication.R
import kz.kazmbs.myfirstapplication.presentation.components.AdditionalCalcButton
import kz.kazmbs.myfirstapplication.presentation.components.CalcButton
import kz.kazmbs.myfirstapplication.ui.theme.ADE2FF

@Composable
fun CalculatorScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp, vertical = 40.dp)
    ) {

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = "6000/2+3227*2",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.surfaceTint
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "=12,454",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        }

        Column(modifier = Modifier.wrapContentHeight()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                AdditionalCalcButton(iconRes = R.drawable.ic_e)

                AdditionalCalcButton(iconRes = R.drawable.ic_miu)

                AdditionalCalcButton(iconRes = R.drawable.ic_sin)

                AdditionalCalcButton(iconRes = R.drawable.ic_deg)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                CalcButton(
                    symbol = "Ac",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    contentColor = MaterialTheme.colorScheme.onTertiary
                )

                CalcButton(
                    symbol = "Ba",
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    contentColor = MaterialTheme.colorScheme.onTertiary
                )

                CalcButton(
                    symbol = "/",
                    containerColor = MaterialTheme.colorScheme.secondary,
                    contentColor = MaterialTheme.colorScheme.onSecondary
                )

                CalcButton(
                    symbol = "*",
                    containerColor = MaterialTheme.colorScheme.secondary,
                    contentColor = MaterialTheme.colorScheme.onSecondary
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                CalcButton(
                    symbol = "7",
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )

                CalcButton(
                    symbol = "8",
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )

                CalcButton(
                    symbol = "9",
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )

                CalcButton(
                    symbol = "-",
                    containerColor = MaterialTheme.colorScheme.secondary,
                    contentColor = MaterialTheme.colorScheme.onSecondary
                )
            }

            Spacer(modifier = Modifier.height(20.dp))


            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.weight(3f)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        CalcButton(
                            symbol = "4",
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )

                        CalcButton(
                            symbol = "5",
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )

                        CalcButton(
                            symbol = "6",
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                    
                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        CalcButton(
                            symbol = "1",
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )

                        CalcButton(
                            symbol = "2",
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )

                        CalcButton(
                            symbol = "3",
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        CalcButton(
                            width = 160.dp,
                            symbol = "0",
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )

                        CalcButton(
                            symbol = ".",
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }

                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Spacer(modifier = Modifier.height(6.dp))

                    CalcButton(
                        width = 62.dp,
                        height = 96.dp,
                        symbol = "-",
                        containerColor = MaterialTheme.colorScheme.secondary,
                        contentColor = MaterialTheme.colorScheme.onSecondary
                    )

                    Spacer(modifier = Modifier.height(16.dp))

//                    CalcButton(
//                        width = 62.dp,
//                        height = 96.dp,
//                        symbol = "=",
//                        withShadow = true,
//                        containerColor = MaterialTheme.colorScheme.surface,
//                        contentColor = MaterialTheme.colorScheme.onSurface
//                    )
//                    val mod = if (withShadow) Modifier
//                        .shadow(elevation = 23.dp, spotColor = Color(0xA600A3FF), ambientColor = Color(0xA600A3FF))
//                        .size(width, height)
//                        .background(containerColor, MaterialTheme.shapes.medium)
//                        .clip(MaterialTheme.shapes.medium)
//                        .clickable {
//
//                        } else Modifier
//                        .size(width, height)
//                        .background(containerColor, MaterialTheme.shapes.medium)
//                        .clip(MaterialTheme.shapes.medium)
//                        .clickable {
//
//                        }
//
                    Column(
                        modifier = Modifier
                            .size(62.dp, 96.dp)
                            .background(MaterialTheme.colorScheme.surface, MaterialTheme.shapes.medium)
                            .clip(MaterialTheme.shapes.medium)
                            .shadow(elevation = 23.dp, spotColor = Color.Black, ambientColor = ADE2FF)

                            .clickable {

                            }
                    ) {

                    }
                }
            }

        }
    }
}