@all
@severity=blocker
@issue=1234
@tmslink=5678
Feature: Командировки

  @13
  Scenario Outline: Авторизация
    Given Страница авторизации: вводим логин "<login>" и пароль "<password>"
    And Страница авторизации: нажимаем кнопку подтвердить
    And Грид: выбираем 'Расходы'
    And Грид: выбираем 'Командировки' в выпадающем списке
    Then Грид: ловим ошибку

    Examples:
      | login       | password |
      | Pro100 A    | testing  |
      | Pro100 Alla | testing  |