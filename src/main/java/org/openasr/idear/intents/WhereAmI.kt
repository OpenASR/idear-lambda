package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.fulfilled

fun whereAmI(): LexFulfillmentResponse {
    return fulfilled("the IDE will tell you where you are",
            mapOf("invokeAction" to "Idear.WhereAmI", Verbosity to ALL))
}
