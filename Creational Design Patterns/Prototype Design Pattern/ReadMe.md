# Prototype Design Pattern

## Problem

- Birçok değişkene sahip constructor metoddan nesne üretmek bazen zor olabilir bu durumda yeni nesne üretmek yerine nesneyi kopyalamak daha mantıklı olur.

- Bir nesneyi kopyalamak istediğimizde o nesneyi tüm alanları ile birbikte kopyalama imkanı olmayabilir.

- Ayrıca nesne kopyalarken, kopyalayacağımız nesnenin hangi class'a ait olduğunu bilmek gerekir. Bu da sınıfa bağımlı olmamıza neden olur.

## Çözüm

- Prototype design pattern, klonlama işlemini klonlanan gerçek nesnelere devreder. Kalıp, klonlamayı destekleyen tüm nesneler için ortak bir arayüz bildirir.
Bu arayüz, kodunuzu o nesnenin sınıfına bağlamadan bir nesneyi klonlamanızı sağlar. Genellikle, böyle bir arayüz sadece tek bir klonlama yöntemi içerir.

- Prototype tek başına kod karmaşıklığına sebeb olmaktadır. Bu yüzden factory design pattern ve prototype design pattern beraber kullanılabilir.
