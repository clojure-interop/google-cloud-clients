(ns com.google.cloud.compute.v1.ForwardingRuleClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
    ProjectRegionForwardingRuleName forwardingRule = ProjectRegionForwardingRuleName.of(\"[PROJECT]\", \"[REGION]\", \"[FORWARDING_RULE]\");
    Operation response = forwardingRuleClient.deleteForwardingRule(forwardingRule);
  }

  Note: close() needs to be called on the forwardingRuleClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of ForwardingRuleSettings to
  create(). For example:

  To customize credentials:



  ForwardingRuleSettings forwardingRuleSettings =
      ForwardingRuleSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ForwardingRuleClient forwardingRuleClient =
      ForwardingRuleClient.create(forwardingRuleSettings);

  To customize the endpoint:



  ForwardingRuleSettings forwardingRuleSettings =
      ForwardingRuleSettings.newBuilder().setEndpoint(myEndpoint).build();
  ForwardingRuleClient forwardingRuleClient =
      ForwardingRuleClient.create(forwardingRuleSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ForwardingRuleClient]))

(defn *create
  "Constructs an instance of ForwardingRuleClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.ForwardingRuleSettings`

  returns: `com.google.cloud.compute.v1.ForwardingRuleClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ForwardingRuleClient [^com.google.cloud.compute.v1.ForwardingRuleSettings settings]
    (ForwardingRuleClient/create settings))
  (^com.google.cloud.compute.v1.ForwardingRuleClient []
    (ForwardingRuleClient/create )))

(defn set-target-forwarding-rule
  "Changes target URL for forwarding rule. The new target should be of the same type as the old
   target.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     ProjectRegionForwardingRuleName forwardingRule = ProjectRegionForwardingRuleName.of(\"[PROJECT]\", \"[REGION]\", \"[FORWARDING_RULE]\");
     TargetReference targetReferenceResource = TargetReference.newBuilder().build();
     Operation response = forwardingRuleClient.setTargetForwardingRule(forwardingRule, targetReferenceResource);
   }

  forwarding-rule - Name of the ForwardingRule resource in which target is to be set. - `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName`
  target-reference-resource - `com.google.cloud.compute.v1.TargetReference`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName forwarding-rule ^com.google.cloud.compute.v1.TargetReference target-reference-resource]
    (-> this (.setTargetForwardingRule forwarding-rule target-reference-resource)))
  (^com.google.cloud.compute.v1.Operation [^ForwardingRuleClient this ^com.google.cloud.compute.v1.SetTargetForwardingRuleHttpRequest request]
    (-> this (.setTargetForwardingRule request))))

(defn aggregated-list-forwarding-rules
  "Retrieves an aggregated list of forwarding rules.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (ForwardingRulesScopedList element : forwardingRuleClient.aggregatedListForwardingRules(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.ForwardingRuleClient$AggregatedListForwardingRulesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ForwardingRuleClient$AggregatedListForwardingRulesPagedResponse [^ForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListForwardingRules project))))

(defn set-target-forwarding-rule-callable
  "Changes target URL for forwarding rule. The new target should be of the same type as the old
   target.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     String formattedForwardingRule = ProjectRegionForwardingRuleName.format(\"[PROJECT]\", \"[REGION]\", \"[FORWARDING_RULE]\");
     TargetReference targetReferenceResource = TargetReference.newBuilder().build();
     SetTargetForwardingRuleHttpRequest request = SetTargetForwardingRuleHttpRequest.newBuilder()
       .setForwardingRule(formattedForwardingRule)
       .setTargetReferenceResource(targetReferenceResource)
       .build();
     ApiFuture<Operation> future = forwardingRuleClient.setTargetForwardingRuleCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleClient this]
    (-> this (.setTargetForwardingRuleCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.ForwardingRuleSettings`"
  (^com.google.cloud.compute.v1.ForwardingRuleSettings [^ForwardingRuleClient this]
    (-> this (.getSettings))))

(defn delete-forwarding-rule-callable
  "Deletes the specified ForwardingRule resource.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     String formattedForwardingRule = ProjectRegionForwardingRuleName.format(\"[PROJECT]\", \"[REGION]\", \"[FORWARDING_RULE]\");
     DeleteForwardingRuleHttpRequest request = DeleteForwardingRuleHttpRequest.newBuilder()
       .setForwardingRule(formattedForwardingRule)
       .build();
     ApiFuture<Operation> future = forwardingRuleClient.deleteForwardingRuleCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleClient this]
    (-> this (.deleteForwardingRuleCallable))))

(defn get-forwarding-rule-callable
  "Returns the specified ForwardingRule resource.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     String formattedForwardingRule = ProjectRegionForwardingRuleName.format(\"[PROJECT]\", \"[REGION]\", \"[FORWARDING_RULE]\");
     GetForwardingRuleHttpRequest request = GetForwardingRuleHttpRequest.newBuilder()
       .setForwardingRule(formattedForwardingRule)
       .build();
     ApiFuture<ForwardingRule> future = forwardingRuleClient.getForwardingRuleCallable().futureCall(request);
     // Do something
     ForwardingRule response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleClient this]
    (-> this (.getForwardingRuleCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ForwardingRuleStub`"
  ([^ForwardingRuleClient this]
    (-> this (.getStub))))

(defn get-forwarding-rule
  "Returns the specified ForwardingRule resource.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     ProjectRegionForwardingRuleName forwardingRule = ProjectRegionForwardingRuleName.of(\"[PROJECT]\", \"[REGION]\", \"[FORWARDING_RULE]\");
     ForwardingRule response = forwardingRuleClient.getForwardingRule(forwardingRule);
   }

  forwarding-rule - Name of the ForwardingRule resource to return. - `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName`

  returns: `com.google.cloud.compute.v1.ForwardingRule`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ForwardingRule [^ForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName forwarding-rule]
    (-> this (.getForwardingRule forwarding-rule))))

(defn insert-forwarding-rule
  "Creates a ForwardingRule resource in the specified project and region using the data included
   in the request.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     ForwardingRule forwardingRuleResource = ForwardingRule.newBuilder().build();
     Operation response = forwardingRuleClient.insertForwardingRule(region, forwardingRuleResource);
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  forwarding-rule-resource - A ForwardingRule resource. A ForwardingRule resource specifies which pool of target virtual machines to forward a packet to if it matches the given [IPAddress, IPProtocol, ports] tuple. (== resource_for beta.forwardingRules ==) (== resource_for v1.forwardingRules ==) (== resource_for beta.globalForwardingRules ==) (== resource_for v1.globalForwardingRules ==) (== resource_for beta.regionForwardingRules ==) (== resource_for v1.regionForwardingRules ==) - `com.google.cloud.compute.v1.ForwardingRule`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.ForwardingRule forwarding-rule-resource]
    (-> this (.insertForwardingRule region forwarding-rule-resource)))
  (^com.google.cloud.compute.v1.Operation [^ForwardingRuleClient this ^com.google.cloud.compute.v1.InsertForwardingRuleHttpRequest request]
    (-> this (.insertForwardingRule request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ForwardingRuleClient this]
    (-> this (.isShutdown))))

(defn delete-forwarding-rule
  "Deletes the specified ForwardingRule resource.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     ProjectRegionForwardingRuleName forwardingRule = ProjectRegionForwardingRuleName.of(\"[PROJECT]\", \"[REGION]\", \"[FORWARDING_RULE]\");
     Operation response = forwardingRuleClient.deleteForwardingRule(forwardingRule);
   }

  forwarding-rule - Name of the ForwardingRule resource to delete. - `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName forwarding-rule]
    (-> this (.deleteForwardingRule forwarding-rule))))

(defn aggregated-list-forwarding-rules-paged-callable
  "Retrieves an aggregated list of forwarding rules.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListForwardingRulesHttpRequest request = AggregatedListForwardingRulesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListForwardingRulesPagedResponse> future = forwardingRuleClient.aggregatedListForwardingRulesPagedCallable().futureCall(request);
     // Do something
     for (ForwardingRulesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleClient$AggregatedListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleClient this]
    (-> this (.aggregatedListForwardingRulesPagedCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ForwardingRuleClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ForwardingRuleClient this]
    (-> this (.shutdown))))

(defn list-forwarding-rules-callable
  "Retrieves a list of ForwardingRule resources available to the specified project and region.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListForwardingRulesHttpRequest request = ListForwardingRulesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       ForwardingRuleList response = forwardingRuleClient.listForwardingRulesCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleClient this]
    (-> this (.listForwardingRulesCallable))))

(defn close
  ""
  ([^ForwardingRuleClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ForwardingRuleClient this]
    (-> this (.isTerminated))))

(defn list-forwarding-rules
  "Retrieves a list of ForwardingRule resources available to the specified project and region.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (ForwardingRule element : forwardingRuleClient.listForwardingRules(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.ForwardingRuleClient$ListForwardingRulesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ForwardingRuleClient$ListForwardingRulesPagedResponse [^ForwardingRuleClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listForwardingRules region))))

(defn aggregated-list-forwarding-rules-callable
  "Retrieves an aggregated list of forwarding rules.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListForwardingRulesHttpRequest request = AggregatedListForwardingRulesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       ForwardingRuleAggregatedList response = forwardingRuleClient.aggregatedListForwardingRulesCallable().call(request);
       for (ForwardingRulesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleClient this]
    (-> this (.aggregatedListForwardingRulesCallable))))

(defn insert-forwarding-rule-callable
  "Creates a ForwardingRule resource in the specified project and region using the data included
   in the request.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ForwardingRule forwardingRuleResource = ForwardingRule.newBuilder().build();
     InsertForwardingRuleHttpRequest request = InsertForwardingRuleHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setForwardingRuleResource(forwardingRuleResource)
       .build();
     ApiFuture<Operation> future = forwardingRuleClient.insertForwardingRuleCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleClient this]
    (-> this (.insertForwardingRuleCallable))))

(defn shutdown-now
  ""
  ([^ForwardingRuleClient this]
    (-> this (.shutdownNow))))

(defn list-forwarding-rules-paged-callable
  "Retrieves a list of ForwardingRule resources available to the specified project and region.

   Sample code:



   try (ForwardingRuleClient forwardingRuleClient = ForwardingRuleClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListForwardingRulesHttpRequest request = ListForwardingRulesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListForwardingRulesPagedResponse> future = forwardingRuleClient.listForwardingRulesPagedCallable().futureCall(request);
     // Do something
     for (ForwardingRule element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleClient$ListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ForwardingRuleClient this]
    (-> this (.listForwardingRulesPagedCallable))))

