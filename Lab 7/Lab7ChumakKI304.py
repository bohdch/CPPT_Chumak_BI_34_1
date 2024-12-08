# Модуль для створення та відображення зубчастого списку на основі введених даних

def generate_jagged_list(matrix_size, fill_char):
    # Ініціалізація порожньої матриці
    matrix = []
    
    # Заповнення лише заштрихованих областей у нижньому лівому трикутнику
    for i in range(matrix_size):
        row = []
        for j in range(matrix_size):
            if j <= matrix_size - i - 1:  # Заповнення нижнього лівого трикутника
                row.append(fill_char)
            else:
                row.append(" ")  # Порожній простір для незаштрихованих областей
        matrix.append(row)
    
    return matrix

def display_matrix(matrix):
    # Виведення матриці в консоль з пробілами між символами
    for row in matrix:
        print(" ".join(row).rstrip())

def save_matrix_to_file(matrix, filename="output.txt"):
    # Запис матриці у файл з пробілами між кожним символом
    with open(filename, "w") as file:
        for row in matrix:
            file.write(" ".join(row).rstrip() + "\n")
    print(f"Матриця збережена у файл {filename}")

def main():
    # Запит розміру матриці у користувача
    try:
        matrix_size = int(input("Введіть розмір квадратної матриці: "))
        if matrix_size <= 0:
            raise ValueError("Розмір матриці повинен бути додатнім числом.")
    except ValueError as e:
        print("Невірне значення для розміру матриці:", e)
        return

    # Запит символу-заповнювача у користувача
    fill_char = input("Введіть один символ для заповнення заштрихованої області: ")
    if len(fill_char) != 1:
        print("Невірне значення: Введіть лише один символ.")
        return

    # Генерація зубчастого списку
    matrix = generate_jagged_list(matrix_size, fill_char)
    
    # Виведення матриці в консоль
    display_matrix(matrix)
    
    # Збереження матриці у файл
    save_matrix_to_file(matrix)

# Запуск головної функції
if __name__ == "__main__":
    main()
