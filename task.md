# Задание 2. Singleton
Паттерн singleton реализован в классе TaskManager (https://github.com/avocadoU/patterns/blob/master/src/AppNotes/TaskManager.java)
Причины выбора:
  1) Будет гарантия, что будет один экземпляр этого класса, что упрощает управления задачами и исключает вероятность создания нескольких экземпляров, которые могут конфликтовать друг с другом.
  2) Singleton позволит легко получить доступ к информации из разных частей приложения без необходимости передавать экземпляр класса.
  3) Позволяет избежать избыточного использования ресурсов.
  4) Это делает код проще.
