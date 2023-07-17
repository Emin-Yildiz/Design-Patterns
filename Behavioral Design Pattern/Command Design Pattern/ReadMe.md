# Command Design Pattern

Command design pattern, bir istek/komutu, bir yöntemi çağıracak ve parametreler gibi gerekli tüm verileri kapsülleyecek bir nesneye dönüştürmek için kullanılır.
Bu, isteklerin ve eylemlerin daha esnek ve soyut bir şekilde temsil edilmesini sağlar.

## Problem

- İstemcinin bir işlem yapacağı zaman bu işlemin hem ne yapıldığından hem de nasıl yapıldığından habersiz karşılayabilmesi gerekmektedir.
- Örneğin, istemci yalnızca “Yap” demeli ve eldeki veriler en uygun algoritma ile sıralanmalıdır.
- Aslında istemci “Yap” dediğinde elindeki verilerin sıralanacağını mı yoksa silineceğini mi yoksa başka bir şey mi olacağını bilemez.

## Çözüm

- Command design pattern bir istek atıldığı zaman bu isteğin direkt olarak atılmaması gerektiğini belirtir.

- İstek atan nesne ile istek alan nesne arasında bu isteği ileten ayrı bir nesne ile istek atarsak hem alıcı hemde verici nesneler kendi görevleri ile ilgilenmiş olurlar
ve birbirlerine olan bağımlılığı ortadan kalmış olur.

- İstemci sadece bir metod üzerinden istek atar bu metod "execute()" olarak adlandırılır.
