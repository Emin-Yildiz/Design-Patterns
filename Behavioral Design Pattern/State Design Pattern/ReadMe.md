# State Design Pattern

State, bir nesnenin iç durumu değiştiğinde davranışını değiştirmesini sağlayan davranışsal bir tasarım modelidir. Nesne başka bir sınıfa aitmiş gibi davranır.

## Problem

- Herhangi bir durumda, program farklı davranır ve program bir durumdan diğerine anında değiştirilebilir. Ancak, mevcut bir duruma bağlı olarak, program belirli diğer durumlara geçebilir veya geçmeyebilir. Geçişler olarak adlandırılan bu geçiş kuralları da sonlu ve önceden belirlenmiştir.
- Finite - State Machine problemine çözüm olarak geliştirilmiştir. Bu problem bir çok if - else if veya switch - case durumunun çok fazla karmaşık hale gelmesinden kaynaklı oluşur. Zamanla daha çok durum ortaya çıkar ve bu blokları büyütmek gerekir.

## Çözüm

- State deseni tüm olası durumlar için if - else if veya switch - case yapısı kullanmak yerine, class yapısını kullanmamızı önerir.
- State deseni'nin strategy deseninden farkı, state deseninde classlar birbirlerinden haberdar iken strategy deseninde cise durum tam tersidir.
