# Visitor Design Pattern

Visitor deseni, algoritmaları üzerinde çalıştıkları nesnelerden ayırmanızı sağlayan davranışsal bir tasarım modelidir.

## Problem

- Bir uygulamada geliştirmeler oldukça yeni özellikler eklenmeye başlandıkça bir çok alt sınıf eklenir. Bu durum uygulamanın esnekliğini, okunabilinirliği, bakımı zor hale gelir.

## Çözüm

- Nesne üzerindeki işlemleri gerçekleştirmek için ayrı bir visitor class'ı yazılır.
- Yapının her bir elemanına visitor sınıfını kabul eden bir fonksiyon eklememiz gerekecek. Bu şekilde bileşenlerimiz, ziyaretçi uygulamasının onları "ziyaret etmesine" ve o öğe üzerinde gerekli herhangi bir eylemi gerçekleştirmesine izin verecektir.
