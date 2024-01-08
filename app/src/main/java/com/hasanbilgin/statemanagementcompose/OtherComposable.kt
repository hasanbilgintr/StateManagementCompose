package com.hasanbilgin.statemanagementcompose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//state durum
//composition oluşturun compoz viewlerin kullanıcıya gösterilmesi
//recomposition composition nun tekrar oluşturulması

@Composable
fun MainScreen() {
    //Surface boş alan demek // view düşünebilirsin
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

            //mutableStateOf string için değişebilir değişken
            //mutableStateMapOf key valu şeklinde
            //mutableStateMapListOf liste şeklinde
            //remember hatırlamasını sağlar
            var myString = remember { mutableStateOf("AndroidCompose") }
            TextField(value = myString.value, onValueChange = {
                myString.value = it
                println(myString.value)
            })
            Spacer(modifier = Modifier.padding(5.dp))
            var textString = remember { mutableStateOf("hello") }
            Text(text = textString.value, fontSize = 26.sp)

            Spacer(modifier = Modifier.padding(5.dp))

            Button(onClick = {
                textString.value="android"
                println("clicked")
            }) {
                Text(text = "Button")
                Text(text = "test")
            }

            Spacer(modifier = Modifier.padding(7.dp))
//            //composableler yeşil f yazar
//            //Image painter, bitmap(normal kullanım,en çok kullanılan),imageVector(R.id.drawable)..
//            //contentDescription görüşü bozuk olan kullanıcılar için android sesli okuma sistemi çiçek okucaktır
//            //modifierçsize vs. mevcuttur
//            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.cicek), contentDescription = "çiçek")
//            Spacer(modifier = Modifier.padding(7.dp))
//            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
//            Spacer(modifier = Modifier.padding(7.dp))
//            Image(painter = ColorPainter(Color.Black), contentDescription = null, modifier = Modifier.size(20.dp,20.dp))


        }
    }

}