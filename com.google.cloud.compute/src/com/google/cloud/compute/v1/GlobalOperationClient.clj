(ns com.google.cloud.compute.v1.GlobalOperationClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
    ProjectGlobalOperationName operation = ProjectGlobalOperationName.of(\"[PROJECT]\", \"[OPERATION]\");
    globalOperationClient.deleteGlobalOperation(operation);
  }

  Note: close() needs to be called on the globalOperationClient object to clean up resources
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

  This class can be customized by passing in a custom instance of GlobalOperationSettings to
  create(). For example:

  To customize credentials:



  GlobalOperationSettings globalOperationSettings =
      GlobalOperationSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  GlobalOperationClient globalOperationClient =
      GlobalOperationClient.create(globalOperationSettings);

  To customize the endpoint:



  GlobalOperationSettings globalOperationSettings =
      GlobalOperationSettings.newBuilder().setEndpoint(myEndpoint).build();
  GlobalOperationClient globalOperationClient =
      GlobalOperationClient.create(globalOperationSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalOperationClient]))

(defn *create
  "Constructs an instance of GlobalOperationClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.GlobalOperationSettings`

  returns: `com.google.cloud.compute.v1.GlobalOperationClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.GlobalOperationClient [^com.google.cloud.compute.v1.GlobalOperationSettings settings]
    (GlobalOperationClient/create settings))
  (^com.google.cloud.compute.v1.GlobalOperationClient []
    (GlobalOperationClient/create )))

(defn list-global-operations
  "Retrieves a list of Operation resources contained within the specified project.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Operation element : globalOperationClient.listGlobalOperations(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.GlobalOperationClient$ListGlobalOperationsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.GlobalOperationClient$ListGlobalOperationsPagedResponse [^GlobalOperationClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listGlobalOperations project))))

(defn get-global-operation-callable
  "Retrieves the specified Operations resource. Gets a list of operations by making a list()
   request.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     String formattedOperation = ProjectGlobalOperationName.format(\"[PROJECT]\", \"[OPERATION]\");
     GetGlobalOperationHttpRequest request = GetGlobalOperationHttpRequest.newBuilder()
       .setOperation(formattedOperation)
       .build();
     ApiFuture<Operation> future = globalOperationClient.getGlobalOperationCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationClient this]
    (-> this (.getGlobalOperationCallable))))

(defn aggregated-list-global-operations-paged-callable
  "Retrieves an aggregated list of all operations.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListGlobalOperationsHttpRequest request = AggregatedListGlobalOperationsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListGlobalOperationsPagedResponse> future = globalOperationClient.aggregatedListGlobalOperationsPagedCallable().futureCall(request);
     // Do something
     for (OperationsScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.GlobalOperationClient$AggregatedListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationClient this]
    (-> this (.aggregatedListGlobalOperationsPagedCallable))))

(defn get-global-operation
  "Retrieves the specified Operations resource. Gets a list of operations by making a list()
   request.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     ProjectGlobalOperationName operation = ProjectGlobalOperationName.of(\"[PROJECT]\", \"[OPERATION]\");
     Operation response = globalOperationClient.getGlobalOperation(operation);
   }

  operation - Name of the Operations resource to return. - `com.google.cloud.compute.v1.ProjectGlobalOperationName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^GlobalOperationClient this ^com.google.cloud.compute.v1.ProjectGlobalOperationName operation]
    (-> this (.getGlobalOperation operation))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.GlobalOperationSettings`"
  (^com.google.cloud.compute.v1.GlobalOperationSettings [^GlobalOperationClient this]
    (-> this (.getSettings))))

(defn list-global-operations-paged-callable
  "Retrieves a list of Operation resources contained within the specified project.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListGlobalOperationsHttpRequest request = ListGlobalOperationsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListGlobalOperationsPagedResponse> future = globalOperationClient.listGlobalOperationsPagedCallable().futureCall(request);
     // Do something
     for (Operation element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.GlobalOperationClient$ListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationClient this]
    (-> this (.listGlobalOperationsPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.GlobalOperationStub`"
  ([^GlobalOperationClient this]
    (-> this (.getStub))))

(defn aggregated-list-global-operations-callable
  "Retrieves an aggregated list of all operations.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListGlobalOperationsHttpRequest request = AggregatedListGlobalOperationsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       OperationAggregatedList response = globalOperationClient.aggregatedListGlobalOperationsCallable().call(request);
       for (OperationsScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationClient this]
    (-> this (.aggregatedListGlobalOperationsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GlobalOperationClient this]
    (-> this (.isShutdown))))

(defn delete-global-operation
  "Deletes the specified Operations resource.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     ProjectGlobalOperationName operation = ProjectGlobalOperationName.of(\"[PROJECT]\", \"[OPERATION]\");
     globalOperationClient.deleteGlobalOperation(operation);
   }

  operation - Name of the Operations resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalOperationName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GlobalOperationClient this ^com.google.cloud.compute.v1.ProjectGlobalOperationName operation]
    (-> this (.deleteGlobalOperation operation))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GlobalOperationClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GlobalOperationClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GlobalOperationClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GlobalOperationClient this]
    (-> this (.isTerminated))))

(defn delete-global-operation-callable
  "Deletes the specified Operations resource.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     String formattedOperation = ProjectGlobalOperationName.format(\"[PROJECT]\", \"[OPERATION]\");
     DeleteGlobalOperationHttpRequest request = DeleteGlobalOperationHttpRequest.newBuilder()
       .setOperation(formattedOperation)
       .build();
     ApiFuture<Void> future = globalOperationClient.deleteGlobalOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationClient this]
    (-> this (.deleteGlobalOperationCallable))))

(defn list-global-operations-callable
  "Retrieves a list of Operation resources contained within the specified project.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListGlobalOperationsHttpRequest request = ListGlobalOperationsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       OperationList response = globalOperationClient.listGlobalOperationsCallable().call(request);
       for (Operation element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationClient this]
    (-> this (.listGlobalOperationsCallable))))

(defn shutdown-now
  ""
  ([^GlobalOperationClient this]
    (-> this (.shutdownNow))))

(defn aggregated-list-global-operations
  "Retrieves an aggregated list of all operations.

   Sample code:



   try (GlobalOperationClient globalOperationClient = GlobalOperationClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (OperationsScopedList element : globalOperationClient.aggregatedListGlobalOperations(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.GlobalOperationClient$AggregatedListGlobalOperationsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.GlobalOperationClient$AggregatedListGlobalOperationsPagedResponse [^GlobalOperationClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListGlobalOperations project))))

