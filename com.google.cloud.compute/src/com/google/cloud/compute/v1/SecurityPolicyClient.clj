(ns com.google.cloud.compute.v1.SecurityPolicyClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
    ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of(\"[PROJECT]\", \"[SECURITY_POLICY]\");
    SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
    Operation response = securityPolicyClient.addRuleSecurityPolicy(securityPolicy, securityPolicyRuleResource);
  }

  Note: close() needs to be called on the securityPolicyClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of SecurityPolicySettings to
  create(). For example:

  To customize credentials:



  SecurityPolicySettings securityPolicySettings =
      SecurityPolicySettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SecurityPolicyClient securityPolicyClient =
      SecurityPolicyClient.create(securityPolicySettings);

  To customize the endpoint:



  SecurityPolicySettings securityPolicySettings =
      SecurityPolicySettings.newBuilder().setEndpoint(myEndpoint).build();
  SecurityPolicyClient securityPolicyClient =
      SecurityPolicyClient.create(securityPolicySettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyClient]))

(defn *create
  "Constructs an instance of SecurityPolicyClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.SecurityPolicySettings`

  returns: `com.google.cloud.compute.v1.SecurityPolicyClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SecurityPolicyClient [^com.google.cloud.compute.v1.SecurityPolicySettings settings]
    (SecurityPolicyClient/create settings))
  (^com.google.cloud.compute.v1.SecurityPolicyClient []
    (SecurityPolicyClient/create )))

(defn patch-rule-security-policy
  "Patches a rule at the specified priority.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     Integer priority = 0;
     ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
     Operation response = securityPolicyClient.patchRuleSecurityPolicy(priority, securityPolicy, securityPolicyRuleResource);
   }

  priority - The priority of the rule to patch. - `java.lang.Integer`
  security-policy - Name of the security policy to update. - `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`
  security-policy-rule-resource - Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny). - `com.google.cloud.compute.v1.SecurityPolicyRule`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^java.lang.Integer priority ^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName security-policy ^com.google.cloud.compute.v1.SecurityPolicyRule security-policy-rule-resource]
    (-> this (.patchRuleSecurityPolicy priority security-policy security-policy-rule-resource)))
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest request]
    (-> this (.patchRuleSecurityPolicy request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.SecurityPolicySettings`"
  (^com.google.cloud.compute.v1.SecurityPolicySettings [^SecurityPolicyClient this]
    (-> this (.getSettings))))

(defn insert-security-policy
  "Creates a new policy in the specified project using the data included in the request.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
     Operation response = securityPolicyClient.insertSecurityPolicy(project, securityPolicyResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  security-policy-resource - A security policy is comprised of one or more rules. It can also be associated with one or more 'targets'. (== resource_for v1.securityPolicies ==) (== resource_for beta.securityPolicies ==) - `com.google.cloud.compute.v1.SecurityPolicy`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.SecurityPolicy security-policy-resource]
    (-> this (.insertSecurityPolicy project security-policy-resource)))
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest request]
    (-> this (.insertSecurityPolicy request))))

(defn get-rule-security-policy-callable
  "Gets a rule at the specified priority.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     Integer priority = 0;
     String formattedSecurityPolicy = ProjectGlobalSecurityPolicyName.format(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     GetRuleSecurityPolicyHttpRequest request = GetRuleSecurityPolicyHttpRequest.newBuilder()
       .setPriority(priority)
       .setSecurityPolicy(formattedSecurityPolicy)
       .build();
     ApiFuture<SecurityPolicyRule> future = securityPolicyClient.getRuleSecurityPolicyCallable().futureCall(request);
     // Do something
     SecurityPolicyRule response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicyRule>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.getRuleSecurityPolicyCallable))))

(defn get-rule-security-policy
  "Gets a rule at the specified priority.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     Integer priority = 0;
     ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     SecurityPolicyRule response = securityPolicyClient.getRuleSecurityPolicy(priority, securityPolicy);
   }

  priority - The priority of the rule to get from the security policy. - `java.lang.Integer`
  security-policy - Name of the security policy to which the queried rule belongs. - `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`

  returns: `com.google.cloud.compute.v1.SecurityPolicyRule`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SecurityPolicyRule [^SecurityPolicyClient this ^java.lang.Integer priority ^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName security-policy]
    (-> this (.getRuleSecurityPolicy priority security-policy)))
  (^com.google.cloud.compute.v1.SecurityPolicyRule [^SecurityPolicyClient this ^com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest request]
    (-> this (.getRuleSecurityPolicy request))))

(defn list-security-policies-paged-callable
  "List all the policies that have been configured for the specified project.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListSecurityPoliciesHttpRequest request = ListSecurityPoliciesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListSecurityPoliciesPagedResponse> future = securityPolicyClient.listSecurityPoliciesPagedCallable().futureCall(request);
     // Do something
     for (SecurityPolicy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.listSecurityPoliciesPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SecurityPolicyStub`"
  ([^SecurityPolicyClient this]
    (-> this (.getStub))))

(defn list-security-policies
  "List all the policies that have been configured for the specified project.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (SecurityPolicy element : securityPolicyClient.listSecurityPolicies(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse [^SecurityPolicyClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listSecurityPolicies project))))

(defn patch-rule-security-policy-callable
  "Patches a rule at the specified priority.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     Integer priority = 0;
     String formattedSecurityPolicy = ProjectGlobalSecurityPolicyName.format(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
     PatchRuleSecurityPolicyHttpRequest request = PatchRuleSecurityPolicyHttpRequest.newBuilder()
       .setPriority(priority)
       .setSecurityPolicy(formattedSecurityPolicy)
       .setSecurityPolicyRuleResource(securityPolicyRuleResource)
       .build();
     ApiFuture<Operation> future = securityPolicyClient.patchRuleSecurityPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.patchRuleSecurityPolicyCallable))))

(defn get-security-policy
  "List all of the ordered rules present in a single specified policy.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     SecurityPolicy response = securityPolicyClient.getSecurityPolicy(securityPolicy);
   }

  security-policy - Name of the security policy to get. - `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`

  returns: `com.google.cloud.compute.v1.SecurityPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SecurityPolicy [^SecurityPolicyClient this ^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName security-policy]
    (-> this (.getSecurityPolicy security-policy))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SecurityPolicyClient this]
    (-> this (.isShutdown))))

(defn delete-security-policy-callable
  "Deletes the specified policy.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     String formattedSecurityPolicy = ProjectGlobalSecurityPolicyName.format(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     DeleteSecurityPolicyHttpRequest request = DeleteSecurityPolicyHttpRequest.newBuilder()
       .setSecurityPolicy(formattedSecurityPolicy)
       .build();
     ApiFuture<Operation> future = securityPolicyClient.deleteSecurityPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.deleteSecurityPolicyCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SecurityPolicyClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn patch-security-policy-callable
  "Patches the specified policy with the data included in the request.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     String formattedSecurityPolicy = ProjectGlobalSecurityPolicyName.format(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchSecurityPolicyHttpRequest request = PatchSecurityPolicyHttpRequest.newBuilder()
       .setSecurityPolicy(formattedSecurityPolicy)
       .setSecurityPolicyResource(securityPolicyResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = securityPolicyClient.patchSecurityPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.patchSecurityPolicyCallable))))

(defn shutdown
  ""
  ([^SecurityPolicyClient this]
    (-> this (.shutdown))))

(defn delete-security-policy
  "Deletes the specified policy.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     Operation response = securityPolicyClient.deleteSecurityPolicy(securityPolicy);
   }

  security-policy - Name of the security policy to delete. - `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName security-policy]
    (-> this (.deleteSecurityPolicy security-policy))))

(defn insert-security-policy-callable
  "Creates a new policy in the specified project using the data included in the request.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
     InsertSecurityPolicyHttpRequest request = InsertSecurityPolicyHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setSecurityPolicyResource(securityPolicyResource)
       .build();
     ApiFuture<Operation> future = securityPolicyClient.insertSecurityPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.insertSecurityPolicyCallable))))

(defn close
  ""
  ([^SecurityPolicyClient this]
    (-> this (.close))))

(defn get-security-policy-callable
  "List all of the ordered rules present in a single specified policy.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     String formattedSecurityPolicy = ProjectGlobalSecurityPolicyName.format(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     GetSecurityPolicyHttpRequest request = GetSecurityPolicyHttpRequest.newBuilder()
       .setSecurityPolicy(formattedSecurityPolicy)
       .build();
     ApiFuture<SecurityPolicy> future = securityPolicyClient.getSecurityPolicyCallable().futureCall(request);
     // Do something
     SecurityPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.getSecurityPolicyCallable))))

(defn add-rule-security-policy-callable
  "Inserts a rule into a security policy.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     String formattedSecurityPolicy = ProjectGlobalSecurityPolicyName.format(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
     AddRuleSecurityPolicyHttpRequest request = AddRuleSecurityPolicyHttpRequest.newBuilder()
       .setSecurityPolicy(formattedSecurityPolicy)
       .setSecurityPolicyRuleResource(securityPolicyRuleResource)
       .build();
     ApiFuture<Operation> future = securityPolicyClient.addRuleSecurityPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.addRuleSecurityPolicyCallable))))

(defn remove-rule-security-policy
  "Deletes a rule at the specified priority.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     Integer priority = 0;
     ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     Operation response = securityPolicyClient.removeRuleSecurityPolicy(priority, securityPolicy);
   }

  priority - The priority of the rule to remove from the security policy. - `java.lang.Integer`
  security-policy - Name of the security policy to update. - `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^java.lang.Integer priority ^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName security-policy]
    (-> this (.removeRuleSecurityPolicy priority security-policy)))
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest request]
    (-> this (.removeRuleSecurityPolicy request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SecurityPolicyClient this]
    (-> this (.isTerminated))))

(defn remove-rule-security-policy-callable
  "Deletes a rule at the specified priority.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     Integer priority = 0;
     String formattedSecurityPolicy = ProjectGlobalSecurityPolicyName.format(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     RemoveRuleSecurityPolicyHttpRequest request = RemoveRuleSecurityPolicyHttpRequest.newBuilder()
       .setPriority(priority)
       .setSecurityPolicy(formattedSecurityPolicy)
       .build();
     ApiFuture<Operation> future = securityPolicyClient.removeRuleSecurityPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.removeRuleSecurityPolicyCallable))))

(defn add-rule-security-policy
  "Inserts a rule into a security policy.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     SecurityPolicyRule securityPolicyRuleResource = SecurityPolicyRule.newBuilder().build();
     Operation response = securityPolicyClient.addRuleSecurityPolicy(securityPolicy, securityPolicyRuleResource);
   }

  security-policy - Name of the security policy to update. - `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`
  security-policy-rule-resource - Represents a rule that describes one or more match conditions along with the action to be taken when traffic matches this condition (allow or deny). - `com.google.cloud.compute.v1.SecurityPolicyRule`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName security-policy ^com.google.cloud.compute.v1.SecurityPolicyRule security-policy-rule-resource]
    (-> this (.addRuleSecurityPolicy security-policy security-policy-rule-resource)))
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest request]
    (-> this (.addRuleSecurityPolicy request))))

(defn patch-security-policy
  "Patches the specified policy with the data included in the request.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     ProjectGlobalSecurityPolicyName securityPolicy = ProjectGlobalSecurityPolicyName.of(\"[PROJECT]\", \"[SECURITY_POLICY]\");
     SecurityPolicy securityPolicyResource = SecurityPolicy.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = securityPolicyClient.patchSecurityPolicy(securityPolicy, securityPolicyResource, fieldMask);
   }

  security-policy - Name of the security policy to update. - `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`
  security-policy-resource - A security policy is comprised of one or more rules. It can also be associated with one or more 'targets'. (== resource_for v1.securityPolicies ==) (== resource_for beta.securityPolicies ==) - `com.google.cloud.compute.v1.SecurityPolicy`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName security-policy ^com.google.cloud.compute.v1.SecurityPolicy security-policy-resource ^java.util.List field-mask]
    (-> this (.patchSecurityPolicy security-policy security-policy-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^SecurityPolicyClient this ^com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest request]
    (-> this (.patchSecurityPolicy request))))

(defn shutdown-now
  ""
  ([^SecurityPolicyClient this]
    (-> this (.shutdownNow))))

(defn list-security-policies-callable
  "List all the policies that have been configured for the specified project.

   Sample code:



   try (SecurityPolicyClient securityPolicyClient = SecurityPolicyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListSecurityPoliciesHttpRequest request = ListSecurityPoliciesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       SecurityPolicyList response = securityPolicyClient.listSecurityPoliciesCallable().call(request);
       for (SecurityPolicy element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityPolicyClient this]
    (-> this (.listSecurityPoliciesCallable))))

