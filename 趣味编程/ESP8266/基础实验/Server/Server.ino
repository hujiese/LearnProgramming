#include <ESP8266WiFi.h>

const char* ssid = "father";
const char* password = "myfather";

WiFiServer server(80);


void setup()
{
  Serial.begin(9600);
  Serial.println();

  Serial.printf("Connecting to %s ", ssid);
  // 连接wifi热点
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED)
  {
    delay(500);
    Serial.print(".");
  }
  Serial.println(" connected");

  // 启动服务端
  server.begin();
  Serial.printf("Web server started, IP Address is %s \n", WiFi.localIP().toString().c_str());
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
        client.println("pong");
      }
    }
    delay(1); 

    // 断开连接
    client.stop();
    Serial.println("[Client disonnected]");
  }
}
