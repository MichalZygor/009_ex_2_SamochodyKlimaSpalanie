##Treść zadania

Zdefiniuj trzy klasy:
- Vehicle(nazwa, pojemność baku, średnie spalanie na 100km)
- Car dziedzicząca po Vehicle – posiada dodatkowo informację o tym, czy ma włączoną klimatyzację, czy nie
- Truck dziedzicząca po Car – posiada dodatkowo informację o wadze ładunku

Jeśli klimatyzacja jest włączona, to samochód spala o 0,8l na 100km więcej, a ciężarówka o 1,6l na 100km więcej. Dodatkowo ciężarówka spala o 0,5l paliwa na 100km więcej dla każdych dodatkowych 100kg ładunku.

W odpowiednich klasach zdefiniuj metodę, która obliczy i zwróci zasięg danego pojazdu wyrażony w kilometrach.

W osobnej klasie utwórz tablicę zawierającą kilka pojazdów (z wyłączoną klimatyzacją), wyświetl o nich podstawowe informacje oraz informację o zasięgu danego pojazdu. Następnie włącz klimatyzację we wszystkich pojazdach i wyświetl te same informacje jeszcze raz.