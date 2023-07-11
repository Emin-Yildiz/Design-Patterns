# Adapter Design Pattern

## Problem

- Elimizde xml formatındaki veriler ile iş yapabilen bir uygulama olduğunu var sayalım. JSON formatında bir veri ile çalışmak istediğimizde uygulama çalışmaz.
Ya gelen verinin formatını xml'e dönüştürmek gerekir. Ya da uygulamamıza JSON türünce veri ile çalışacak şekilde güncellenir.

## Çözüm

- Adapter tasarım deseni, uyumsuz arayüzlere sahip iki sınıfın veya bileşenin bir araya getirilmesini sağlar.
Bu desen, bir sınıfın arayüzünü, diğer sınıfın beklediği arayüz şekline dönüştürür.
Böylece, uyumsuzluğu giderir ve iki bileşenin işbirliği yapmasını sağlar.
- Adapter, bir adaptasyon katmanı oluşturarak istemci kodunun uyumsuz bileşenle iletişim kurmasını kolaylaştırır.
