package com.jetbrains.idear.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lexruntime.model.DialogState
import com.amazonaws.services.lexruntime.model.PostTextRequest
import com.amazonaws.services.lexruntime.model.PostTextResult


class LexFulfillment : RequestHandler<PostTextRequest, PostTextResult> {

    override fun handleRequest(request: PostTextRequest, context: Context): PostTextResult {
        val result = PostTextResult()
                .withDialogState(DialogState.Fulfilled)
                .withIntentName("ApplyLiveTemplate")

        return result
    }
}