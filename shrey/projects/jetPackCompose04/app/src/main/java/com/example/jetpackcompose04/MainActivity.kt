package com.example.jetpackcompose04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose04.ui.theme.JetPackCompose04Theme
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass



class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompose04Theme {
//                Scaffold(modifier = Modifier.fillMaxSize())
//                {
//                    innerpadding ->
//                    Column (modifier = Modifier.padding(innerpadding)
//                        .fillMaxSize())
//                    {
//                        SearchBar()
//                        HomeSection(R.string.PetImages) {
//                            AlignYourBodyRow()
//                        }
//                        HomeSection(R.string.NatureImages){
//                            FavouriteCollectionsGrid()
//                        }
//                        HomeScreen()
//                        BottomNaviagtion()
//                        MyNewAppPortrait()
//                    }
//                }
                val windowSizeClass = calculateWindowSizeClass(this)
                MyNewApp((windowSizeClass))
//                        MyNewAppLandscape()
            }
        }
    }
}

data class DrawableStringPair(val drawable:Int, val text: Int)

val alignYourBodyData = listOf(
    DrawableStringPair(R.drawable.cutedog, R.string.dog),
    DrawableStringPair(R.drawable.cat_img, R.string.cat),
    DrawableStringPair(R.drawable.rabbit_img, R.string.rabbit),
    DrawableStringPair(R.drawable.rat_img, R.string.rat),
    DrawableStringPair(R.drawable.monkey_img, R.string.monkey),
    DrawableStringPair(R.drawable.peacock_img, R.string.peacock),
    DrawableStringPair(R.drawable.ostrich_img, R.string.ostrich),
    DrawableStringPair(R.drawable.tortoise_img, R.string.tortoise)
)

val FavouriteCollectionsData = listOf(
    DrawableStringPair(R.drawable.nature01, R.string.nature01),
    DrawableStringPair(R.drawable.nature02, R.string.nature02),
    DrawableStringPair(R.drawable.nature03, R.string.nature03),
    DrawableStringPair(R.drawable.nature04, R.string.nature04),
    DrawableStringPair(R.drawable.nature05, R.string.nature05),
    DrawableStringPair(R.drawable.nature06, R.string.nature06)
)

@Composable
fun SearchBar(
    modifier: Modifier = Modifier
){
    TextField(
        value = "",
        onValueChange = {},
        placeholder = {Text(stringResource(R.string.placeholder_search))},
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search,
                contentDescription = null,
                modifier= Modifier.size(20.dp))
        },
        singleLine = true,
        shape = RoundedCornerShape(12.dp),
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.surface
        ),
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)        // adjust height here
            .padding(horizontal = 16.dp)
    )
}

@Composable
fun AlignYourBodyElement(
    @DrawableRes drawable : Int,
    @StringRes text : Int,
    modifier : Modifier = Modifier
){
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            modifier= Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
            Text(
                text=stringResource(text),
                modifier = Modifier.paddingFromBaseline(top = 24.dp , bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium
                )
    }
}

@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
){
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(alignYourBodyData.size){ index ->
            val item = alignYourBodyData[index]
            AlignYourBodyElement(item.drawable,item.text)
        }
    }
}

@Composable
fun FavouriteCollectionCard(
    drawable: Int = R.drawable.nature01,
    text: Int = R.string.nature01,
    modifier: Modifier
){
    Surface (
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surfaceVariant,
        modifier = modifier
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.width(255.dp)
        ){
            Image(
                painter = painterResource(drawable),
                contentDescription = "null",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(80.dp)
            )
            Text(text = stringResource(text),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}

@Composable
fun FavouriteCollectionsGrid(
    modifier: Modifier = Modifier
){
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(168.dp)
    ) {
        items(FavouriteCollectionsData.size) { index ->
            val item = FavouriteCollectionsData[index]
            FavouriteCollectionCard(item.drawable, item.text, Modifier.height(80.dp))
        }
    }
}

@Composable
fun HomeSection(
    @StringRes title : Int,
    modifier : Modifier = Modifier,
    content: @Composable () -> Unit
){
    Column(modifier){
        Text(
            text= stringResource(title),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier
                    .paddingFromBaseline(top = 40.dp , bottom = 16.dp)
                    .padding(horizontal = 16.dp)
        )
        content()
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(
        modifier
        .verticalScroll(rememberScrollState())) {
//        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.PetImages){
            AlignYourBodyRow()
        }
        HomeSection(title = R.string.NatureImages) {
            FavouriteCollectionsGrid()
        }
        Spacer(Modifier.height(16.dp))
    }
}
@Composable
private fun BottomNaviagtion(modifier: Modifier = Modifier){
    NavigationBar(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            modifier = Modifier.height(80.dp)
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                   painter = painterResource(R.drawable.home),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
            },
            label={
                Text(
                    text = stringResource(R.string.bottomNavigation_home)
                )
            },
            selected = true,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
            },
            label={
                Text(
                    text = stringResource(R.string.bottomNavigation_profile)
                )
            },
            selected = true,
            onClick = {}
        )
    }
}

@Composable
fun MyNewAppPortrait(){
    JetPackCompose04Theme {
        Scaffold(bottomBar = {BottomNaviagtion()})
        {
            padding -> HomeScreen(Modifier.padding(padding))
        }
    }
}

@Composable
private fun NewNavigationRail(modifier: Modifier = Modifier){
    NavigationRail(
        modifier = modifier.padding(start = 8.dp, end = 8.dp),
        containerColor = MaterialTheme.colorScheme.background,
    ) {
        Column(
            modifier = modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavigationRailItem(
                icon = {
                    Icon(
                        painter = painterResource(R.drawable.home),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                },
                label = {
                    Text(stringResource(R.string.bottomNavigation_home))
                },
                selected = true,
                onClick = {}
            )
            Spacer(modifier = Modifier.height(8.dp))
            NavigationRailItem(
                icon = {
                    Icon(
                        painter = painterResource(R.drawable.profile),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                },
                label = {
                    Text(stringResource(R.string.bottomNavigation_profile))
                },
                selected = true,
                onClick = {}
            )
        }
    }
}
@Composable
fun MyNewAppLandscape(){
    JetPackCompose04Theme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Row {
                NewNavigationRail()
                HomeScreen()
            }
        }
    }
}

@Composable
fun MyNewApp(windowSize: WindowSizeClass) {
    when (windowSize.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            MyNewAppPortrait()
        }
        WindowWidthSizeClass.Medium, WindowWidthSizeClass.Expanded -> {
            MyNewAppLandscape()
        }
        else -> {
            // Optional: fallback UI
            MyNewAppPortrait()
        }
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun MainPreview(){
    JetPackCompose04Theme {
//        Column {
//            SearchBar()
//            HomeSection(R.string.PetImages) {
//                AlignYourBodyRow()
//            }
//            HomeSection(R.string.NatureImages){
//                FavouriteCollectionsGrid()
//            }
//            MyNewAppPortrait()
//            HomeScreen()
//            BottomNaviagtion()
//            MyNewAppPortrait()
        MyNewAppPortrait()
//        }

    }
}
