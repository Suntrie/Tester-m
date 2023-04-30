package com.example.tester

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tester.ui.theme.TesterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TesterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android-T")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(
    ) {
        Row(modifier = Modifier.weight(1.0f, true)) {
            Text(
                text = "Hello $name!",
                modifier = Modifier.wrapContentSize()
            )
        }
        Row(modifier = Modifier.weight(1.0f, true)) {
            Button(
                onClick = {
                    context.startActivity(Intent(context, InputSmth::class.java))
                },
                modifier = Modifier.wrapContentSize()
            ) {
                Text(text = "Click me")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TesterTheme {
        Greeting("Android")
    }
}