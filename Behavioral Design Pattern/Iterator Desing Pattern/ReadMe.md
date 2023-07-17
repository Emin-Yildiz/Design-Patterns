# Iterator Design Pattern

Iterator, bir koleksiyonun temel temsilini (list, stack, tree, ...) açığa çıkarmadan koleksiyonun öğeleri arasında geçiş yapmanızı sağlayan davranışsal bir tasarım modelidir.

## Problem

- Çoğu koleksiyon yapısı basit liste yapıları kullansada ağaç gibi karmaşık veri yapısı kullanan koleksiyon veri yapılarıda bulunmaktadır.
- Ancak uygulama içerisinde koleksiyon yapısı içerisinde bulunan ögelere erişmek her zaman kolay değildir.

## Çözüm

- Iterator Design Pattern, koleksiyonlardaki elemanlar üzerinde gezinebilme ve dolayısıyla istenilen eleman, bilgi veya sonuca ulaşabilme amacı ile kullanılır.
- Iterator tasarım deseninin amacı, koleksiyonun türünden bağımsız olarak elemanlara erişimi sağlamak ve işlemek için standart bir arayüz sağlamaktır.
