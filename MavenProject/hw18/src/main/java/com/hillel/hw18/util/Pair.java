package com.hillel.hw18.util;

// Pair class
public class Pair<U, V>
{
    public final U first;       // первое поле пары
    public final V second;      // второе поле пары

    // Создает новую пару с указанными значениями
    public Pair(U first, V second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    // Проверяет, является ли указанный объект "равным" текущему объекту или нет
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) o;

        // вызвать метод equals() базовых объектов
        if (!first.equals(pair.first)) {
            return false;
        }
        return second.equals(pair.second);
    }

    @Override
    // Вычисляет хеш-код для объекта для поддержки хеш-таблиц
    public int hashCode()
    {
        // используем хеш-коды базовых объектов
        return 31 * first.hashCode() + second.hashCode();
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    // Фабричный метод для создания неизменяемого экземпляра типизированной пары
    public static <U, V> Pair <U, V> of(U a, V b)
    {
        // вызывает приватный конструктор
        return new Pair<>(a, b);
    }
}