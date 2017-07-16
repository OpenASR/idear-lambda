package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.fulfilled

fun shrink(): LexFulfillmentResponse {
    return fulfilled("shrinking selection",
            mapOf("invokeAction" to "EditorUnSelectWord", Verbosity to DEBUG))
}
