# Написать скрипт для расчета корреляции Пирсона между
# двумя случайными величинами (двумя массивами). Можете
# использовать любую парадигму, но рекомендую использовать
# функциональную
#
from math import sqrt
from statistics import mean


def pearson_correlation(x, y):
    # Проверяем, что оба массива имеют одинаковую длину
    if len(x) != len(y):
        raise ValueError("Массивы должны иметь одинаковую длину")

    n = len(x)

    # Вычисляем средние значения для обоих массивов
    mean_x = mean(x)
    mean_y = mean(y)

    # Вычисляем числитель и знаменатель для корреляции Пирсона
    numerator = sum((x[i] - mean_x) * (y[i] - mean_y) for i in range(n))
    denominator_x = sqrt(sum((x[i] - mean_x) ** 2 for i in range(n)))
    denominator_y = sqrt(sum((y[i] - mean_y) ** 2 for i in range(n)))

    # Вычисляем корреляцию Пирсона
    correlation = numerator / (denominator_x * denominator_y)

    return correlation


# Пример использования
if __name__ == "__main__":
    x = [1, 2, 3, 4, 5]
    y = [1, 3, 4, 9, 6]

    correlation = pearson_correlation(x, y)
    print(f"Корреляция Пирсона: {correlation}")