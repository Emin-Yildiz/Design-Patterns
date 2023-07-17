# Chain of Responsibility

Sorumluluk Zinciri, istekleri bir işleyici zinciri boyunca aktarmanıza olanak tanıyan davranışsal bir tasarım modelidir.
Bir istek alan her işleyici, isteği işleme koymaya ya da zincirdeki bir sonraki işleyiciye aktarmaya karar verir.

Chain of responsibility deseni, esnek ve basit bir şekilde istekleri işlemek için kullanılır.

Bir isteğin birden çok işleme alındığı durumlarda yaygın olarak kullanılır.

## Problem

- Bir sistem her istek geldiğinde istek kontrollerde geçer. Bu kontroller, her yeni özellik eklendikçe daha da karmaşık hale gelir.
- Bir kontrolü değiştirmek bazen diğer kontrolleri de etkiliyebilir.
- En kötüsü, sistemin diğer bileşenlerini korumak için kontrolleri yeniden kullanmaya çalıştığınızda, bu bileşenler diğer kontrollere bağımlı olabilir.

## Çözüm

- Chain of responsibility deseni, belirli kontrollerin birbirinden bağımsız nesneler olarak tasarlanmasına dayanır.
- Bu tasarım deseninde nesneler birbirleri ile zincir biçiminde bağlanabilir. Bu sayede zincirdeki halkalar istenildiği şekilde tasarlanabilir.
