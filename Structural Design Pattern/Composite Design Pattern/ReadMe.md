# Composite Design Pattern

Composite, nesneleri ağaç yapıları halinde oluşturmanızı ve daha sonra bu yapılarla tek tek nesnelermiş gibi çalışmanızı sağlayan yapısal bir tasarım modelidir.

## Problem

- Bir işi yapmanın bir çok yolu vardır. Bir iş tek seferde yapılabilirken, parça parça halinde de yapılabilir.
İşi tek seferde hemen halletmek daha basit ve tasarruflu bir yöntemdir.

- Ancak bir işi tek seferde halletmek bir programda basit bir şey değildir.

## Çözüm

- Composite Design Pattern, bileşik nesne ve parçaları ile istemci arasındaki ilişkiyi karmaşıklıktan uzak bir şekilde yönetmek amacı ile kullanılır.
İstemcinin bileşik nesnedeki tüm parçalar ile tek tek uğraşmasındansa yalnızca bileşik nesne ile uğraşmasını ve böylece parçalara da ulaşabilmesini hedefler.

- Bilgisayarda bu problemin çözümü için ağaç yapısı kullanılır.
