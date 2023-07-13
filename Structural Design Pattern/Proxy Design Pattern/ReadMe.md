# Proxy Design Pattern

Proxy, başka bir nesne için bir yedek veya yer tutucu sağlamanıza olanak tanıyan yapısal bir tasarım modelidir.
Bir proxy, orjinal nesneye erişimi kontrol ederek, istek orijinal nesneye ulaşmadan önce veya sonra bir şey gerçekleştirmenize olanak tanır.

## Problem

- Bir nesnenin diğer tüm nesneler tarafından doğrudan erişilebilir olması problemleride beraberinde getirebilir.

- Bir nesne çok önemli bir görevi yerine getiriyor olabilir bu yüzden diğer nesnelerin bu nesneye erişebilmesi güvenlik açıklarına sebeb olur.
Ayrıca bu nesnenin görevini yerine getirmesi oldukça maliyetli olabilir.

## Çözüm

- Proxy modeli, orjinal nesneyle aynı arayüze sahip yeni bir proxy class'ı oluşturup, proxy nesnemizi orjinal nesnemizin tüm istemcilere iletecek şekilde güncelleriz.

- Proxy Design Pattern, bir nesneye olan erişimin kontrol altına alınması amacı ile kullanılır.
İstemcilerin direkt olarak ilgili nesneye ulaşması yerine bir vekil aracılığı ile (dolaylı olarak) nesneye ulaşmasını sağlar.
Vekil nesne, yalnızca gerekli durumlarda asıl nesne ile iletişime geçer ve ilgili işlemler gerçekleştirilir.

- Bu tarz durumlarda eğer bir engel oluşturmuyorsa singleton design pattern'de kullanılabilir.
