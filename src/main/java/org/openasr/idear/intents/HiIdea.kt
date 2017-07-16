package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.elicitSlot
import org.openasr.idear.lex.action.fulfilled

fun hiIdea(intentName: String, sessionAttributes: Map<String, String>?): LexFulfillmentResponse {
    if (sessionAttributes?.get("greeted") == "true") {
        return fulfilled("Hi, again!", promptForInfo)
    } else {
        return elicitSlot(intentName,
                "say",
                mapOf<String, String>("greeted" to "true"),
                "Hi", promptForInfo)
    }
}
