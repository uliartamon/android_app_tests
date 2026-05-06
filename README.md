# NotesApp

Простое Android-приложение для создания и удаления заметок, разработанное на Kotlin в Android Studio.

## Функционал

- создание заметки
- отображение заметки на экране
- удаление заметки
- сохранение данных через SharedPreferences
- восстановление заметки после перезапуска приложения
- модульное тестирование (JUnit)
- UI-тестирование (Espresso)

## Технологии

- Kotlin
- Android SDK
- Android Studio
- SharedPreferences
- JUnit
- Espresso

## Структура проекта

- `MainActivity.kt` — логика приложения
- `activity_main.xml` — пользовательский интерфейс
- `NoteManager.kt` — работа с заметками
- `NoteManagerTest.kt` — unit-тесты
- `NoteUiTest.kt` — UI-тесты

## Запуск проекта

1. Клонировать репозиторий:

```bash
git clone https://github.com/USERNAME/NotesApp.git
```

2. Открыть проект в Android Studio

3. Запустить Android Emulator

4. Нажать кнопку Run ▶

## Тестирование

### Unit tests

```bash
./gradlew test
```

### UI tests

```bash
./gradlew connectedAndroidTest
```

## Возможности для улучшения

- поддержка нескольких заметок
- использование RecyclerView
- подключение базы данных Room
- улучшение пользовательского интерфейса
- добавление поиска и сортировки заметок

## Автор

Ulyana
