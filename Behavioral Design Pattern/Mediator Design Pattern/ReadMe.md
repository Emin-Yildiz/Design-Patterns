# Mediator Design Pattern

Mediator nesneler arasındaki olan bağımlılıkları azaltmayı amaçlayan bir tasarım desenidir.
Desen nesneler arasındaki iletişimi kısıtlar ve yanlızca bir ara nesne aracılığı ile işlem yapmayı sağlar.

## Problem

- Uygulama içerisinde bir butıonumuz olduğunu varsayalım. Bu butuna basılığı zaman bir alan daha ortaya çıkmaktadır. Bu alan butonun içinde yazıldığı zaman butonun tekrar kullanılabilirliği ortadan kalkmaktadır.

## Çözüm

- Uygulama içerisinde kullanılacak bir yapı (buton, ...) bütün bağımlı olduğu özelliklerinden ayrılır ve sadece bir görevi olur.
- Mesela bir butona basıldığında belirli kontrolleri yapmak ve göndermek yerine, kontrolleri yapmak ayrı bir class'ın görevi olacak şekilde yazılmalıdır.
