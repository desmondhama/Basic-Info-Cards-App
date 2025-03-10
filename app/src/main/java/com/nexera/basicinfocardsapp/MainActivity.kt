package com.nexera.basicinfocardsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.nexera.basicinfocardsapp.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FourEqualParts()
                }
            }
        }
    }
}

@Composable
fun FourEqualParts() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Top-left part
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(color = Color(0xFFEADDFF))
                .align(Alignment.TopStart),
				contentAlignment = Alignment.Center
        ) {
            Column(
			    modifier = Modifier.padding(16.dp)
				) {
			    Text(
                    text = stringResource(R.string.title_text),
                    style = TextStyle(
                    fontWeight = FontWeight.Bold
                    ),
					modifier = Modifier
					.fillMaxWidth()
					.padding(bottom = 16.dp),
				    textAlign = TextAlign.Center
                )
			    Text(
                    text = stringResource(R.string.infomation_text),
                    style = TextStyle(
                                fontSize = 18.sp
                            ),
					modifier = Modifier
					.fillMaxWidth()
					.padding(bottom = 16.dp),
				    textAlign = TextAlign.Center
                )
			}
        }
		// Top-right part
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(color = Color(0xFFD0BCFF))
                .align(Alignment.TopEnd),
				contentAlignment = Alignment.Center
        ) {
            Column(
			    modifier = Modifier.padding(16.dp)
				) {
			    Text(
                    text = stringResource(R.string.title_image),
                    style = TextStyle(
                    fontWeight = FontWeight.Bold
                    ),
					modifier = Modifier
					.fillMaxWidth()
					.padding(bottom = 16.dp),
				    textAlign = TextAlign.Center
                )
			    Text(
                    text = stringResource(R.string.infomation_image),
                    style = TextStyle(
                                fontSize = 18.sp
                            ),
					modifier = Modifier
					.fillMaxWidth()
					.padding(bottom = 16.dp),
				    textAlign = TextAlign.Center
                )
			}
        }
		// Bottom-left part
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(color = Color(0xFFB69DF8))
                .align(Alignment.BottomStart),
				contentAlignment = Alignment.Center
        ) {
            Column(
			    modifier = Modifier.padding(16.dp)
				) {
			    Text(
                    text = stringResource(R.string.title_row),
                    style = TextStyle(
                    fontWeight = FontWeight.Bold
                    ),
					modifier = Modifier
					.fillMaxWidth()
					.padding(bottom = 16.dp),
				    textAlign = TextAlign.Center
                )
			    Text(
                    text = stringResource(R.string.infomation_row),
                    style = TextStyle(
                                fontSize = 18.sp
                            ),
					modifier = Modifier
					.fillMaxWidth()
					.padding(bottom = 16.dp),
				    textAlign = TextAlign.Center
                )
			}
        }
		// Bottom-right part
        Box(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .background(color = Color(0xFFF6EDFF))
                .align(Alignment.BottomEnd),
				contentAlignment = Alignment.Center
        ) {
            Column(
			    modifier = Modifier.padding(16.dp)
				) {
			    Text(
                    text = stringResource(R.string.title_column),
                    style = TextStyle(
                    fontWeight = FontWeight.Bold
                    ),
					modifier = Modifier
					.fillMaxWidth()
					.padding(bottom = 16.dp),
				    textAlign = TextAlign.Center
                )
			    Text(
                    text = stringResource(R.string.infomation_column),
                    style = TextStyle(
                                fontSize = 18.sp
                            ),
					modifier = Modifier
					.fillMaxWidth()
					.padding(bottom = 16.dp),
				    textAlign = TextAlign.Center
                )
			}
        }
    }
}