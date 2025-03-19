package com.practicum.composstatelessontwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.practicum.composstatelessontwo.ui.theme.ComposStateLessonTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//// Данный вызов помещает тексты друг на друга
//// Решение - column и row
//            Text("hello")
//            Text("world")

//// Column и Row работают как LinearLayout в XML
//            Column {
//                Column {
//                    Text("hello")
//                    Text("world")
//                }
//
//                Row {
//                    Text("hello")
//                    Text("world")
//                }
//            }

//           ДЛЯ ROW
//           Главная ось - это горизонтальная (horizontalArrangement - горизонтальное расположение элементов)
//           Поперечная ось - вертикальная (verticalAlignment - вертикальное выравнивание элементов)

//           ДЛЯ COLUMN
//           Главная ось - это вертикальная (verticalArrangement - вертикальное расположение элементов)
//           Поперечная ось - горизонтальная (horizontalAlignment - горизонтальное выравнивание элементов)

            Column(
                modifier = Modifier
//                    .width(100.dp)
//                    .height(300.dp)
                    .fillMaxSize(0.5f) // 50%
                    .background(Color.Green),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("hello")
                Text("world")
            }
        }
    }
}
