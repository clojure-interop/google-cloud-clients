(ns com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient
  "Service Description: Manages knowledge bases.

  Allows users to setup and maintain knowledge bases with their knowledge data.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
    KnowledgeBaseName name = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
    KnowledgeBase response = knowledgeBasesClient.getKnowledgeBase(name);
  }

  Note: close() needs to be called on the knowledgeBasesClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of KnowledgeBasesSettings to
  create(). For example:

  To customize credentials:



  KnowledgeBasesSettings knowledgeBasesSettings =
      KnowledgeBasesSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  KnowledgeBasesClient knowledgeBasesClient =
      KnowledgeBasesClient.create(knowledgeBasesSettings);

  To customize the endpoint:



  KnowledgeBasesSettings knowledgeBasesSettings =
      KnowledgeBasesSettings.newBuilder().setEndpoint(myEndpoint).build();
  KnowledgeBasesClient knowledgeBasesClient =
      KnowledgeBasesClient.create(knowledgeBasesSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 KnowledgeBasesClient]))

(defn *create
  "Constructs an instance of KnowledgeBasesClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient [^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings settings]
    (KnowledgeBasesClient/create settings))
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient []
    (KnowledgeBasesClient/create )))

(defn create-knowledge-base-callable
  "Creates a knowledge base.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
     CreateKnowledgeBaseRequest request = CreateKnowledgeBaseRequest.newBuilder()
       .setParent(parent.toString())
       .setKnowledgeBase(knowledgeBase)
       .build();
     ApiFuture<KnowledgeBase> future = knowledgeBasesClient.createKnowledgeBaseCallable().futureCall(request);
     // Do something
     KnowledgeBase response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesClient this]
    (-> this (.createKnowledgeBaseCallable))))

(defn update-knowledge-base-callable
  "Updates the specified knowledge base.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
     UpdateKnowledgeBaseRequest request = UpdateKnowledgeBaseRequest.newBuilder()
       .setKnowledgeBase(knowledgeBase)
       .build();
     ApiFuture<KnowledgeBase> future = knowledgeBasesClient.updateKnowledgeBaseCallable().futureCall(request);
     // Do something
     KnowledgeBase response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.UpdateKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesClient this]
    (-> this (.updateKnowledgeBaseCallable))))

(defn list-knowledge-bases-paged-callable
  "Returns the list of all knowledge bases of the specified agent.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListKnowledgeBasesRequest request = ListKnowledgeBasesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListKnowledgeBasesPagedResponse> future = knowledgeBasesClient.listKnowledgeBasesPagedCallable().futureCall(request);
     // Do something
     for (KnowledgeBase element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesClient this]
    (-> this (.listKnowledgeBasesPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings`"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesSettings [^KnowledgeBasesClient this]
    (-> this (.getSettings))))

(defn list-knowledge-bases
  "Returns the list of all knowledge bases of the specified agent.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     for (KnowledgeBase element : knowledgeBasesClient.listKnowledgeBases(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The project to list of knowledge bases for. Format: `projects/<Project ID>`. - `com.google.cloud.dialogflow.v2beta1.ProjectName`

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBasesClient$ListKnowledgeBasesPagedResponse [^KnowledgeBasesClient this ^com.google.cloud.dialogflow.v2beta1.ProjectName parent]
    (-> this (.listKnowledgeBases parent))))

(defn get-knowledge-base
  "Retrieves the specified knowledge base.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     KnowledgeBaseName name = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     KnowledgeBase response = knowledgeBasesClient.getKnowledgeBase(name);
   }

  name - Required. The name of the knowledge base to retrieve. Format `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`. - `com.google.cloud.dialogflow.v2beta1.KnowledgeBaseName`

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBase`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBase [^KnowledgeBasesClient this ^com.google.cloud.dialogflow.v2beta1.KnowledgeBaseName name]
    (-> this (.getKnowledgeBase name))))

(defn delete-knowledge-base
  "Deletes the specified knowledge base.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     KnowledgeBaseName name = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     knowledgeBasesClient.deleteKnowledgeBase(name);
   }

  name - Required. The name of the knowledge base to delete. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`. - `com.google.cloud.dialogflow.v2beta1.KnowledgeBaseName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^KnowledgeBasesClient this ^com.google.cloud.dialogflow.v2beta1.KnowledgeBaseName name]
    (-> this (.deleteKnowledgeBase name))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2beta1.stub.KnowledgeBasesStub`"
  ([^KnowledgeBasesClient this]
    (-> this (.getStub))))

(defn get-knowledge-base-callable
  "Retrieves the specified knowledge base.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     KnowledgeBaseName name = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     GetKnowledgeBaseRequest request = GetKnowledgeBaseRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<KnowledgeBase> future = knowledgeBasesClient.getKnowledgeBaseCallable().futureCall(request);
     // Do something
     KnowledgeBase response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.GetKnowledgeBaseRequest,com.google.cloud.dialogflow.v2beta1.KnowledgeBase>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesClient this]
    (-> this (.getKnowledgeBaseCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^KnowledgeBasesClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^KnowledgeBasesClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^KnowledgeBasesClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^KnowledgeBasesClient this]
    (-> this (.close))))

(defn create-knowledge-base
  "Creates a knowledge base.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
     KnowledgeBase response = knowledgeBasesClient.createKnowledgeBase(parent, knowledgeBase);
   }

  parent - Required. The project to create a knowledge base for. Format: `projects/<Project ID>`. - `com.google.cloud.dialogflow.v2beta1.ProjectName`
  knowledge-base - Required. The knowledge base to create. - `com.google.cloud.dialogflow.v2beta1.KnowledgeBase`

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBase`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBase [^KnowledgeBasesClient this ^com.google.cloud.dialogflow.v2beta1.ProjectName parent ^com.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge-base]
    (-> this (.createKnowledgeBase parent knowledge-base)))
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBase [^KnowledgeBasesClient this ^com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest request]
    (-> this (.createKnowledgeBase request))))

(defn list-knowledge-bases-callable
  "Returns the list of all knowledge bases of the specified agent.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListKnowledgeBasesRequest request = ListKnowledgeBasesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListKnowledgeBasesResponse response = knowledgeBasesClient.listKnowledgeBasesCallable().call(request);
       for (KnowledgeBase element : response.getKnowledgeBasesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesRequest,com.google.cloud.dialogflow.v2beta1.ListKnowledgeBasesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesClient this]
    (-> this (.listKnowledgeBasesCallable))))

(defn update-knowledge-base
  "Updates the specified knowledge base.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     KnowledgeBase knowledgeBase = KnowledgeBase.newBuilder().build();
     KnowledgeBase response = knowledgeBasesClient.updateKnowledgeBase(knowledgeBase);
   }

  knowledge-base - Required. The knowledge base to update. - `com.google.cloud.dialogflow.v2beta1.KnowledgeBase`

  returns: `com.google.cloud.dialogflow.v2beta1.KnowledgeBase`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2beta1.KnowledgeBase [^KnowledgeBasesClient this ^com.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge-base]
    (-> this (.updateKnowledgeBase knowledge-base))))

(defn delete-knowledge-base-callable
  "Deletes the specified knowledge base.

   Note: The `projects.agent.knowledgeBases` resource is deprecated; only use
   `projects.knowledgeBases`.

   Sample code:



   try (KnowledgeBasesClient knowledgeBasesClient = KnowledgeBasesClient.create()) {
     KnowledgeBaseName name = KnowledgeBaseName.of(\"[PROJECT]\", \"[KNOWLEDGE_BASE]\");
     DeleteKnowledgeBaseRequest request = DeleteKnowledgeBaseRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = knowledgeBasesClient.deleteKnowledgeBaseCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2beta1.DeleteKnowledgeBaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KnowledgeBasesClient this]
    (-> this (.deleteKnowledgeBaseCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^KnowledgeBasesClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^KnowledgeBasesClient this]
    (-> this (.shutdownNow))))

