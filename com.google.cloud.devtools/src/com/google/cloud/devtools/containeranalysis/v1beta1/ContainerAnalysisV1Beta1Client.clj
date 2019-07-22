(ns com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client
  "Service Description: Retrieves analysis results of Cloud components such as Docker container
  images. The Container Analysis API is an implementation of the [Grafeas](grafeas.io) API.

  Analysis results are stored as a series of occurrences. An `Occurrence` contains information
  about a specific analysis instance on a resource. An occurrence refers to a `Note`. A note
  contains details describing the analysis and is generally stored in a separate project, called a
  `Provider`. Multiple occurrences can refer to the same note.

  For example, an SSL vulnerability could affect multiple images. In this case, there would be
  one note for the vulnerability and an occurrence for each image with the vulnerability referring
  to that note.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
    IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
    Policy policy = Policy.newBuilder().build();
    Policy response = containerAnalysisV1Beta1Client.setIamPolicy(resource, policy);
  }

  Note: close() needs to be called on the containerAnalysisV1Beta1Client object to clean up
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
  ContainerAnalysisV1Beta1Settings to create(). For example:

  To customize credentials:



  ContainerAnalysisV1Beta1Settings containerAnalysisV1Beta1Settings =
      ContainerAnalysisV1Beta1Settings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client =
      ContainerAnalysisV1Beta1Client.create(containerAnalysisV1Beta1Settings);

  To customize the endpoint:



  ContainerAnalysisV1Beta1Settings containerAnalysisV1Beta1Settings =
      ContainerAnalysisV1Beta1Settings.newBuilder().setEndpoint(myEndpoint).build();
  ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client =
      ContainerAnalysisV1Beta1Client.create(containerAnalysisV1Beta1Settings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1 ContainerAnalysisV1Beta1Client]))

(defn *create
  "Constructs an instance of ContainerAnalysisV1Beta1Client, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client [^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings settings]
    (ContainerAnalysisV1Beta1Client/create settings))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client []
    (ContainerAnalysisV1Beta1Client/create )))

(defn get-scan-config-callable
  "Gets the specified scan configuration.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     GetScanConfigRequest request = GetScanConfigRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ScanConfig> future = containerAnalysisV1Beta1Client.getScanConfigCallable().futureCall(request);
     // Do something
     ScanConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.GetScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Client this]
    (-> this (.getScanConfigCallable))))

(defn update-scan-config-callable
  "Updates the specified scan configuration.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     UpdateScanConfigRequest request = UpdateScanConfigRequest.newBuilder()
       .setName(name.toString())
       .setScanConfig(scanConfig)
       .build();
     ApiFuture<ScanConfig> future = containerAnalysisV1Beta1Client.updateScanConfigCallable().futureCall(request);
     // Do something
     ScanConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.UpdateScanConfigRequest,com.google.containeranalysis.v1beta1.ScanConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Client this]
    (-> this (.updateScanConfigCallable))))

(defn get-iam-policy-callable
  "Gets the access control policy for a note or an occurrence resource. Requires
   `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy`
   permission if the resource is a note or occurrence, respectively.

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .build();
     ApiFuture<Policy> future = containerAnalysisV1Beta1Client.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Client this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy on the specified note or occurrence. Requires
   `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy`
   permission if the resource is a note or an occurrence, respectively.

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = containerAnalysisV1Beta1Client.setIamPolicy(resource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `com.google.containeranalysis.v1beta1.IamResourceName`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^ContainerAnalysisV1Beta1Client this ^com.google.containeranalysis.v1beta1.IamResourceName resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^ContainerAnalysisV1Beta1Client this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn get-settings
  "returns: `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings`"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Settings [^ContainerAnalysisV1Beta1Client this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.devtools.containeranalysis.v1beta1.stub.ContainerAnalysisV1Beta1Stub`"
  ([^ContainerAnalysisV1Beta1Client this]
    (-> this (.getStub))))

(defn get-scan-config
  "Gets the specified scan configuration.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ScanConfig response = containerAnalysisV1Beta1Client.getScanConfig(name);
   }

  name - The name of the scan configuration in the form of `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`. - `com.google.containeranalysis.v1beta1.ScanConfigName`

  returns: `com.google.containeranalysis.v1beta1.ScanConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.containeranalysis.v1beta1.ScanConfig [^ContainerAnalysisV1Beta1Client this ^com.google.containeranalysis.v1beta1.ScanConfigName name]
    (-> this (.getScanConfig name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ContainerAnalysisV1Beta1Client this]
    (-> this (.isShutdown))))

(defn list-scan-configs-callable
  "Lists scan configurations for the specified project.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListScanConfigsRequest request = ListScanConfigsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListScanConfigsResponse response = containerAnalysisV1Beta1Client.listScanConfigsCallable().call(request);
       for (ScanConfig element : response.getScanConfigsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.ListScanConfigsRequest,com.google.containeranalysis.v1beta1.ListScanConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Client this]
    (-> this (.listScanConfigsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ContainerAnalysisV1Beta1Client this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ContainerAnalysisV1Beta1Client this]
    (-> this (.shutdown))))

(defn set-iam-policy-callable
  "Sets the access control policy on the specified note or occurrence. Requires
   `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy`
   permission if the resource is a note or an occurrence, respectively.

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = containerAnalysisV1Beta1Client.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Client this]
    (-> this (.setIamPolicyCallable))))

(defn update-scan-config
  "Updates the specified scan configuration.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     ScanConfigName name = ScanConfigName.of(\"[PROJECT]\", \"[SCAN_CONFIG]\");
     ScanConfig scanConfig = ScanConfig.newBuilder().build();
     ScanConfig response = containerAnalysisV1Beta1Client.updateScanConfig(name, scanConfig);
   }

  name - The name of the scan configuration in the form of `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`. - `com.google.containeranalysis.v1beta1.ScanConfigName`
  scan-config - The updated scan configuration. - `com.google.containeranalysis.v1beta1.ScanConfig`

  returns: `com.google.containeranalysis.v1beta1.ScanConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.containeranalysis.v1beta1.ScanConfig [^ContainerAnalysisV1Beta1Client this ^com.google.containeranalysis.v1beta1.ScanConfigName name ^com.google.containeranalysis.v1beta1.ScanConfig scan-config]
    (-> this (.updateScanConfig name scan-config)))
  (^com.google.containeranalysis.v1beta1.ScanConfig [^ContainerAnalysisV1Beta1Client this ^com.google.containeranalysis.v1beta1.UpdateScanConfigRequest request]
    (-> this (.updateScanConfig request))))

(defn close
  ""
  ([^ContainerAnalysisV1Beta1Client this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns the permissions that a caller has on the specified note or occurrence. Requires list
   permission on the project (for example, `containeranalysis.notes.list`).

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(resource.toString())
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = containerAnalysisV1Beta1Client.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Client this]
    (-> this (.testIamPermissionsCallable))))

(defn get-iam-policy
  "Gets the access control policy for a note or an occurrence resource. Requires
   `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy`
   permission if the resource is a note or occurrence, respectively.

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Policy response = containerAnalysisV1Beta1Client.getIamPolicy(resource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `com.google.containeranalysis.v1beta1.IamResourceName`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^ContainerAnalysisV1Beta1Client this ^com.google.containeranalysis.v1beta1.IamResourceName resource]
    (-> this (.getIamPolicy resource))))

(defn list-scan-configs-paged-callable
  "Lists scan configurations for the specified project.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListScanConfigsRequest request = ListScanConfigsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListScanConfigsPagedResponse> future = containerAnalysisV1Beta1Client.listScanConfigsPagedCallable().futureCall(request);
     // Do something
     for (ScanConfig element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.containeranalysis.v1beta1.ListScanConfigsRequest,com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisV1Beta1Client this]
    (-> this (.listScanConfigsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ContainerAnalysisV1Beta1Client this]
    (-> this (.isTerminated))))

(defn list-scan-configs
  "Lists scan configurations for the specified project.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     String filter = \"\";
     for (ScanConfig element : containerAnalysisV1Beta1Client.listScanConfigs(parent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The name of the project to list scan configurations for in the form of `projects/[PROJECT_ID]`. - `com.google.containeranalysis.v1beta1.ProjectName`
  filter - The filter expression. - `java.lang.String`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse [^ContainerAnalysisV1Beta1Client this ^com.google.containeranalysis.v1beta1.ProjectName parent ^java.lang.String filter]
    (-> this (.listScanConfigs parent filter)))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.ContainerAnalysisV1Beta1Client$ListScanConfigsPagedResponse [^ContainerAnalysisV1Beta1Client this ^com.google.containeranalysis.v1beta1.ListScanConfigsRequest request]
    (-> this (.listScanConfigs request))))

(defn shutdown-now
  ""
  ([^ContainerAnalysisV1Beta1Client this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions
  "Returns the permissions that a caller has on the specified note or occurrence. Requires list
   permission on the project (for example, `containeranalysis.notes.list`).

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisV1Beta1Client containerAnalysisV1Beta1Client = ContainerAnalysisV1Beta1Client.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = containerAnalysisV1Beta1Client.testIamPermissions(resource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `com.google.containeranalysis.v1beta1.IamResourceName`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^ContainerAnalysisV1Beta1Client this ^com.google.containeranalysis.v1beta1.IamResourceName resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^ContainerAnalysisV1Beta1Client this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

