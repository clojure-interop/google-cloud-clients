(ns com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient
  "Service Description: Entities are extracted from user input and represent parameters that are
  meaningful to your application. For example, a date range, a proper name such as a geographic
  location or landmark, and so on. Entities represent actionable data for your application.

  Session entity types are referred to as **User** entity types and are entities
  that are built for an individual user such as favorites, preferences, playlists, and so on. You
  can redefine a session entity type at the session level.

  For more information about entity types, see the [Dialogflow
  documentation](https://cloud.google.com/dialogflow/docs/entities-overview).

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
    SessionEntityTypeName name = SessionEntityTypeName.of(\"[PROJECT]\", \"[SESSION]\", \"[ENTITY_TYPE]\");
    SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
  }

  Note: close() needs to be called on the sessionEntityTypesClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

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

  This class can be customized by passing in a custom instance of SessionEntityTypesSettings to
  create(). For example:

  To customize credentials:



  SessionEntityTypesSettings sessionEntityTypesSettings =
      SessionEntityTypesSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SessionEntityTypesClient sessionEntityTypesClient =
      SessionEntityTypesClient.create(sessionEntityTypesSettings);

  To customize the endpoint:



  SessionEntityTypesSettings sessionEntityTypesSettings =
      SessionEntityTypesSettings.newBuilder().setEndpoint(myEndpoint).build();
  SessionEntityTypesClient sessionEntityTypesClient =
      SessionEntityTypesClient.create(sessionEntityTypesSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 SessionEntityTypesClient]))

(defn *create
  "Constructs an instance of SessionEntityTypesClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient [^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings settings]
    (SessionEntityTypesClient/create settings))
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient []
    (SessionEntityTypesClient/create )))

(defn get-settings
  "returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings`"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesSettings [^SessionEntityTypesClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.SessionEntityTypesStub`"
  ([^SessionEntityTypesClient this]
    (-> this (.getStub))))

(defn delete-session-entity-type
  "Deletes the specified session entity type.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionEntityTypeName name = SessionEntityTypeName.of(\"[PROJECT]\", \"[SESSION]\", \"[ENTITY_TYPE]\");
     sessionEntityTypesClient.deleteSessionEntityType(name);
   }

  name - Required. The name of the entity type to delete. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.SessionEntityTypeName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^SessionEntityTypesClient this ^com.google.cloud.dialogflow.v2beta1.SessionEntityTypeName name]
    (-> this (.deleteSessionEntityType name))))

(defn list-session-entity-types-paged-callable
  "Returns the list of all session entity types in the specified session.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     ListSessionEntityTypesRequest request = ListSessionEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListSessionEntityTypesPagedResponse> future = sessionEntityTypesClient.listSessionEntityTypesPagedCallable().futureCall(request);
     // Do something
     for (SessionEntityType element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesClient this]
    (-> this (.listSessionEntityTypesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SessionEntityTypesClient this]
    (-> this (.isShutdown))))

(defn get-session-entity-type
  "Retrieves the specified session entity type.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionEntityTypeName name = SessionEntityTypeName.of(\"[PROJECT]\", \"[SESSION]\", \"[ENTITY_TYPE]\");
     SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
   }

  name - Required. The name of the session entity type. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.SessionEntityTypeName`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityType [^SessionEntityTypesClient this ^com.google.cloud.dialogflow.v2beta1.SessionEntityTypeName name]
    (-> this (.getSessionEntityType name))))

(defn create-session-entity-type-callable
  "Creates a session entity type.

   If the specified session entity type already exists, overrides the session entity type.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
     CreateSessionEntityTypeRequest request = CreateSessionEntityTypeRequest.newBuilder()
       .setParent(parent.toString())
       .setSessionEntityType(sessionEntityType)
       .build();
     ApiFuture<SessionEntityType> future = sessionEntityTypesClient.createSessionEntityTypeCallable().futureCall(request);
     // Do something
     SessionEntityType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesClient this]
    (-> this (.createSessionEntityTypeCallable))))

(defn list-session-entity-types-callable
  "Returns the list of all session entity types in the specified session.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     ListSessionEntityTypesRequest request = ListSessionEntityTypesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListSessionEntityTypesResponse response = sessionEntityTypesClient.listSessionEntityTypesCallable().call(request);
       for (SessionEntityType element : response.getSessionEntityTypesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest,com.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesClient this]
    (-> this (.listSessionEntityTypesCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SessionEntityTypesClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^SessionEntityTypesClient this]
    (-> this (.shutdown))))

(defn delete-session-entity-type-callable
  "Deletes the specified session entity type.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionEntityTypeName name = SessionEntityTypeName.of(\"[PROJECT]\", \"[SESSION]\", \"[ENTITY_TYPE]\");
     DeleteSessionEntityTypeRequest request = DeleteSessionEntityTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = sessionEntityTypesClient.deleteSessionEntityTypeCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesClient this]
    (-> this (.deleteSessionEntityTypeCallable))))

(defn get-session-entity-type-callable
  "Retrieves the specified session entity type.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionEntityTypeName name = SessionEntityTypeName.of(\"[PROJECT]\", \"[SESSION]\", \"[ENTITY_TYPE]\");
     GetSessionEntityTypeRequest request = GetSessionEntityTypeRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<SessionEntityType> future = sessionEntityTypesClient.getSessionEntityTypeCallable().futureCall(request);
     // Do something
     SessionEntityType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesClient this]
    (-> this (.getSessionEntityTypeCallable))))

(defn update-session-entity-type-callable
  "Updates the specified session entity type.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
     UpdateSessionEntityTypeRequest request = UpdateSessionEntityTypeRequest.newBuilder()
       .setSessionEntityType(sessionEntityType)
       .build();
     ApiFuture<SessionEntityType> future = sessionEntityTypesClient.updateSessionEntityTypeCallable().futureCall(request);
     // Do something
     SessionEntityType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest,com.google.cloud.dialogflow.v2beta1.SessionEntityType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SessionEntityTypesClient this]
    (-> this (.updateSessionEntityTypeCallable))))

(defn update-session-entity-type
  "Updates the specified session entity type.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
     SessionEntityType response = sessionEntityTypesClient.updateSessionEntityType(sessionEntityType);
   }

  session-entity-type - Required. The entity type to update. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.SessionEntityType`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityType [^SessionEntityTypesClient this ^com.google.cloud.dialogflow.v2beta1.SessionEntityType session-entity-type]
    (-> this (.updateSessionEntityType session-entity-type))))

(defn create-session-entity-type
  "Creates a session entity type.

   If the specified session entity type already exists, overrides the session entity type.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
     SessionEntityType response = sessionEntityTypesClient.createSessionEntityType(parent, sessionEntityType);
   }

  parent - Required. The session to create a session entity type for. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/ sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.SessionName`
  session-entity-type - Required. The session entity type to create. - `com.google.cloud.dialogflow.v2beta1.SessionEntityType`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityType [^SessionEntityTypesClient this ^com.google.cloud.dialogflow.v2beta1.SessionName parent ^com.google.cloud.dialogflow.v2beta1.SessionEntityType session-entity-type]
    (-> this (.createSessionEntityType parent session-entity-type)))
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityType [^SessionEntityTypesClient this ^com.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest request]
    (-> this (.createSessionEntityType request))))

(defn close
  ""
  ([^SessionEntityTypesClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SessionEntityTypesClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^SessionEntityTypesClient this]
    (-> this (.shutdownNow))))

(defn list-session-entity-types
  "Returns the list of all session entity types in the specified session.

   Sample code:



   try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
     SessionName parent = SessionName.of(\"[PROJECT]\", \"[SESSION]\");
     for (SessionEntityType element : sessionEntityTypesClient.listSessionEntityTypes(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The session to list all session entity types from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/ sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. - `com.google.cloud.dialogflow.v2beta1.SessionName`

  returns: `com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient$ListSessionEntityTypesPagedResponse [^SessionEntityTypesClient this ^com.google.cloud.dialogflow.v2beta1.SessionName parent]
    (-> this (.listSessionEntityTypes parent))))

