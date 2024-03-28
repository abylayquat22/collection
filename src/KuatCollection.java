//Iterator. Использовать при работе с потоками или не коллекция не поддерживает for each.
//Особенности:
//- Во время итерации обнаруживает изменения в коллекции. (for each нет)
//- Соблюдение контракта. hasNext(), next(), remove()
//
//Коллекции. (Динамические массивы)
//Iterable - базовый интерфейс. Используется для создания кастомных коллекции.

import java.util.Iterator;
import java.util.NoSuchElementException;

public class KuatCollection<T> implements Iterable<T> {

  private Object[] elements = new Object[2];
  private int size = 0;

  public KuatCollection() {

  }

  public void add(T element) {
    if (size == elements.length) {
      increaseCapacity();
    }
    elements[size++] = element;
  }

  private void increaseCapacity() {
    int newCapacity = elements.length * 2;
    Object[] newArray = new Object[newCapacity];
    System.arraycopy(elements, 0, newArray, 0, size);
    elements = newArray;
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private int currentIndex = 0;

      @Override
      public boolean hasNext() {
        return currentIndex < size;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T next() {
        if (hasNext()) {
          return (T) elements[currentIndex++];
        }
        throw new NoSuchElementException();
      }
    };
  }

}
