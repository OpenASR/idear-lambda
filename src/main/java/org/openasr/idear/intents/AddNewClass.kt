package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.fulfilled

fun addNewClass(slots: Map<String, String>?): LexFulfillmentResponse {
    return fulfilled("create new class",
            mapOf("invokeAction" to "NewElement", Verbosity to DEBUG))
}
