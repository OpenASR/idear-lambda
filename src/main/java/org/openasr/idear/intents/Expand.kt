package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.fulfilled

fun expand(): LexFulfillmentResponse {
    return fulfilled("expanding selection",
            mapOf("invokeAction" to "EditorSelectWord", Verbosity to DEBUG))
}
