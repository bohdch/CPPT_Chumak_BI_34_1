# gasmask_package/gas_mask.py

class GasMask:
    """Базовий клас, що представляє загальний протигаз."""

    def __init__(self, model: str, filter_type: str, weight: float):
        """
        Ініціалізує протигаз з моделлю, типом фільтра та вагою.

        Аргументи:
            model (str): Модель протигаза.
            filter_type (str): Тип використовуваного фільтра.
            weight (float): Вага протигаза в кг.
        """
        self.model = model
        self.filter_type = filter_type
        self.weight = weight

    def provide_protection(self):
        """Симулює захисну функцію протигаза."""
        return f"Протигаз {self.model} з фільтром {self.filter_type} забезпечує захист."

    def set_filter_type(self, new_filter_type: str):
        """Оновлює тип фільтра протигаза."""
        self.filter_type = new_filter_type
        return f"Фільтр змінено на {new_filter_type}"

    def set_weight(self, new_weight: float):
        """Оновлює вагу протигаза."""
        self.weight = new_weight
        return f"Вага протигаза змінена на {new_weight} кг"

    def __str__(self):
        return f"Модель протигаза: {self.model}, Фільтр: {self.filter_type}, Вага: {self.weight} кг"
