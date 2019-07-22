(ns com.google.cloud.compute.v1.ZoneOperationClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
    ProjectZoneOperationName operation = ProjectZoneOperationName.of(\"[PROJECT]\", \"[ZONE]\", \"[OPERATION]\");
    zoneOperationClient.deleteZoneOperation(operation);
  }

  Note: close() needs to be called on the zoneOperationClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of ZoneOperationSettings to
  create(). For example:

  To customize credentials:



  ZoneOperationSettings zoneOperationSettings =
      ZoneOperationSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ZoneOperationClient zoneOperationClient =
      ZoneOperationClient.create(zoneOperationSettings);

  To customize the endpoint:



  ZoneOperationSettings zoneOperationSettings =
      ZoneOperationSettings.newBuilder().setEndpoint(myEndpoint).build();
  ZoneOperationClient zoneOperationClient =
      ZoneOperationClient.create(zoneOperationSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ZoneOperationClient]))

(defn *create
  "Constructs an instance of ZoneOperationClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.ZoneOperationSettings`

  returns: `com.google.cloud.compute.v1.ZoneOperationClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ZoneOperationClient [^com.google.cloud.compute.v1.ZoneOperationSettings settings]
    (ZoneOperationClient/create settings))
  (^com.google.cloud.compute.v1.ZoneOperationClient []
    (ZoneOperationClient/create )))

(defn get-zone-operation
  "Retrieves the specified zone-specific Operations resource.

   Sample code:



   try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
     ProjectZoneOperationName operation = ProjectZoneOperationName.of(\"[PROJECT]\", \"[ZONE]\", \"[OPERATION]\");
     Operation response = zoneOperationClient.getZoneOperation(operation);
   }

  operation - Name of the Operations resource to return. - `com.google.cloud.compute.v1.ProjectZoneOperationName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ZoneOperationClient this ^com.google.cloud.compute.v1.ProjectZoneOperationName operation]
    (-> this (.getZoneOperation operation))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.ZoneOperationSettings`"
  (^com.google.cloud.compute.v1.ZoneOperationSettings [^ZoneOperationClient this]
    (-> this (.getSettings))))

(defn list-zone-operations-paged-callable
  "Retrieves a list of Operation resources contained within the specified zone.

   Sample code:



   try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListZoneOperationsHttpRequest request = ListZoneOperationsHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListZoneOperationsPagedResponse> future = zoneOperationClient.listZoneOperationsPagedCallable().futureCall(request);
     // Do something
     for (Operation element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneOperationClient this]
    (-> this (.listZoneOperationsPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ZoneOperationStub`"
  ([^ZoneOperationClient this]
    (-> this (.getStub))))

(defn get-zone-operation-callable
  "Retrieves the specified zone-specific Operations resource.

   Sample code:



   try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
     String formattedOperation = ProjectZoneOperationName.format(\"[PROJECT]\", \"[ZONE]\", \"[OPERATION]\");
     GetZoneOperationHttpRequest request = GetZoneOperationHttpRequest.newBuilder()
       .setOperation(formattedOperation)
       .build();
     ApiFuture<Operation> future = zoneOperationClient.getZoneOperationCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetZoneOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneOperationClient this]
    (-> this (.getZoneOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ZoneOperationClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ZoneOperationClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ZoneOperationClient this]
    (-> this (.shutdown))))

(defn list-zone-operations
  "Retrieves a list of Operation resources contained within the specified zone.

   Sample code:



   try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (Operation element : zoneOperationClient.listZoneOperations(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - Name of the zone for request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse [^ZoneOperationClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listZoneOperations zone))))

(defn close
  ""
  ([^ZoneOperationClient this]
    (-> this (.close))))

(defn delete-zone-operation
  "Deletes the specified zone-specific Operations resource.

   Sample code:



   try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
     ProjectZoneOperationName operation = ProjectZoneOperationName.of(\"[PROJECT]\", \"[ZONE]\", \"[OPERATION]\");
     zoneOperationClient.deleteZoneOperation(operation);
   }

  operation - Name of the Operations resource to delete. - `com.google.cloud.compute.v1.ProjectZoneOperationName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ZoneOperationClient this ^com.google.cloud.compute.v1.ProjectZoneOperationName operation]
    (-> this (.deleteZoneOperation operation))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ZoneOperationClient this]
    (-> this (.isTerminated))))

(defn delete-zone-operation-callable
  "Deletes the specified zone-specific Operations resource.

   Sample code:



   try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
     String formattedOperation = ProjectZoneOperationName.format(\"[PROJECT]\", \"[ZONE]\", \"[OPERATION]\");
     DeleteZoneOperationHttpRequest request = DeleteZoneOperationHttpRequest.newBuilder()
       .setOperation(formattedOperation)
       .build();
     ApiFuture<Void> future = zoneOperationClient.deleteZoneOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneOperationClient this]
    (-> this (.deleteZoneOperationCallable))))

(defn shutdown-now
  ""
  ([^ZoneOperationClient this]
    (-> this (.shutdownNow))))

(defn list-zone-operations-callable
  "Retrieves a list of Operation resources contained within the specified zone.

   Sample code:



   try (ZoneOperationClient zoneOperationClient = ZoneOperationClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListZoneOperationsHttpRequest request = ListZoneOperationsHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       OperationList response = zoneOperationClient.listZoneOperationsCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneOperationClient this]
    (-> this (.listZoneOperationsCallable))))

