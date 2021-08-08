#include <ESP8266WiFi.h>

const char* ssid = "father";
const char* password = "myfather";

// 服务端IP地址
const char* host = "192.168.137.87";

void setup()
{
  Serial.begin(9600);
  Serial.println();

  Serial.printf("Connecting to %s ", ssid);
  // 连接WIFI热点
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED)
  {
    delay(500);
    Serial.print(".");
  }
  Serial.println(" connected");
}


void loop()
{
  // 定义一个客户端
  WiFiClient client;

  Serial.printf("\n[Connecting to %s ... ", host);
  // 客户端连接服务器，IP:PORT
  if (client.connect(host, 80))
  {
    Serial.println("connected]");

    Serial.println("[Sending a request]");
    // 发送ping字符串给服务器
    client.println("ping");

    Serial.println("[Response:]");
    // 如果客户端连接成功
    while (client.connected())
    {
      // 如果客户端收到服务端发来数据
      if (client.available())
      {
        // 读取一行数据
        String line = client.readStringUntil('\n');
        Serial.println(line);
        // 延时5s后发送ping给服务端，这个过程是循环的
        delay(5000);
        client.println("ping");
      }
    }
    client.stop();
    Serial.println("\n[Disconnected]");
  }
  else
  {
    Serial.println("connection failed!]");
    client.stop();
  }
  delay(5000);
}
