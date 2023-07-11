# Factory Design Pattern

Fabrika Yöntemi, bir üst sınıfta nesneler oluşturmak için bir arayüz sağlayan,
ancak alt sınıfların oluşturulacak nesnelerin türünü değiştirmesine izin veren bir yaratım tasarım modelidir.
Factory Design Pattern, nesne yaratma işlemi için bir arayüz tasarlanmasını gerektirir ve alt sınıfların nesne üretmesine olanak sağlar.

## Problem

- Bir uygulama yazarken bu uygulamayı tek bir ürün üzerinden yazmak hatalıdır. İleride uygulama üzerine başka ürünler eklenmek istediği zaman
bu yazdığımız program açısından sıkıntı yaratmaktadır. Koşullara gereğinden fazla bağlı ve sürekli olarak güncellemeye muhtaç metot tasarımı ortaya çıkar.

## Çözüm

- Uygulama üzerinde benzer yapıda nesne üretimi için ortak soyut bir class tanımlarız. Bu soyut class nesne üretirken geri döndüreceğimiz class'dır.

- Nesne oluştururken tek bir class üzerinden nesne oluşturulur.Bu class'a factory class denir. Factory class üzerinden geriye ise oluşturmak istediğimiz nesne türünde bir obje döner
