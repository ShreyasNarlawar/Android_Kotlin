package com.example.compose_project01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.compose_project01.ui.theme.Compose_project01Theme
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_project01Theme {
                    MainScreen()
            }
        }
    }
}
@Composable
fun MainScreen() {
    var isLoading by remember { mutableStateOf(true) }

    // Simulate loading delay (e.g., 3 seconds)
    LaunchedEffect(Unit) {
        delay(3000)
        isLoading = false
    }

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splash_launch))
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        isPlaying = isLoading,
        speed = 1.0f
    )

    val backgroundPainter = painterResource(id = R.drawable.dashboard_background)

    Box(modifier = Modifier.fillMaxSize()) {
        // Background image
        Image(
            painter = backgroundPainter,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        if (isLoading) {
            // Lottie loading animation
            LottieAnimation(
                composition = composition,
                modifier = Modifier.fillMaxSize(),
                progress = { progress }
            )
        } else {
            // Main content shown after animation finishes
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 45.dp, start = 16.dp, end = 16.dp)
            ) {
                ProjHeader(
                    name = "Jose Atizol",
                    lastAccess = "11/01/25"
                )
                Spacer(modifier = Modifier.height(24.dp))
                HomeSection(R.string.prodname) {
                    ProdCard(
                        icon = painterResource(R.drawable.cuentaahorro_icon),
                        title = "Cuenta de ahorros",
                        subInfo = "800881234",
                        label = "Balance disponible:",
                        amount = "US$8,987.23"
                    )
                    ProdCard(
                        icon = painterResource(R.drawable.pagostarjetas_icon),
                        title = "Tarjeta de crédito",
                        subInfo = "****2912",
                        label = "Balance a la fecha:",
                        amount = "US$459.40"
                    )
                    ProdCard(
                        icon = painterResource(R.drawable.prestamos_icon),
                        title = "Préstamo",
                        subInfo = "534594329",
                        label = "Balance disponible",
                        amount = "US$3,987.53"
                    )
                    ProdCard(
                        icon = painterResource(R.drawable.dep_sitoaplazo_icon),
                        title = "Depósito a plazo",
                        subInfo = "234554329",
                        label = "Balance actual",
                        amount = "US$235,987.53"
                    )
                }
            }
        }
    }
}


@Composable
fun ProdCard(
    icon: Painter,
    title: String,
    subInfo: String,
    label: String,
    amount: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = icon,
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(title, fontWeight = FontWeight.SemiBold)
                Text(subInfo, color = Color.Gray, style = MaterialTheme.typography.bodySmall)
            }

            Column(horizontalAlignment = Alignment.End) {
                Text(label, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
                Text(amount, color = Color(0xFF00796B), fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun ProjHeader(name: String, lastAccess: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text("Buenas tardes,", style = MaterialTheme.typography.bodyMedium,color = Color.White)
            Text(name, style = MaterialTheme.typography.titleMedium,color = Color.White)
            Text(
                "Último Acceso: $lastAccess",
                style = MaterialTheme.typography.bodySmall,
                color = Color.White

            )
        }
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color(0xFF11AAE7)),
            contentAlignment = Alignment.Center
        ) {
            Text("JA", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        Text(stringResource(title))
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun MainProjectPreview() {
    Compose_project01Theme {
        MainScreen()
    }
}