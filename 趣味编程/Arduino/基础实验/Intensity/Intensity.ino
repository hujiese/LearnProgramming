#define AD5 A5   //定义模拟口A5
 
int Intensity = 0;//光照度数值
 
void setup()  //程序初始化
{
  Serial.begin(9600);//设置波特率9600
}
 
void loop()//程序主体循环
{
  Intensity = analogRead(AD5);  //读取模拟口AD5的值，存入Intensity变量
  Serial.print("Intensity = ");  //串口输出"Intensity = "
  Serial.println(Intensity);     //串口输出Intensity变量的值，并换行
  delay(2000);     //延时2000ms
}
