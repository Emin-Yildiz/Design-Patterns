# Decorator Design Pattern

Decorator design pattern, davranışları içeren özel sarmalayıcı nesnelerin içine bu nesneleri yerleştirerek nesnelere yeni davranışlar eklemenizi sağlayan yapısal bir tasarım modelidir.

## Problem

- Bir class'a özellik eklediğimiz zaman bir çok alt sınıf oluşturmamız gerekebilir. Uygulama bu durumda işin içinden çıkamayacak kadar karmaşık bir hal alır.

## Çözüm

- Decorator Design Pattern, nesnelerin farklı kombinasyonlar ile farklı özelliklere sahip olabilmesini (karmaşıklıktan uzak bir şekilde) sağlamak amacı ile kullanılır.
- Bunu yapmak için farklı sınıfların oluşturulmasındansa her bir özellik için bir sınıf tanımlayarak, var olan nesnenin üzerine
bu sınıf özelliklerini ekleyerek yeni nesne oluşturulmasını sağlar.
