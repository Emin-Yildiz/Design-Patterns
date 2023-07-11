# Builder Design Pattern

## Problem

- Builder Design Pattern birden fazla constructor kullanımının gerekli olduğu durumlarda hem hatasız hemde daha kolay nesne üretimini sağlar.

- Bir class'da çok fazla alan olması constructor metodları çok karışık hale getirir. Çünkü bazı alanlar zorunluyken bazı alanlar zorunlu olmayabilir.
Bu durumda bu class'da nesne oluştururken çok fazla constructor tanımlaması yapılır bu da karışıklığa neden olur.

## Çözüm

- Builder class oluşturarak constructor yerine geçen metodlar tanımlanır.

- Bu metodlar istenilen parametre ve isimde olabileceği için overload hatalarının önüne geçebiliyoruz.

- Bu yöntem sayesinde arka planda çalışan algoritmaları bilmeden ve new anahtar kelimesini kullanmadan nesne oluşturma işlemi gerçekleştirildi.
