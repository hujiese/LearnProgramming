////发射端程序
// 
//#include <SPI.h>
//#include <Mirf.h>
//#include <nRF24L01.h>
//#include <MirfHardwareSpiDriver.h>
//
//#define PIN_X 0  
//#define PIN_Y 1
//
//int value; 
//char flagY = 'S';
//char flagY_p = 'S';
//char flagX = 'S';
//char flagX_p = 'S';
//
//void sendMsg(int value)
//{
//  Mirf.setTADDR((byte *)"FGHIJ");           //设置接收端地址
//  Mirf.send((byte *)&value);                //发送指令，发送随机数value
//  while(Mirf.isSending()) delay(1);         //直到发送成功，退出循环
//}
//
//void setup()
//{
//  pinMode(PIN_X, INPUT);
//  pinMode(PIN_Y, INPUT);
//  
//  Mirf.spi = &MirfHardwareSpi;
//  Mirf.init();
//  Mirf.setRADDR((byte *)"ABCDE"); //设置自己的地址（发送端地址），使用5个字符
//  Mirf.payload = sizeof(value);
//  Mirf.channel = 90;              //设置所用信道
//  Mirf.config();
//}
//
//void loop()
//{
//  value = analogRead(PIN_X); 
//  flagX_p = flagX;
//  if(value < 200)
//  {
//    flagX = 'L';//turn left
//  }
//  else if(value >800)
//  {
//    flagX = 'R';//turn right  
//  }
//  else
//  {
//    flagX = 'S';// stop  
//  } 
//  if(flagX != flagX_p)
//  {
//     sendMsg(flagX); 
//  }
// 
//  value = analogRead(PIN_Y); 
//  flagY_p = flagY;
//  if(value < 200)
//  {
//    flagY = 'F';//forward
//  }
//  else if(value >800)
//  {
//    flagY = 'B'; //back 
//  }
//  else
//  {
//    flagY = 'S'; //stop 
//  }
//  if(flagY != flagY_p)
//  {
//     sendMsg(flagY);
//  }
//}

//接收端程序
 
#include <SPI.h>
#include <Mirf.h>
#include <nRF24L01.h>
#include <MirfHardwareSpiDriver.h>

int value;

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
//  Serial.begin(9600);
  
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  
  Mirf.spi = &MirfHardwareSpi;
  Mirf.init();
  Mirf.setRADDR((byte *)"FGHIJ"); //设置自己的地址（接收端地址），使用5个字符
  Mirf.payload = sizeof(value);   
  Mirf.channel = 90;   //设置使用的信道
  Mirf.config(); 
//  Serial.println("Listening...");  //开始监听接收到的数据
}
 
void loop()
{
  if(Mirf.dataReady()) {  //当接收到程序，便从串口输出接收到的数据
    Mirf.getData((byte *) &value);
//    Serial.print("Got data: ");
//    Serial.println((char)value);
    switch((char)value)
    {
      case 'S': // 收到S，停止
//        Serial.println("stop");
        stop();
        break;
      case 'L':// 收到L，左转
//        Serial.println("left");
        turn_left();
        break;
      case 'R': // 收到R，右转
//        Serial.println("right");
        turn_right();
        break;
      case 'F': // 收到F，前进
//        Serial.println("forward");
        forward();
        break;
      case 'B': // 收到B，后退
//        Serial.println("back");
        back();
        break;
      default:
//        Serial.println("others");
        stop();
        break;
    }
  }
}
