[kaspresso](../../index.md) / [com.kaspersky.kaspresso.compose.pack](../index.md) / [ActionsOnWebElementsPack](./index.md)

# ActionsOnWebElementsPack

`class ActionsOnWebElementsPack`

The builder class for parameters of [com.kaspersky.kaspresso.compose.WebComposeProvider.compose](../../com.kaspersky.kaspresso.compose/-web-compose-provider/compose.md) method.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ActionsOnWebElementsPack(webElementBuilder: WebElementBuilder)`<br>The builder class for parameters of [com.kaspersky.kaspresso.compose.WebComposeProvider.compose](../../com.kaspersky.kaspresso.compose/-web-compose-provider/compose.md) method. |

### Functions

| Name | Summary |
|---|---|
| [orWithElement](or-with-element.md) | `fun orWithElement(locator: Locator, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, action: KWebInteraction.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Builds the lambda to add to [actions](#) that invokes the given [action](or-with-element.md#com.kaspersky.kaspresso.compose.pack.ActionsOnWebElementsPack$orWithElement(androidx.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.web.WebElementBuilder.KWebInteraction, kotlin.Unit)))/action) on the web element built by [webElementBuilder](#) with given [locator](or-with-element.md#com.kaspersky.kaspresso.compose.pack.ActionsOnWebElementsPack$orWithElement(androidx.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.web.WebElementBuilder.KWebInteraction, kotlin.Unit)))/locator) and [value](or-with-element.md#com.kaspersky.kaspresso.compose.pack.ActionsOnWebElementsPack$orWithElement(androidx.test.espresso.web.webdriver.Locator, kotlin.String, kotlin.Function1((com.agoda.kakao.web.WebElementBuilder.KWebInteraction, kotlin.Unit)))/value). |
