package org.openasr.idear.intents

import org.openasr.idear.lex.LexFulfillmentResponse

interface Intent {
    fun handleRequest(): LexFulfillmentResponse
}
