package com.example.thelearntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thelearntogether.ui.theme.TheLearnTogetherTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheLearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    JetpackComposeTextView(headline = stringResource(R.string.headline), text2 = stringResource(R.string.text2) , text3 =  stringResource(R.string.text3))
                }
            }
           }
    }
}


@Composable
fun JetpackComposeTextView(headline: String,text2:String,text3:String,modifier: Modifier=Modifier) {
    val image = painterResource(R.drawable.back_of_compose)
    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement=Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Image(
            painter=image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            alignment = Alignment.TopCenter

        )
       Text(
           text = headline,
           fontSize = 24.sp,
           modifier= Modifier
               .padding(top = 16.dp, start = 16.dp, end = 16.dp)
               .align(Alignment.CenterHorizontally)
)
        Text(
            text= text2,
            modifier= Modifier
                .padding(start = 16.dp, end = 16.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text=text3,
            modifier= Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                .align(Alignment.CenterHorizontally)

        )
     }
}

@Preview(showBackground = true)
@Composable
fun LearnPreview() {
    TheLearnTogetherTheme {
        val headline :String=stringResource(R.string.headline)
        val text2 :String =stringResource(R.string.text2)
        val text3 :String= stringResource(R.string.text3)

        JetpackComposeTextView(headline,text2,text3)

    }
}