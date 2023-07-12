# Facade Design Pattern

## Problem

- İstemci tarafında karmaşık işler ile uğraşmak hatalara neden olabilmektedir.
Proje büyüdükçe daha çok class ve metod, işin içine girdikçe bazı hatalar gözden kaçabilir ve uygulamanın düzgün çalışmamasına neden olabilir.

## Çözüm

- Facade Design Pattern, karmaşık alt sistemler ile istemci arasındaki iletişimin doğru ve basit olması amacı ile kullanılır.
İstemcinin alt sistemlerin detayları ile ilgilenmesindense mümkünse yalnızca bir veya birkaç arayüz ile iletişim kurmasını hedefler.

- Bu tasarım deseninde temel mantık karmaşık alt sistemlerin birleşip bir sistem tarafından kullanılabilmesi.
