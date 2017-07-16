package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.fulfilled

fun pressKey(slots: Map<String, String>?): LexFulfillmentResponse {
    val keyStroke = slots?.get("KeyStroke")!!
    return fulfilled("press key " + keyStroke, mapOf("routinePress" to keyStroke, Verbosity to DEBUG))
}
