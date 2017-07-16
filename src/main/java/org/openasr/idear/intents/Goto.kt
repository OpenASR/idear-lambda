package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.fulfilled

fun goto(slots: Map<String, String>?): LexFulfillmentResponse {
    val lineNumber = slots?.get("LineNumber")!!
    return fulfilled("go to line " + lineNumber, mapOf("routineGoto" to lineNumber, Verbosity to DEBUG))
}
