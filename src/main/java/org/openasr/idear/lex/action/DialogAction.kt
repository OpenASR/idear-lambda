package org.openasr.idear.lex.action

import org.openasr.idear.lex.FulfillmentState
import org.openasr.idear.lex.Message


fun fulfilled(message: String): Close = close(FulfillmentState.Fulfilled, message)
fun failed(message: String): Close = close(FulfillmentState.Failed, message)

fun close(fulfillmentState: FulfillmentState, message: String): Close {
    val action = Close(fulfillmentState, Message(message))

    return action
}

abstract class DialogAction(val type: String)