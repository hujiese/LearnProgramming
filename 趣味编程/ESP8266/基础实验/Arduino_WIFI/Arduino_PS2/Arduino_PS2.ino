#define PIN_X 0  
#define PIN_Y 1

int value; 
char flagY = 'S';
char flagY_p = 'S';
char flagX = 'S';
char flagX_p = 'S';

void setup()
{
  Serial.begin(9600); 
  pinMode(PIN_X, INPUT);
  pinMode(PIN_Y, INPUT);
}

void loop()
{
  value = analogRead(PIN_X); 
  flagX_p = flagX;
  if(value < 200)
  {
    flagX = 'L';//turn left
  }
  else if(value >800)
  {
    flagX = 'R';//turn right  
  }
  else
  {
    flagX = 'S';// stop  
  } 
  if(flagX != flagX_p)
  {
    Serial.print(flagX); 
  }
 
  value = analogRead(PIN_Y); 
  flagY_p = flagY;
  if(value < 200)
  {
    flagY = 'F';//forward
  }
  else if(value >800)
  {
    flagY = 'B'; //back 
  }
  else
  {
    flagY = 'S'; //stop 
  }
  if(flagY != flagY_p)
  {
    Serial.print(flagY); 
  }
}
