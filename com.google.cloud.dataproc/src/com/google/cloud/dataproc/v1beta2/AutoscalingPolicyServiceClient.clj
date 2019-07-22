(ns com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient
  "Service Description: The API interface for managing autoscaling policies in the Google Cloud
  Dataproc API.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
    RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
    AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();
    AutoscalingPolicy response = autoscalingPolicyServiceClient.createAutoscalingPolicy(parent, policy);
  }

  Note: close() needs to be called on the autoscalingPolicyServiceClient object to clean up
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
  AutoscalingPolicyServiceSettings to create(). For example:

  To customize credentials:



  AutoscalingPolicyServiceSettings autoscalingPolicyServiceSettings =
      AutoscalingPolicyServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AutoscalingPolicyServiceClient autoscalingPolicyServiceClient =
      AutoscalingPolicyServiceClient.create(autoscalingPolicyServiceSettings);

  To customize the endpoint:



  AutoscalingPolicyServiceSettings autoscalingPolicyServiceSettings =
      AutoscalingPolicyServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  AutoscalingPolicyServiceClient autoscalingPolicyServiceClient =
      AutoscalingPolicyServiceClient.create(autoscalingPolicyServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 AutoscalingPolicyServiceClient]))

(defn *create
  "Constructs an instance of AutoscalingPolicyServiceClient, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings`

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient [^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings settings]
    (AutoscalingPolicyServiceClient/create settings))
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient []
    (AutoscalingPolicyServiceClient/create )))

(defn update-autoscaling-policy-callable
  "Updates (replaces) autoscaling policy.

   Disabled check for update_mask, because all updates will be full replacements.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();
     UpdateAutoscalingPolicyRequest request = UpdateAutoscalingPolicyRequest.newBuilder()
       .setPolicy(policy)
       .build();
     ApiFuture<AutoscalingPolicy> future = autoscalingPolicyServiceClient.updateAutoscalingPolicyCallable().futureCall(request);
     // Do something
     AutoscalingPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceClient this]
    (-> this (.updateAutoscalingPolicyCallable))))

(defn get-settings
  "returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings`"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings [^AutoscalingPolicyServiceClient this]
    (-> this (.getSettings))))

(defn list-autoscaling-policies-paged-callable
  "Lists autoscaling policies in the project.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     ListAutoscalingPoliciesRequest request = ListAutoscalingPoliciesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListAutoscalingPoliciesPagedResponse> future = autoscalingPolicyServiceClient.listAutoscalingPoliciesPagedCallable().futureCall(request);
     // Do something
     for (AutoscalingPolicy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceClient this]
    (-> this (.listAutoscalingPoliciesPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStub`"
  ([^AutoscalingPolicyServiceClient this]
    (-> this (.getStub))))

(defn list-autoscaling-policies
  "Lists autoscaling policies in the project.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (AutoscalingPolicy element : autoscalingPolicyServiceClient.listAutoscalingPolicies(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The \"resource name\" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}` - `com.google.cloud.dataproc.v1beta2.RegionName`

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse [^AutoscalingPolicyServiceClient this ^com.google.cloud.dataproc.v1beta2.RegionName parent]
    (-> this (.listAutoscalingPolicies parent))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AutoscalingPolicyServiceClient this]
    (-> this (.isShutdown))))

(defn update-autoscaling-policy
  "Updates (replaces) autoscaling policy.

   Disabled check for update_mask, because all updates will be full replacements.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();
     AutoscalingPolicy response = autoscalingPolicyServiceClient.updateAutoscalingPolicy(policy);
   }

  policy - Required. The updated autoscaling policy. - `com.google.cloud.dataproc.v1beta2.AutoscalingPolicy`

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicy [^AutoscalingPolicyServiceClient this ^com.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy]
    (-> this (.updateAutoscalingPolicy policy))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AutoscalingPolicyServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^AutoscalingPolicyServiceClient this]
    (-> this (.shutdown))))

(defn delete-autoscaling-policy
  "Deletes an autoscaling policy. It is an error to delete an autoscaling policy that is in use by
   one or more clusters.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     AutoscalingPolicyName name = AutoscalingPolicyName.of(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALING_POLICY]\");
     autoscalingPolicyServiceClient.deleteAutoscalingPolicy(name);
   }

  name - Required. The \"resource name\" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`. - `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AutoscalingPolicyServiceClient this ^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyName name]
    (-> this (.deleteAutoscalingPolicy name))))

(defn create-autoscaling-policy-callable
  "Creates new autoscaling policy.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();
     CreateAutoscalingPolicyRequest request = CreateAutoscalingPolicyRequest.newBuilder()
       .setParent(parent.toString())
       .setPolicy(policy)
       .build();
     ApiFuture<AutoscalingPolicy> future = autoscalingPolicyServiceClient.createAutoscalingPolicyCallable().futureCall(request);
     // Do something
     AutoscalingPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CreateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceClient this]
    (-> this (.createAutoscalingPolicyCallable))))

(defn create-autoscaling-policy
  "Creates new autoscaling policy.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();
     AutoscalingPolicy response = autoscalingPolicyServiceClient.createAutoscalingPolicy(parent, policy);
   }

  parent - Required. The \"resource name\" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}`. - `com.google.cloud.dataproc.v1beta2.RegionName`
  policy - The autoscaling policy to create. - `com.google.cloud.dataproc.v1beta2.AutoscalingPolicy`

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicy [^AutoscalingPolicyServiceClient this ^com.google.cloud.dataproc.v1beta2.RegionName parent ^com.google.cloud.dataproc.v1beta2.AutoscalingPolicy policy]
    (-> this (.createAutoscalingPolicy parent policy)))
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicy [^AutoscalingPolicyServiceClient this ^com.google.cloud.dataproc.v1beta2.CreateAutoscalingPolicyRequest request]
    (-> this (.createAutoscalingPolicy request))))

(defn get-autoscaling-policy-callable
  "Retrieves autoscaling policy.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     AutoscalingPolicyName name = AutoscalingPolicyName.of(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALING_POLICY]\");
     GetAutoscalingPolicyRequest request = GetAutoscalingPolicyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<AutoscalingPolicy> future = autoscalingPolicyServiceClient.getAutoscalingPolicyCallable().futureCall(request);
     // Do something
     AutoscalingPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceClient this]
    (-> this (.getAutoscalingPolicyCallable))))

(defn close
  ""
  ([^AutoscalingPolicyServiceClient this]
    (-> this (.close))))

(defn get-autoscaling-policy
  "Retrieves autoscaling policy.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     AutoscalingPolicyName name = AutoscalingPolicyName.of(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALING_POLICY]\");
     AutoscalingPolicy response = autoscalingPolicyServiceClient.getAutoscalingPolicy(name);
   }

  name - Required. The \"resource name\" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`. - `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyName`

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicy [^AutoscalingPolicyServiceClient this ^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyName name]
    (-> this (.getAutoscalingPolicy name))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AutoscalingPolicyServiceClient this]
    (-> this (.isTerminated))))

(defn delete-autoscaling-policy-callable
  "Deletes an autoscaling policy. It is an error to delete an autoscaling policy that is in use by
   one or more clusters.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     AutoscalingPolicyName name = AutoscalingPolicyName.of(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALING_POLICY]\");
     DeleteAutoscalingPolicyRequest request = DeleteAutoscalingPolicyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = autoscalingPolicyServiceClient.deleteAutoscalingPolicyCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteAutoscalingPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceClient this]
    (-> this (.deleteAutoscalingPolicyCallable))))

(defn list-autoscaling-policies-callable
  "Lists autoscaling policies in the project.

   Sample code:



   try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient = AutoscalingPolicyServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     ListAutoscalingPoliciesRequest request = ListAutoscalingPoliciesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListAutoscalingPoliciesResponse response = autoscalingPolicyServiceClient.listAutoscalingPoliciesCallable().call(request);
       for (AutoscalingPolicy element : response.getPoliciesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesRequest,com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalingPolicyServiceClient this]
    (-> this (.listAutoscalingPoliciesCallable))))

(defn shutdown-now
  ""
  ([^AutoscalingPolicyServiceClient this]
    (-> this (.shutdownNow))))

