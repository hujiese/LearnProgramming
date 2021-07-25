int buttonState = 0;

void setup() {  // initialize digital pin 2 as an output.
   pinMode(2, OUTPUT);
   pinMode(4, INPUT);
}

void loop() {
  buttonState = digitalRead(4);
  if(buttonState == HIGH)
  {
      digitalWrite(2, HIGH);
  }
  else
  {
      digitalWrite(2, LOW);
  }
}
