# Запуск тестов

Для запуска тестов локально на эмуляторе:
```
gradle clean testByTags -Dtags=emulator -DdeviceHost=emulator
```

Для запуска тестов удаленно с помощью Browserstack:
```
gradle clean testByTags -Dtags=browserstack -DdeviceHost=browserstack
```
