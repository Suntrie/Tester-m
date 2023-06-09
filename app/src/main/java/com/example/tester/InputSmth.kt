package com.example.tester

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.tester.ui.theme.TesterTheme
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp

class InputSmth : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TesterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }
    Column() {
        Row(modifier = Modifier.weight(1.0f, true)) {
            TextField(
                value = text,
                onValueChange = { newText -> text = newText },
                modifier = Modifier.size(width = 100.dp, height = 100.dp)
            )
        }
        Row(modifier = Modifier.weight(1.0f, true)) {
            Text(
                text = "Bar",
                modifier = Modifier.wrapContentSize()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    TesterTheme {
        Greeting2("Android")
    }
}