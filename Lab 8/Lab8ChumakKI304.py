import math
import struct

def calculate_expression(x):
    """
    Обчислює значення виразу y = sin(x) / (x + tan(x)) для заданого значення x.
    
    Параметри:
        x (float): Значення змінної x.
        
    Повертає:
        float: Результат обчислення виразу.
    """
    try:
        numerator = math.sin(x)
        denominator = x + math.tan(x)

        # Перевірка на ділення на нуль або дуже близьке до нуля
        if abs(denominator) < 1e-10:
            raise ZeroDivisionError("Ділення на нуль або дуже близьке до нуля.")

        # Обчислюю і повертаю результат
        return numerator / denominator
    except ZeroDivisionError as e:
        print(f"Помилка: {e}")
        return None

# Функція для запису результату в текстовий файл
def write_to_text_file(result, filename):
    with open(filename, 'w') as file:
        file.write(str(result))

# Функція для читання результату з текстового файлу
def read_from_text_file(filename):
    with open(filename, 'r') as file:
        result = float(file.read())
    return result

# Функція для запису результату в бінарний файл
def write_to_binary_file(result, filename):
    with open(filename, 'wb') as file:
        packed_result = struct.pack('d', result)  # Упаковую результат в бінарний формат
        file.write(packed_result)

# Функція для читання результату з бінарного файлу
def read_from_binary_file(filename):
    with open(filename, 'rb') as file:
        packed_result = file.read(struct.calcsize('d'))  # Зчитую упакований бінарний результат
        result = struct.unpack('d', packed_result)[0]  # Розпаковую бінарний результат
    return result

if __name__ == "__main__":
    x = float(input("Введіть значення x: "))

    # Розраховую вираз для заданого x
    result = calculate_expression(x)
    
    if result is not None:
        # Записую результат в текстовий файл
        write_to_text_file(result, 'result.txt')
        print("Результат записано у файл result.txt")

        # Записую результат в бінарний файл
        write_to_binary_file(result, 'result.dat')
        print("Результат записано у файл result.dat")

        # Зчитую результат з текстового файлу і виводимо його
        text_result = read_from_text_file('result.txt')
        print("Результат із текстового файлу:", text_result)

        # Зчитую результат з бінарного файлу і виводимо його
        binary_result = read_from_binary_file('result.dat')
        print("Результат із бінарного файлу:", binary_result)
