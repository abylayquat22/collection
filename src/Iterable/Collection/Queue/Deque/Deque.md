Deque - наследуется от Queue.
Двунаправленная очередь. Можно добавить и удалить в начало и конец очереди.

Ключевые доп методы:
- addFirst(), addLast(), removeFirst(), removeLast(), 
- getFirst(), getLast() // не найден - исключение
- offerFirst(), offerLast(), pollFirst(), pollLast(), // возвращает true/false
- peekFirst(), peekLast() // не найден - null
- offer(), poll(), peek() - возвращают null

Примеры:
```
 Deque<Integer> queue = new LinkedList<>(); // в связанном списке
 Deque<Integer> queue = new ArrayDeque<>(); // в массиве
```