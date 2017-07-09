package com.jetbrains.idear.lex.action

import com.jetbrains.idear.lex.FulfillmentState
import com.jetbrains.idear.lex.Message


fun fulfilled(message: String): Close = close(FulfillmentState.Fulfilled, message)
fun failed(message: String): Close = close(FulfillmentState.Failed, message)

fun close(fulfillmentState: FulfillmentState, message: String): Close {
    val action = Close(fulfillmentState, Message(message))

    return action
}

abstract class DialogAction(val type: String)