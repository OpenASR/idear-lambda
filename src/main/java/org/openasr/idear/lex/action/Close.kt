package org.openasr.idear.lex.action

import org.openasr.idear.lex.FulfillmentState
import org.openasr.idear.lex.Message

class Close(val fulfillmentState: FulfillmentState, message: Message) : DialogActionWithResponse("Close", message)
