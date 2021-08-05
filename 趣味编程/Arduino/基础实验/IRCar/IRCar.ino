#include <IRremote.h>
int RECV_PIN = 11; //define input pin on Arduino

IRrecv irrecv(RECV_PIN);
decode_results results;

void forward()
{
  digitalWrite(2, HIGH);
  digitalWrite(3, LOW);
  digitalWrite(4, HIGH);
  digitalWrite(5, LOW);
}

void back()
{
  digitalWrite(2, LOW);
  digitalWrite(3, HIGH);
  digitalWrite(4, LOW);
  digitalWrite(5, HIGH);
}

void stop()
{
  digitalWrite(2, LOW);
  digitalWrite(3, LOW);
  digitalWrite(4, LOW);
  digitalWrite(5, LOW);
}

void turn_left()
{
  digitalWrite(2, HIGH);
  digitalWrite(3, LOW);
  digitalWrite(4, LOW);
  digitalWrite(5, HIGH);
}

void turn_right()
{
  digitalWrite(2, LOW);
  digitalWrite(3, HIGH);
  digitalWrite(4, HIGH);
  digitalWrite(5, LOW);
}

void setup()
{
  Serial.begin(9600);
  irrecv.enableIRIn(); // Start the receiver
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
}
void loop() {
  if (irrecv.decode(&results)) {
    Serial.println(results.value, HEX);
    switch(results.value)
    {
      case 0xFFFFFFFF:
        break;// 什么也不做
      case 0xFF38C7: // 0xFF38C7为Ok按键的键码值，停止
        stop();
        break;
      case 0xFF10EF:// 0xFF10EF为left按键的键码值
        turn_left();
        delay(200);
        stop();
        break;
      case 0xFF5AA5: // 0xFF5AA5为right按键的键码值
        turn_right();
        delay(200);
        stop();
        break;
      case 0xFF18E7: // 0xFF18E7为up按键的键码值，前进
        forward();
        break;
      case 0xFF4AB5: // 0xFF4AB5为down按键的键码值，后退
        back();
        break;
      default:
        stop();
        break;
    }
    irrecv.resume(); // Receive the next value
  }
}
