(ns com.google.cloud.dialogflow.v2beta1.ContextsClient
  "Service Description: A context represents additional information included with user input or with
  an intent returned by the Dialogflow API. Contexts are helpful for differentiating user input
  which may be vague or have a different meaning depending on additional details from your
  application such as user setting and preferences, previous user input, where the user is in your
  application, geographic location, and so on.

  You can include contexts as input parameters of a
  [DetectIntent][google.cloud.dialogflow.v2beta1.Sessions.DetectIntent] (or
  [StreamingDetectIntent][google.cloud.dialogflow.v2beta1.Sessions.StreamingDetectIntent]) request,
  or as output contexts included in the returned intent. Contexts expire when an intent is matched,
  after the number of `DetectIntent` requests specified by the `lifespan_count` parameter, or after
  20 minutes if no intents are matched for a `DetectIntent` request.

  For more information about contexts, see the [Dialogflow
  documentation](https://cloud.google.com/dialogflow/docs/contexts-overview).

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ContextsClient contextsClient = ContextsClient.create()) {
    ContextName name = ContextName.of(\"[PROJECT]\", \"[SESSION]\", \"[CONTEXT]\");
    Context response = contextsClient.getContext(name);
  }

  Note: close() needs to be called on the contextsClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of ContextsSettings to create().
  For example:

  To customize credentials:



  ContextsSettings contextsSettings =
      ContextsSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ContextsClient contextsClient =
      ContextsClient.create(contextsSettings);

  To customize the endpoint:



  ContextsSettings contextsSettings =
      ContextsSettings.newBuilder().setEndpoint(myEndpoint).build();
  ContextsClient contextsClient =
      ContextsClient.create(contextsSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 ContextsClient]))

(defn *create
  "Constructs an instance of ContextsClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dialogflow.v2beta1.ContextsSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.ContextsClient`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.ContextsClient [^com.google.cloud.dialogflow.v2beta1.ContextsSettings settings]
    (ContextsClient/create settings))
  (^com.google.cloud.dialogflow.v2beta1.ContextsClient []
    (ContextsClient/create )))

(defn delete-context-callable
  "Deletes the specified context.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     ContextName name = ContextName.of(\"[PROJECT]\", \"[SESSION]\", \"[CONTEXT]\");
     DeleteContextRequest request = DeleteContextRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = contextsClient.deleteContextCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteContextRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsClient this]
    (-> this (.deleteContextCallable))))

(defn delete-context
  "Deletes the specified context.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     ContextName name = ContextName.of(\"[PROJECT]\", \"[SESSION]\", \"[CONTEXT]\");
     contextsClient.deleteContext(name);
   }

  name - Required. The name of the context to delete. Format: `projects/<Project ID>/agent/sessions/<Session ID>/contexts/<Context ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/contexts/<Context ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.ContextName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ContextsClient this ^com.google.cloud.dialogflow.v2beta1.ContextName name]
    (-> this (.deleteContext name))))

(defn get-settings
  "returns: `com.google.cloud.dialogflow.v2beta1.ContextsSettings`"
  (^com.google.cloud.dialogflow.v2beta1.ContextsSettings [^ContextsClient this]
    (-> this (.getSettings))))

(defn delete-all-contexts
  "Deletes all active contexts in the specified session.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     contextsClient.deleteAllContexts(parent);
   }

  parent - Required. The name of the session to delete all contexts from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.SessionName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ContextsClient this ^com.google.cloud.dialogflow.v2beta1.SessionName parent]
    (-> this (.deleteAllContexts parent))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.ContextsStub`"
  ([^ContextsClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ContextsClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ContextsClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-contexts-callable
  "Returns the list of all contexts in the specified session.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     ListContextsRequest request = ListContextsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListContextsResponse response = contextsClient.listContextsCallable().call(request);
       for (Context element : response.getContextsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListContextsRequest,com.google.cloud.dialogflow.v2beta1.ListContextsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsClient this]
    (-> this (.listContextsCallable))))

(defn shutdown
  ""
  ([^ContextsClient this]
    (-> this (.shutdown))))

(defn create-context
  "Creates a context.

   If the specified context already exists, overrides the context.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     Context context = Context.newBuilder().build();
     Context response = contextsClient.createContext(parent, context);
   }

  parent - Required. The session to create a context for. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.SessionName`
  context - Required. The context to create. - `com.google.cloud.dialogflow.v2beta1.Context`

  returns: `com.google.cloud.dialogflow.v2beta1.Context`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.Context [^ContextsClient this ^com.google.cloud.dialogflow.v2beta1.SessionName parent ^com.google.cloud.dialogflow.v2beta1.Context context]
    (-> this (.createContext parent context)))
  (^com.google.cloud.dialogflow.v2beta1.Context [^ContextsClient this ^com.google.cloud.dialogflow.v2beta1.CreateContextRequest request]
    (-> this (.createContext request))))

(defn close
  ""
  ([^ContextsClient this]
    (-> this (.close))))

(defn get-context-callable
  "Retrieves the specified context.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     ContextName name = ContextName.of(\"[PROJECT]\", \"[SESSION]\", \"[CONTEXT]\");
     GetContextRequest request = GetContextRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Context> future = contextsClient.getContextCallable().futureCall(request);
     // Do something
     Context response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsClient this]
    (-> this (.getContextCallable))))

(defn get-context
  "Retrieves the specified context.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     ContextName name = ContextName.of(\"[PROJECT]\", \"[SESSION]\", \"[CONTEXT]\");
     Context response = contextsClient.getContext(name);
   }

  name - Required. The name of the context. Format: `projects/<Project ID>/agent/sessions/<Session ID>/contexts/<Context ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/contexts/<Context ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.ContextName`

  returns: `com.google.cloud.dialogflow.v2beta1.Context`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.Context [^ContextsClient this ^com.google.cloud.dialogflow.v2beta1.ContextName name]
    (-> this (.getContext name))))

(defn delete-all-contexts-callable
  "Deletes all active contexts in the specified session.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     DeleteAllContextsRequest request = DeleteAllContextsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Void> future = contextsClient.deleteAllContextsCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteAllContextsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsClient this]
    (-> this (.deleteAllContextsCallable))))

(defn list-contexts-paged-callable
  "Returns the list of all contexts in the specified session.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     ListContextsRequest request = ListContextsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListContextsPagedResponse> future = contextsClient.listContextsPagedCallable().futureCall(request);
     // Do something
     for (Context element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListContextsRequest,com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsClient this]
    (-> this (.listContextsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ContextsClient this]
    (-> this (.isTerminated))))

(defn update-context-callable
  "Updates the specified context.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     Context context = Context.newBuilder().build();
     UpdateContextRequest request = UpdateContextRequest.newBuilder()
       .setContext(context)
       .build();
     ApiFuture<Context> future = contextsClient.updateContextCallable().futureCall(request);
     // Do something
     Context response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsClient this]
    (-> this (.updateContextCallable))))

(defn list-contexts
  "Returns the list of all contexts in the specified session.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     for (Context element : contextsClient.listContexts(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The session to list all contexts from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.SessionName`

  returns: `com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.ContextsClient$ListContextsPagedResponse [^ContextsClient this ^com.google.cloud.dialogflow.v2beta1.SessionName parent]
    (-> this (.listContexts parent))))

(defn update-context
  "Updates the specified context.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     Context context = Context.newBuilder().build();
     Context response = contextsClient.updateContext(context);
   }

  context - Required. The context to update. - `com.google.cloud.dialogflow.v2beta1.Context`

  returns: `com.google.cloud.dialogflow.v2beta1.Context`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.Context [^ContextsClient this ^com.google.cloud.dialogflow.v2beta1.Context context]
    (-> this (.updateContext context))))

(defn create-context-callable
  "Creates a context.

   If the specified context already exists, overrides the context.

   Sample code:



   try (ContextsClient contextsClient = ContextsClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     Context context = Context.newBuilder().build();
     CreateContextRequest request = CreateContextRequest.newBuilder()
       .setParent(parent.toString())
       .setContext(context)
       .build();
     ApiFuture<Context> future = contextsClient.createContextCallable().futureCall(request);
     // Do something
     Context response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateContextRequest,com.google.cloud.dialogflow.v2beta1.Context>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContextsClient this]
    (-> this (.createContextCallable))))

(defn shutdown-now
  ""
  ([^ContextsClient this]
    (-> this (.shutdownNow))))

