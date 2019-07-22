(ns com.google.cloud.monitoring.v3.AlertPolicyServiceClient
  "Service Description: The AlertPolicyService API is used to manage (list, create, delete, edit)
  alert policies in Stackdriver Monitoring. An alerting policy is a description of the conditions
  under which some aspect of your system is considered to be \"unhealthy\" and the ways to notify
  people or services about this state. In addition to using this API, alert policies can also be
  managed through [Stackdriver Monitoring](https://cloud.google.com/monitoring/docs/), which can be
  reached by clicking the \"Monitoring\" tab in [Cloud Console](https://console.cloud.google.com/).

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
    AlertPolicyName name = AlertPolicyName.of(\"[PROJECT]\", \"[ALERT_POLICY]\");
    AlertPolicy response = alertPolicyServiceClient.getAlertPolicy(name);
  }

  Note: close() needs to be called on the alertPolicyServiceClient object to clean up resources
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

  This class can be customized by passing in a custom instance of AlertPolicyServiceSettings to
  create(). For example:

  To customize credentials:



  AlertPolicyServiceSettings alertPolicyServiceSettings =
      AlertPolicyServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AlertPolicyServiceClient alertPolicyServiceClient =
      AlertPolicyServiceClient.create(alertPolicyServiceSettings);

  To customize the endpoint:



  AlertPolicyServiceSettings alertPolicyServiceSettings =
      AlertPolicyServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  AlertPolicyServiceClient alertPolicyServiceClient =
      AlertPolicyServiceClient.create(alertPolicyServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 AlertPolicyServiceClient]))

(defn *create
  "Constructs an instance of AlertPolicyServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.monitoring.v3.AlertPolicyServiceSettings`

  returns: `com.google.cloud.monitoring.v3.AlertPolicyServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.AlertPolicyServiceClient [^com.google.cloud.monitoring.v3.AlertPolicyServiceSettings settings]
    (AlertPolicyServiceClient/create settings))
  (^com.google.cloud.monitoring.v3.AlertPolicyServiceClient []
    (AlertPolicyServiceClient/create )))

(defn get-alert-policy-callable
  "Gets a single alerting policy.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     AlertPolicyName name = AlertPolicyName.of(\"[PROJECT]\", \"[ALERT_POLICY]\");
     GetAlertPolicyRequest request = GetAlertPolicyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<AlertPolicy> future = alertPolicyServiceClient.getAlertPolicyCallable().futureCall(request);
     // Do something
     AlertPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceClient this]
    (-> this (.getAlertPolicyCallable))))

(defn get-settings
  "returns: `com.google.cloud.monitoring.v3.AlertPolicyServiceSettings`"
  (^com.google.cloud.monitoring.v3.AlertPolicyServiceSettings [^AlertPolicyServiceClient this]
    (-> this (.getSettings))))

(defn update-alert-policy
  "Updates an alerting policy. You can either replace the entire policy with a new one or replace
   only certain fields in the current alerting policy by specifying the fields to be updated via
   `updateMask`. Returns the updated alerting policy.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     FieldMask updateMask = FieldMask.newBuilder().build();
     AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
     AlertPolicy response = alertPolicyServiceClient.updateAlertPolicy(updateMask, alertPolicy);
   }

  update-mask - Optional. A list of alerting policy field names. If this field is not empty, each listed field in the existing alerting policy is set to the value of the corresponding field in the supplied policy (`alert_policy`), or to the field's default value if the field is not in the supplied alerting policy. Fields not listed retain their previous value. Examples of valid field masks include `display_name`, `documentation`, `documentation.content`, `documentation.mime_type`, `user_labels`, `user_label.nameofkey`, `enabled`, `conditions`, `combiner`, etc. If this field is empty, then the supplied alerting policy replaces the existing policy. It is the same as deleting the existing policy and adding the supplied policy, except for the following: + The new policy will have the same `[ALERT_POLICY_ID]` as the former policy. This gives you continuity with the former policy in your notifications and incidents. Conditions in the new policy will keep their former `[CONDITION_ID]` if the supplied condition includes the `name` field with that `[CONDITION_ID]`. If the supplied condition omits the `name` field, then a new `[CONDITION_ID]` is created. - `com.google.protobuf.FieldMask`
  alert-policy - Required. The updated alerting policy or the updated values for the fields listed in `update_mask`. If `update_mask` is not empty, any fields in this policy that are not in `update_mask` are ignored. - `com.google.monitoring.v3.AlertPolicy`

  returns: `com.google.monitoring.v3.AlertPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.AlertPolicy [^AlertPolicyServiceClient this ^com.google.protobuf.FieldMask update-mask ^com.google.monitoring.v3.AlertPolicy alert-policy]
    (-> this (.updateAlertPolicy update-mask alert-policy)))
  (^com.google.monitoring.v3.AlertPolicy [^AlertPolicyServiceClient this ^com.google.monitoring.v3.UpdateAlertPolicyRequest request]
    (-> this (.updateAlertPolicy request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStub`"
  ([^AlertPolicyServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AlertPolicyServiceClient this]
    (-> this (.isShutdown))))

(defn list-alert-policies
  "Lists the existing alerting policies for the project.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     for (AlertPolicy element : alertPolicyServiceClient.listAlertPolicies(name).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The project whose alert policies are to be listed. The format is projects/[PROJECT_ID] Note that this field names the parent container in which the alerting policies to be listed are stored. To retrieve a single alerting policy by name, use the [GetAlertPolicy][google.monitoring.v3.AlertPolicyService.GetAlertPolicy] operation, instead. - `com.google.monitoring.v3.ProjectName`

  returns: `com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse [^AlertPolicyServiceClient this ^com.google.monitoring.v3.ProjectName name]
    (-> this (.listAlertPolicies name))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AlertPolicyServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^AlertPolicyServiceClient this]
    (-> this (.shutdown))))

(defn update-alert-policy-callable
  "Updates an alerting policy. You can either replace the entire policy with a new one or replace
   only certain fields in the current alerting policy by specifying the fields to be updated via
   `updateMask`. Returns the updated alerting policy.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
     UpdateAlertPolicyRequest request = UpdateAlertPolicyRequest.newBuilder()
       .setAlertPolicy(alertPolicy)
       .build();
     ApiFuture<AlertPolicy> future = alertPolicyServiceClient.updateAlertPolicyCallable().futureCall(request);
     // Do something
     AlertPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceClient this]
    (-> this (.updateAlertPolicyCallable))))

(defn list-alert-policies-paged-callable
  "Lists the existing alerting policies for the project.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListAlertPoliciesRequest request = ListAlertPoliciesRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListAlertPoliciesPagedResponse> future = alertPolicyServiceClient.listAlertPoliciesPagedCallable().futureCall(request);
     // Do something
     for (AlertPolicy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceClient this]
    (-> this (.listAlertPoliciesPagedCallable))))

(defn get-alert-policy
  "Gets a single alerting policy.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     AlertPolicyName name = AlertPolicyName.of(\"[PROJECT]\", \"[ALERT_POLICY]\");
     AlertPolicy response = alertPolicyServiceClient.getAlertPolicy(name);
   }

  name - The alerting policy to retrieve. The format is projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID] - `com.google.monitoring.v3.AlertPolicyName`

  returns: `com.google.monitoring.v3.AlertPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.AlertPolicy [^AlertPolicyServiceClient this ^com.google.monitoring.v3.AlertPolicyName name]
    (-> this (.getAlertPolicy name))))

(defn delete-alert-policy-callable
  "Deletes an alerting policy.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     AlertPolicyName name = AlertPolicyName.of(\"[PROJECT]\", \"[ALERT_POLICY]\");
     DeleteAlertPolicyRequest request = DeleteAlertPolicyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = alertPolicyServiceClient.deleteAlertPolicyCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteAlertPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceClient this]
    (-> this (.deleteAlertPolicyCallable))))

(defn close
  ""
  ([^AlertPolicyServiceClient this]
    (-> this (.close))))

(defn list-alert-policies-callable
  "Lists the existing alerting policies for the project.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListAlertPoliciesRequest request = ListAlertPoliciesRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListAlertPoliciesResponse response = alertPolicyServiceClient.listAlertPoliciesCallable().call(request);
       for (AlertPolicy element : response.getAlertPoliciesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.monitoring.v3.ListAlertPoliciesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceClient this]
    (-> this (.listAlertPoliciesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AlertPolicyServiceClient this]
    (-> this (.isTerminated))))

(defn create-alert-policy
  "Creates a new alerting policy.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
     AlertPolicy response = alertPolicyServiceClient.createAlertPolicy(name, alertPolicy);
   }

  name - The project in which to create the alerting policy. The format is `projects/[PROJECT_ID]`. Note that this field names the parent container in which the alerting policy will be written, not the name of the created policy. The alerting policy that is returned will have a name that contains a normalized representation of this name as a prefix but adds a suffix of the form `/alertPolicies/[POLICY_ID]`, identifying the policy in the container. - `com.google.monitoring.v3.ProjectName`
  alert-policy - The requested alerting policy. You should omit the `name` field in this policy. The name will be returned in the new policy, including a new [ALERT_POLICY_ID] value. - `com.google.monitoring.v3.AlertPolicy`

  returns: `com.google.monitoring.v3.AlertPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.AlertPolicy [^AlertPolicyServiceClient this ^com.google.monitoring.v3.ProjectName name ^com.google.monitoring.v3.AlertPolicy alert-policy]
    (-> this (.createAlertPolicy name alert-policy)))
  (^com.google.monitoring.v3.AlertPolicy [^AlertPolicyServiceClient this ^com.google.monitoring.v3.CreateAlertPolicyRequest request]
    (-> this (.createAlertPolicy request))))

(defn shutdown-now
  ""
  ([^AlertPolicyServiceClient this]
    (-> this (.shutdownNow))))

(defn delete-alert-policy
  "Deletes an alerting policy.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     AlertPolicyName name = AlertPolicyName.of(\"[PROJECT]\", \"[ALERT_POLICY]\");
     alertPolicyServiceClient.deleteAlertPolicy(name);
   }

  name - The alerting policy to delete. The format is: projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID] For more information, see [AlertPolicy][google.monitoring.v3.AlertPolicy]. - `com.google.monitoring.v3.AlertPolicyName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AlertPolicyServiceClient this ^com.google.monitoring.v3.AlertPolicyName name]
    (-> this (.deleteAlertPolicy name))))

(defn create-alert-policy-callable
  "Creates a new alerting policy.

   Sample code:



   try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     AlertPolicy alertPolicy = AlertPolicy.newBuilder().build();
     CreateAlertPolicyRequest request = CreateAlertPolicyRequest.newBuilder()
       .setName(name.toString())
       .setAlertPolicy(alertPolicy)
       .build();
     ApiFuture<AlertPolicy> future = alertPolicyServiceClient.createAlertPolicyCallable().futureCall(request);
     // Do something
     AlertPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AlertPolicyServiceClient this]
    (-> this (.createAlertPolicyCallable))))

