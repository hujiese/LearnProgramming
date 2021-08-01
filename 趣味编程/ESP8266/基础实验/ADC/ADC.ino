void setup() {
   // 初始化串行通信速率为9600bit/s：
   Serial.begin(9600);
}

void loop() {
   // 读取模拟引脚A0的输入数据
   int sensorValue = analogRead(A0);
   // 将模拟信号转换成电压
   float voltage = sensorValue * (3.3 / 1023.0);
   // 打印到串口监视器
   Serial.println(voltage);
   delay(1000);
}
