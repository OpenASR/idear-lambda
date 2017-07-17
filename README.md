AWS Lex fulfillment service for [idear](https://github.com/OpenASR/idear)

## Building

    ./gradlew shadowJar
    
## Deploy
    
    ./gradlew migrateFunction 
    
## Programming Model

The LexFulfillment Lambda function responds to Lex in accordance with the Lex [Response Format](http://docs.aws.amazon.com/lex/latest/dg/lambda-input-response-format.html#using-lambda-response-format).
  
The `message` field is used as intended - plays an audible prompt to the user by TTS.
  
Unfortunately, `responseCard` is not available to speech requests, so `sessionAttributes` are used to send commands back to the IDE:  
  
 - `invokeAction`: invokes the named IntelliJ Action - [built-in](https://upsource.jetbrains.com/idea-ce/file/idea-ce-d00d8b4ae3ed33097972b8a4286b336bf4ffcfab/platform/platform-api/src/com/intellij/openapi/actionSystem/IdeActions.java)
or [custom](http://www.jetbrains.org/intellij/sdk/docs/tutorials/action_system/working_with_custom_actions.html) actions are both supported

 - `pressKeystroke`: a comma-delimited list of integer values may be dispatched to the IDE
  
 - `Verbosity`: Lex insists on responses having a non-empty `message`, but in Idear not all commands require audible feedback.
   - '`INFO`' if an audible prompt is required (eg "what's the name of the class").
   - '`DEBUG`' for prompts which may be useful for the visually impaired
   - '`ALL`' where nobody would be interested in hearing the message
   
    