package com.hasanbilgin.statemanagementcompose

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hasanbilgin.statemanagementcompose.ui.theme.StateManagementComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //diğer classtan direk çağırılabiliyor
//            MainScreen();
            MainScreen2();
        }
    }
}

@Composable
fun MainScreen2() {
    //state hoisting örneğidir
    var myString = remember { mutableStateOf("") }


    //Surface arka plan için
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            SpecialText(string = "Test")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialText(string = "Android")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialTextFields(myString.value) {
myString.value=it
            }
        }
    }

}

@Composable
fun SpecialText(string: String) {
    Text(text = string, fontSize = 20.sp, fontStyle = FontStyle.Italic, fontFamily = FontFamily.SansSerif)
}



@Composable
fun SpecialTextFields(message: String, textFieldOnValuChange: (String) -> Unit) {
    TextField(value = message, onValueChange = textFieldOnValuChange)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//    MainScreen();
    MainScreen2();
}