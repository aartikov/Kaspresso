[kaspresso](../../index.md) / [com.kaspersky.kaspresso.compose](../index.md) / [WebComposeProviderImpl](index.md) / [compose](./compose.md)

# compose

`fun WebElementBuilder.compose(block: `[`ActionsOnWebElementsPack`](../../com.kaspersky.kaspresso.compose.pack/-actions-on-web-elements-pack/index.md)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Overrides [WebComposeProvider.compose](../-web-compose-provider/compose.md)

Composes a [block](compose.md#com.kaspersky.kaspresso.compose.WebComposeProviderImpl$compose(com.agoda.kakao.web.WebElementBuilder, kotlin.Function1((com.kaspersky.kaspresso.compose.pack.ActionsOnWebElementsPack, kotlin.Unit)))/block) of actions with their web views to invoke on in one composite action that succeeds if at least
one of it's parts succeeds.

### Parameters

`block` - the actions to compose.`fun KWebInteraction.compose(webElementBuilder: WebElementBuilder, block: `[`ActionsPack`](../../com.kaspersky.kaspresso.compose.pack/-actions-pack/index.md)`<KWebInteraction>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Overrides [WebComposeProvider.compose](../-web-compose-provider/compose.md)

Composes a [block](compose.md#com.kaspersky.kaspresso.compose.WebComposeProviderImpl$compose(com.agoda.kakao.web.WebElementBuilder.KWebInteraction, com.agoda.kakao.web.WebElementBuilder, kotlin.Function1((com.kaspersky.kaspresso.compose.pack.ActionsPack((com.agoda.kakao.web.WebElementBuilder.KWebInteraction)), kotlin.Unit)))/block) of actions on the given web view in one composite action that succeeds if at least
one of it's parts succeeds.

### Parameters

`block` - the actions to compose.