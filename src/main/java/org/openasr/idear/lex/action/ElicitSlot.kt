package org.openasr.idear.lex.action

class ElicitSlot(val intentName: String, slotToElicit: String, slots: Map<String, String>, message: String? = null) : DialogAction("ElicitSlot")
