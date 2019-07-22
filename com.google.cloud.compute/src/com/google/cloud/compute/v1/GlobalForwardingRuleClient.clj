(ns com.google.cloud.compute.v1.GlobalForwardingRuleClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
    ProjectGlobalForwardingRuleName forwardingRule = ProjectGlobalForwardingRuleName.of(\"[PROJECT]\", \"[FORWARDING_RULE]\");
    Operation response = globalForwardingRuleClient.deleteGlobalForwardingRule(forwardingRule);
  }

  Note: close() needs to be called on the globalForwardingRuleClient object to clean up
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

  This class can be customized by passing in a custom instance of GlobalForwardingRuleSettings
  to create(). For example:

  To customize credentials:



  GlobalForwardingRuleSettings globalForwardingRuleSettings =
      GlobalForwardingRuleSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  GlobalForwardingRuleClient globalForwardingRuleClient =
      GlobalForwardingRuleClient.create(globalForwardingRuleSettings);

  To customize the endpoint:



  GlobalForwardingRuleSettings globalForwardingRuleSettings =
      GlobalForwardingRuleSettings.newBuilder().setEndpoint(myEndpoint).build();
  GlobalForwardingRuleClient globalForwardingRuleClient =
      GlobalForwardingRuleClient.create(globalForwardingRuleSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalForwardingRuleClient]))

(defn *create
  "Constructs an instance of GlobalForwardingRuleClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.GlobalForwardingRuleSettings`

  returns: `com.google.cloud.compute.v1.GlobalForwardingRuleClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.GlobalForwardingRuleClient [^com.google.cloud.compute.v1.GlobalForwardingRuleSettings settings]
    (GlobalForwardingRuleClient/create settings))
  (^com.google.cloud.compute.v1.GlobalForwardingRuleClient []
    (GlobalForwardingRuleClient/create )))

(defn insert-global-forwarding-rule-callable
  "Creates a GlobalForwardingRule resource in the specified project using the data included in the
   request.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ForwardingRule forwardingRuleResource = ForwardingRule.newBuilder().build();
     InsertGlobalForwardingRuleHttpRequest request = InsertGlobalForwardingRuleHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setForwardingRuleResource(forwardingRuleResource)
       .build();
     ApiFuture<Operation> future = globalForwardingRuleClient.insertGlobalForwardingRuleCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleClient this]
    (-> this (.insertGlobalForwardingRuleCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.GlobalForwardingRuleSettings`"
  (^com.google.cloud.compute.v1.GlobalForwardingRuleSettings [^GlobalForwardingRuleClient this]
    (-> this (.getSettings))))

(defn list-global-forwarding-rules
  "Retrieves a list of GlobalForwardingRule resources available to the specified project.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (ForwardingRule element : globalForwardingRuleClient.listGlobalForwardingRules(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.GlobalForwardingRuleClient$ListGlobalForwardingRulesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.GlobalForwardingRuleClient$ListGlobalForwardingRulesPagedResponse [^GlobalForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listGlobalForwardingRules project))))

(defn set-target-global-forwarding-rule-callable
  "Changes target URL for the GlobalForwardingRule resource. The new target should be of the same
   type as the old target.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     String formattedForwardingRule = ProjectGlobalForwardingRuleName.format(\"[PROJECT]\", \"[FORWARDING_RULE]\");
     TargetReference targetReferenceResource = TargetReference.newBuilder().build();
     SetTargetGlobalForwardingRuleHttpRequest request = SetTargetGlobalForwardingRuleHttpRequest.newBuilder()
       .setForwardingRule(formattedForwardingRule)
       .setTargetReferenceResource(targetReferenceResource)
       .build();
     ApiFuture<Operation> future = globalForwardingRuleClient.setTargetGlobalForwardingRuleCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleClient this]
    (-> this (.setTargetGlobalForwardingRuleCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.GlobalForwardingRuleStub`"
  ([^GlobalForwardingRuleClient this]
    (-> this (.getStub))))

(defn delete-global-forwarding-rule
  "Deletes the specified GlobalForwardingRule resource.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     ProjectGlobalForwardingRuleName forwardingRule = ProjectGlobalForwardingRuleName.of(\"[PROJECT]\", \"[FORWARDING_RULE]\");
     Operation response = globalForwardingRuleClient.deleteGlobalForwardingRule(forwardingRule);
   }

  forwarding-rule - Name of the ForwardingRule resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^GlobalForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName forwarding-rule]
    (-> this (.deleteGlobalForwardingRule forwarding-rule))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GlobalForwardingRuleClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GlobalForwardingRuleClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn set-target-global-forwarding-rule
  "Changes target URL for the GlobalForwardingRule resource. The new target should be of the same
   type as the old target.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     ProjectGlobalForwardingRuleName forwardingRule = ProjectGlobalForwardingRuleName.of(\"[PROJECT]\", \"[FORWARDING_RULE]\");
     TargetReference targetReferenceResource = TargetReference.newBuilder().build();
     Operation response = globalForwardingRuleClient.setTargetGlobalForwardingRule(forwardingRule, targetReferenceResource);
   }

  forwarding-rule - Name of the ForwardingRule resource in which target is to be set. - `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName`
  target-reference-resource - `com.google.cloud.compute.v1.TargetReference`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^GlobalForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName forwarding-rule ^com.google.cloud.compute.v1.TargetReference target-reference-resource]
    (-> this (.setTargetGlobalForwardingRule forwarding-rule target-reference-resource)))
  (^com.google.cloud.compute.v1.Operation [^GlobalForwardingRuleClient this ^com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleHttpRequest request]
    (-> this (.setTargetGlobalForwardingRule request))))

(defn shutdown
  ""
  ([^GlobalForwardingRuleClient this]
    (-> this (.shutdown))))

(defn get-global-forwarding-rule-callable
  "Returns the specified GlobalForwardingRule resource. Gets a list of available forwarding rules
   by making a list() request.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     String formattedForwardingRule = ProjectGlobalForwardingRuleName.format(\"[PROJECT]\", \"[FORWARDING_RULE]\");
     GetGlobalForwardingRuleHttpRequest request = GetGlobalForwardingRuleHttpRequest.newBuilder()
       .setForwardingRule(formattedForwardingRule)
       .build();
     ApiFuture<ForwardingRule> future = globalForwardingRuleClient.getGlobalForwardingRuleCallable().futureCall(request);
     // Do something
     ForwardingRule response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleClient this]
    (-> this (.getGlobalForwardingRuleCallable))))

(defn close
  ""
  ([^GlobalForwardingRuleClient this]
    (-> this (.close))))

(defn list-global-forwarding-rules-callable
  "Retrieves a list of GlobalForwardingRule resources available to the specified project.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListGlobalForwardingRulesHttpRequest request = ListGlobalForwardingRulesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       ForwardingRuleList response = globalForwardingRuleClient.listGlobalForwardingRulesCallable().call(request);
       for (ForwardingRule element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleClient this]
    (-> this (.listGlobalForwardingRulesCallable))))

(defn list-global-forwarding-rules-paged-callable
  "Retrieves a list of GlobalForwardingRule resources available to the specified project.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListGlobalForwardingRulesHttpRequest request = ListGlobalForwardingRulesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListGlobalForwardingRulesPagedResponse> future = globalForwardingRuleClient.listGlobalForwardingRulesPagedCallable().futureCall(request);
     // Do something
     for (ForwardingRule element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.GlobalForwardingRuleClient$ListGlobalForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleClient this]
    (-> this (.listGlobalForwardingRulesPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GlobalForwardingRuleClient this]
    (-> this (.isTerminated))))

(defn get-global-forwarding-rule
  "Returns the specified GlobalForwardingRule resource. Gets a list of available forwarding rules
   by making a list() request.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     ProjectGlobalForwardingRuleName forwardingRule = ProjectGlobalForwardingRuleName.of(\"[PROJECT]\", \"[FORWARDING_RULE]\");
     ForwardingRule response = globalForwardingRuleClient.getGlobalForwardingRule(forwardingRule);
   }

  forwarding-rule - Name of the ForwardingRule resource to return. - `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName`

  returns: `com.google.cloud.compute.v1.ForwardingRule`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ForwardingRule [^GlobalForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName forwarding-rule]
    (-> this (.getGlobalForwardingRule forwarding-rule))))

(defn insert-global-forwarding-rule
  "Creates a GlobalForwardingRule resource in the specified project using the data included in the
   request.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ForwardingRule forwardingRuleResource = ForwardingRule.newBuilder().build();
     Operation response = globalForwardingRuleClient.insertGlobalForwardingRule(project, forwardingRuleResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  forwarding-rule-resource - A ForwardingRule resource. A ForwardingRule resource specifies which pool of target virtual machines to forward a packet to if it matches the given [IPAddress, IPProtocol, ports] tuple. (== resource_for beta.forwardingRules ==) (== resource_for v1.forwardingRules ==) (== resource_for beta.globalForwardingRules ==) (== resource_for v1.globalForwardingRules ==) (== resource_for beta.regionForwardingRules ==) (== resource_for v1.regionForwardingRules ==) - `com.google.cloud.compute.v1.ForwardingRule`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^GlobalForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.ForwardingRule forwarding-rule-resource]
    (-> this (.insertGlobalForwardingRule project forwarding-rule-resource)))
  (^com.google.cloud.compute.v1.Operation [^GlobalForwardingRuleClient this ^com.google.cloud.compute.v1.InsertGlobalForwardingRuleHttpRequest request]
    (-> this (.insertGlobalForwardingRule request))))

(defn shutdown-now
  ""
  ([^GlobalForwardingRuleClient this]
    (-> this (.shutdownNow))))

(defn delete-global-forwarding-rule-callable
  "Deletes the specified GlobalForwardingRule resource.

   Sample code:



   try (GlobalForwardingRuleClient globalForwardingRuleClient = GlobalForwardingRuleClient.create()) {
     String formattedForwardingRule = ProjectGlobalForwardingRuleName.format(\"[PROJECT]\", \"[FORWARDING_RULE]\");
     DeleteGlobalForwardingRuleHttpRequest request = DeleteGlobalForwardingRuleHttpRequest.newBuilder()
       .setForwardingRule(formattedForwardingRule)
       .build();
     ApiFuture<Operation> future = globalForwardingRuleClient.deleteGlobalForwardingRuleCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalForwardingRuleClient this]
    (-> this (.deleteGlobalForwardingRuleCallable))))

