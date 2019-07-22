(ns com.google.cloud.compute.v1.TargetPoolClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
    ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
    TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequestResource = TargetPoolsAddHealthCheckRequest.newBuilder().build();
    Operation response = targetPoolClient.addHealthCheckTargetPool(targetPool, targetPoolsAddHealthCheckRequestResource);
  }

  Note: close() needs to be called on the targetPoolClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of TargetPoolSettings to
  create(). For example:

  To customize credentials:



  TargetPoolSettings targetPoolSettings =
      TargetPoolSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TargetPoolClient targetPoolClient =
      TargetPoolClient.create(targetPoolSettings);

  To customize the endpoint:



  TargetPoolSettings targetPoolSettings =
      TargetPoolSettings.newBuilder().setEndpoint(myEndpoint).build();
  TargetPoolClient targetPoolClient =
      TargetPoolClient.create(targetPoolSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolClient]))

(defn *create
  "Constructs an instance of TargetPoolClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.TargetPoolSettings`

  returns: `com.google.cloud.compute.v1.TargetPoolClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetPoolClient [^com.google.cloud.compute.v1.TargetPoolSettings settings]
    (TargetPoolClient/create settings))
  (^com.google.cloud.compute.v1.TargetPoolClient []
    (TargetPoolClient/create )))

(defn set-backup-target-pool-callable
  "Changes a backup target pool's configurations.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedTargetPool = ProjectRegionTargetPoolName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     Float failoverRatio = 0;
     TargetReference targetReferenceResource = TargetReference.newBuilder().build();
     SetBackupTargetPoolHttpRequest request = SetBackupTargetPoolHttpRequest.newBuilder()
       .setTargetPool(formattedTargetPool)
       .setFailoverRatio(failoverRatio)
       .setTargetReferenceResource(targetReferenceResource)
       .build();
     ApiFuture<Operation> future = targetPoolClient.setBackupTargetPoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.setBackupTargetPoolCallable))))

(defn add-health-check-target-pool
  "Adds health check URLs to a target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequestResource = TargetPoolsAddHealthCheckRequest.newBuilder().build();
     Operation response = targetPoolClient.addHealthCheckTargetPool(targetPool, targetPoolsAddHealthCheckRequestResource);
   }

  target-pool - Name of the target pool to add a health check to. - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`
  target-pools-add-health-check-request-resource - `com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionTargetPoolName target-pool ^com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest target-pools-add-health-check-request-resource]
    (-> this (.addHealthCheckTargetPool target-pool target-pools-add-health-check-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.AddHealthCheckTargetPoolHttpRequest request]
    (-> this (.addHealthCheckTargetPool request))))

(defn get-target-pool
  "Returns the specified target pool. Gets a list of available target pools by making a list()
   request.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPool response = targetPoolClient.getTargetPool(targetPool);
   }

  target-pool - Name of the TargetPool resource to return. - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`

  returns: `com.google.cloud.compute.v1.TargetPool`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetPool [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionTargetPoolName target-pool]
    (-> this (.getTargetPool target-pool))))

(defn add-instance-target-pool-callable
  "Adds an instance to a target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedTargetPool = ProjectRegionTargetPoolName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequestResource = TargetPoolsAddInstanceRequest.newBuilder().build();
     AddInstanceTargetPoolHttpRequest request = AddInstanceTargetPoolHttpRequest.newBuilder()
       .setTargetPool(formattedTargetPool)
       .setTargetPoolsAddInstanceRequestResource(targetPoolsAddInstanceRequestResource)
       .build();
     ApiFuture<Operation> future = targetPoolClient.addInstanceTargetPoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.addInstanceTargetPoolCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.TargetPoolSettings`"
  (^com.google.cloud.compute.v1.TargetPoolSettings [^TargetPoolClient this]
    (-> this (.getSettings))))

(defn set-backup-target-pool
  "Changes a backup target pool's configurations.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     Float failoverRatio = 0;
     TargetReference targetReferenceResource = TargetReference.newBuilder().build();
     Operation response = targetPoolClient.setBackupTargetPool(targetPool, failoverRatio, targetReferenceResource);
   }

  target-pool - Name of the TargetPool resource to set a backup pool for. - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`
  failover-ratio - New failoverRatio value for the target pool. - `java.lang.Float`
  target-reference-resource - `com.google.cloud.compute.v1.TargetReference`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionTargetPoolName target-pool ^java.lang.Float failover-ratio ^com.google.cloud.compute.v1.TargetReference target-reference-resource]
    (-> this (.setBackupTargetPool target-pool failover-ratio target-reference-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest request]
    (-> this (.setBackupTargetPool request))))

(defn get-health-target-pool
  "Gets the most recent health check results for each IP for the instance that is referenced by
   the given target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     InstanceReference instanceReferenceResource = InstanceReference.newBuilder().build();
     TargetPoolInstanceHealth response = targetPoolClient.getHealthTargetPool(targetPool, instanceReferenceResource);
   }

  target-pool - Name of the TargetPool resource to which the queried instance belongs. - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`
  instance-reference-resource - `com.google.cloud.compute.v1.InstanceReference`

  returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionTargetPoolName target-pool ^com.google.cloud.compute.v1.InstanceReference instance-reference-resource]
    (-> this (.getHealthTargetPool target-pool instance-reference-resource)))
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth [^TargetPoolClient this ^com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest request]
    (-> this (.getHealthTargetPool request))))

(defn delete-target-pool-callable
  "Deletes the specified target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedTargetPool = ProjectRegionTargetPoolName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     DeleteTargetPoolHttpRequest request = DeleteTargetPoolHttpRequest.newBuilder()
       .setTargetPool(formattedTargetPool)
       .build();
     ApiFuture<Operation> future = targetPoolClient.deleteTargetPoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.deleteTargetPoolCallable))))

(defn delete-target-pool
  "Deletes the specified target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     Operation response = targetPoolClient.deleteTargetPool(targetPool);
   }

  target-pool - Name of the TargetPool resource to delete. - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionTargetPoolName target-pool]
    (-> this (.deleteTargetPool target-pool))))

(defn list-target-pools-callable
  "Retrieves a list of target pools available to the specified project and region.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListTargetPoolsHttpRequest request = ListTargetPoolsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       TargetPoolList response = targetPoolClient.listTargetPoolsCallable().call(request);
       for (TargetPool element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.listTargetPoolsCallable))))

(defn insert-target-pool
  "Creates a target pool in the specified project and region using the data included in the
   request.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     TargetPool targetPoolResource = TargetPool.newBuilder().build();
     Operation response = targetPoolClient.insertTargetPool(region, targetPoolResource);
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  target-pool-resource - A TargetPool resource. This resource defines a pool of instances, an associated HttpHealthCheck resource, and the fallback target pool. (== resource_for beta.targetPools ==) (== resource_for v1.targetPools ==) - `com.google.cloud.compute.v1.TargetPool`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.TargetPool target-pool-resource]
    (-> this (.insertTargetPool region target-pool-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.InsertTargetPoolHttpRequest request]
    (-> this (.insertTargetPool request))))

(defn list-target-pools
  "Retrieves a list of target pools available to the specified project and region.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (TargetPool element : targetPoolClient.listTargetPools(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.TargetPoolClient$ListTargetPoolsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetPoolClient$ListTargetPoolsPagedResponse [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listTargetPools region))))

(defn get-target-pool-callable
  "Returns the specified target pool. Gets a list of available target pools by making a list()
   request.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedTargetPool = ProjectRegionTargetPoolName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     GetTargetPoolHttpRequest request = GetTargetPoolHttpRequest.newBuilder()
       .setTargetPool(formattedTargetPool)
       .build();
     ApiFuture<TargetPool> future = targetPoolClient.getTargetPoolCallable().futureCall(request);
     // Do something
     TargetPool response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPool>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.getTargetPoolCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetPoolStub`"
  ([^TargetPoolClient this]
    (-> this (.getStub))))

(defn add-health-check-target-pool-callable
  "Adds health check URLs to a target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedTargetPool = ProjectRegionTargetPoolName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequestResource = TargetPoolsAddHealthCheckRequest.newBuilder().build();
     AddHealthCheckTargetPoolHttpRequest request = AddHealthCheckTargetPoolHttpRequest.newBuilder()
       .setTargetPool(formattedTargetPool)
       .setTargetPoolsAddHealthCheckRequestResource(targetPoolsAddHealthCheckRequestResource)
       .build();
     ApiFuture<Operation> future = targetPoolClient.addHealthCheckTargetPoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.addHealthCheckTargetPoolCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TargetPoolClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TargetPoolClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn get-health-target-pool-callable
  "Gets the most recent health check results for each IP for the instance that is referenced by
   the given target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedTargetPool = ProjectRegionTargetPoolName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     InstanceReference instanceReferenceResource = InstanceReference.newBuilder().build();
     GetHealthTargetPoolHttpRequest request = GetHealthTargetPoolHttpRequest.newBuilder()
       .setTargetPool(formattedTargetPool)
       .setInstanceReferenceResource(instanceReferenceResource)
       .build();
     ApiFuture<TargetPoolInstanceHealth> future = targetPoolClient.getHealthTargetPoolCallable().futureCall(request);
     // Do something
     TargetPoolInstanceHealth response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPoolInstanceHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.getHealthTargetPoolCallable))))

(defn shutdown
  ""
  ([^TargetPoolClient this]
    (-> this (.shutdown))))

(defn aggregated-list-target-pools
  "Retrieves an aggregated list of target pools.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (TargetPoolsScopedList element : targetPoolClient.aggregatedListTargetPools(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.TargetPoolClient$AggregatedListTargetPoolsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetPoolClient$AggregatedListTargetPoolsPagedResponse [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListTargetPools project))))

(defn add-instance-target-pool
  "Adds an instance to a target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequestResource = TargetPoolsAddInstanceRequest.newBuilder().build();
     Operation response = targetPoolClient.addInstanceTargetPool(targetPool, targetPoolsAddInstanceRequestResource);
   }

  target-pool - Name of the TargetPool resource to add instances to. - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`
  target-pools-add-instance-request-resource - `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionTargetPoolName target-pool ^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest target-pools-add-instance-request-resource]
    (-> this (.addInstanceTargetPool target-pool target-pools-add-instance-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.AddInstanceTargetPoolHttpRequest request]
    (-> this (.addInstanceTargetPool request))))

(defn aggregated-list-target-pools-paged-callable
  "Retrieves an aggregated list of target pools.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListTargetPoolsHttpRequest request = AggregatedListTargetPoolsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListTargetPoolsPagedResponse> future = targetPoolClient.aggregatedListTargetPoolsPagedCallable().futureCall(request);
     // Do something
     for (TargetPoolsScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolClient$AggregatedListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.aggregatedListTargetPoolsPagedCallable))))

(defn insert-target-pool-callable
  "Creates a target pool in the specified project and region using the data included in the
   request.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     TargetPool targetPoolResource = TargetPool.newBuilder().build();
     InsertTargetPoolHttpRequest request = InsertTargetPoolHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setTargetPoolResource(targetPoolResource)
       .build();
     ApiFuture<Operation> future = targetPoolClient.insertTargetPoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.insertTargetPoolCallable))))

(defn aggregated-list-target-pools-callable
  "Retrieves an aggregated list of target pools.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListTargetPoolsHttpRequest request = AggregatedListTargetPoolsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       TargetPoolAggregatedList response = targetPoolClient.aggregatedListTargetPoolsCallable().call(request);
       for (TargetPoolsScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.aggregatedListTargetPoolsCallable))))

(defn remove-health-check-target-pool
  "Removes health check URL from a target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource = TargetPoolsRemoveHealthCheckRequest.newBuilder().build();
     Operation response = targetPoolClient.removeHealthCheckTargetPool(targetPool, targetPoolsRemoveHealthCheckRequestResource);
   }

  target-pool - Name of the target pool to remove health checks from. - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`
  target-pools-remove-health-check-request-resource - `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionTargetPoolName target-pool ^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest target-pools-remove-health-check-request-resource]
    (-> this (.removeHealthCheckTargetPool target-pool target-pools-remove-health-check-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolHttpRequest request]
    (-> this (.removeHealthCheckTargetPool request))))

(defn close
  ""
  ([^TargetPoolClient this]
    (-> this (.close))))

(defn list-target-pools-paged-callable
  "Retrieves a list of target pools available to the specified project and region.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListTargetPoolsHttpRequest request = ListTargetPoolsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListTargetPoolsPagedResponse> future = targetPoolClient.listTargetPoolsPagedCallable().futureCall(request);
     // Do something
     for (TargetPool element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolClient$ListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.listTargetPoolsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TargetPoolClient this]
    (-> this (.isTerminated))))

(defn remove-instance-target-pool
  "Removes instance URL from a target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     ProjectRegionTargetPoolName targetPool = ProjectRegionTargetPoolName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequestResource = TargetPoolsRemoveInstanceRequest.newBuilder().build();
     Operation response = targetPoolClient.removeInstanceTargetPool(targetPool, targetPoolsRemoveInstanceRequestResource);
   }

  target-pool - Name of the TargetPool resource to remove instances from. - `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`
  target-pools-remove-instance-request-resource - `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.ProjectRegionTargetPoolName target-pool ^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest target-pools-remove-instance-request-resource]
    (-> this (.removeInstanceTargetPool target-pool target-pools-remove-instance-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetPoolClient this ^com.google.cloud.compute.v1.RemoveInstanceTargetPoolHttpRequest request]
    (-> this (.removeInstanceTargetPool request))))

(defn remove-health-check-target-pool-callable
  "Removes health check URL from a target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedTargetPool = ProjectRegionTargetPoolName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPoolsRemoveHealthCheckRequest targetPoolsRemoveHealthCheckRequestResource = TargetPoolsRemoveHealthCheckRequest.newBuilder().build();
     RemoveHealthCheckTargetPoolHttpRequest request = RemoveHealthCheckTargetPoolHttpRequest.newBuilder()
       .setTargetPool(formattedTargetPool)
       .setTargetPoolsRemoveHealthCheckRequestResource(targetPoolsRemoveHealthCheckRequestResource)
       .build();
     ApiFuture<Operation> future = targetPoolClient.removeHealthCheckTargetPoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.removeHealthCheckTargetPoolCallable))))

(defn shutdown-now
  ""
  ([^TargetPoolClient this]
    (-> this (.shutdownNow))))

(defn remove-instance-target-pool-callable
  "Removes instance URL from a target pool.

   Sample code:



   try (TargetPoolClient targetPoolClient = TargetPoolClient.create()) {
     String formattedTargetPool = ProjectRegionTargetPoolName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_POOL]\");
     TargetPoolsRemoveInstanceRequest targetPoolsRemoveInstanceRequestResource = TargetPoolsRemoveInstanceRequest.newBuilder().build();
     RemoveInstanceTargetPoolHttpRequest request = RemoveInstanceTargetPoolHttpRequest.newBuilder()
       .setTargetPool(formattedTargetPool)
       .setTargetPoolsRemoveInstanceRequestResource(targetPoolsRemoveInstanceRequestResource)
       .build();
     ApiFuture<Operation> future = targetPoolClient.removeInstanceTargetPoolCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolClient this]
    (-> this (.removeInstanceTargetPoolCallable))))

