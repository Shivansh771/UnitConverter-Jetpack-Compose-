package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme
import org.intellij.lang.annotations.PrintFormat
import androidx.compose.ui.tooling.preview.Preview as Preview1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    unitConverter()
                }
            }
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun unitConverter(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        //ui elements stacked on top of each other
        Text("Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = { //here goes what happens if value of txt changes
            } )
        Spacer(modifier = Modifier.height(16.dp))

        Row {
        Box{
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Select")
                Icon(Icons.Default.ArrowDropDown,contentDescription = "Arrow Down")
                
            }
            DropdownMenu(expanded = false, onDismissRequest = {  }) {
                DropdownMenuItem(
                    text = { Text("Centimeters")},
                    onClick = { /*TODO*/ })

                DropdownMenuItem(
                    text = { Text("Meters")},
                    onClick = { /*TODO*/ })
                DropdownMenuItem(
                    text = { Text("Feet")},
                    onClick = { /*TODO*/ })
                DropdownMenuItem(
                    text = { Text("Millimeters")},
                    onClick = { /*TODO*/ })
            }
        }
            Spacer(modifier = Modifier.width(16.dp))
        Box {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Select")
                Icon(Icons.Default.ArrowDropDown,contentDescription = "Arrow Down")

            }
            DropdownMenu(expanded = false, onDismissRequest = {  }) {
                DropdownMenuItem(
                    text = { Text("Centimeters")},
                    onClick = { /*TODO*/ })

                DropdownMenuItem(
                    text = { Text("Meters")},
                    onClick = { /*TODO*/ })
                DropdownMenuItem(
                    text = { Text("Feet")},
                    onClick = { /*TODO*/ })
                DropdownMenuItem(
                    text = { Text("Millimeters")},
                    onClick = { /*TODO*/ })
            }
        }

    }
        Spacer(modifier = Modifier.height(16.dp))

        Text("Result")
    }}



