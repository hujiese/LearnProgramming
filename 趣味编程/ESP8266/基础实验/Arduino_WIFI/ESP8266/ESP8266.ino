//esp8266作为软AP热点使用
#include <ESP8266WiFi.h>

IPAddress local_IP(192,168,8,20);
IPAddress gateway(192,168,8,1);
IPAddress subnet(255,255,255,0);

WiFiServer server(80);

void setup()
{
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
      }
    }
    delay(1); 

    // 断开连接
    client.stop();
    Serial.println("[Client disonnected]");
  }
}
