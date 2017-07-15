package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.action.elicitSlot
import org.openasr.idear.lex.action.fulfilled

class HiIdea(val sessionAttributes: Map<String, String>?) : Intent {
    override fun handleRequest(): LexFulfillmentResponse {
        if (sessionAttributes?.get("greeted") == "true") {
            return fulfilled("Hi, again!")
        } else {
            return elicitSlot(HiIdea::class.simpleName!!, "say", mapOf<String, String>("greeted" to "true"), "Hi")
        }
    }
}
