(ns com.google.cloud.redis.v1.CloudRedisClient
  "Service Description: Configures and manages Cloud Memorystore for Redis instances

  Google Cloud Memorystore for Redis v1

  The `redis.googleapis.com` service implements the Google Cloud Memorystore for Redis API and
  defines the following resource model for managing Redis instances: * The service works with a
  collection of cloud projects, named: `/projects/*` * Each project has a collection of
  available locations, named: `/locations/*` * Each location has a collection of Redis
  instances, named: `/instances/*` * As such, Redis instances are resources of the form:
  `/projects/{project_id}/locations/{location_id}/instances/{instance_id}`

  Note that location_id must be referring to a GCP `region`; for example: *
  `projects/redpepper-1290/locations/us-central1/instances/my-redis`

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
    InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
    Instance response = cloudRedisClient.getInstance(name);
  }

  Note: close() needs to be called on the cloudRedisClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of CloudRedisSettings to
  create(). For example:

  To customize credentials:



  CloudRedisSettings cloudRedisSettings =
      CloudRedisSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  CloudRedisClient cloudRedisClient =
      CloudRedisClient.create(cloudRedisSettings);

  To customize the endpoint:



  CloudRedisSettings cloudRedisSettings =
      CloudRedisSettings.newBuilder().setEndpoint(myEndpoint).build();
  CloudRedisClient cloudRedisClient =
      CloudRedisClient.create(cloudRedisSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.redis.v1 CloudRedisClient]))

(defn *create
  "Constructs an instance of CloudRedisClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.redis.v1.CloudRedisSettings`

  returns: `com.google.cloud.redis.v1.CloudRedisClient`

  throws: java.io.IOException"
  (^com.google.cloud.redis.v1.CloudRedisClient [^com.google.cloud.redis.v1.CloudRedisSettings settings]
    (CloudRedisClient/create settings))
  (^com.google.cloud.redis.v1.CloudRedisClient []
    (CloudRedisClient/create )))

(defn delete-instance-operation-callable
  "Deletes a specific Redis instance. Instance stops serving and data is deleted.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     DeleteInstanceRequest request = DeleteInstanceRequest.newBuilder()
       .setName(name.toString())
       .build();
     OperationFuture<Empty, OperationMetadata> future = cloudRedisClient.deleteInstanceOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.DeleteInstanceRequest,com.google.protobuf.Empty,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisClient this]
    (-> this (.deleteInstanceOperationCallable))))

(defn export-instance-async
  "Export Redis instance data into a Redis RDB format file in Cloud Storage.

   Redis will continue serving during this operation.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String formattedName = InstanceName.format(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     Instance response = cloudRedisClient.exportInstanceAsync(formattedName, outputConfig).get();
   }

  name - Required. Redis instance resource name using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id` refers to a GCP region. - `java.lang.String`
  output-config - Required. Specify data to be exported. - `com.google.cloud.redis.v1.OutputConfig`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudRedisClient this ^java.lang.String name ^com.google.cloud.redis.v1.OutputConfig output-config]
    (-> this (.exportInstanceAsync name output-config)))
  ([^CloudRedisClient this ^com.google.cloud.redis.v1.ExportInstanceRequest request]
    (-> this (.exportInstanceAsync request))))

(defn failover-instance-callable
  "Initiates a failover of the master node to current replica node for a specific STANDARD tier
   Cloud Memorystore for Redis instance.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     FailoverInstanceRequest.DataProtectionMode dataProtectionMode = FailoverInstanceRequest.DataProtectionMode.DATA_PROTECTION_MODE_UNSPECIFIED;
     FailoverInstanceRequest request = FailoverInstanceRequest.newBuilder()
       .setName(name.toString())
       .setDataProtectionMode(dataProtectionMode)
       .build();
     ApiFuture<Operation> future = cloudRedisClient.failoverInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.FailoverInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.failoverInstanceCallable))))

(defn export-instance-callable
  "Export Redis instance data into a Redis RDB format file in Cloud Storage.

   Redis will continue serving during this operation.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String formattedName = InstanceName.format(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportInstanceRequest request = ExportInstanceRequest.newBuilder()
       .setName(formattedName)
       .setOutputConfig(outputConfig)
       .build();
     ApiFuture<Operation> future = cloudRedisClient.exportInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.ExportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.exportInstanceCallable))))

(defn get-settings
  "returns: `com.google.cloud.redis.v1.CloudRedisSettings`"
  (^com.google.cloud.redis.v1.CloudRedisSettings [^CloudRedisClient this]
    (-> this (.getSettings))))

(defn list-instances-callable
  "Lists all Redis instances owned by a project in either the specified location (region) or all
   locations.

   The location should have the following format: *
   `projects/{project_id}/locations/{location_id}`

   If `location_id` is specified as `-` (wildcard), then all regions available to the project
   are queried, and the results are aggregated.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListInstancesRequest request = ListInstancesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListInstancesResponse response = cloudRedisClient.listInstancesCallable().call(request);
       for (Instance element : response.getInstancesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.ListInstancesRequest,com.google.cloud.redis.v1.ListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.listInstancesCallable))))

(defn export-instance-operation-callable
  "Export Redis instance data into a Redis RDB format file in Cloud Storage.

   Redis will continue serving during this operation.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String formattedName = InstanceName.format(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     ExportInstanceRequest request = ExportInstanceRequest.newBuilder()
       .setName(formattedName)
       .setOutputConfig(outputConfig)
       .build();
     OperationFuture<Instance, OperationMetadata> future = cloudRedisClient.exportInstanceOperationCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.ExportInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisClient this]
    (-> this (.exportInstanceOperationCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.redis.v1.stub.CloudRedisStub`"
  ([^CloudRedisClient this]
    (-> this (.getStub))))

(defn list-instances
  "Lists all Redis instances owned by a project in either the specified location (region) or all
   locations.

   The location should have the following format: *
   `projects/{project_id}/locations/{location_id}`

   If `location_id` is specified as `-` (wildcard), then all regions available to the project
   are queried, and the results are aggregated.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (Instance element : cloudRedisClient.listInstances(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The resource name of the instance location using the form: `projects/{project_id}/locations/{location_id}` where `location_id` refers to a GCP region. - `com.google.cloud.redis.v1.LocationName`

  returns: `com.google.cloud.redis.v1.CloudRedisClient$ListInstancesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.redis.v1.CloudRedisClient$ListInstancesPagedResponse [^CloudRedisClient this ^com.google.cloud.redis.v1.LocationName parent]
    (-> this (.listInstances parent))))

(defn list-instances-paged-callable
  "Lists all Redis instances owned by a project in either the specified location (region) or all
   locations.

   The location should have the following format: *
   `projects/{project_id}/locations/{location_id}`

   If `location_id` is specified as `-` (wildcard), then all regions available to the project
   are queried, and the results are aggregated.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListInstancesRequest request = ListInstancesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListInstancesPagedResponse> future = cloudRedisClient.listInstancesPagedCallable().futureCall(request);
     // Do something
     for (Instance element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.ListInstancesRequest,com.google.cloud.redis.v1.CloudRedisClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.listInstancesPagedCallable))))

(defn create-instance-async
  "Creates a Redis instance based on the specified tier and memory size.

   By default, the instance is accessible from the project's [default
   network](/compute/docs/networks-and-firewalls#networks).

   The creation is executed asynchronously and callers may check the returned operation to
   track its progress. Once the operation is completed the Redis instance will be fully
   functional. Completed longrunning.Operation will contain the new instance object in the
   response field.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     String instanceId = \"test_instance\";
     Instance.Tier tier = Instance.Tier.BASIC;
     int memorySizeGb = 1;
     Instance instance = Instance.newBuilder()
       .setTier(tier)
       .setMemorySizeGb(memorySizeGb)
       .build();
     Instance response = cloudRedisClient.createInstanceAsync(parent, instanceId, instance).get();
   }

  parent - Required. The resource name of the instance location using the form: `projects/{project_id}/locations/{location_id}` where `location_id` refers to a GCP region. - `com.google.cloud.redis.v1.LocationName`
  instance-id - Required. The logical name of the Redis instance in the customer project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the customer project / location - `java.lang.String`
  instance - Required. A Redis [Instance] resource - `com.google.cloud.redis.v1.Instance`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudRedisClient this ^com.google.cloud.redis.v1.LocationName parent ^java.lang.String instance-id ^com.google.cloud.redis.v1.Instance instance]
    (-> this (.createInstanceAsync parent instance-id instance)))
  ([^CloudRedisClient this ^com.google.cloud.redis.v1.CreateInstanceRequest request]
    (-> this (.createInstanceAsync request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^CloudRedisClient this]
    (-> this (.isShutdown))))

(defn failover-instance-operation-callable
  "Initiates a failover of the master node to current replica node for a specific STANDARD tier
   Cloud Memorystore for Redis instance.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     FailoverInstanceRequest.DataProtectionMode dataProtectionMode = FailoverInstanceRequest.DataProtectionMode.DATA_PROTECTION_MODE_UNSPECIFIED;
     FailoverInstanceRequest request = FailoverInstanceRequest.newBuilder()
       .setName(name.toString())
       .setDataProtectionMode(dataProtectionMode)
       .build();
     OperationFuture<Instance, OperationMetadata> future = cloudRedisClient.failoverInstanceOperationCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.FailoverInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisClient this]
    (-> this (.failoverInstanceOperationCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^CloudRedisClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn import-instance-callable
  "Import a Redis RDB snapshot file from Cloud Storage into a Redis instance.

   Redis may stop serving during this operation. Instance state will be IMPORTING for entire
   operation. When complete, the instance will contain only data from the imported file.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String formattedName = InstanceName.format(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     ImportInstanceRequest request = ImportInstanceRequest.newBuilder()
       .setName(formattedName)
       .setInputConfig(inputConfig)
       .build();
     ApiFuture<Operation> future = cloudRedisClient.importInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.ImportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.importInstanceCallable))))

(defn create-instance-operation-callable
  "Creates a Redis instance based on the specified tier and memory size.

   By default, the instance is accessible from the project's [default
   network](/compute/docs/networks-and-firewalls#networks).

   The creation is executed asynchronously and callers may check the returned operation to
   track its progress. Once the operation is completed the Redis instance will be fully
   functional. Completed longrunning.Operation will contain the new instance object in the
   response field.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     String instanceId = \"test_instance\";
     Instance.Tier tier = Instance.Tier.BASIC;
     int memorySizeGb = 1;
     Instance instance = Instance.newBuilder()
       .setTier(tier)
       .setMemorySizeGb(memorySizeGb)
       .build();
     CreateInstanceRequest request = CreateInstanceRequest.newBuilder()
       .setParent(parent.toString())
       .setInstanceId(instanceId)
       .setInstance(instance)
       .build();
     OperationFuture<Instance, OperationMetadata> future = cloudRedisClient.createInstanceOperationCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.CreateInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisClient this]
    (-> this (.createInstanceOperationCallable))))

(defn update-instance-operation-callable
  "Updates the metadata and configuration of a specific Redis instance.

   Completed longrunning.Operation will contain the new instance object in the response field.
   The returned operation is automatically deleted after a few hours, so there is no need to call
   DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String pathsElement = \"display_name\";
     String pathsElement2 = \"memory_size_gb\";
     List<String> paths = Arrays.asList(pathsElement, pathsElement2);
     FieldMask updateMask = FieldMask.newBuilder()
       .addAllPaths(paths)
       .build();
     String displayName = \" instance.memory_size_gb=4\";
     Instance instance = Instance.newBuilder()
       .setDisplayName(displayName)
       .build();
     UpdateInstanceRequest request = UpdateInstanceRequest.newBuilder()
       .setUpdateMask(updateMask)
       .setInstance(instance)
       .build();
     OperationFuture<Instance, OperationMetadata> future = cloudRedisClient.updateInstanceOperationCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.UpdateInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisClient this]
    (-> this (.updateInstanceOperationCallable))))

(defn shutdown
  ""
  ([^CloudRedisClient this]
    (-> this (.shutdown))))

(defn get-instance
  "Gets the details of a specific Redis instance.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     Instance response = cloudRedisClient.getInstance(name);
   }

  name - Required. Redis instance resource name using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id` refers to a GCP region. - `com.google.cloud.redis.v1.InstanceName`

  returns: `com.google.cloud.redis.v1.Instance`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.redis.v1.Instance [^CloudRedisClient this ^com.google.cloud.redis.v1.InstanceName name]
    (-> this (.getInstance name))))

(defn delete-instance-async
  "Deletes a specific Redis instance. Instance stops serving and data is deleted.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     cloudRedisClient.deleteInstanceAsync(name).get();
   }

  name - Required. Redis instance resource name using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id` refers to a GCP region. - `com.google.cloud.redis.v1.InstanceName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.redis.v1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudRedisClient this ^com.google.cloud.redis.v1.InstanceName name]
    (-> this (.deleteInstanceAsync name))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^CloudRedisClient this]
    (-> this (.getOperationsClient))))

(defn import-instance-async
  "Import a Redis RDB snapshot file from Cloud Storage into a Redis instance.

   Redis may stop serving during this operation. Instance state will be IMPORTING for entire
   operation. When complete, the instance will contain only data from the imported file.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String formattedName = InstanceName.format(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     Instance response = cloudRedisClient.importInstanceAsync(formattedName, inputConfig).get();
   }

  name - Required. Redis instance resource name using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id` refers to a GCP region. - `java.lang.String`
  input-config - Required. Specify data to be imported. - `com.google.cloud.redis.v1.InputConfig`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudRedisClient this ^java.lang.String name ^com.google.cloud.redis.v1.InputConfig input-config]
    (-> this (.importInstanceAsync name input-config)))
  ([^CloudRedisClient this ^com.google.cloud.redis.v1.ImportInstanceRequest request]
    (-> this (.importInstanceAsync request))))

(defn close
  ""
  ([^CloudRedisClient this]
    (-> this (.close))))

(defn delete-instance-callable
  "Deletes a specific Redis instance. Instance stops serving and data is deleted.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     DeleteInstanceRequest request = DeleteInstanceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = cloudRedisClient.deleteInstanceCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.DeleteInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.deleteInstanceCallable))))

(defn create-instance-callable
  "Creates a Redis instance based on the specified tier and memory size.

   By default, the instance is accessible from the project's [default
   network](/compute/docs/networks-and-firewalls#networks).

   The creation is executed asynchronously and callers may check the returned operation to
   track its progress. Once the operation is completed the Redis instance will be fully
   functional. Completed longrunning.Operation will contain the new instance object in the
   response field.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     String instanceId = \"test_instance\";
     Instance.Tier tier = Instance.Tier.BASIC;
     int memorySizeGb = 1;
     Instance instance = Instance.newBuilder()
       .setTier(tier)
       .setMemorySizeGb(memorySizeGb)
       .build();
     CreateInstanceRequest request = CreateInstanceRequest.newBuilder()
       .setParent(parent.toString())
       .setInstanceId(instanceId)
       .setInstance(instance)
       .build();
     ApiFuture<Operation> future = cloudRedisClient.createInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.createInstanceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^CloudRedisClient this]
    (-> this (.isTerminated))))

(defn import-instance-operation-callable
  "Import a Redis RDB snapshot file from Cloud Storage into a Redis instance.

   Redis may stop serving during this operation. Instance state will be IMPORTING for entire
   operation. When complete, the instance will contain only data from the imported file.

   The returned operation is automatically deleted after a few hours, so there is no need to
   call DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String formattedName = InstanceName.format(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     InputConfig inputConfig = InputConfig.newBuilder().build();
     ImportInstanceRequest request = ImportInstanceRequest.newBuilder()
       .setName(formattedName)
       .setInputConfig(inputConfig)
       .build();
     OperationFuture<Instance, OperationMetadata> future = cloudRedisClient.importInstanceOperationCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.redis.v1.ImportInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisClient this]
    (-> this (.importInstanceOperationCallable))))

(defn update-instance-async
  "Updates the metadata and configuration of a specific Redis instance.

   Completed longrunning.Operation will contain the new instance object in the response field.
   The returned operation is automatically deleted after a few hours, so there is no need to call
   DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String pathsElement = \"display_name\";
     String pathsElement2 = \"memory_size_gb\";
     List<String> paths = Arrays.asList(pathsElement, pathsElement2);
     FieldMask updateMask = FieldMask.newBuilder()
       .addAllPaths(paths)
       .build();
     String displayName = \" instance.memory_size_gb=4\";
     Instance instance = Instance.newBuilder()
       .setDisplayName(displayName)
       .build();
     Instance response = cloudRedisClient.updateInstanceAsync(updateMask, instance).get();
   }

  update-mask - Required. Mask of fields to update. At least one path must be supplied in this field. The elements of the repeated paths field may only include these fields from [Instance][CloudRedis.Instance]: * `displayName` * `labels` * `memorySizeGb` * `redisConfig` - `com.google.protobuf.FieldMask`
  instance - Required. Update description. Only fields specified in update_mask are updated. - `com.google.cloud.redis.v1.Instance`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudRedisClient this ^com.google.protobuf.FieldMask update-mask ^com.google.cloud.redis.v1.Instance instance]
    (-> this (.updateInstanceAsync update-mask instance)))
  ([^CloudRedisClient this ^com.google.cloud.redis.v1.UpdateInstanceRequest request]
    (-> this (.updateInstanceAsync request))))

(defn update-instance-callable
  "Updates the metadata and configuration of a specific Redis instance.

   Completed longrunning.Operation will contain the new instance object in the response field.
   The returned operation is automatically deleted after a few hours, so there is no need to call
   DeleteOperation.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     String pathsElement = \"display_name\";
     String pathsElement2 = \"memory_size_gb\";
     List<String> paths = Arrays.asList(pathsElement, pathsElement2);
     FieldMask updateMask = FieldMask.newBuilder()
       .addAllPaths(paths)
       .build();
     String displayName = \" instance.memory_size_gb=4\";
     Instance instance = Instance.newBuilder()
       .setDisplayName(displayName)
       .build();
     UpdateInstanceRequest request = UpdateInstanceRequest.newBuilder()
       .setUpdateMask(updateMask)
       .setInstance(instance)
       .build();
     ApiFuture<Operation> future = cloudRedisClient.updateInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.updateInstanceCallable))))

(defn get-instance-callable
  "Gets the details of a specific Redis instance.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     GetInstanceRequest request = GetInstanceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Instance> future = cloudRedisClient.getInstanceCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.redis.v1.GetInstanceRequest,com.google.cloud.redis.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudRedisClient this]
    (-> this (.getInstanceCallable))))

(defn failover-instance-async
  "Initiates a failover of the master node to current replica node for a specific STANDARD tier
   Cloud Memorystore for Redis instance.

   Sample code:



   try (CloudRedisClient cloudRedisClient = CloudRedisClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[LOCATION]\", \"[INSTANCE]\");
     FailoverInstanceRequest.DataProtectionMode dataProtectionMode = FailoverInstanceRequest.DataProtectionMode.DATA_PROTECTION_MODE_UNSPECIFIED;
     Instance response = cloudRedisClient.failoverInstanceAsync(name, dataProtectionMode).get();
   }

  name - Required. Redis instance resource name using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id` refers to a GCP region. - `com.google.cloud.redis.v1.InstanceName`
  data-protection-mode - Optional. Available data protection modes that the user can choose. If it's unspecified, data protection mode will be LIMITED_DATA_LOSS by default. - `com.google.cloud.redis.v1.FailoverInstanceRequest$DataProtectionMode`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^CloudRedisClient this ^com.google.cloud.redis.v1.InstanceName name ^com.google.cloud.redis.v1.FailoverInstanceRequest$DataProtectionMode data-protection-mode]
    (-> this (.failoverInstanceAsync name data-protection-mode)))
  ([^CloudRedisClient this ^com.google.cloud.redis.v1.FailoverInstanceRequest request]
    (-> this (.failoverInstanceAsync request))))

(defn shutdown-now
  ""
  ([^CloudRedisClient this]
    (-> this (.shutdownNow))))

