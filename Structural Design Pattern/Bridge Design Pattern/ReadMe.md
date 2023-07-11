# Bridge Design Pattern

Bridge design pattern birbirine bağımlı olan class'ları birbirinden bağımsız hale getirir.

## Problem

- İki farklı yapı birbirine bağımlı olduğunda, bu yapılara özellik eklemek istediğimiz zaman bir çok subclass yazmak durumda kalırız.
Bu kodun esnekliğini, genişletirilebilirliğini ve değiştirilebilinirliğini bozar.

## Çözüm

- Bridge desing bu sorunu kalıtımı, nesne bileşimine geçerek çözmeye çalışır.

- Birbirine bağlı yapıları farklı hiyearşiler olarak yazdığımız zaman, bir yapıya özellik eklediğimizde diğer yapı bu değişiklikten etkilenmeyecektir.
