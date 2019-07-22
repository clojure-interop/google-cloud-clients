(ns com.google.cloud.dialogflow.v2beta1.IntentsClient
  "Service Description: An intent represents a mapping between input from a user and an action to be
  taken by your application. When you pass user input to the
  [DetectIntent][google.cloud.dialogflow.v2beta1.Sessions.DetectIntent] (or
  [StreamingDetectIntent][google.cloud.dialogflow.v2beta1.Sessions.StreamingDetectIntent]) method,
  the Dialogflow API analyzes the input and searches for a matching intent. If no match is found,
  the Dialogflow API returns a fallback intent (`is_fallback` = true).

  You can provide additional information for the Dialogflow API to use to match user input to an
  intent by adding the following to your intent.

  * **Contexts** - provide additional context for intent analysis. For
  example, if an intent is related to an object in your application that plays music, you can
  provide a context to determine when to match the intent if the user input is \"turn it off\". You
  can include a context that matches the intent when there is previous user input of \"play music\",
  and not when there is previous user input of \"turn on the light\".

  * **Events** - allow for matching an intent by using an event name instead
  of user input. Your application can provide an event name and related parameters to the
  Dialogflow API to match an intent. For example, when your application starts, you can send a
  welcome event with a user name parameter to the Dialogflow API to match an intent with a
  personalized welcome message for the user.

  * **Training phrases** - provide examples of user input to train the
  Dialogflow API agent to better match intents.

  For more information about intents, see the [Dialogflow
  documentation](https://cloud.google.com/dialogflow/docs/intents-overview).

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (IntentsClient intentsClient = IntentsClient.create()) {
    IntentName name = IntentName.of(\"[PROJECT]\", \"[INTENT]\");
    Intent response = intentsClient.getIntent(name);
  }

  Note: close() needs to be called on the intentsClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of IntentsSettings to create().
  For example:

  To customize credentials:



  IntentsSettings intentsSettings =
      IntentsSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  IntentsClient intentsClient =
      IntentsClient.create(intentsSettings);

  To customize the endpoint:



  IntentsSettings intentsSettings =
      IntentsSettings.newBuilder().setEndpoint(myEndpoint).build();
  IntentsClient intentsClient =
      IntentsClient.create(intentsSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 IntentsClient]))

(defn *create
  "Constructs an instance of IntentsClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dialogflow.v2beta1.IntentsSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.IntentsClient`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.IntentsClient [^com.google.cloud.dialogflow.v2beta1.IntentsSettings settings]
    (IntentsClient/create settings))
  (^com.google.cloud.dialogflow.v2beta1.IntentsClient []
    (IntentsClient/create )))

(defn batch-delete-intents-operation-callable
  "Deletes intents in the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     List<Intent> intents = new ArrayList<>();
     BatchDeleteIntentsRequest request = BatchDeleteIntentsRequest.newBuilder()
       .setParent(parent.toString())
       .addAllIntents(intents)
       .build();
     OperationFuture<Empty, Struct> future = intentsClient.batchDeleteIntentsOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^IntentsClient this]
    (-> this (.batchDeleteIntentsOperationCallable))))

(defn update-intent
  "Updates the specified intent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     Intent intent = Intent.newBuilder().build();
     String languageCode = \"\";
     FieldMask updateMask = FieldMask.newBuilder().build();
     Intent response = intentsClient.updateIntent(intent, languageCode, updateMask);
   }

  intent - Required. The intent to update. - `com.google.cloud.dialogflow.v2beta1.Intent`
  language-code - Optional. The language of training phrases, parameters and rich messages defined in `intent`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`
  update-mask - Optional. The mask to control which fields get updated. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.dialogflow.v2beta1.Intent`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.Intent [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.Intent intent ^java.lang.String language-code ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateIntent intent language-code update-mask)))
  (^com.google.cloud.dialogflow.v2beta1.Intent [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.Intent intent ^java.lang.String language-code]
    (-> this (.updateIntent intent language-code)))
  (^com.google.cloud.dialogflow.v2beta1.Intent [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest request]
    (-> this (.updateIntent request))))

(defn get-intent-callable
  "Retrieves the specified intent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     IntentName name = IntentName.of(\"[PROJECT]\", \"[INTENT]\");
     GetIntentRequest request = GetIntentRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Intent> future = intentsClient.getIntentCallable().futureCall(request);
     // Do something
     Intent response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsClient this]
    (-> this (.getIntentCallable))))

(defn list-intents
  "Returns the list of all intents in the specified agent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     String languageCode = \"\";
     for (Intent element : intentsClient.listIntents(parent, languageCode).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The agent to list all intents from. Format: `projects/<Project ID>/agent`. - `com.google.cloud.dialogflow.v2beta1.ProjectAgentName`
  language-code - Optional. The language to list training phrases, parameters and rich messages for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.ProjectAgentName parent ^java.lang.String language-code]
    (-> this (.listIntents parent language-code)))
  (^com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.ProjectAgentName parent]
    (-> this (.listIntents parent))))

(defn list-intents-paged-callable
  "Returns the list of all intents in the specified agent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     ListIntentsRequest request = ListIntentsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListIntentsPagedResponse> future = intentsClient.listIntentsPagedCallable().futureCall(request);
     // Do something
     for (Intent element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListIntentsRequest,com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsClient this]
    (-> this (.listIntentsPagedCallable))))

(defn list-intents-callable
  "Returns the list of all intents in the specified agent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     ListIntentsRequest request = ListIntentsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListIntentsResponse response = intentsClient.listIntentsCallable().call(request);
       for (Intent element : response.getIntentsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListIntentsRequest,com.google.cloud.dialogflow.v2beta1.ListIntentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsClient this]
    (-> this (.listIntentsCallable))))

(defn get-settings
  "returns: `com.google.cloud.dialogflow.v2beta1.IntentsSettings`"
  (^com.google.cloud.dialogflow.v2beta1.IntentsSettings [^IntentsClient this]
    (-> this (.getSettings))))

(defn batch-update-intents-operation-callable
  "Updates/Creates multiple intents in the specified agent.

   Operation <response:
   [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]>

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     String languageCode = \"\";
     BatchUpdateIntentsRequest request = BatchUpdateIntentsRequest.newBuilder()
       .setParent(parent.toString())
       .setLanguageCode(languageCode)
       .build();
     OperationFuture<BatchUpdateIntentsResponse, Struct> future = intentsClient.batchUpdateIntentsOperationCallable().futureCall(request);
     // Do something
     BatchUpdateIntentsResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse,com.google.protobuf.Struct>`"
  ([^IntentsClient this]
    (-> this (.batchUpdateIntentsOperationCallable))))

(defn batch-update-intents-async
  "Updates/Creates multiple intents in the specified agent.

   Operation <response:
   [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]>

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     String languageCode = \"\";
     BatchUpdateIntentsRequest request = BatchUpdateIntentsRequest.newBuilder()
       .setParent(parent.toString())
       .setLanguageCode(languageCode)
       .build();
     BatchUpdateIntentsResponse response = intentsClient.batchUpdateIntentsAsync(request).get();
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest request]
    (-> this (.batchUpdateIntentsAsync request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.IntentsStub`"
  ([^IntentsClient this]
    (-> this (.getStub))))

(defn batch-delete-intents-async
  "Deletes intents in the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     List<Intent> intents = new ArrayList<>();
     intentsClient.batchDeleteIntentsAsync(parent, intents).get();
   }

  parent - Required. The name of the agent to delete all entities types for. Format: `projects/<Project ID>/agent`. - `com.google.cloud.dialogflow.v2beta1.ProjectAgentName`
  intents - Required. The collection of intents to delete. Only intent `name` must be filled in. - `java.util.List`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.ProjectAgentName parent ^java.util.List intents]
    (-> this (.batchDeleteIntentsAsync parent intents)))
  ([^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest request]
    (-> this (.batchDeleteIntentsAsync request))))

(defn update-intent-callable
  "Updates the specified intent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     Intent intent = Intent.newBuilder().build();
     String languageCode = \"\";
     UpdateIntentRequest request = UpdateIntentRequest.newBuilder()
       .setIntent(intent)
       .setLanguageCode(languageCode)
       .build();
     ApiFuture<Intent> future = intentsClient.updateIntentCallable().futureCall(request);
     // Do something
     Intent response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsClient this]
    (-> this (.updateIntentCallable))))

(defn batch-update-intents-callable
  "Updates/Creates multiple intents in the specified agent.

   Operation <response:
   [BatchUpdateIntentsResponse][google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse]>

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     String languageCode = \"\";
     BatchUpdateIntentsRequest request = BatchUpdateIntentsRequest.newBuilder()
       .setParent(parent.toString())
       .setLanguageCode(languageCode)
       .build();
     ApiFuture<Operation> future = intentsClient.batchUpdateIntentsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsClient this]
    (-> this (.batchUpdateIntentsCallable))))

(defn get-intent
  "Retrieves the specified intent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     IntentName name = IntentName.of(\"[PROJECT]\", \"[INTENT]\");
     String languageCode = \"\";
     Intent response = intentsClient.getIntent(name, languageCode);
   }

  name - Required. The name of the intent. Format: `projects/<Project ID>/agent/intents/<Intent ID>`. - `com.google.cloud.dialogflow.v2beta1.IntentName`
  language-code - Optional. The language to retrieve training phrases, parameters and rich messages for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `com.google.cloud.dialogflow.v2beta1.Intent`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.Intent [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.IntentName name ^java.lang.String language-code]
    (-> this (.getIntent name language-code)))
  (^com.google.cloud.dialogflow.v2beta1.Intent [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.IntentName name]
    (-> this (.getIntent name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^IntentsClient this]
    (-> this (.isShutdown))))

(defn delete-intent-callable
  "Deletes the specified intent and its direct or indirect followup intents.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     IntentName name = IntentName.of(\"[PROJECT]\", \"[INTENT]\");
     DeleteIntentRequest request = DeleteIntentRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = intentsClient.deleteIntentCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsClient this]
    (-> this (.deleteIntentCallable))))

(defn create-intent
  "Creates an intent in the specified agent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     Intent intent = Intent.newBuilder().build();
     String languageCode = \"\";
     Intent response = intentsClient.createIntent(parent, intent, languageCode);
   }

  parent - Required. The agent to create a intent for. Format: `projects/<Project ID>/agent`. - `com.google.cloud.dialogflow.v2beta1.ProjectAgentName`
  intent - Required. The intent to create. - `com.google.cloud.dialogflow.v2beta1.Intent`
  language-code - Optional. The language of training phrases, parameters and rich messages defined in `intent`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used. - `java.lang.String`

  returns: `com.google.cloud.dialogflow.v2beta1.Intent`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.Intent [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.ProjectAgentName parent ^com.google.cloud.dialogflow.v2beta1.Intent intent ^java.lang.String language-code]
    (-> this (.createIntent parent intent language-code)))
  (^com.google.cloud.dialogflow.v2beta1.Intent [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.ProjectAgentName parent ^com.google.cloud.dialogflow.v2beta1.Intent intent]
    (-> this (.createIntent parent intent)))
  (^com.google.cloud.dialogflow.v2beta1.Intent [^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.CreateIntentRequest request]
    (-> this (.createIntent request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^IntentsClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^IntentsClient this]
    (-> this (.shutdown))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^IntentsClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^IntentsClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^IntentsClient this]
    (-> this (.isTerminated))))

(defn delete-intent
  "Deletes the specified intent and its direct or indirect followup intents.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     IntentName name = IntentName.of(\"[PROJECT]\", \"[INTENT]\");
     intentsClient.deleteIntent(name);
   }

  name - Required. The name of the intent to delete. If this intent has direct or indirect followup intents, we also delete them. Format: `projects/<Project ID>/agent/intents/<Intent ID>`. - `com.google.cloud.dialogflow.v2beta1.IntentName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^IntentsClient this ^com.google.cloud.dialogflow.v2beta1.IntentName name]
    (-> this (.deleteIntent name))))

(defn batch-delete-intents-callable
  "Deletes intents in the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     List<Intent> intents = new ArrayList<>();
     BatchDeleteIntentsRequest request = BatchDeleteIntentsRequest.newBuilder()
       .setParent(parent.toString())
       .addAllIntents(intents)
       .build();
     ApiFuture<Operation> future = intentsClient.batchDeleteIntentsCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsClient this]
    (-> this (.batchDeleteIntentsCallable))))

(defn create-intent-callable
  "Creates an intent in the specified agent.

   Sample code:



   try (IntentsClient intentsClient = IntentsClient.create()) {
     ProjectAgentName parent = ProjectAgentName.of(\"[PROJECT]\");
     Intent intent = Intent.newBuilder().build();
     CreateIntentRequest request = CreateIntentRequest.newBuilder()
       .setParent(parent.toString())
       .setIntent(intent)
       .build();
     ApiFuture<Intent> future = intentsClient.createIntentCallable().futureCall(request);
     // Do something
     Intent response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IntentsClient this]
    (-> this (.createIntentCallable))))

(defn shutdown-now
  ""
  ([^IntentsClient this]
    (-> this (.shutdownNow))))

