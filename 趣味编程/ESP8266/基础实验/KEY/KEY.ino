int buttonState = 0;

void setup() {  // initialize digital GPIO5 as an output.
   pinMode(5, OUTPUT);
   pinMode(4, INPUT);
}

void loop() {
  buttonState = digitalRead(4);
  if(buttonState == HIGH)
  {
      digitalWrite(5, HIGH);
  }
  else
  {
      digitalWrite(5, LOW);
  }
}
