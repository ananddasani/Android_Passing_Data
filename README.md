# Android_Passing_Data
An Android App to practice passing the data to other Activities

# Code

#### 1st Activity 
```
Intent intent = new Intent(MainActivity.this, MainActivity2.class);

String message = fetchMessage.getText().toString();
intent.putExtra("KEY", message);

startActivity(intent);
```

#### 2nd Activity 
```
//get the activity that started this activity and extract the string
Intent intent = getIntent();
String message = intent.getStringExtra("KEY");

textView = findViewById(R.id.textView);
textView.setText(message);
```

# App Highlight

<img src="app_images/Pass Data Code.png" width="1000" /><br>

<img src="app_images/Pass Data App1.png" width="300" /><br>

<img src="app_images/Pass Data App2.png" width="300" /><br>
