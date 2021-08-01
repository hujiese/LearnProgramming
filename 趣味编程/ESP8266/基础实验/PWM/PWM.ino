int led = 5; // the PWM pin the LED is attached to
int brightness = 0; // how bright the LED is
int fadeAmount = 10; // how many points to fade the LED by

void setup() {
   // declare pin 9 to be an output:
   pinMode(led, OUTPUT);
}

void loop() {
   // set the brightness of pin 9:
   analogWrite(led, brightness);
   // change the brightness for next time through the loop:
   brightness = brightness + fadeAmount;
   // reverse the direction of the fading at the ends of the fade:
   if (brightness >= 255) {
      brightness = 0 ;
   }
   // wait for 30 milliseconds to see the dimming effect
   delay(300);
}
