# Observer Design Pattern

Observer, bir nesnedeki değişimleri gözlemleyerek program içimdeki diğer nesnelere bu değişikliği bilgilendiren bir tasarım desenidir.

## Problem

- Bir mağaza müsterilere sürekli gelen ürünler hakkında mail gönderiyor olsun bu durum bazı müşterileri memnum ederken bazı müşterileri ise rahatsız edecektir. Mail göndermez ise müşteriler yeni gelen ürünler hakkında bilgilenmek için sürekli mağazaya uğramak zorunda kalacaklardır.
- Döviz uygulaması düşünelim bu uygulama dövizi sürekli olarak güncellemek zorundadır yoksa hesaplama hataları ortaya çıkabilir. Ancak bu durum performan sorunlarına neden olmaktadır.

## Çözüm

- Observer deseni, aralarında one-to-many ilişki bulunan ve nesneler arası bağımlılıkların söz konusu olduğu durumlarda, bağımlı nesnelerin bağlı olunan nesnenin durumuna göre güncellenebilmesi/haberdar olabilmesi amacı ile kullanılır.
- bağımlı olunan(takip edilen, abone olunan) nesne Subject; bağımlı olan(abone) nesne ise Observer olarak isimlendirilir.
