package org.openasr.idear.lex.action

import org.openasr.idear.lex.Message


class ElicitSlot(val intentName: String, val slotToElicit: String, val slots: Map<String, String>, message: Message) : DialogActionWithResponse("ElicitSlot", message) {
    override fun toString(): String {
        return "ElicitSlot(intentName=$intentName, slotToElicit=$slotToElicit, slots=$slots, message=$message)"
    }
}
