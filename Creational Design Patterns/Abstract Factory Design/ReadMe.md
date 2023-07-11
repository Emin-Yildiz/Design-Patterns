# Abstract Factory Design

- Soyut Fabrika, somut sınıflarını belirtmeden birbiriyle ilişkili nesne aileleri üretmenizi sağlayan bir tasarım modelidir.

- Abstract Factory yapısında ise benzer nesne üretimlerini gerçekleştirebilmek adına her nesne için ayrı bir fabrika sınıfı oluşturmamız gerekmektedir.

## Problem

- Factory design pattern ile benzerdir ancak factory design patternde bulunan if/else if... problemine çözüm getirir.

## Çözüm

- Abstract Factory Desing Pattern yapısında, benzer nesnelerin üretimi için her nesneye ait bir fabrika oluşturulur.
- Bu fabrika sınıflar ise soyut bir ana fabrika sınıfından türer.
