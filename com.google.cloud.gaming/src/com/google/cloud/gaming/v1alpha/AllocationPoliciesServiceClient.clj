(ns com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient
  "Service Description: The cloud gaming allocation policy is used as the controller's recipe for
  the allocating game servers from clusters. The policy has three modes: 1. Default mode which is
  not limited to time. 2. Time based mode which is temporary and overrides the default mode when
  effective. 3. Periodic mode which follows the time base mode, but happens periodically using
  local time, identified by cron specs.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
    String formattedName = AllocationPoliciesServiceClient.formatAllocationPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[ALLOCATION_POLICY]\");
    AllocationPolicy response = allocationPoliciesServiceClient.getAllocationPolicy(formattedName);
  }

  Note: close() needs to be called on the allocationPoliciesServiceClient object to clean up
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

  This class can be customized by passing in a custom instance of
  AllocationPoliciesServiceSettings to create(). For example:

  To customize credentials:



  AllocationPoliciesServiceSettings allocationPoliciesServiceSettings =
      AllocationPoliciesServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AllocationPoliciesServiceClient allocationPoliciesServiceClient =
      AllocationPoliciesServiceClient.create(allocationPoliciesServiceSettings);

  To customize the endpoint:



  AllocationPoliciesServiceSettings allocationPoliciesServiceSettings =
      AllocationPoliciesServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  AllocationPoliciesServiceClient allocationPoliciesServiceClient =
      AllocationPoliciesServiceClient.create(allocationPoliciesServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha AllocationPoliciesServiceClient]))

(defn *format-allocation-policy-name
  "Deprecated. Use the AllocationPolicyName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  allocation-policy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String allocation-policy]
    (AllocationPoliciesServiceClient/formatAllocationPolicyName project location allocation-policy)))

(defn *format-location-name
  "Deprecated. Use the LocationName class instead.

  project - `java.lang.String`
  location - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location]
    (AllocationPoliciesServiceClient/formatLocationName project location)))

(defn *parse-project-from-allocation-policy-name
  "Deprecated. Use the AllocationPolicyName class instead.

  allocation-policy-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String allocation-policy-name]
    (AllocationPoliciesServiceClient/parseProjectFromAllocationPolicyName allocation-policy-name)))

(defn *parse-location-from-allocation-policy-name
  "Deprecated. Use the AllocationPolicyName class instead.

  allocation-policy-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String allocation-policy-name]
    (AllocationPoliciesServiceClient/parseLocationFromAllocationPolicyName allocation-policy-name)))

(defn *parse-allocation-policy-from-allocation-policy-name
  "Deprecated. Use the AllocationPolicyName class instead.

  allocation-policy-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String allocation-policy-name]
    (AllocationPoliciesServiceClient/parseAllocationPolicyFromAllocationPolicyName allocation-policy-name)))

(defn *parse-project-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (AllocationPoliciesServiceClient/parseProjectFromLocationName location-name)))

(defn *parse-location-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (AllocationPoliciesServiceClient/parseLocationFromLocationName location-name)))

(defn *create
  "Constructs an instance of AllocationPoliciesServiceClient, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings`

  returns: `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient [^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings settings]
    (AllocationPoliciesServiceClient/create settings))
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient []
    (AllocationPoliciesServiceClient/create )))

(defn delete-allocation-policy-callable
  "Deletes a single allocation policy.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedName = AllocationPoliciesServiceClient.formatAllocationPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[ALLOCATION_POLICY]\");
     DeleteAllocationPolicyRequest request = DeleteAllocationPolicyRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Operation> future = allocationPoliciesServiceClient.deleteAllocationPolicyCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceClient this]
    (-> this (.deleteAllocationPolicyCallable))))

(defn delete-allocation-policy-operation-callable
  "Deletes a single allocation policy.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedName = AllocationPoliciesServiceClient.formatAllocationPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[ALLOCATION_POLICY]\");
     DeleteAllocationPolicyRequest request = DeleteAllocationPolicyRequest.newBuilder()
       .setName(formattedName)
       .build();
     OperationFuture<Empty, Empty> future = allocationPoliciesServiceClient.deleteAllocationPolicyOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceClient this]
    (-> this (.deleteAllocationPolicyOperationCallable))))

(defn get-settings
  "returns: `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings`"
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings [^AllocationPoliciesServiceClient this]
    (-> this (.getSettings))))

(defn update-allocation-policy-operation-callable
  "Patches a single allocation policy.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     AllocationPolicy allocationPolicy = AllocationPolicy.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateAllocationPolicyRequest request = UpdateAllocationPolicyRequest.newBuilder()
       .setAllocationPolicy(allocationPolicy)
       .setUpdateMask(updateMask)
       .build();
     OperationFuture<AllocationPolicy, Empty> future = allocationPoliciesServiceClient.updateAllocationPolicyOperationCallable().futureCall(request);
     // Do something
     AllocationPolicy response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceClient this]
    (-> this (.updateAllocationPolicyOperationCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStub`"
  ([^AllocationPoliciesServiceClient this]
    (-> this (.getStub))))

(defn get-allocation-policy-callable
  "Gets details of a single allocation policy.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedName = AllocationPoliciesServiceClient.formatAllocationPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[ALLOCATION_POLICY]\");
     GetAllocationPolicyRequest request = GetAllocationPolicyRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<AllocationPolicy> future = allocationPoliciesServiceClient.getAllocationPolicyCallable().futureCall(request);
     // Do something
     AllocationPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceClient this]
    (-> this (.getAllocationPolicyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AllocationPoliciesServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AllocationPoliciesServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^AllocationPoliciesServiceClient this]
    (-> this (.shutdown))))

(defn list-allocation-policies-callable
  "List allocation policies in a given project and location.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedParent = AllocationPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     ListAllocationPoliciesRequest request = ListAllocationPoliciesRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListAllocationPoliciesResponse response = allocationPoliciesServiceClient.listAllocationPoliciesCallable().call(request);
       for (AllocationPolicy element : response.getAllocationPoliciesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.ListAllocationPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceClient this]
    (-> this (.listAllocationPoliciesCallable))))

(defn get-allocation-policy
  "Gets details of a single allocation policy.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedName = AllocationPoliciesServiceClient.formatAllocationPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[ALLOCATION_POLICY]\");
     AllocationPolicy response = allocationPoliciesServiceClient.getAllocationPolicy(formattedName);
   }

  name - Required. The name of the allocation policy to retrieve, using the form: `projects/{project_id}/locations/{location}/allocationPolicies/{allocation_policy_id}` - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.AllocationPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.AllocationPolicy [^AllocationPoliciesServiceClient this ^java.lang.String name]
    (-> this (.getAllocationPolicy name))))

(defn create-allocation-policy-async
  "Creates a new allocation policy in a given project and location.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedParent = AllocationPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String allocationPolicyId = \"\";
     AllocationPolicy allocationPolicy = AllocationPolicy.newBuilder().build();
     AllocationPolicy response = allocationPoliciesServiceClient.createAllocationPolicyAsync(formattedParent, allocationPolicyId, allocationPolicy).get();
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}`. - `java.lang.String`
  allocation-policy-id - Required. The ID of the allocation policy resource to be created. - `java.lang.String`
  allocation-policy - Required. The allocation policy resource to be created. - `com.google.cloud.gaming.v1alpha.AllocationPolicy`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AllocationPoliciesServiceClient this ^java.lang.String parent ^java.lang.String allocation-policy-id ^com.google.cloud.gaming.v1alpha.AllocationPolicy allocation-policy]
    (-> this (.createAllocationPolicyAsync parent allocation-policy-id allocation-policy)))
  ([^AllocationPoliciesServiceClient this ^com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest request]
    (-> this (.createAllocationPolicyAsync request))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^AllocationPoliciesServiceClient this]
    (-> this (.getOperationsClient))))

(defn update-allocation-policy-async
  "Patches a single allocation policy.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     AllocationPolicy allocationPolicy = AllocationPolicy.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     AllocationPolicy response = allocationPoliciesServiceClient.updateAllocationPolicyAsync(allocationPolicy, updateMask).get();
   }

  allocation-policy - Required. The allocation policy to be updated. Only fields specified in update_mask are updated. - `com.google.cloud.gaming.v1alpha.AllocationPolicy`
  update-mask - Required. Mask of fields to update. At least one path must be supplied in this field. For the `FieldMask` definition, see https: //developers.google.com/protocol-buffers // /docs/reference/google.protobuf#fieldmask - `com.google.protobuf.FieldMask`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AllocationPoliciesServiceClient this ^com.google.cloud.gaming.v1alpha.AllocationPolicy allocation-policy ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateAllocationPolicyAsync allocation-policy update-mask)))
  ([^AllocationPoliciesServiceClient this ^com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest request]
    (-> this (.updateAllocationPolicyAsync request))))

(defn close
  ""
  ([^AllocationPoliciesServiceClient this]
    (-> this (.close))))

(defn list-allocation-policies-paged-callable
  "List allocation policies in a given project and location.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedParent = AllocationPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     ListAllocationPoliciesRequest request = ListAllocationPoliciesRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListAllocationPoliciesPagedResponse> future = allocationPoliciesServiceClient.listAllocationPoliciesPagedCallable().futureCall(request);
     // Do something
     for (AllocationPolicy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceClient this]
    (-> this (.listAllocationPoliciesPagedCallable))))

(defn list-allocation-policies
  "List allocation policies in a given project and location.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedParent = AllocationPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     for (AllocationPolicy element : allocationPoliciesServiceClient.listAllocationPolicies(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}`. - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse [^AllocationPoliciesServiceClient this ^java.lang.String parent]
    (-> this (.listAllocationPolicies parent))))

(defn create-allocation-policy-callable
  "Creates a new allocation policy in a given project and location.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedParent = AllocationPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String allocationPolicyId = \"\";
     AllocationPolicy allocationPolicy = AllocationPolicy.newBuilder().build();
     CreateAllocationPolicyRequest request = CreateAllocationPolicyRequest.newBuilder()
       .setParent(formattedParent)
       .setAllocationPolicyId(allocationPolicyId)
       .setAllocationPolicy(allocationPolicy)
       .build();
     ApiFuture<Operation> future = allocationPoliciesServiceClient.createAllocationPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceClient this]
    (-> this (.createAllocationPolicyCallable))))

(defn delete-allocation-policy-async
  "Deletes a single allocation policy.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedName = AllocationPoliciesServiceClient.formatAllocationPolicyName(\"[PROJECT]\", \"[LOCATION]\", \"[ALLOCATION_POLICY]\");
     allocationPoliciesServiceClient.deleteAllocationPolicyAsync(formattedName).get();
   }

  name - Required. The name of the allocation policy to delete, using the form: `projects/{project_id}/locations/{location}/allocationPolicies/{allocation_policy_id}` - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AllocationPoliciesServiceClient this ^java.lang.String name]
    (-> this (.deleteAllocationPolicyAsync name))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AllocationPoliciesServiceClient this]
    (-> this (.isTerminated))))

(defn update-allocation-policy-callable
  "Patches a single allocation policy.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     AllocationPolicy allocationPolicy = AllocationPolicy.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateAllocationPolicyRequest request = UpdateAllocationPolicyRequest.newBuilder()
       .setAllocationPolicy(allocationPolicy)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Operation> future = allocationPoliciesServiceClient.updateAllocationPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AllocationPoliciesServiceClient this]
    (-> this (.updateAllocationPolicyCallable))))

(defn shutdown-now
  ""
  ([^AllocationPoliciesServiceClient this]
    (-> this (.shutdownNow))))

(defn create-allocation-policy-operation-callable
  "Creates a new allocation policy in a given project and location.

   Sample code:



   try (AllocationPoliciesServiceClient allocationPoliciesServiceClient = AllocationPoliciesServiceClient.create()) {
     String formattedParent = AllocationPoliciesServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String allocationPolicyId = \"\";
     AllocationPolicy allocationPolicy = AllocationPolicy.newBuilder().build();
     CreateAllocationPolicyRequest request = CreateAllocationPolicyRequest.newBuilder()
       .setParent(formattedParent)
       .setAllocationPolicyId(allocationPolicyId)
       .setAllocationPolicy(allocationPolicy)
       .build();
     OperationFuture<AllocationPolicy, Empty> future = allocationPoliciesServiceClient.createAllocationPolicyOperationCallable().futureCall(request);
     // Do something
     AllocationPolicy response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceClient this]
    (-> this (.createAllocationPolicyOperationCallable))))

