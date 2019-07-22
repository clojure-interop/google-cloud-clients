(ns com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisClient
  "Service Description: Retrieves analysis results of Cloud components such as Docker container
  images. The Container Analysis API is an implementation of the [Grafeas](https://grafeas.io) API.

  Analysis results are stored as a series of occurrences. An `Occurrence` contains information
  about a specific analysis instance on a resource. An occurrence refers to a `Note`. A note
  contains details describing the analysis and is generally stored in a separate project, called a
  `Provider`. Multiple occurrences can refer to the same note.

  For example, an SSL vulnerability could affect multiple images. In this case, there would be
  one note for the vulnerability and an occurrence for each image with the vulnerability referring
  to that note.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ContainerAnalysisClient containerAnalysisClient = ContainerAnalysisClient.create()) {
    IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
    Policy policy = Policy.newBuilder().build();
    Policy response = containerAnalysisClient.setIamPolicy(resource, policy);
  }

  Note: close() needs to be called on the containerAnalysisClient object to clean up resources
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

  This class can be customized by passing in a custom instance of ContainerAnalysisSettings to
  create(). For example:

  To customize credentials:



  ContainerAnalysisSettings containerAnalysisSettings =
      ContainerAnalysisSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ContainerAnalysisClient containerAnalysisClient =
      ContainerAnalysisClient.create(containerAnalysisSettings);

  To customize the endpoint:



  ContainerAnalysisSettings containerAnalysisSettings =
      ContainerAnalysisSettings.newBuilder().setEndpoint(myEndpoint).build();
  ContainerAnalysisClient containerAnalysisClient =
      ContainerAnalysisClient.create(containerAnalysisSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1 ContainerAnalysisClient]))

(defn *create
  "Constructs an instance of ContainerAnalysisClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings`

  returns: `com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisClient`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisClient [^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings settings]
    (ContainerAnalysisClient/create settings))
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisClient []
    (ContainerAnalysisClient/create )))

(defn get-iam-policy-callable
  "Gets the access control policy for a note or an occurrence resource. Requires
   `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy`
   permission if the resource is a note or occurrence, respectively.

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisClient containerAnalysisClient = ContainerAnalysisClient.create()) {
     ResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .build();
     ApiFuture<Policy> future = containerAnalysisClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisClient this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy on the specified note or occurrence. Requires
   `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy`
   permission if the resource is a note or an occurrence, respectively.

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisClient containerAnalysisClient = ContainerAnalysisClient.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = containerAnalysisClient.setIamPolicy(resource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `com.google.containeranalysis.v1.IamResourceName`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^ContainerAnalysisClient this ^com.google.containeranalysis.v1.IamResourceName resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^ContainerAnalysisClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn get-settings
  "returns: `com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings`"
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings [^ContainerAnalysisClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStub`"
  ([^ContainerAnalysisClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ContainerAnalysisClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ContainerAnalysisClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ContainerAnalysisClient this]
    (-> this (.shutdown))))

(defn set-iam-policy-callable
  "Sets the access control policy on the specified note or occurrence. Requires
   `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy`
   permission if the resource is a note or an occurrence, respectively.

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisClient containerAnalysisClient = ContainerAnalysisClient.create()) {
     ResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = containerAnalysisClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisClient this]
    (-> this (.setIamPolicyCallable))))

(defn get-grafeas-client
  "Returns a new GrafeasClient with the same configured settings.

  returns: `io.grafeas.v1.GrafeasClient`

  throws: java.io.IOException"
  (^io.grafeas.v1.GrafeasClient [^ContainerAnalysisClient this]
    (-> this (.getGrafeasClient))))

(defn close
  ""
  ([^ContainerAnalysisClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns the permissions that a caller has on the specified note or occurrence. Requires list
   permission on the project (for example, `containeranalysis.notes.list`).

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisClient containerAnalysisClient = ContainerAnalysisClient.create()) {
     ResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(resource.toString())
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = containerAnalysisClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ContainerAnalysisClient this]
    (-> this (.testIamPermissionsCallable))))

(defn get-iam-policy
  "Gets the access control policy for a note or an occurrence resource. Requires
   `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy`
   permission if the resource is a note or occurrence, respectively.

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisClient containerAnalysisClient = ContainerAnalysisClient.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     Policy response = containerAnalysisClient.getIamPolicy(resource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `com.google.containeranalysis.v1.IamResourceName`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^ContainerAnalysisClient this ^com.google.containeranalysis.v1.IamResourceName resource]
    (-> this (.getIamPolicy resource))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ContainerAnalysisClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^ContainerAnalysisClient this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions
  "Returns the permissions that a caller has on the specified note or occurrence. Requires list
   permission on the project (for example, `containeranalysis.notes.list`).

   The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and
   `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.

   Sample code:



   try (ContainerAnalysisClient containerAnalysisClient = ContainerAnalysisClient.create()) {
     IamResourceName resource = NoteName.of(\"[PROJECT]\", \"[NOTE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = containerAnalysisClient.testIamPermissions(resource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `com.google.containeranalysis.v1.IamResourceName`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^ContainerAnalysisClient this ^com.google.containeranalysis.v1.IamResourceName resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^ContainerAnalysisClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

