package org.openasr.idear.lex.action

import org.openasr.idear.lex.FulfillmentState
import org.openasr.idear.lex.LexFulfillmentResponse
import org.openasr.idear.lex.Message


fun fulfilled(message: String, sessionAttributes: Map<String, String>? = null) = close(FulfillmentState.Fulfilled, message, sessionAttributes)
fun failed(message: String, sessionAttributes: Map<String, String>? = null) = close(FulfillmentState.Failed, message, sessionAttributes)

fun close(fulfillmentState: FulfillmentState,
          message: String,
          sessionAttributes: Map<String, String>? = null): LexFulfillmentResponse {
    return LexFulfillmentResponse(Close(fulfillmentState, Message(message)), sessionAttributes)
}

fun elicitSlot(intentName: String,
               slotToElicit: String,
               message: String,
               sessionAttributes: Map<String, String>? = null): LexFulfillmentResponse {
    return LexFulfillmentResponse(ElicitSlot(intentName, slotToElicit, emptyMap<String, String>(), Message(message)), sessionAttributes)
}
fun elicitSlot(intentName: String,
               slotToElicit: String,
               slots: Map<String, String> = emptyMap<String, String>(),
               message: String,
               sessionAttributes: Map<String, String>? = null): LexFulfillmentResponse {
    return LexFulfillmentResponse(ElicitSlot(intentName, slotToElicit, slots, Message(message)), sessionAttributes)
}

fun delegate(slots: Map<String, String>?,
             sessionAttributes: Map<String, String>?): LexFulfillmentResponse {
    return LexFulfillmentResponse(Delegate(slots), sessionAttributes)
}

abstract class DialogAction(val type: String)