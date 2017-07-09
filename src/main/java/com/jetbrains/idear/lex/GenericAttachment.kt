package com.jetbrains.idear.lex

import java.awt.Button


class GenericAttachment(val title: String) {
    var subTitle: String? = null
    var imageUrl: String? = null
    var attachmentLinkUrl: String? = null
    var buttons: List<Button>? = null
}