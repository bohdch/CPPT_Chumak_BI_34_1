# main.py

from gasmask_package.gas_mask import GasMask
from gasmask_package.commander_gas_mask import CommanderGasMask

def main():
    # Створюємо звичайний протигаз
    gas_mask = GasMask(model="GM-1", filter_type="ABC", weight=1.2)
    print(gas_mask)
    print(gas_mask.provide_protection())
    print(gas_mask.set_filter_type("XYZ"))  # Оновлення типу фільтра
    print(gas_mask.set_weight(1.3))  # Оновлення ваги
    print(gas_mask)
    print("\n")

    # Створюємо командирський протигаз
    commander_gas_mask = CommanderGasMask(model="CM-2", filter_type="DEF", weight=1.5, communication_device=True)
    print(commander_gas_mask)
    print(commander_gas_mask.provide_protection())
    print(commander_gas_mask.provide_command_capability())
    print(commander_gas_mask.toggle_communication_device())  # Перемикаємо стан пристрою зв'язку

if __name__ == "__main__":
    main()
