# Template Design Pattern

Template deseni, üst sınıfta bir algoritmanın iskeletini tanımlayan ancak alt sınıfların algoritmanın yapısını değiştirmeden belirli adımlarını geçersiz kılmasına izin veren davranışsal bir tasarım modelidir.

## Problem

- Bir algoritmanın bazı adımlarının değiştirilebilir bazı adımları ise değiştirilemez olması gerekebilir.
- Bir veri işleme uygulamamız olsun bu uygulama bir çok farklı dosyayı kullanarak içindeki verileri işliyor olsun. Bu uygulama veri formatlarıyla uğraşma dışındaki, veri işleme , analiz gibi işlemler bütün sınıflarda aynı olur.

## Çözüm

- Template deseni, bir algoritmayı bir dizi adıma ayırmanızı, bu adımları metodlara dönüştürmenizi ve bu metodlara yapılan bir dizi çağrıyı tek bir şablon yöntemin içine yerleştirmenizi önerir.
