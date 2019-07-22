(ns com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient
  "Service Description: Cloud Spanner Instance Admin API

  The Cloud Spanner Instance Admin API can be used to create, delete, modify and list instances.
  Instances are dedicated Cloud Spanner serving and storage resources to be used by Cloud Spanner
  databases.

  Each instance has a \"configuration\", which dictates where the serving resources for the Cloud
  Spanner instance are located (e.g., US-central, Europe). Configurations are created by Google
  based on resource availability.

  Cloud Spanner billing is based on the instances that exist and their sizes. After an instance
  exists, there are no additional per-database or per-operation charges for use of the instance
  (though there may be additional network bandwidth charges). Instances offer isolation: problems
  with databases in one instance will not affect other instances. However, within an instance
  databases can affect each other. For example, if one database in an instance receives a lot of
  requests and consumes most of the instance resources, fewer resources are available for other
  databases in that instance, and their performance may suffer.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
    InstanceConfigName name = InstanceConfigName.of(\"[PROJECT]\", \"[INSTANCE_CONFIG]\");
    InstanceConfig response = instanceAdminClient.getInstanceConfig(name);
  }

  Note: close() needs to be called on the instanceAdminClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of InstanceAdminSettings to
  create(). For example:

  To customize credentials:



  InstanceAdminSettings instanceAdminSettings =
      InstanceAdminSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  InstanceAdminClient instanceAdminClient =
      InstanceAdminClient.create(instanceAdminSettings);

  To customize the endpoint:



  InstanceAdminSettings instanceAdminSettings =
      InstanceAdminSettings.newBuilder().setEndpoint(myEndpoint).build();
  InstanceAdminClient instanceAdminClient =
      InstanceAdminClient.create(instanceAdminSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.instance.v1 InstanceAdminClient]))

(defn *create
  "Constructs an instance of InstanceAdminClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings`

  returns: `com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient [^com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings settings]
    (InstanceAdminClient/create settings))
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient []
    (InstanceAdminClient/create )))

(defn get-iam-policy-callable
  "Gets the access control policy for an instance resource. Returns an empty policy if an instance
   exists but does not have a policy set.

   Authorization requires `spanner.instances.getIamPolicy` on
   [resource][google.iam.v1.GetIamPolicyRequest.resource].

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     String formattedResource = InstanceName.format(\"[PROJECT]\", \"[INSTANCE]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = instanceAdminClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy on an instance resource. Replaces any existing policy.

   Authorization requires `spanner.instances.setIamPolicy` on
   [resource][google.iam.v1.SetIamPolicyRequest.resource].

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     String formattedResource = InstanceName.format(\"[PROJECT]\", \"[INSTANCE]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = instanceAdminClient.setIamPolicy(formattedResource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^InstanceAdminClient this ^java.lang.String resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^InstanceAdminClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn get-settings
  "returns: `com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings`"
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminSettings [^InstanceAdminClient this]
    (-> this (.getSettings))))

(defn list-instance-configs-callable
  "Lists the supported instance configurations for a given project.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListInstanceConfigsRequest request = ListInstanceConfigsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListInstanceConfigsResponse response = instanceAdminClient.listInstanceConfigsCallable().call(request);
       for (InstanceConfig element : response.getInstanceConfigsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,com.google.spanner.admin.instance.v1.ListInstanceConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.listInstanceConfigsCallable))))

(defn get-instance-config-callable
  "Gets information about a particular instance configuration.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     InstanceConfigName name = InstanceConfigName.of(\"[PROJECT]\", \"[INSTANCE_CONFIG]\");
     GetInstanceConfigRequest request = GetInstanceConfigRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<InstanceConfig> future = instanceAdminClient.getInstanceConfigCallable().futureCall(request);
     // Do something
     InstanceConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.GetInstanceConfigRequest,com.google.spanner.admin.instance.v1.InstanceConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.getInstanceConfigCallable))))

(defn list-instances-callable
  "Lists all instances in the given project.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListInstancesRequest request = ListInstancesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListInstancesResponse response = instanceAdminClient.listInstancesCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstancesRequest,com.google.spanner.admin.instance.v1.ListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.listInstancesCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.spanner.admin.instance.v1.stub.InstanceAdminStub`"
  ([^InstanceAdminClient this]
    (-> this (.getStub))))

(defn list-instances
  "Lists all instances in the given project.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     for (Instance element : instanceAdminClient.listInstances(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The name of the project for which a list of instances is requested. Values are of the form `projects/<project>`. - `com.google.spanner.admin.instance.v1.ProjectName`

  returns: `com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPagedResponse [^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.ProjectName parent]
    (-> this (.listInstances parent))))

(defn list-instances-paged-callable
  "Lists all instances in the given project.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListInstancesRequest request = ListInstancesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListInstancesPagedResponse> future = instanceAdminClient.listInstancesPagedCallable().futureCall(request);
     // Do something
     for (Instance element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstancesRequest,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.listInstancesPagedCallable))))

(defn create-instance-async
  "Creates an instance and begins preparing it to begin serving. The returned [long-running
   operation][google.longrunning.Operation] can be used to track the progress of preparing the new
   instance. The instance name is assigned by the caller. If the named instance already exists,
   `CreateInstance` returns `ALREADY_EXISTS`.

   Immediately upon completion of this request:

   * The instance is readable via the API, with all requested attributes but no allocated
   resources. Its state is `CREATING`.

   Until completion of the returned operation:

   * Cancelling the operation renders the instance immediately unreadable via the API.
   * The instance can be deleted. * All other attempts to modify the instance are
   rejected.

   Upon completion of the returned operation:

   * Billing for all successfully-allocated resources begins (some types may have lower
   than the requested levels). * Databases can be created in the instance. * The
   instance's allocated resource levels are readable via the API. * The instance's state
   becomes `READY`.

   The returned [long-running operation][google.longrunning.Operation] will have a name of the
   format `<instance_name>/operations/<operation_id>` and can be used to track
   creation of the instance. The [metadata][google.longrunning.Operation.metadata] field type is
   [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Instance][google.spanner.admin.instance.v1.Instance], if successful.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     InstanceName instanceId = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     Instance instance = Instance.newBuilder().build();
     Instance response = instanceAdminClient.createInstanceAsync(parent, instanceId, instance).get();
   }

  parent - Required. The name of the project in which to create the instance. Values are of the form `projects/<project>`. - `com.google.spanner.admin.instance.v1.ProjectName`
  instance-id - Required. The ID of the instance to create. Valid identifiers are of the form `[a-z][-a-z0-9]*[a-z0-9]` and must be between 6 and 30 characters in length. - `com.google.spanner.admin.instance.v1.InstanceName`
  instance - Required. The instance to create. The name may be omitted, but if specified must be `<parent>/instances/<instance_id>`. - `com.google.spanner.admin.instance.v1.Instance`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.CreateInstanceMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.ProjectName parent ^com.google.spanner.admin.instance.v1.InstanceName instance-id ^com.google.spanner.admin.instance.v1.Instance instance]
    (-> this (.createInstanceAsync parent instance-id instance)))
  ([^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.CreateInstanceRequest request]
    (-> this (.createInstanceAsync request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^InstanceAdminClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^InstanceAdminClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn get-instance-config
  "Gets information about a particular instance configuration.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     InstanceConfigName name = InstanceConfigName.of(\"[PROJECT]\", \"[INSTANCE_CONFIG]\");
     InstanceConfig response = instanceAdminClient.getInstanceConfig(name);
   }

  name - Required. The name of the requested instance configuration. Values are of the form `projects/<project>/instanceConfigs/<config>`. - `com.google.spanner.admin.instance.v1.InstanceConfigName`

  returns: `com.google.spanner.admin.instance.v1.InstanceConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.admin.instance.v1.InstanceConfig [^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.InstanceConfigName name]
    (-> this (.getInstanceConfig name))))

(defn delete-instance
  "Deletes an instance.

   Immediately upon completion of the request:

   * Billing ceases for all of the instance's reserved resources.

   Soon afterward:

   * The instance and *all of its databases* immediately and irrevocably disappear
   from the API. All data in the databases is permanently deleted.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     instanceAdminClient.deleteInstance(name);
   }

  name - Required. The name of the instance to be deleted. Values are of the form `projects/<project>/instances/<instance>` - `com.google.spanner.admin.instance.v1.InstanceName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.InstanceName name]
    (-> this (.deleteInstance name))))

(defn create-instance-operation-callable
  "Creates an instance and begins preparing it to begin serving. The returned [long-running
   operation][google.longrunning.Operation] can be used to track the progress of preparing the new
   instance. The instance name is assigned by the caller. If the named instance already exists,
   `CreateInstance` returns `ALREADY_EXISTS`.

   Immediately upon completion of this request:

   * The instance is readable via the API, with all requested attributes but no allocated
   resources. Its state is `CREATING`.

   Until completion of the returned operation:

   * Cancelling the operation renders the instance immediately unreadable via the API.
   * The instance can be deleted. * All other attempts to modify the instance are
   rejected.

   Upon completion of the returned operation:

   * Billing for all successfully-allocated resources begins (some types may have lower
   than the requested levels). * Databases can be created in the instance. * The
   instance's allocated resource levels are readable via the API. * The instance's state
   becomes `READY`.

   The returned [long-running operation][google.longrunning.Operation] will have a name of the
   format `<instance_name>/operations/<operation_id>` and can be used to track
   creation of the instance. The [metadata][google.longrunning.Operation.metadata] field type is
   [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Instance][google.spanner.admin.instance.v1.Instance], if successful.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     InstanceName instanceId = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     Instance instance = Instance.newBuilder().build();
     CreateInstanceRequest request = CreateInstanceRequest.newBuilder()
       .setParent(parent.toString())
       .setInstanceId(instanceId.toString())
       .setInstance(instance)
       .build();
     OperationFuture<Instance, CreateInstanceMetadata> future = instanceAdminClient.createInstanceOperationCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.CreateInstanceMetadata>`"
  ([^InstanceAdminClient this]
    (-> this (.createInstanceOperationCallable))))

(defn update-instance-operation-callable
  "Updates an instance, and begins allocating or releasing resources as requested. The returned
   [long-running operation][google.longrunning.Operation] can be used to track the progress of
   updating the instance. If the named instance does not exist, returns `NOT_FOUND`.

   Immediately upon completion of this request:

   * For resource types for which a decrease in the instance's allocation has been
   requested, billing is based on the newly-requested level.

   Until completion of the returned operation:

   * Cancelling the operation sets its metadata's
   [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
   restoring resources to their pre-request values. The operation is guaranteed to succeed at
   undoing all resource changes, after which point it terminates with a `CANCELLED` status. *
   All other attempts to modify the instance are rejected. * Reading the instance via the API
   continues to give the pre-request resource levels.

   Upon completion of the returned operation:

   * Billing begins for all successfully-allocated resources (some types may have lower
   than the requested levels). * All newly-reserved resources are available for serving the
   instance's tables. * The instance's new resource levels are readable via the API.

   The returned [long-running operation][google.longrunning.Operation] will have a name of the
   format `<instance_name>/operations/<operation_id>` and can be used to track the
   instance modification. The [metadata][google.longrunning.Operation.metadata] field type is
   [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Instance][google.spanner.admin.instance.v1.Instance], if successful.

   Authorization requires `spanner.instances.update` permission on resource
   [name][google.spanner.admin.instance.v1.Instance.name].

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     Instance instance = Instance.newBuilder().build();
     FieldMask fieldMask = FieldMask.newBuilder().build();
     UpdateInstanceRequest request = UpdateInstanceRequest.newBuilder()
       .setInstance(instance)
       .setFieldMask(fieldMask)
       .build();
     OperationFuture<Instance, UpdateInstanceMetadata> future = instanceAdminClient.updateInstanceOperationCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`"
  ([^InstanceAdminClient this]
    (-> this (.updateInstanceOperationCallable))))

(defn shutdown
  ""
  ([^InstanceAdminClient this]
    (-> this (.shutdown))))

(defn get-instance
  "Gets information about a particular instance.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     Instance response = instanceAdminClient.getInstance(name);
   }

  name - Required. The name of the requested instance. Values are of the form `projects/<project>/instances/<instance>`. - `com.google.spanner.admin.instance.v1.InstanceName`

  returns: `com.google.spanner.admin.instance.v1.Instance`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.admin.instance.v1.Instance [^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.InstanceName name]
    (-> this (.getInstance name))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^InstanceAdminClient this]
    (-> this (.getOperationsClient))))

(defn set-iam-policy-callable
  "Sets the access control policy on an instance resource. Replaces any existing policy.

   Authorization requires `spanner.instances.setIamPolicy` on
   [resource][google.iam.v1.SetIamPolicyRequest.resource].

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     String formattedResource = InstanceName.format(\"[PROJECT]\", \"[INSTANCE]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = instanceAdminClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^InstanceAdminClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns permissions that the caller has on the specified instance resource.

   Attempting this RPC on a non-existent Cloud Spanner instance resource will result in a
   NOT_FOUND error if the user has `spanner.instances.list` permission on the containing Google
   Cloud Project. Otherwise returns an empty set of permissions.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     String formattedResource = InstanceName.format(\"[PROJECT]\", \"[INSTANCE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(formattedResource)
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = instanceAdminClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.testIamPermissionsCallable))))

(defn get-iam-policy
  "Gets the access control policy for an instance resource. Returns an empty policy if an instance
   exists but does not have a policy set.

   Authorization requires `spanner.instances.getIamPolicy` on
   [resource][google.iam.v1.GetIamPolicyRequest.resource].

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     String formattedResource = InstanceName.format(\"[PROJECT]\", \"[INSTANCE]\");
     Policy response = instanceAdminClient.getIamPolicy(formattedResource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^InstanceAdminClient this ^java.lang.String resource]
    (-> this (.getIamPolicy resource))))

(defn list-instance-configs
  "Lists the supported instance configurations for a given project.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     for (InstanceConfig element : instanceAdminClient.listInstanceConfigs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The name of the project for which a list of supported instance configurations is requested. Values are of the form `projects/<project>`. - `com.google.spanner.admin.instance.v1.ProjectName`

  returns: `com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse [^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.ProjectName parent]
    (-> this (.listInstanceConfigs parent))))

(defn delete-instance-callable
  "Deletes an instance.

   Immediately upon completion of the request:

   * Billing ceases for all of the instance's reserved resources.

   Soon afterward:

   * The instance and *all of its databases* immediately and irrevocably disappear
   from the API. All data in the databases is permanently deleted.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     DeleteInstanceRequest request = DeleteInstanceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = instanceAdminClient.deleteInstanceCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.DeleteInstanceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.deleteInstanceCallable))))

(defn create-instance-callable
  "Creates an instance and begins preparing it to begin serving. The returned [long-running
   operation][google.longrunning.Operation] can be used to track the progress of preparing the new
   instance. The instance name is assigned by the caller. If the named instance already exists,
   `CreateInstance` returns `ALREADY_EXISTS`.

   Immediately upon completion of this request:

   * The instance is readable via the API, with all requested attributes but no allocated
   resources. Its state is `CREATING`.

   Until completion of the returned operation:

   * Cancelling the operation renders the instance immediately unreadable via the API.
   * The instance can be deleted. * All other attempts to modify the instance are
   rejected.

   Upon completion of the returned operation:

   * Billing for all successfully-allocated resources begins (some types may have lower
   than the requested levels). * Databases can be created in the instance. * The
   instance's allocated resource levels are readable via the API. * The instance's state
   becomes `READY`.

   The returned [long-running operation][google.longrunning.Operation] will have a name of the
   format `<instance_name>/operations/<operation_id>` and can be used to track
   creation of the instance. The [metadata][google.longrunning.Operation.metadata] field type is
   [CreateInstanceMetadata][google.spanner.admin.instance.v1.CreateInstanceMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Instance][google.spanner.admin.instance.v1.Instance], if successful.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     InstanceName instanceId = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     Instance instance = Instance.newBuilder().build();
     CreateInstanceRequest request = CreateInstanceRequest.newBuilder()
       .setParent(parent.toString())
       .setInstanceId(instanceId.toString())
       .setInstance(instance)
       .build();
     ApiFuture<Operation> future = instanceAdminClient.createInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.createInstanceCallable))))

(defn list-instance-configs-paged-callable
  "Lists the supported instance configurations for a given project.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListInstanceConfigsRequest request = ListInstanceConfigsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListInstanceConfigsPagedResponse> future = instanceAdminClient.listInstanceConfigsPagedCallable().futureCall(request);
     // Do something
     for (InstanceConfig element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.ListInstanceConfigsRequest,com.google.cloud.spanner.admin.instance.v1.InstanceAdminClient$ListInstanceConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.listInstanceConfigsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^InstanceAdminClient this]
    (-> this (.isTerminated))))

(defn update-instance-async
  "Updates an instance, and begins allocating or releasing resources as requested. The returned
   [long-running operation][google.longrunning.Operation] can be used to track the progress of
   updating the instance. If the named instance does not exist, returns `NOT_FOUND`.

   Immediately upon completion of this request:

   * For resource types for which a decrease in the instance's allocation has been
   requested, billing is based on the newly-requested level.

   Until completion of the returned operation:

   * Cancelling the operation sets its metadata's
   [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
   restoring resources to their pre-request values. The operation is guaranteed to succeed at
   undoing all resource changes, after which point it terminates with a `CANCELLED` status. *
   All other attempts to modify the instance are rejected. * Reading the instance via the API
   continues to give the pre-request resource levels.

   Upon completion of the returned operation:

   * Billing begins for all successfully-allocated resources (some types may have lower
   than the requested levels). * All newly-reserved resources are available for serving the
   instance's tables. * The instance's new resource levels are readable via the API.

   The returned [long-running operation][google.longrunning.Operation] will have a name of the
   format `<instance_name>/operations/<operation_id>` and can be used to track the
   instance modification. The [metadata][google.longrunning.Operation.metadata] field type is
   [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Instance][google.spanner.admin.instance.v1.Instance], if successful.

   Authorization requires `spanner.instances.update` permission on resource
   [name][google.spanner.admin.instance.v1.Instance.name].

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     Instance instance = Instance.newBuilder().build();
     FieldMask fieldMask = FieldMask.newBuilder().build();
     Instance response = instanceAdminClient.updateInstanceAsync(instance, fieldMask).get();
   }

  instance - Required. The instance to update, which must always include the instance name. Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included. - `com.google.spanner.admin.instance.v1.Instance`
  field-mask - Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated. The field mask must always be specified; this prevents any future fields in [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know about them. - `com.google.protobuf.FieldMask`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.Instance instance ^com.google.protobuf.FieldMask field-mask]
    (-> this (.updateInstanceAsync instance field-mask)))
  ([^InstanceAdminClient this ^com.google.spanner.admin.instance.v1.UpdateInstanceRequest request]
    (-> this (.updateInstanceAsync request))))

(defn update-instance-callable
  "Updates an instance, and begins allocating or releasing resources as requested. The returned
   [long-running operation][google.longrunning.Operation] can be used to track the progress of
   updating the instance. If the named instance does not exist, returns `NOT_FOUND`.

   Immediately upon completion of this request:

   * For resource types for which a decrease in the instance's allocation has been
   requested, billing is based on the newly-requested level.

   Until completion of the returned operation:

   * Cancelling the operation sets its metadata's
   [cancel_time][google.spanner.admin.instance.v1.UpdateInstanceMetadata.cancel_time], and begins
   restoring resources to their pre-request values. The operation is guaranteed to succeed at
   undoing all resource changes, after which point it terminates with a `CANCELLED` status. *
   All other attempts to modify the instance are rejected. * Reading the instance via the API
   continues to give the pre-request resource levels.

   Upon completion of the returned operation:

   * Billing begins for all successfully-allocated resources (some types may have lower
   than the requested levels). * All newly-reserved resources are available for serving the
   instance's tables. * The instance's new resource levels are readable via the API.

   The returned [long-running operation][google.longrunning.Operation] will have a name of the
   format `<instance_name>/operations/<operation_id>` and can be used to track the
   instance modification. The [metadata][google.longrunning.Operation.metadata] field type is
   [UpdateInstanceMetadata][google.spanner.admin.instance.v1.UpdateInstanceMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Instance][google.spanner.admin.instance.v1.Instance], if successful.

   Authorization requires `spanner.instances.update` permission on resource
   [name][google.spanner.admin.instance.v1.Instance.name].

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     Instance instance = Instance.newBuilder().build();
     FieldMask fieldMask = FieldMask.newBuilder().build();
     UpdateInstanceRequest request = UpdateInstanceRequest.newBuilder()
       .setInstance(instance)
       .setFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = instanceAdminClient.updateInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.updateInstanceCallable))))

(defn get-instance-callable
  "Gets information about a particular instance.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     InstanceName name = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     GetInstanceRequest request = GetInstanceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Instance> future = instanceAdminClient.getInstanceCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.instance.v1.GetInstanceRequest,com.google.spanner.admin.instance.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceAdminClient this]
    (-> this (.getInstanceCallable))))

(defn shutdown-now
  ""
  ([^InstanceAdminClient this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions
  "Returns permissions that the caller has on the specified instance resource.

   Attempting this RPC on a non-existent Cloud Spanner instance resource will result in a
   NOT_FOUND error if the user has `spanner.instances.list` permission on the containing Google
   Cloud Project. Otherwise returns an empty set of permissions.

   Sample code:



   try (InstanceAdminClient instanceAdminClient = InstanceAdminClient.create()) {
     String formattedResource = InstanceName.format(\"[PROJECT]\", \"[INSTANCE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = instanceAdminClient.testIamPermissions(formattedResource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^InstanceAdminClient this ^java.lang.String resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^InstanceAdminClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

