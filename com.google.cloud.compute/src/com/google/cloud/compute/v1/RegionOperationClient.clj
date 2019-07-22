(ns com.google.cloud.compute.v1.RegionOperationClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
    ProjectRegionOperationName operation = ProjectRegionOperationName.of(\"[PROJECT]\", \"[REGION]\", \"[OPERATION]\");
    regionOperationClient.deleteRegionOperation(operation);
  }

  Note: close() needs to be called on the regionOperationClient object to clean up resources
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

  This class can be customized by passing in a custom instance of RegionOperationSettings to
  create(). For example:

  To customize credentials:



  RegionOperationSettings regionOperationSettings =
      RegionOperationSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionOperationClient regionOperationClient =
      RegionOperationClient.create(regionOperationSettings);

  To customize the endpoint:



  RegionOperationSettings regionOperationSettings =
      RegionOperationSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionOperationClient regionOperationClient =
      RegionOperationClient.create(regionOperationSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionOperationClient]))

(defn *create
  "Constructs an instance of RegionOperationClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RegionOperationSettings`

  returns: `com.google.cloud.compute.v1.RegionOperationClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionOperationClient [^com.google.cloud.compute.v1.RegionOperationSettings settings]
    (RegionOperationClient/create settings))
  (^com.google.cloud.compute.v1.RegionOperationClient []
    (RegionOperationClient/create )))

(defn delete-region-operation
  "Deletes the specified region-specific Operations resource.

   Sample code:



   try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
     ProjectRegionOperationName operation = ProjectRegionOperationName.of(\"[PROJECT]\", \"[REGION]\", \"[OPERATION]\");
     regionOperationClient.deleteRegionOperation(operation);
   }

  operation - Name of the Operations resource to delete. - `com.google.cloud.compute.v1.ProjectRegionOperationName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^RegionOperationClient this ^com.google.cloud.compute.v1.ProjectRegionOperationName operation]
    (-> this (.deleteRegionOperation operation))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionOperationSettings`"
  (^com.google.cloud.compute.v1.RegionOperationSettings [^RegionOperationClient this]
    (-> this (.getSettings))))

(defn list-region-operations-paged-callable
  "Retrieves a list of Operation resources contained within the specified region.

   Sample code:



   try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionOperationsHttpRequest request = ListRegionOperationsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRegionOperationsPagedResponse> future = regionOperationClient.listRegionOperationsPagedCallable().futureCall(request);
     // Do something
     for (Operation element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionOperationClient this]
    (-> this (.listRegionOperationsPagedCallable))))

(defn get-region-operation
  "Retrieves the specified region-specific Operations resource.

   Sample code:



   try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
     ProjectRegionOperationName operation = ProjectRegionOperationName.of(\"[PROJECT]\", \"[REGION]\", \"[OPERATION]\");
     Operation response = regionOperationClient.getRegionOperation(operation);
   }

  operation - Name of the Operations resource to return. - `com.google.cloud.compute.v1.ProjectRegionOperationName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionOperationClient this ^com.google.cloud.compute.v1.ProjectRegionOperationName operation]
    (-> this (.getRegionOperation operation))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionOperationStub`"
  ([^RegionOperationClient this]
    (-> this (.getStub))))

(defn delete-region-operation-callable
  "Deletes the specified region-specific Operations resource.

   Sample code:



   try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
     String formattedOperation = ProjectRegionOperationName.format(\"[PROJECT]\", \"[REGION]\", \"[OPERATION]\");
     DeleteRegionOperationHttpRequest request = DeleteRegionOperationHttpRequest.newBuilder()
       .setOperation(formattedOperation)
       .build();
     ApiFuture<Void> future = regionOperationClient.deleteRegionOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionOperationClient this]
    (-> this (.deleteRegionOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionOperationClient this]
    (-> this (.isShutdown))))

(defn get-region-operation-callable
  "Retrieves the specified region-specific Operations resource.

   Sample code:



   try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
     String formattedOperation = ProjectRegionOperationName.format(\"[PROJECT]\", \"[REGION]\", \"[OPERATION]\");
     GetRegionOperationHttpRequest request = GetRegionOperationHttpRequest.newBuilder()
       .setOperation(formattedOperation)
       .build();
     ApiFuture<Operation> future = regionOperationClient.getRegionOperationCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionOperationClient this]
    (-> this (.getRegionOperationCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionOperationClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^RegionOperationClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^RegionOperationClient this]
    (-> this (.close))))

(defn list-region-operations
  "Retrieves a list of Operation resources contained within the specified region.

   Sample code:



   try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (Operation element : regionOperationClient.listRegionOperations(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPagedResponse [^RegionOperationClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRegionOperations region))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionOperationClient this]
    (-> this (.isTerminated))))

(defn list-region-operations-callable
  "Retrieves a list of Operation resources contained within the specified region.

   Sample code:



   try (RegionOperationClient regionOperationClient = RegionOperationClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionOperationsHttpRequest request = ListRegionOperationsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       OperationList response = regionOperationClient.listRegionOperationsCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionOperationClient this]
    (-> this (.listRegionOperationsCallable))))

(defn shutdown-now
  ""
  ([^RegionOperationClient this]
    (-> this (.shutdownNow))))

