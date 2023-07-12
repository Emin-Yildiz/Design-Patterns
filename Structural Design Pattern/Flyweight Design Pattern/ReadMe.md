# Flyweight Design Pattern

Flyweight, tüm verileri her bir nesnede tutmak yerine ortak durum parçalarını birden fazla nesne arasında paylaşarak
mevcut RAM miktarına daha fazla nesne sığdırmanızı sağlayan yapısal bir tasarım modelidir.

## Problem

- Uygulamamızda bulunan her bir nesneyi ram'de tutarız.
Eğer programımızı dikkatsiz dağınık bir şekilde yazarsak bir süre sonra bu nesneler ramde her yeri kaplar ve program çöker.

- Örnek verecek olursak bir bilgisayar oyunundaki mermiler oyunda ilerledikçe mermi sayısı artar ve bir süre sonra bellekte yer kalmaz ve program çöker.

## Çözüm

- Bir nesnenin sabit verisi içsel durum(Intrinsic State), değişken verisi ise dışsal durum(Extrinsic State) denir.

- Flyweight modeli, dışsal durumu nesnenin içinde saklamayı bırakmanızı önerir.
Bunun yerine, bu durumu ona bağlı olan belirli yöntemlere aktarmalısınız. Yalnızca içsel durum nesne içinde kalır ve farklı bağlamlarda yeniden kullanmanıza izin verir.
Sonuç olarak, dışsal durumdan çok daha az varyasyona sahip olan içsel durum açısından farklılık gösterdikleri için bu nesnelerden daha azına ihtiyacınız olacaktır.

- Flyweight Design Pattern, benzer nesnelere ihtiyaç duyulması durumunda yeni nesneler oluşturmaktansa var olan nesnelerin birbirleri yerine geçebilmelerini sağlamak amacı ile kullanılır.
Sürekli yeni alanlara ihtiyaç duymaktansa ortak bir bellek alanı üzerinde gerekli işlemleri gerçekleştirmeyi hedefler.
Özellikle yüksek nesne ihtiyacı olan durumlarda sıklıkla kullanılır.
