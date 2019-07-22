(ns com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient
  "Service Description: The cloud gaming scaling policy is used to configure scaling parameters for
  each fleet.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
    String formattedName = ScalingPoliciesServiceClient.formatScalingPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[SCALING_POLICY]\");
    ScalingPolicy response = scalingPoliciesServiceClient.getScalingPolicy(formattedName);
  }

  Note: close() needs to be called on the scalingPoliciesServiceClient object to clean up
  resources such as threads. In the example above, try-with-resources is used, which automatically
  calls close().

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

  This class can be customized by passing in a custom instance of ScalingPoliciesServiceSettings
  to create(). For example:

  To customize credentials:



  ScalingPoliciesServiceSettings scalingPoliciesServiceSettings =
      ScalingPoliciesServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ScalingPoliciesServiceClient scalingPoliciesServiceClient =
      ScalingPoliciesServiceClient.create(scalingPoliciesServiceSettings);

  To customize the endpoint:



  ScalingPoliciesServiceSettings scalingPoliciesServiceSettings =
      ScalingPoliciesServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  ScalingPoliciesServiceClient scalingPoliciesServiceClient =
      ScalingPoliciesServiceClient.create(scalingPoliciesServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha ScalingPoliciesServiceClient]))

(defn *format-location-name
  "Deprecated. Use the LocationName class instead.

  project - `java.lang.String`
  location - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location]
    (ScalingPoliciesServiceClient/formatLocationName project location)))

(defn *format-scaling-policy-name
  "Deprecated. Use the ScalingPolicyName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  scaling-policy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String scaling-policy]
    (ScalingPoliciesServiceClient/formatScalingPolicyName project location scaling-policy)))

(defn *parse-project-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (ScalingPoliciesServiceClient/parseProjectFromLocationName location-name)))

(defn *parse-location-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (ScalingPoliciesServiceClient/parseLocationFromLocationName location-name)))

(defn *parse-project-from-scaling-policy-name
  "Deprecated. Use the ScalingPolicyName class instead.

  scaling-policy-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String scaling-policy-name]
    (ScalingPoliciesServiceClient/parseProjectFromScalingPolicyName scaling-policy-name)))

(defn *parse-location-from-scaling-policy-name
  "Deprecated. Use the ScalingPolicyName class instead.

  scaling-policy-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String scaling-policy-name]
    (ScalingPoliciesServiceClient/parseLocationFromScalingPolicyName scaling-policy-name)))

(defn *parse-scaling-policy-from-scaling-policy-name
  "Deprecated. Use the ScalingPolicyName class instead.

  scaling-policy-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String scaling-policy-name]
    (ScalingPoliciesServiceClient/parseScalingPolicyFromScalingPolicyName scaling-policy-name)))

(defn *create
  "Constructs an instance of ScalingPoliciesServiceClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceSettings`

  returns: `com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient [^com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceSettings settings]
    (ScalingPoliciesServiceClient/create settings))
  (^com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient []
    (ScalingPoliciesServiceClient/create )))

(defn create-scaling-policy-operation-callable
  "Creates a new scaling policy in a given project and location.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedParent = ScalingPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String scalingPolicyId = \"\";
     ScalingPolicy scalingPolicy = ScalingPolicy.newBuilder().build();
     CreateScalingPolicyRequest request = CreateScalingPolicyRequest.newBuilder()
       .setParent(formattedParent)
       .setScalingPolicyId(scalingPolicyId)
       .setScalingPolicy(scalingPolicy)
       .build();
     OperationFuture<ScalingPolicy, Empty> future = scalingPoliciesServiceClient.createScalingPolicyOperationCallable().futureCall(request);
     // Do something
     ScalingPolicy response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceClient this]
    (-> this (.createScalingPolicyOperationCallable))))

(defn delete-scaling-policy-async
  "Deletes a single scaling policy.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedName = ScalingPoliciesServiceClient.formatScalingPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[SCALING_POLICY]\");
     scalingPoliciesServiceClient.deleteScalingPolicyAsync(formattedName).get();
   }

  name - Required. The name of the scaling policy to delete, using the form: `projects/{project_id}/locations/{location}/scalingPolicies/{scaling_policy_id}` - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ScalingPoliciesServiceClient this ^java.lang.String name]
    (-> this (.deleteScalingPolicyAsync name))))

(defn get-settings
  "returns: `com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceSettings`"
  (^com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceSettings [^ScalingPoliciesServiceClient this]
    (-> this (.getSettings))))

(defn update-scaling-policy-callable
  "Patches a single scaling policy.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     ScalingPolicy scalingPolicy = ScalingPolicy.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateScalingPolicyRequest request = UpdateScalingPolicyRequest.newBuilder()
       .setScalingPolicy(scalingPolicy)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Operation> future = scalingPoliciesServiceClient.updateScalingPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceClient this]
    (-> this (.updateScalingPolicyCallable))))

(defn get-scaling-policy-callable
  "Gets details of a single scaling policy.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedName = ScalingPoliciesServiceClient.formatScalingPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[SCALING_POLICY]\");
     GetScalingPolicyRequest request = GetScalingPolicyRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<ScalingPolicy> future = scalingPoliciesServiceClient.getScalingPolicyCallable().futureCall(request);
     // Do something
     ScalingPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceClient this]
    (-> this (.getScalingPolicyCallable))))

(defn list-scaling-policies-paged-callable
  "Lists ScalingPolicies in a given project and location.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedParent = ScalingPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     ListScalingPoliciesRequest request = ListScalingPoliciesRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListScalingPoliciesPagedResponse> future = scalingPoliciesServiceClient.listScalingPoliciesPagedCallable().futureCall(request);
     // Do something
     for (ScalingPolicy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListScalingPoliciesRequest,com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceClient this]
    (-> this (.listScalingPoliciesPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStub`"
  ([^ScalingPoliciesServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ScalingPoliciesServiceClient this]
    (-> this (.isShutdown))))

(defn create-scaling-policy-async
  "Creates a new scaling policy in a given project and location.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedParent = ScalingPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String scalingPolicyId = \"\";
     ScalingPolicy scalingPolicy = ScalingPolicy.newBuilder().build();
     ScalingPolicy response = scalingPoliciesServiceClient.createScalingPolicyAsync(formattedParent, scalingPolicyId, scalingPolicy).get();
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}`. - `java.lang.String`
  scaling-policy-id - Required. The ID of the scaling policy resource to be created. - `java.lang.String`
  scaling-policy - Required. The scaling policy resource to be created. - `com.google.cloud.gaming.v1alpha.ScalingPolicy`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ScalingPoliciesServiceClient this ^java.lang.String parent ^java.lang.String scaling-policy-id ^com.google.cloud.gaming.v1alpha.ScalingPolicy scaling-policy]
    (-> this (.createScalingPolicyAsync parent scaling-policy-id scaling-policy)))
  ([^ScalingPoliciesServiceClient this ^com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest request]
    (-> this (.createScalingPolicyAsync request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ScalingPoliciesServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ScalingPoliciesServiceClient this]
    (-> this (.shutdown))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^ScalingPoliciesServiceClient this]
    (-> this (.getOperationsClient))))

(defn delete-scaling-policy-operation-callable
  "Deletes a single scaling policy.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedName = ScalingPoliciesServiceClient.formatScalingPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[SCALING_POLICY]\");
     DeleteScalingPolicyRequest request = DeleteScalingPolicyRequest.newBuilder()
       .setName(formattedName)
       .build();
     OperationFuture<Empty, Empty> future = scalingPoliciesServiceClient.deleteScalingPolicyOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceClient this]
    (-> this (.deleteScalingPolicyOperationCallable))))

(defn close
  ""
  ([^ScalingPoliciesServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ScalingPoliciesServiceClient this]
    (-> this (.isTerminated))))

(defn update-scaling-policy-operation-callable
  "Patches a single scaling policy.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     ScalingPolicy scalingPolicy = ScalingPolicy.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateScalingPolicyRequest request = UpdateScalingPolicyRequest.newBuilder()
       .setScalingPolicy(scalingPolicy)
       .setUpdateMask(updateMask)
       .build();
     OperationFuture<ScalingPolicy, Empty> future = scalingPoliciesServiceClient.updateScalingPolicyOperationCallable().futureCall(request);
     // Do something
     ScalingPolicy response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceClient this]
    (-> this (.updateScalingPolicyOperationCallable))))

(defn delete-scaling-policy-callable
  "Deletes a single scaling policy.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedName = ScalingPoliciesServiceClient.formatScalingPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[SCALING_POLICY]\");
     DeleteScalingPolicyRequest request = DeleteScalingPolicyRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Operation> future = scalingPoliciesServiceClient.deleteScalingPolicyCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceClient this]
    (-> this (.deleteScalingPolicyCallable))))

(defn get-scaling-policy
  "Gets details of a single scaling policy.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedName = ScalingPoliciesServiceClient.formatScalingPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[SCALING_POLICY]\");
     ScalingPolicy response = scalingPoliciesServiceClient.getScalingPolicy(formattedName);
   }

  name - Required. The name of the scaling policy to retrieve, using the form: `projects/{project_id}/locations/{location}/scalingPolicies/{scaling_policy_id}` - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.ScalingPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.ScalingPolicy [^ScalingPoliciesServiceClient this ^java.lang.String name]
    (-> this (.getScalingPolicy name))))

(defn create-scaling-policy-callable
  "Creates a new scaling policy in a given project and location.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedParent = ScalingPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String scalingPolicyId = \"\";
     ScalingPolicy scalingPolicy = ScalingPolicy.newBuilder().build();
     CreateScalingPolicyRequest request = CreateScalingPolicyRequest.newBuilder()
       .setParent(formattedParent)
       .setScalingPolicyId(scalingPolicyId)
       .setScalingPolicy(scalingPolicy)
       .build();
     ApiFuture<Operation> future = scalingPoliciesServiceClient.createScalingPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceClient this]
    (-> this (.createScalingPolicyCallable))))

(defn list-scaling-policies-callable
  "Lists ScalingPolicies in a given project and location.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedParent = ScalingPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     ListScalingPoliciesRequest request = ListScalingPoliciesRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListScalingPoliciesResponse response = scalingPoliciesServiceClient.listScalingPoliciesCallable().call(request);
       for (ScalingPolicy element : response.getScalingPoliciesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListScalingPoliciesRequest,com.google.cloud.gaming.v1alpha.ListScalingPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ScalingPoliciesServiceClient this]
    (-> this (.listScalingPoliciesCallable))))

(defn update-scaling-policy-async
  "Patches a single scaling policy.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     ScalingPolicy scalingPolicy = ScalingPolicy.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     ScalingPolicy response = scalingPoliciesServiceClient.updateScalingPolicyAsync(scalingPolicy, updateMask).get();
   }

  scaling-policy - Required. The scaling policy to be updated. Only fields specified in update_mask are updated. - `com.google.cloud.gaming.v1alpha.ScalingPolicy`
  update-mask - Required. Mask of fields to update. At least one path must be supplied in this field. For the `FieldMask` definition, see https: //developers.google.com/protocol-buffers // /docs/reference/google.protobuf#fieldmask - `com.google.protobuf.FieldMask`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ScalingPoliciesServiceClient this ^com.google.cloud.gaming.v1alpha.ScalingPolicy scaling-policy ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateScalingPolicyAsync scaling-policy update-mask)))
  ([^ScalingPoliciesServiceClient this ^com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest request]
    (-> this (.updateScalingPolicyAsync request))))

(defn shutdown-now
  ""
  ([^ScalingPoliciesServiceClient this]
    (-> this (.shutdownNow))))

(defn list-scaling-policies
  "Lists ScalingPolicies in a given project and location.

   Sample code:



   try (ScalingPoliciesServiceClient scalingPoliciesServiceClient = ScalingPoliciesServiceClient.create()) {
     String formattedParent = ScalingPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     for (ScalingPolicy element : scalingPoliciesServiceClient.listScalingPolicies(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}`. - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse [^ScalingPoliciesServiceClient this ^java.lang.String parent]
    (-> this (.listScalingPolicies parent))))

