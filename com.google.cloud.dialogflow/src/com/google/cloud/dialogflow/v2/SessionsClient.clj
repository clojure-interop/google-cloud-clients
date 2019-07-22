(ns com.google.cloud.dialogflow.v2.SessionsClient
  "Service Description: A session represents an interaction with a user. You retrieve user input and
  pass it to the [DetectIntent][google.cloud.dialogflow.v2.Sessions.DetectIntent] (or
  [StreamingDetectIntent][google.cloud.dialogflow.v2.Sessions.StreamingDetectIntent]) method to
  determine user intent and respond.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SessionsClient sessionsClient = SessionsClient.create()) {
    SessionName session = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
    QueryInput queryInput = QueryInput.newBuilder().build();
    DetectIntentResponse response = sessionsClient.detectIntent(session, queryInput);
  }

  Note: close() needs to be called on the sessionsClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of SessionsSettings to create().
  For example:

  To customize credentials:



  SessionsSettings sessionsSettings =
      SessionsSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SessionsClient sessionsClient =
      SessionsClient.create(sessionsSettings);

  To customize the endpoint:



  SessionsSettings sessionsSettings =
      SessionsSettings.newBuilder().setEndpoint(myEndpoint).build();
  SessionsClient sessionsClient =
      SessionsClient.create(sessionsSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2 SessionsClient]))

(defn *create
  "Constructs an instance of SessionsClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dialogflow.v2.SessionsSettings`

  returns: `com.google.cloud.dialogflow.v2.SessionsClient`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.SessionsClient [^com.google.cloud.dialogflow.v2.SessionsSettings settings]
    (SessionsClient/create settings))
  (^com.google.cloud.dialogflow.v2.SessionsClient []
    (SessionsClient/create )))

(defn get-settings
  "returns: `com.google.cloud.dialogflow.v2.SessionsSettings`"
  (^com.google.cloud.dialogflow.v2.SessionsSettings [^SessionsClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2.stub.SessionsStub`"
  ([^SessionsClient this]
    (-> this (.getStub))))

(defn streaming-detect-intent-callable
  "Processes a natural language query in audio format in a streaming fashion and returns
   structured, actionable data as a result. This method is only available via the gRPC API (not
   REST).

   Sample code:



   try (SessionsClient sessionsClient = SessionsClient.create()) {
     BidiStream<StreamingDetectIntentRequest, StreamingDetectIntentResponse> bidiStream =
         sessionsClient.streamingDetectIntentCallable().call();

     String session = \"\";
     QueryInput queryInput = QueryInput.newBuilder().build();
     StreamingDetectIntentRequest request = StreamingDetectIntentRequest.newBuilder()
       .setSession(session)
       .setQueryInput(queryInput)
       .build();
     bidiStream.send(request);
     for (StreamingDetectIntentResponse response : bidiStream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.dialogflow.v2.StreamingDetectIntentRequest,com.google.cloud.dialogflow.v2.StreamingDetectIntentResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^SessionsClient this]
    (-> this (.streamingDetectIntentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SessionsClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SessionsClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^SessionsClient this]
    (-> this (.shutdown))))

(defn detect-intent-callable
  "Processes a natural language query and returns structured, actionable data as a result. This
   method is not idempotent, because it may cause contexts and session entity types to be updated,
   which in turn might affect results of future queries.

   Sample code:



   try (SessionsClient sessionsClient = SessionsClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     QueryInput queryInput = QueryInput.newBuilder().build();
     DetectIntentRequest request = DetectIntentRequest.newBuilder()
       .setSession(session.toString())
       .setQueryInput(queryInput)
       .build();
     ApiFuture<DetectIntentResponse> future = sessionsClient.detectIntentCallable().futureCall(request);
     // Do something
     DetectIntentResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.DetectIntentRequest,com.google.cloud.dialogflow.v2.DetectIntentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionsClient this]
    (-> this (.detectIntentCallable))))

(defn close
  ""
  ([^SessionsClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SessionsClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^SessionsClient this]
    (-> this (.shutdownNow))))

(defn detect-intent
  "Processes a natural language query and returns structured, actionable data as a result. This
   method is not idempotent, because it may cause contexts and session entity types to be updated,
   which in turn might affect results of future queries.

   Sample code:



   try (SessionsClient sessionsClient = SessionsClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     QueryInput queryInput = QueryInput.newBuilder().build();
     DetectIntentResponse response = sessionsClient.detectIntent(session, queryInput);
   }

  session - Required. The name of the session this query is sent to. Format: `projects/<Project ID>/agent/sessions/<Session ID>`. It's up to the API caller to choose an appropriate session ID. It can be a random number or some type of user identifier (preferably hashed). The length of the session ID must not exceed 36 bytes. - `com.google.cloud.dialogflow.v2.SessionName`
  query-input - Required. The input specification. It can be set to: 1. an audio config which instructs the speech recognizer how to process the speech audio, 2. a conversational query in the form of text, or 3. an event that specifies which intent to trigger. - `com.google.cloud.dialogflow.v2.QueryInput`

  returns: `com.google.cloud.dialogflow.v2.DetectIntentResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2.DetectIntentResponse [^SessionsClient this ^com.google.cloud.dialogflow.v2.SessionName session ^com.google.cloud.dialogflow.v2.QueryInput query-input]
    (-> this (.detectIntent session query-input)))
  (^com.google.cloud.dialogflow.v2.DetectIntentResponse [^SessionsClient this ^com.google.cloud.dialogflow.v2.DetectIntentRequest request]
    (-> this (.detectIntent request))))

