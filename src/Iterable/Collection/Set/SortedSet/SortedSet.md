SortedSet - дополняет Set. Сортирует элементы по их значению. В естественном виде или описанном в компораторе.
Пример:
```
    // Создание SortedSet с использованием пользовательского компаратора
    SortedSet<Integer> sortedSet = new TreeSet<>(Comporator.reverseOrder());

    // Добавление элементов
    sortedSet.add(5);
    sortedSet.add(2);
    sortedSet.add(8);

    // Вывод элементов в обратном порядке
    for (int num : sortedSet) {
        System.out.println(num); 8, 5, 2
    }
```