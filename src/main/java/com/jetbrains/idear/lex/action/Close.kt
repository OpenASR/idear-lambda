package com.jetbrains.idear.lex.action

import com.jetbrains.idear.lex.FulfillmentState
import com.jetbrains.idear.lex.Message

class Close(val fulfillmentState: FulfillmentState, message: Message) : DialogActionWithResponse("Close", message)
