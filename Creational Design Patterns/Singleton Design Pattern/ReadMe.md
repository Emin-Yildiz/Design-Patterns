# Singleton Design Pattern

## Problem

- Nesne oluştururken bir nesne oluşturup o nesneyi heryerden erişmek hem kaynak avantajı sağlar hemde maliyeti azaltır.

- Bu yöntem genellikle veritabanı gibi tek bir nesne oluşturup erişim sağlamanın yeterli olduğu yerlerde kullanılır.

## Çözüm

- Constructor metod private hale getirilir bu sayede dışarıdan yeni bir nesne oluşturulmaz.
Class içine bir nesne oluşturulur ve bu nesneye ihtiyacı olan herkes erişebilir şekilde yapılandırılır.
