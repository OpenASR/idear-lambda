package com.jetbrains.idear.lex

/**
 * @param genericAttachments - 0 to 10 items
 */
class ResponseCard(val genericAttachments: List<GenericAttachment>,
                   val version: Int = 1,
                   val contentType: String = "application/vnd.amazonaws.card.generic") {
    constructor(genericAttachment: GenericAttachment) : this(listOf(genericAttachment))

    constructor(title: String) : this(listOf(GenericAttachment(title)))
}