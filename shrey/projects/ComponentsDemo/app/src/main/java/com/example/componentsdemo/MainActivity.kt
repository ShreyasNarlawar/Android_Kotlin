package com.example.componentsdemo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.componentsdemo.ui.theme.ComponentsDemoTheme

class MainActivity : ComponentActivity() {

    private lateinit var serviceStatusTextView: TextView
    private lateinit var startServiceButton: Button
    private lateinit var stopServiceButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        serviceStatusTextView = findViewById(R.id.serviceStatusTextView)
        startServiceButton = findViewById(R.id.startServiceButton)
        stopServiceButton = findViewById(R.id.stopServiceButton)

        startServiceButton.setOnClickListener {
            startService(Intent(this, MyService::class.java))
            serviceStatusTextView.text = "Service is running..."
            Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show()
        }

        stopServiceButton.setOnClickListener {
            stopService(Intent(this, MyService::class.java))
            serviceStatusTextView.text = "Service is stopped."
            Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComponentsDemoTheme{
        Greeting("Android")
    }
}
