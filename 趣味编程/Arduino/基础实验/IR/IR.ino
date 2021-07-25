//#include <IRremote.h>
//int RECV_PIN = 11; //define input pin on Arduino
//IRrecv irrecv(RECV_PIN);
//decode_results results;
//
//void setup()
//{
//  Serial.begin(9600);
//  irrecv.enableIRIn(); // Start the receiver
//}
//void loop() {
//  if (irrecv.decode(&results)) {
//    Serial.println(results.value, HEX);
//    irrecv.resume(); // Receive the next value
//  }
//}

#include <IRremote.h>
int RECV_PIN = 11; //define input pin on Arduino
IRrecv irrecv(RECV_PIN);
decode_results results;

void setup()
{
  irrecv.enableIRIn(); // Start the receiver
  pinMode(2, OUTPUT);
}

void loop() {
  if (irrecv.decode(&results)) {
    if(results.value == 0xFFFFFFFF)
    {
      ;// 什么事也不做
    }
    else if(results.value == 0xFF38C7)// 0xFF38C7为Ok按键的键码值
    {
      digitalWrite(2, HIGH);
    }
    else
    {
      digitalWrite(2, LOW);
    }
    irrecv.resume(); // Receive the next value
  }
}
