package com.ani.moviesapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ani.moviesapp.ui.theme.MoviesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BuildBody(name = "ani")
                }
            }
        }
    }
}

@Composable
fun BuildBody(name: String) {
    Column(

    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                text = "hello $name",
                style = TextStyle(
                    fontSize = 22.sp,
                )
            )

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "",
                    tint = Color.Black,
                    modifier = Modifier.size(22.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .fillMaxWidth()
        ) {
            Image(painterResource(id = R.drawable.ic_launcher_background), contentDescription = "")
        }
        
        Text(text = "hiiii")

    }
//    Spacer(modifier = Modifier.size(30.dp))

}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MoviesAppTheme {
//        BuildHeader("Android")
//    }
//}