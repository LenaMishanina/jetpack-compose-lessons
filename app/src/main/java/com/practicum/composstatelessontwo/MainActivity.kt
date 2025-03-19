package com.practicum.composstatelessontwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.practicum.composstatelessontwo.ui.theme.ComposStateLessonTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//             В jetpack compose нет margin, все выполняется с помощью padding
            Column (
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .padding(start = 16.dp) // добавляет padding контенту внутри Column
//                    .width(600.dp) // если размер выйдет за рамки экрана, то установится размер экрана
//                    .requiredWidth(600.dp) // если размер выйдет за рамки экрана, то установится указанный размер
                    .border(5.dp, Color.Cyan)
                    .padding(20.dp)
                    .border(5.dp, Color.Red)
            ) {
                Text(
                    text = "Hello",
                    modifier = Modifier
                        .border(5.dp, Color.Yellow)
                        .padding(5.dp)
                        .offset(x = 20.dp, y = 30.dp) // устанавливает элемент по указанным координатам, это смещение не влияет на другие элементы
                        .border(10.dp, Color.Black)
                        .padding(10.dp)
                        .clickable { // итерактивность

                        }
                )
                Spacer(modifier = Modifier.height(30.dp)) // устанавливает доплнительное пространство между Hello и World (не учитывает смещение Hello)
                Text("World", modifier = Modifier
                    .padding(5.dp)) // добавили отступ от border, так как текст заходит за него
            }
        }
    }
}
