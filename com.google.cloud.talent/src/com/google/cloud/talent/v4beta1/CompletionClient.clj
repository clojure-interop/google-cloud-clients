(ns com.google.cloud.talent.v4beta1.CompletionClient
  "Service Description: A service handles auto completion.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (CompletionClient completionClient = CompletionClient.create()) {
    TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
    String query = \"\";
    int pageSize = 0;
    CompleteQueryRequest request = CompleteQueryRequest.newBuilder()
      .setParent(parent.toString())
      .setQuery(query)
      .setPageSize(pageSize)
      .build();
    CompleteQueryResponse response = completionClient.completeQuery(request);
  }

  Note: close() needs to be called on the completionClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of CompletionSettings to
  create(). For example:

  To customize credentials:



  CompletionSettings completionSettings =
      CompletionSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  CompletionClient completionClient =
      CompletionClient.create(completionSettings);

  To customize the endpoint:



  CompletionSettings completionSettings =
      CompletionSettings.newBuilder().setEndpoint(myEndpoint).build();
  CompletionClient completionClient =
      CompletionClient.create(completionSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 CompletionClient]))

(defn *create
  "Constructs an instance of CompletionClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.talent.v4beta1.CompletionSettings`

  returns: `com.google.cloud.talent.v4beta1.CompletionClient`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.CompletionClient [^com.google.cloud.talent.v4beta1.CompletionSettings settings]
    (CompletionClient/create settings))
  (^com.google.cloud.talent.v4beta1.CompletionClient []
    (CompletionClient/create )))

(defn get-settings
  "returns: `com.google.cloud.talent.v4beta1.CompletionSettings`"
  (^com.google.cloud.talent.v4beta1.CompletionSettings [^CompletionClient this]
    (-> this (.getSettings))))

(defn complete-query-callable
  "Completes the specified prefix with keyword suggestions. Intended for use by a job search
   auto-complete search box.

   Sample code:



   try (CompletionClient completionClient = CompletionClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     String query = \"\";
     int pageSize = 0;
     CompleteQueryRequest request = CompleteQueryRequest.newBuilder()
       .setParent(parent.toString())
       .setQuery(query)
       .setPageSize(pageSize)
       .build();
     ApiFuture<CompleteQueryResponse> future = completionClient.completeQueryCallable().futureCall(request);
     // Do something
     CompleteQueryResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CompleteQueryRequest,com.google.cloud.talent.v4beta1.CompleteQueryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CompletionClient this]
    (-> this (.completeQueryCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.CompletionStub`"
  ([^CompletionClient this]
    (-> this (.getStub))))

(defn complete-query
  "Completes the specified prefix with keyword suggestions. Intended for use by a job search
   auto-complete search box.

   Sample code:



   try (CompletionClient completionClient = CompletionClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     String query = \"\";
     int pageSize = 0;
     CompleteQueryRequest request = CompleteQueryRequest.newBuilder()
       .setParent(parent.toString())
       .setQuery(query)
       .setPageSize(pageSize)
       .build();
     CompleteQueryResponse response = completionClient.completeQuery(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.talent.v4beta1.CompleteQueryRequest`

  returns: `com.google.cloud.talent.v4beta1.CompleteQueryResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.CompleteQueryResponse [^CompletionClient this ^com.google.cloud.talent.v4beta1.CompleteQueryRequest request]
    (-> this (.completeQuery request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^CompletionClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^CompletionClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^CompletionClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^CompletionClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^CompletionClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^CompletionClient this]
    (-> this (.shutdownNow))))

