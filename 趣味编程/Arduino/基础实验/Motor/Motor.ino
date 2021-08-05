void forward()
{
  digitalWrite(2, HIGH);
  digitalWrite(3, LOW);
}

void stop()
{
  digitalWrite(2, LOW);
  digitalWrite(3, LOW);
}

void back()
{
  digitalWrite(2, LOW);
  digitalWrite(3, HIGH);
}

void setup()
{
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
}
void loop() {

  while(true)
  {
    forward();
    delay(1000);
    stop();
    delay(1000);
    back();
    delay(1000);
    stop();
    delay(1000);
    
  }
}
