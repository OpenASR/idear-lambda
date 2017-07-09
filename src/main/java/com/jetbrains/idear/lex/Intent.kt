package com.jetbrains.idear.lex

data class Intent(val name: String? = null,
             val slots: Map<String, String>? = null,
             val confirmationStatus: String? = null)