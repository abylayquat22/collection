Queue - наследуется от Collection. 
Принципом "первым пришел - первым ушел" (First-In-First-Out, FIFO)


Ключевые доп методы:
- add(), remove(), element() - выбрасывают исключение
- offer(), poll(), peek() - возвращают null

Пример:
```
1) Queue<String> queue = new LinkedList() // без приоритетов и ограничений в очереди
2) Queue<Integer> queue = new ArrayBlockingQueue<>(5); // ограниченная очередь
```
```
3) PriorityQueue<Task> queue = new PriorityQueue<>(); // очередь по приоритетам
   - priorityQueue.add(new Task("Task 1", 3));
   -------------------------------------------------
public class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}
```