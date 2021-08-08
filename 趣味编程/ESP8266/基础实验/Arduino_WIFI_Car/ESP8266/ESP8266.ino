//esp8266作为软AP热点使用
#include <ESP8266WiFi.h>

IPAddress local_IP(192,168,8,20);
IPAddress gateway(192,168,8,1);
IPAddress subnet(255,255,255,0);

WiFiServer server(80);

void forward()
{
  digitalWrite(2, HIGH);
  digitalWrite(13, LOW);
  digitalWrite(4, HIGH);
  digitalWrite(5, LOW);
}

void back()
{
  digitalWrite(2, LOW);
  digitalWrite(13, HIGH);
  digitalWrite(4, LOW);
  digitalWrite(5, HIGH);
}

void stop()
{
  digitalWrite(2, LOW);
  digitalWrite(13, LOW);
  digitalWrite(4, LOW);
  digitalWrite(5, LOW);
}

void turn_left()
{
  digitalWrite(2, HIGH);
  digitalWrite(13, LOW);
  digitalWrite(4, LOW);
  digitalWrite(5, HIGH);
}

void turn_right()
{
  digitalWrite(2, LOW);
  digitalWrite(13, HIGH);
  digitalWrite(4, HIGH);
  digitalWrite(5, LOW);
}

void setup()
{
  pinMode(2, OUTPUT);
  pinMode(13, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  
  Serial.begin(9600);
  Serial.println();

  Serial.print("Setting soft-AP configuration ... ");
  Serial.println(WiFi.softAPConfig(local_IP, gateway, subnet) ? "Ready" : "Failed!");
  
  Serial.print("Setting soft-AP ... ");
  boolean result = WiFi.softAP("father", "myfather");
  if(result == true)
  {
    Serial.println("Ready");
  }
  else
  {
    Serial.println("Failed!");
  }

  Serial.print("Soft-AP IP address = ");
  Serial.println(WiFi.softAPIP());

    // 启动服务端
  server.begin();
}

void loop()
{
    // 等待客户端连接
  WiFiClient client = server.available();
  if (client)
  {
    Serial.println("\n[Client connected]");
    // 如果客户端连接
    while (client.connected())
    {
      // 如果客户端发送过来数据
      if (client.available())
      {
        String line = client.readStringUntil('\n');
        Serial.println(line);
        switch(line[0])
        {
          case 'S': // 收到S，停止
            stop();
            break;
          case 'L':// 收到L，左转
            turn_left();
            break;
          case 'R': // 收到R，右转
            turn_right();
            break;
          case 'F': // 收到F，前进
            forward();
            break;
          case 'B': // 收到B，后退
            back();
            break;
          default:
            stop();
            break;
        }
      }
    }
    delay(1); 

    // 断开连接
    client.stop();
    Serial.println("[Client disonnected]");
  }
}
