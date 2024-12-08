# gasmask_package/commander_gas_mask.py

from .gas_mask import GasMask

class CommanderGasMask(GasMask):
    """Похідний клас, що представляє командирський протигаз з додатковими функціями."""

    def __init__(self, model: str, filter_type: str, weight: float, communication_device: bool):
        """
        Ініціалізує командирський протигаз з додатковими функціями.

        Аргументи:
            model (str): Модель протигаза.
            filter_type (str): Тип використовуваного фільтра.
            weight (float): Вага протигаза в кг.
            communication_device (bool): Наявність пристрою зв'язку.
        """
        super().__init__(model, filter_type, weight)
        self.communication_device = communication_device

    def provide_command_capability(self):
        """Симулює можливість комунікації через командирський протигаз."""
        if self.communication_device:
            return "Командирський протигаз оснащений пристроєм зв'язку для координації."
        else:
            return "Командирський протигаз не оснащений пристроєм зв'язку."

    def toggle_communication_device(self):
        """Перемикає стан пристрою зв'язку."""
        self.communication_device = not self.communication_device
        state = "увімкнений" if self.communication_device else "вимкнений"
        return f"Пристрій зв'язку тепер {state}"

    def __str__(self):      
        base_info = super().__str__()
        comm_device = "Так" if self.communication_device else "Ні"
        return f"{base_info}, Пристрій зв'язку: {comm_device}"
