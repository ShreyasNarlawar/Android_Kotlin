package com.example.jetpackcompose03_hoisting

import android.app.Activity
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import com.example.jetpackcompose03_hoisting.ui.theme.Blue
import com.example.jetpackcompose03_hoisting.ui.theme.Chartreuse
import com.example.jetpackcompose03_hoisting.ui.theme.JetPackCompose03_HoistingTheme
import com.example.jetpackcompose03_hoisting.ui.theme.LightBlue
import com.example.jetpackcompose03_hoisting.ui.theme.Navy
import com.example.jetpackcompose03_hoisting.ui.theme.Typography


private val DarkColorScheme = darkColorScheme(
    surface = Blue,
    onSurface = Navy,
    primary = Navy,
    onPrimary = Chartreuse
)

private val LightColorScheme = lightColorScheme(
    surface = Blue,
    onSurface = Color.White,
    primary = LightBlue,
    onPrimary = Navy
)
@Composable
fun Jetpackcompose03_hoisting(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb()
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = darkTheme
        }
    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose03_HoistingTheme {
                MynewApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}
@Composable
fun MynewApp(modifier: Modifier = Modifier){

//    var shouldShowOnboarding by remember{mutableStateOf(true)}
    var shouldShowOnboarding by rememberSaveable{mutableStateOf(true)}
    Surface(modifier) {
        if (shouldShowOnboarding)
            OnboardingScreen(onContinueClicked={shouldShowOnboarding=false})
        else
            Greetings()
    }
}

@Composable
fun OnboardingScreen(
    onContinueClicked:()->Unit ,
    modifier:Modifier = Modifier){
//    var shouldShowOnboarding by remember { mutableStateOf(true) }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Welcome to the Project")
        Button(
            modifier = Modifier.padding(vertical = 24.dp),
//            onClick = { shouldShowOnboarding = false}
            onClick = onContinueClicked
        ) {
            Text("Continue")
        }
    }
}

@Composable
private fun Greetings(
    modifier: Modifier = Modifier,
//    names: List<String> = listOf("World","Shreyas","Siddhatech")
    names: List<String> = List(100) {"$it"}
) {
//    Column(modifier = modifier.padding(vertical = 4.dp)) {
    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
//        for (name in names) {
          items(items = names){name->
            Greeting(name = name)
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    JetPackCompose03_HoistingTheme {
        OnboardingScreen(onContinueClicked = {})
    }
}

@Composable
private fun Greeting(name: String,modifier: Modifier= Modifier) {
//     var expanded by remember { mutableStateOf(false) }
//     var expanded by rememberSaveable { mutableStateOf(false) }
//     var extraPadding = if(expanded)48.dp else 0.dp
//    val extraPadding by animateDpAsState(
//        if(expanded)48.dp else 0.dp,
//        animationSpec = spring(
//            dampingRatio = Spring.DampingRatioMediumBouncy,
//            stiffness = Spring.StiffnessLow
//        )
//    )
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        CardContent(name)
    }
}

@Composable
private fun CardContent(name: String) {

    var expanded by rememberSaveable { mutableStateOf(false) }
//Surface(
//        color = colorScheme.primary,
//        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
//    ){
    Row(
        modifier = Modifier.padding(24.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)
        ) {
            Text(text = "Hello")
            Text(
                text = name, style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.ExtraBold
                )
            )
            if (expanded) {
                Text(
                    text = ("lorem Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \n" +
                            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \n" +
                            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \n" +
                            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n ").repeat(
                        4
                    ),
                )
            }
            IconButton(onClick = { expanded = !expanded }) {
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription =
                        if (expanded)
                            stringResource(R.string.show_less)
                        else
                            stringResource(R.string.show_more)
                )
            }
        }
    }
}
    @Preview(
        showBackground = true,
        widthDp = 320,
        uiMode = UI_MODE_NIGHT_YES,
        name = "GreetingPreviewDark"
    )

    @Preview(showBackground = true, widthDp = 320)
    @Composable
    fun GreetingsPreview() {
        JetPackCompose03_HoistingTheme {
            Greetings()
        }
    }

    @Preview
    @Composable
    fun MynewAppPreview(){
        JetPackCompose03_HoistingTheme {
            MynewApp(Modifier.fillMaxSize())
        }
    }

@Composable
fun JetPackCompose03_HoistingTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor : Boolean = true,
    content: @Composable ()->Unit
){
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
