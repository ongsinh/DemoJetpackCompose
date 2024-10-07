package com.example.demojetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demojetpack.ui.theme.DemoJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoJetpackTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Greeting(name = "Android")
                        BannerComposable()
                        VectorImgaeComponent()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.test_text),
        style = TextStyle(
            color = Color.Blue,
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            fontFamily = FontFamily.Serif,
            textDecoration = TextDecoration.Underline
        ),
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = modifier.padding(20.dp)
    )
}
@Composable
fun CustomPainterComponet(){

}

@Composable
fun BannerComposable() {
    Image(
        painter = painterResource(id = R.drawable.banner_1),
        contentDescription = "Banner Image",
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(20.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun VectorImgaeComponent(){
    Image(
        modifier = Modifier.padding(10.dp),
        imageVector = Icons.Filled.Person,
        contentDescription = "Banner Fashtion"

    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    DemoJetpackTheme {
        Column {
            Greeting(name = "Android")
            BannerComposable()
            VectorImgaeComponent()
        }
    }
}
