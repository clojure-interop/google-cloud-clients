(ns com.google.cloud.compute.v1.SslPolicyClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
    ProjectGlobalSslPolicyName sslPolicy = ProjectGlobalSslPolicyName.of(\"[PROJECT]\", \"[SSL_POLICY]\");
    Operation response = sslPolicyClient.deleteSslPolicy(sslPolicy);
  }

  Note: close() needs to be called on the sslPolicyClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of SslPolicySettings to create().
  For example:

  To customize credentials:



  SslPolicySettings sslPolicySettings =
      SslPolicySettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SslPolicyClient sslPolicyClient =
      SslPolicyClient.create(sslPolicySettings);

  To customize the endpoint:



  SslPolicySettings sslPolicySettings =
      SslPolicySettings.newBuilder().setEndpoint(myEndpoint).build();
  SslPolicyClient sslPolicyClient =
      SslPolicyClient.create(sslPolicySettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPolicyClient]))

(defn *create
  "Constructs an instance of SslPolicyClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.SslPolicySettings`

  returns: `com.google.cloud.compute.v1.SslPolicyClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SslPolicyClient [^com.google.cloud.compute.v1.SslPolicySettings settings]
    (SslPolicyClient/create settings))
  (^com.google.cloud.compute.v1.SslPolicyClient []
    (SslPolicyClient/create )))

(defn insert-ssl-policy-callable
  "Returns the specified SSL policy resource. Gets a list of available SSL policies by making a
   list() request.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     SslPolicy sslPolicyResource = SslPolicy.newBuilder().build();
     InsertSslPolicyHttpRequest request = InsertSslPolicyHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setSslPolicyResource(sslPolicyResource)
       .build();
     ApiFuture<Operation> future = sslPolicyClient.insertSslPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyClient this]
    (-> this (.insertSslPolicyCallable))))

(defn get-ssl-policy
  "Lists all of the ordered rules present in a single specified policy.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     ProjectGlobalSslPolicyName sslPolicy = ProjectGlobalSslPolicyName.of(\"[PROJECT]\", \"[SSL_POLICY]\");
     SslPolicy response = sslPolicyClient.getSslPolicy(sslPolicy);
   }

  ssl-policy - Name of the SSL policy to update. The name must be 1-63 characters long, and comply with RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName`

  returns: `com.google.cloud.compute.v1.SslPolicy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SslPolicy [^SslPolicyClient this ^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName ssl-policy]
    (-> this (.getSslPolicy ssl-policy))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.SslPolicySettings`"
  (^com.google.cloud.compute.v1.SslPolicySettings [^SslPolicyClient this]
    (-> this (.getSettings))))

(defn list-ssl-policies-paged-callable
  "Lists all the SSL policies that have been configured for the specified project.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListSslPoliciesHttpRequest request = ListSslPoliciesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListSslPoliciesPagedResponse> future = sslPolicyClient.listSslPoliciesPagedCallable().futureCall(request);
     // Do something
     for (SslPolicy element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPolicyClient$ListSslPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyClient this]
    (-> this (.listSslPoliciesPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SslPolicyStub`"
  ([^SslPolicyClient this]
    (-> this (.getStub))))

(defn delete-ssl-policy
  "Deletes the specified SSL policy. The SSL policy resource can be deleted only if it is not in
   use by any TargetHttpsProxy or TargetSslProxy resources.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     ProjectGlobalSslPolicyName sslPolicy = ProjectGlobalSslPolicyName.of(\"[PROJECT]\", \"[SSL_POLICY]\");
     Operation response = sslPolicyClient.deleteSslPolicy(sslPolicy);
   }

  ssl-policy - Name of the SSL policy to delete. The name must be 1-63 characters long, and comply with RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SslPolicyClient this ^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName ssl-policy]
    (-> this (.deleteSslPolicy ssl-policy))))

(defn list-available-features-ssl-policies
  "Lists all features that can be specified in the SSL policy when using custom profile.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     SslPoliciesListAvailableFeaturesResponse response = sslPolicyClient.listAvailableFeaturesSslPolicies(project);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse [^SslPolicyClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listAvailableFeaturesSslPolicies project))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SslPolicyClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SslPolicyClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^SslPolicyClient this]
    (-> this (.shutdown))))

(defn get-ssl-policy-callable
  "Lists all of the ordered rules present in a single specified policy.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     String formattedSslPolicy = ProjectGlobalSslPolicyName.format(\"[PROJECT]\", \"[SSL_POLICY]\");
     GetSslPolicyHttpRequest request = GetSslPolicyHttpRequest.newBuilder()
       .setSslPolicy(formattedSslPolicy)
       .build();
     ApiFuture<SslPolicy> future = sslPolicyClient.getSslPolicyCallable().futureCall(request);
     // Do something
     SslPolicy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSslPolicyHttpRequest,com.google.cloud.compute.v1.SslPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyClient this]
    (-> this (.getSslPolicyCallable))))

(defn list-ssl-policies
  "Lists all the SSL policies that have been configured for the specified project.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (SslPolicy element : sslPolicyClient.listSslPolicies(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.SslPolicyClient$ListSslPoliciesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SslPolicyClient$ListSslPoliciesPagedResponse [^SslPolicyClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listSslPolicies project))))

(defn patch-ssl-policy-callable
  "Patches the specified SSL policy with the data included in the request.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     String formattedSslPolicy = ProjectGlobalSslPolicyName.format(\"[PROJECT]\", \"[SSL_POLICY]\");
     SslPolicy sslPolicyResource = SslPolicy.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchSslPolicyHttpRequest request = PatchSslPolicyHttpRequest.newBuilder()
       .setSslPolicy(formattedSslPolicy)
       .setSslPolicyResource(sslPolicyResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = sslPolicyClient.patchSslPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyClient this]
    (-> this (.patchSslPolicyCallable))))

(defn close
  ""
  ([^SslPolicyClient this]
    (-> this (.close))))

(defn list-ssl-policies-callable
  "Lists all the SSL policies that have been configured for the specified project.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListSslPoliciesHttpRequest request = ListSslPoliciesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       SslPoliciesList response = sslPolicyClient.listSslPoliciesCallable().call(request);
       for (SslPolicy element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyClient this]
    (-> this (.listSslPoliciesCallable))))

(defn insert-ssl-policy
  "Returns the specified SSL policy resource. Gets a list of available SSL policies by making a
   list() request.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     SslPolicy sslPolicyResource = SslPolicy.newBuilder().build();
     Operation response = sslPolicyClient.insertSslPolicy(project, sslPolicyResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  ssl-policy-resource - A SSL policy specifies the server-side support for SSL features. This can be attached to a TargetHttpsProxy or a TargetSslProxy. This affects connections between clients and the HTTPS or SSL proxy load balancer. They do not affect the connection between the load balancers and the backends. - `com.google.cloud.compute.v1.SslPolicy`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SslPolicyClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.SslPolicy ssl-policy-resource]
    (-> this (.insertSslPolicy project ssl-policy-resource)))
  (^com.google.cloud.compute.v1.Operation [^SslPolicyClient this ^com.google.cloud.compute.v1.InsertSslPolicyHttpRequest request]
    (-> this (.insertSslPolicy request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SslPolicyClient this]
    (-> this (.isTerminated))))

(defn delete-ssl-policy-callable
  "Deletes the specified SSL policy. The SSL policy resource can be deleted only if it is not in
   use by any TargetHttpsProxy or TargetSslProxy resources.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     String formattedSslPolicy = ProjectGlobalSslPolicyName.format(\"[PROJECT]\", \"[SSL_POLICY]\");
     DeleteSslPolicyHttpRequest request = DeleteSslPolicyHttpRequest.newBuilder()
       .setSslPolicy(formattedSslPolicy)
       .build();
     ApiFuture<Operation> future = sslPolicyClient.deleteSslPolicyCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyClient this]
    (-> this (.deleteSslPolicyCallable))))

(defn patch-ssl-policy
  "Patches the specified SSL policy with the data included in the request.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     ProjectGlobalSslPolicyName sslPolicy = ProjectGlobalSslPolicyName.of(\"[PROJECT]\", \"[SSL_POLICY]\");
     SslPolicy sslPolicyResource = SslPolicy.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = sslPolicyClient.patchSslPolicy(sslPolicy, sslPolicyResource, fieldMask);
   }

  ssl-policy - Name of the SSL policy to update. The name must be 1-63 characters long, and comply with RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName`
  ssl-policy-resource - A SSL policy specifies the server-side support for SSL features. This can be attached to a TargetHttpsProxy or a TargetSslProxy. This affects connections between clients and the HTTPS or SSL proxy load balancer. They do not affect the connection between the load balancers and the backends. - `com.google.cloud.compute.v1.SslPolicy`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SslPolicyClient this ^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName ssl-policy ^com.google.cloud.compute.v1.SslPolicy ssl-policy-resource ^java.util.List field-mask]
    (-> this (.patchSslPolicy ssl-policy ssl-policy-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^SslPolicyClient this ^com.google.cloud.compute.v1.PatchSslPolicyHttpRequest request]
    (-> this (.patchSslPolicy request))))

(defn shutdown-now
  ""
  ([^SslPolicyClient this]
    (-> this (.shutdownNow))))

(defn list-available-features-ssl-policies-callable
  "Lists all features that can be specified in the SSL policy when using custom profile.

   Sample code:



   try (SslPolicyClient sslPolicyClient = SslPolicyClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListAvailableFeaturesSslPoliciesHttpRequest request = ListAvailableFeaturesSslPoliciesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<SslPoliciesListAvailableFeaturesResponse> future = sslPolicyClient.listAvailableFeaturesSslPoliciesCallable().futureCall(request);
     // Do something
     SslPoliciesListAvailableFeaturesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAvailableFeaturesSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslPolicyClient this]
    (-> this (.listAvailableFeaturesSslPoliciesCallable))))

