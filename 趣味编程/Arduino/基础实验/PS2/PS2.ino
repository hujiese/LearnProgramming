//#define PIN_X 0  
//#define PIN_Y 1  
//#define PIN_Z 2  
// 
//void setup() {  
//  pinMode(PIN_X, INPUT);
//  pinMode(PIN_Y, INPUT);
//  pinMode(PIN_Z, INPUT);
//  Serial.begin(9600);
//}  
// 
//void loop() {  
//  int x,y,z;  
// 
//  x=analogRead(PIN_X);  
//  y=analogRead(PIN_Y);  
//  z=analogRead(PIN_Z);  
// 
//  Serial.print("X=");  
//  Serial.print(x);   
//  Serial.print("\tY=");     
//  Serial.print(y);  
//  Serial.print("\tZ=");     
//  Serial.println(z);  
// 
//  delay(2000);  
//}

#define PIN_X A0  
 
void setup() {  
  pinMode(PIN_X, INPUT);
  pinMode(2, OUTPUT);
  Serial.begin(9600);
}  
 
void loop() {  
  int x;  
 
  x=analogRead(PIN_X);   
  if(x > 1000)
  {
    digitalWrite(2, HIGH);
  }
  else
  {
    digitalWrite(2, LOW);  
  }
 
  delay(200);  
}
