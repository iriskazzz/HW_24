# <img width="5%" title="Wikipedia" src="media/logo/Wikipedia.svg"> Дипломный проект по тестирования мобильного приложения [Wikipedia](https://github.com/wikimedia/apps-android-wikipedia/)

## :open_book: Содержание:

- [Технологии и инструменты](#технологии-и-инструменты)
- [Тест кейсы](#тест-кейсы)
- [Запуск тестов из терминала](#запуск-тестов-из-терминала)
- [Сборка в Jenkins](#сборка-в-jenkins)
- [Пример Allure-отчета](#пример-Allure-отчета)
- [Пример запуска теста в Browserstack](#пример-запуска-теста-в-Browserstack)

## Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/logo/Intelij_IDEA.svg"></a>
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/logo/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/logo/JUnit5.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/logo/GitHub.svg"></a>
<a href="https://developer.android.com/"><img width="6%" title="Android-studio" src="media/logo/Android-studio.svg"></a>
<a href="https://appium.io/"><img width="6%" title="Appium" src="media/logo/Appium.svg"></a>
<a href="https://www.browserstack.com/"><img width="6%" title="Browserstack" src="media/logo/Browserstack.svg"></a>
<a href="https://allurereport.org/"><img width="6%" title="Allure Report" src="media/logo/Allure_Report.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/logo/Jenkins.svg"></a>
</p>

## Тест кейсы
- Проверка объектов на странице создания нового аккаунта
- Проверка работы строки поиска
- Проверка текстов на экранах онбординга

## Запуск тестов из терминала

### Локальный запуск тестов

```bash
 gradle clean test -DdeviceHost=emulator
```

### Удаленный запуск тестов

```bash
gradle clean test -DdeviceHost=browserstack
```

При выполнении команды, данные тесты запустятся удаленно в <code>Browserstack</code>

При необходимости также можно переопределить параметры запуска:

```
clean testByTags
-Dtags=${TAGS} 
-DdeviceHost=${DEVICE_HOST} 
```

### Параметры сборки

* <code>TAGS</code> – тэг с которым будут запускаться тесты.
* <code>DEVICE_HOST</code> – переменная определения среды для запуска тестов.

## Сборка в [Jenkins](https://jenkins.autotests.cloud/job/zolina_diplom_mobile/)

Для запуска сборки необходимо перейти в раздел <code>Build with Parameters</code> указать нужный параметр и нажать кнопку <code>Build</code>.

<p align="center">
<img title="Jenkins Build" src="media/screens/JenkinsBuild.png">
</p>

После выполнения сборки, в блоке <code>Build History</code> напротив номера сборки появится значок <code>Allure Report</code> кликнув по которому, откроется страница с сформированным html-отчетом.

## Пример [Allure-отчета](https://jenkins.autotests.cloud/job/zolina_diplom_mobile/allure)
### Overview

<p align="center">
<img title="Allure Overview" src="media/screens/allureReport.png">
</p>

### Результат выполнения теста

<p align="center">
<img title="Test Results in Alure" src="media/screens/ResultTest.png">
</p>

## Пример запуска теста в Browserstack

К каждому тесту в отчете прилагается видео.

На данном видео выполняется:

- Проверка работы строки поиска

<p align="center">
  <img title="Selenoid Video" src="media/screens/video.gif">
</p>