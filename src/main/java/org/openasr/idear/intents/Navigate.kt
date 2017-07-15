package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.fulfilled

/**
 * https://www.jetbrains.com/help/idea/navigating-to-declaration-or-type-declaration-of-a-symbol.html
 */
class Navigate : Intent {
    override fun handleRequest(): LexFulfillmentResponse {
        return fulfilled("", mapOf("invokeAction" to "GotoDeclaration"))
    }
}
