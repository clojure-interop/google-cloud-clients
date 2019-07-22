(ns com.google.cloud.compute.v1.TargetInstanceClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
    ProjectZoneTargetInstanceName targetInstance = ProjectZoneTargetInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[TARGET_INSTANCE]\");
    Operation response = targetInstanceClient.deleteTargetInstance(targetInstance);
  }

  Note: close() needs to be called on the targetInstanceClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of TargetInstanceSettings to
  create(). For example:

  To customize credentials:



  TargetInstanceSettings targetInstanceSettings =
      TargetInstanceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TargetInstanceClient targetInstanceClient =
      TargetInstanceClient.create(targetInstanceSettings);

  To customize the endpoint:



  TargetInstanceSettings targetInstanceSettings =
      TargetInstanceSettings.newBuilder().setEndpoint(myEndpoint).build();
  TargetInstanceClient targetInstanceClient =
      TargetInstanceClient.create(targetInstanceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetInstanceClient]))

(defn *create
  "Constructs an instance of TargetInstanceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.TargetInstanceSettings`

  returns: `com.google.cloud.compute.v1.TargetInstanceClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetInstanceClient [^com.google.cloud.compute.v1.TargetInstanceSettings settings]
    (TargetInstanceClient/create settings))
  (^com.google.cloud.compute.v1.TargetInstanceClient []
    (TargetInstanceClient/create )))

(defn delete-target-instance-callable
  "Deletes the specified TargetInstance resource.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     String formattedTargetInstance = ProjectZoneTargetInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[TARGET_INSTANCE]\");
     DeleteTargetInstanceHttpRequest request = DeleteTargetInstanceHttpRequest.newBuilder()
       .setTargetInstance(formattedTargetInstance)
       .build();
     ApiFuture<Operation> future = targetInstanceClient.deleteTargetInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceClient this]
    (-> this (.deleteTargetInstanceCallable))))

(defn aggregated-list-target-instances-callable
  "Retrieves an aggregated list of target instances.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListTargetInstancesHttpRequest request = AggregatedListTargetInstancesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       TargetInstanceAggregatedList response = targetInstanceClient.aggregatedListTargetInstancesCallable().call(request);
       for (TargetInstancesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceClient this]
    (-> this (.aggregatedListTargetInstancesCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.TargetInstanceSettings`"
  (^com.google.cloud.compute.v1.TargetInstanceSettings [^TargetInstanceClient this]
    (-> this (.getSettings))))

(defn aggregated-list-target-instances-paged-callable
  "Retrieves an aggregated list of target instances.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListTargetInstancesHttpRequest request = AggregatedListTargetInstancesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListTargetInstancesPagedResponse> future = targetInstanceClient.aggregatedListTargetInstancesPagedCallable().futureCall(request);
     // Do something
     for (TargetInstancesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceClient$AggregatedListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceClient this]
    (-> this (.aggregatedListTargetInstancesPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetInstanceStub`"
  ([^TargetInstanceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TargetInstanceClient this]
    (-> this (.isShutdown))))

(defn insert-target-instance-callable
  "Creates a TargetInstance resource in the specified project and zone using the data included in
   the request.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     TargetInstance targetInstanceResource = TargetInstance.newBuilder().build();
     InsertTargetInstanceHttpRequest request = InsertTargetInstanceHttpRequest.newBuilder()
       .setZone(formattedZone)
       .setTargetInstanceResource(targetInstanceResource)
       .build();
     ApiFuture<Operation> future = targetInstanceClient.insertTargetInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceClient this]
    (-> this (.insertTargetInstanceCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TargetInstanceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^TargetInstanceClient this]
    (-> this (.shutdown))))

(defn aggregated-list-target-instances
  "Retrieves an aggregated list of target instances.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (TargetInstancesScopedList element : targetInstanceClient.aggregatedListTargetInstances(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.TargetInstanceClient$AggregatedListTargetInstancesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetInstanceClient$AggregatedListTargetInstancesPagedResponse [^TargetInstanceClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListTargetInstances project))))

(defn close
  ""
  ([^TargetInstanceClient this]
    (-> this (.close))))

(defn get-target-instance
  "Returns the specified TargetInstance resource. Gets a list of available target instances by
   making a list() request.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     ProjectZoneTargetInstanceName targetInstance = ProjectZoneTargetInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[TARGET_INSTANCE]\");
     TargetInstance response = targetInstanceClient.getTargetInstance(targetInstance);
   }

  target-instance - Name of the TargetInstance resource to return. - `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName`

  returns: `com.google.cloud.compute.v1.TargetInstance`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetInstance [^TargetInstanceClient this ^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName target-instance]
    (-> this (.getTargetInstance target-instance))))

(defn get-target-instance-callable
  "Returns the specified TargetInstance resource. Gets a list of available target instances by
   making a list() request.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     String formattedTargetInstance = ProjectZoneTargetInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[TARGET_INSTANCE]\");
     GetTargetInstanceHttpRequest request = GetTargetInstanceHttpRequest.newBuilder()
       .setTargetInstance(formattedTargetInstance)
       .build();
     ApiFuture<TargetInstance> future = targetInstanceClient.getTargetInstanceCallable().futureCall(request);
     // Do something
     TargetInstance response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetInstanceHttpRequest,com.google.cloud.compute.v1.TargetInstance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceClient this]
    (-> this (.getTargetInstanceCallable))))

(defn insert-target-instance
  "Creates a TargetInstance resource in the specified project and zone using the data included in
   the request.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     TargetInstance targetInstanceResource = TargetInstance.newBuilder().build();
     Operation response = targetInstanceClient.insertTargetInstance(zone, targetInstanceResource);
   }

  zone - Name of the zone scoping this request. - `com.google.cloud.compute.v1.ProjectZoneName`
  target-instance-resource - A TargetInstance resource. This resource defines an endpoint instance that terminates traffic of certain protocols. (== resource_for beta.targetInstances ==) (== resource_for v1.targetInstances ==) - `com.google.cloud.compute.v1.TargetInstance`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetInstanceClient this ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.TargetInstance target-instance-resource]
    (-> this (.insertTargetInstance zone target-instance-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetInstanceClient this ^com.google.cloud.compute.v1.InsertTargetInstanceHttpRequest request]
    (-> this (.insertTargetInstance request))))

(defn list-target-instances-paged-callable
  "Retrieves a list of TargetInstance resources available to the specified project and zone.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListTargetInstancesHttpRequest request = ListTargetInstancesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListTargetInstancesPagedResponse> future = targetInstanceClient.listTargetInstancesPagedCallable().futureCall(request);
     // Do something
     for (TargetInstance element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceClient$ListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceClient this]
    (-> this (.listTargetInstancesPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TargetInstanceClient this]
    (-> this (.isTerminated))))

(defn list-target-instances-callable
  "Retrieves a list of TargetInstance resources available to the specified project and zone.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListTargetInstancesHttpRequest request = ListTargetInstancesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       TargetInstanceList response = targetInstanceClient.listTargetInstancesCallable().call(request);
       for (TargetInstance element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceClient this]
    (-> this (.listTargetInstancesCallable))))

(defn delete-target-instance
  "Deletes the specified TargetInstance resource.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     ProjectZoneTargetInstanceName targetInstance = ProjectZoneTargetInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[TARGET_INSTANCE]\");
     Operation response = targetInstanceClient.deleteTargetInstance(targetInstance);
   }

  target-instance - Name of the TargetInstance resource to delete. - `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetInstanceClient this ^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName target-instance]
    (-> this (.deleteTargetInstance target-instance))))

(defn shutdown-now
  ""
  ([^TargetInstanceClient this]
    (-> this (.shutdownNow))))

(defn list-target-instances
  "Retrieves a list of TargetInstance resources available to the specified project and zone.

   Sample code:



   try (TargetInstanceClient targetInstanceClient = TargetInstanceClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (TargetInstance element : targetInstanceClient.listTargetInstances(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - Name of the zone scoping this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.TargetInstanceClient$ListTargetInstancesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetInstanceClient$ListTargetInstancesPagedResponse [^TargetInstanceClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listTargetInstances zone))))

