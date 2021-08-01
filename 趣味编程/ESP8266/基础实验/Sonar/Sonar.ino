int Echo = 4; // 定义超声波信号接收接口
int Trig = 5; // 定义超声波信号发出接口

void setup()
{
  Serial.begin(9600);
  pinMode(Echo, INPUT);
  pinMode(Trig, OUTPUT);
}
void loop()
{
  digitalWrite(Trig, LOW); // 使发出发出超声波信号接口低电平2μs
  delayMicroseconds(2);
  digitalWrite(Trig, HIGH); // 使发出发出超声波信号接口高电平10μs，这里是至少10μs
  delayMicroseconds(10);
  digitalWrite(Trig, LOW); // 保持发出超声波信号接口低电平
  int distance = pulseIn(Echo, HIGH); // 读出脉冲时间
  distance= distance/58; // 将脉冲时间转化为距离（单位：厘米）
  Serial.println(distance); //输出距离值
  delay(1500);
}
