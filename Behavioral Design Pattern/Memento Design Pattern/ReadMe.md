# Memento Design Pattern

Memento bir nesnenin geçmişteki durumlarını kaydetmeye ve bu geçmişe geri dönmeye olanak sağlayan bir tasarım desenidir.

## Problem

- Değiştirilmiş bir nesneyi eski haline geri döndermeye çalıştığımızda, nesnenin bazı özel alanları olabilir. Bu alanları erişme imkanımız olmadığı için nesneyi eski haline getirmek oldukça zor olacaktır.
- Nesnenin bütün alanlarının erişilebilir olduğunu varsaysak bile uygulama içerisinde bazı sınıfların yeniden düzenlemeye karar verebiliriz Bu durum aynı zamanda etkilenen nesnelerin durumunu kopyalamaktan sorumlu sınıfları da değiştirmeyi gerektirecektir.

## Çözüm

- Yukarıdaki açıklanan problemler encapsulation'un bozulmasından kaynaklıdır.
- Memento modeli, anlık görüntülerinin oluşturulmasını o durumun gerçek sahibi olan kaynak nesneye devreder. Dolayısıyla, editörün durumunu "dışarıdan" kopyalamaya çalışan diğer nesneler yerine, editör sınıfının kendisi kendi durumuna tam erişime sahip olduğu için anlık görüntüyü oluşturabilir. LIFO veri yapısı kullanılır.
