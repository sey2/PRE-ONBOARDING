package org.chosun.pre_onboarding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.chosun.pre_onboarding.ui.theme.Pre_onboardingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pre_onboardingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Start Compose Exam")
                }
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Greeting(name = "MyApp Composable")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.padding(24.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pre_onboardingTheme {
        Greeting("Start Compose Exam")
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    Pre_onboardingTheme {
        MyApp()
    }
}