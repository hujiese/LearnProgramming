#include <Arduino.h>

#include <ESP8266WiFi.h>
#include <ESP8266HTTPClient.h>
#include <WiFiClient.h>

//ESP8266WiFiMulti WiFiMulti;
const char* ssid = "father";
const char* password = "myfather";

void setup() {
  Serial.begin(9600);
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

void loop() {
    WiFiClient client;

    HTTPClient http;

    Serial.print("[HTTP] begin...\n");
    if (http.begin(client, "http://www.example.com/")) {  // HTTP
      Serial.print("[HTTP] GET...\n");
      // 获取请求方式
      int httpCode = http.GET();
      // 获取返回码
      if (httpCode > 0) {
        Serial.printf("[HTTP] GET... code: %d\n", httpCode);
        // 返回码没有问题
        if (httpCode == HTTP_CODE_OK || httpCode == HTTP_CODE_MOVED_PERMANENTLY) {
          // 获取返回内容并打印
          String payload = http.getString();
          Serial.println(payload);
        }
      } else {
        Serial.printf("[HTTP] GET... failed, error: %s\n", http.errorToString(httpCode).c_str());
      }

      http.end();
    } else {
      Serial.printf("[HTTP} Unable to connect\n");
    }

  delay(5000);
}
