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

![Pass Data App1](https://user-images.githubusercontent.com/74413402/192092887-2f9f48b3-10b1-4673-a72c-3b0471624f8e.png)
![Pass Data App2](https://user-images.githubusercontent.com/74413402/192092889-1164dabb-42e2-471c-9f66-b75c66f29277.png)
![Pass Data Code](https://user-images.githubusercontent.com/74413402/192092890-a66a25f4-318e-4165-ba88-c6809210f3e7.png)
