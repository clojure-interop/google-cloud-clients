(ns com.google.cloud.compute.v1.SnapshotClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SnapshotClient snapshotClient = SnapshotClient.create()) {
    ProjectGlobalSnapshotName snapshot = ProjectGlobalSnapshotName.of(\"[PROJECT]\", \"[SNAPSHOT]\");
    Operation response = snapshotClient.deleteSnapshot(snapshot);
  }

  Note: close() needs to be called on the snapshotClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of SnapshotSettings to create().
  For example:

  To customize credentials:



  SnapshotSettings snapshotSettings =
      SnapshotSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SnapshotClient snapshotClient =
      SnapshotClient.create(snapshotSettings);

  To customize the endpoint:



  SnapshotSettings snapshotSettings =
      SnapshotSettings.newBuilder().setEndpoint(myEndpoint).build();
  SnapshotClient snapshotClient =
      SnapshotClient.create(snapshotSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SnapshotClient]))

(defn *create
  "Constructs an instance of SnapshotClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.SnapshotSettings`

  returns: `com.google.cloud.compute.v1.SnapshotClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SnapshotClient [^com.google.cloud.compute.v1.SnapshotSettings settings]
    (SnapshotClient/create settings))
  (^com.google.cloud.compute.v1.SnapshotClient []
    (SnapshotClient/create )))

(defn set-iam-policy-snapshot-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     String formattedResource = ProjectGlobalSnapshotResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
     SetIamPolicySnapshotHttpRequest request = SetIamPolicySnapshotHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = snapshotClient.setIamPolicySnapshotCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotClient this]
    (-> this (.setIamPolicySnapshotCallable))))

(defn list-snapshots-callable
  "Retrieves the list of Snapshot resources contained within the specified project.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListSnapshotsHttpRequest request = ListSnapshotsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       SnapshotList response = snapshotClient.listSnapshotsCallable().call(request);
       for (Snapshot element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotClient this]
    (-> this (.listSnapshotsCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.SnapshotSettings`"
  (^com.google.cloud.compute.v1.SnapshotSettings [^SnapshotClient this]
    (-> this (.getSettings))))

(defn get-snapshot
  "Returns the specified Snapshot resource. Gets a list of available snapshots by making a list()
   request.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     ProjectGlobalSnapshotName snapshot = ProjectGlobalSnapshotName.of(\"[PROJECT]\", \"[SNAPSHOT]\");
     Snapshot response = snapshotClient.getSnapshot(snapshot);
   }

  snapshot - Name of the Snapshot resource to return. - `com.google.cloud.compute.v1.ProjectGlobalSnapshotName`

  returns: `com.google.cloud.compute.v1.Snapshot`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Snapshot [^SnapshotClient this ^com.google.cloud.compute.v1.ProjectGlobalSnapshotName snapshot]
    (-> this (.getSnapshot snapshot))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SnapshotStub`"
  ([^SnapshotClient this]
    (-> this (.getStub))))

(defn test-iam-permissions-snapshot-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     String formattedResource = ProjectGlobalSnapshotResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsSnapshotHttpRequest request = TestIamPermissionsSnapshotHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = snapshotClient.testIamPermissionsSnapshotCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsSnapshotHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotClient this]
    (-> this (.testIamPermissionsSnapshotCallable))))

(defn get-iam-policy-snapshot
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     ProjectGlobalSnapshotResourceName resource = ProjectGlobalSnapshotResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     Policy response = snapshotClient.getIamPolicySnapshot(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^SnapshotClient this ^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName resource]
    (-> this (.getIamPolicySnapshot resource))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SnapshotClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SnapshotClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^SnapshotClient this]
    (-> this (.shutdown))))

(defn delete-snapshot
  "Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not
   necessarily delete all the data on that snapshot. If any data on the snapshot that is marked
   for deletion is needed for subsequent snapshots, the data will be moved to the next
   corresponding snapshot.

   For more information, see Deleting snapshots.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     ProjectGlobalSnapshotName snapshot = ProjectGlobalSnapshotName.of(\"[PROJECT]\", \"[SNAPSHOT]\");
     Operation response = snapshotClient.deleteSnapshot(snapshot);
   }

  snapshot - Name of the Snapshot resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalSnapshotName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SnapshotClient this ^com.google.cloud.compute.v1.ProjectGlobalSnapshotName snapshot]
    (-> this (.deleteSnapshot snapshot))))

(defn set-labels-snapshot
  "Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources
   documentation.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     ProjectGlobalSnapshotResourceName resource = ProjectGlobalSnapshotResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetLabelsRequest globalSetLabelsRequestResource = GlobalSetLabelsRequest.newBuilder().build();
     Operation response = snapshotClient.setLabelsSnapshot(resource, globalSetLabelsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName`
  global-set-labels-request-resource - `com.google.cloud.compute.v1.GlobalSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SnapshotClient this ^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName resource ^com.google.cloud.compute.v1.GlobalSetLabelsRequest global-set-labels-request-resource]
    (-> this (.setLabelsSnapshot resource global-set-labels-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^SnapshotClient this ^com.google.cloud.compute.v1.SetLabelsSnapshotHttpRequest request]
    (-> this (.setLabelsSnapshot request))))

(defn set-iam-policy-snapshot
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     ProjectGlobalSnapshotResourceName resource = ProjectGlobalSnapshotResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
     Policy response = snapshotClient.setIamPolicySnapshot(resource, globalSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName`
  global-set-policy-request-resource - `com.google.cloud.compute.v1.GlobalSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^SnapshotClient this ^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName resource ^com.google.cloud.compute.v1.GlobalSetPolicyRequest global-set-policy-request-resource]
    (-> this (.setIamPolicySnapshot resource global-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^SnapshotClient this ^com.google.cloud.compute.v1.SetIamPolicySnapshotHttpRequest request]
    (-> this (.setIamPolicySnapshot request))))

(defn delete-snapshot-callable
  "Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not
   necessarily delete all the data on that snapshot. If any data on the snapshot that is marked
   for deletion is needed for subsequent snapshots, the data will be moved to the next
   corresponding snapshot.

   For more information, see Deleting snapshots.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     String formattedSnapshot = ProjectGlobalSnapshotName.format(\"[PROJECT]\", \"[SNAPSHOT]\");
     DeleteSnapshotHttpRequest request = DeleteSnapshotHttpRequest.newBuilder()
       .setSnapshot(formattedSnapshot)
       .build();
     ApiFuture<Operation> future = snapshotClient.deleteSnapshotCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotClient this]
    (-> this (.deleteSnapshotCallable))))

(defn close
  ""
  ([^SnapshotClient this]
    (-> this (.close))))

(defn test-iam-permissions-snapshot
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     ProjectGlobalSnapshotResourceName resource = ProjectGlobalSnapshotResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = snapshotClient.testIamPermissionsSnapshot(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^SnapshotClient this ^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsSnapshot resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^SnapshotClient this ^com.google.cloud.compute.v1.TestIamPermissionsSnapshotHttpRequest request]
    (-> this (.testIamPermissionsSnapshot request))))

(defn list-snapshots
  "Retrieves the list of Snapshot resources contained within the specified project.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Snapshot element : snapshotClient.listSnapshots(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse [^SnapshotClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listSnapshots project))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SnapshotClient this]
    (-> this (.isTerminated))))

(defn set-labels-snapshot-callable
  "Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources
   documentation.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     String formattedResource = ProjectGlobalSnapshotResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetLabelsRequest globalSetLabelsRequestResource = GlobalSetLabelsRequest.newBuilder().build();
     SetLabelsSnapshotHttpRequest request = SetLabelsSnapshotHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setGlobalSetLabelsRequestResource(globalSetLabelsRequestResource)
       .build();
     ApiFuture<Operation> future = snapshotClient.setLabelsSnapshotCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsSnapshotHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotClient this]
    (-> this (.setLabelsSnapshotCallable))))

(defn get-snapshot-callable
  "Returns the specified Snapshot resource. Gets a list of available snapshots by making a list()
   request.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     String formattedSnapshot = ProjectGlobalSnapshotName.format(\"[PROJECT]\", \"[SNAPSHOT]\");
     GetSnapshotHttpRequest request = GetSnapshotHttpRequest.newBuilder()
       .setSnapshot(formattedSnapshot)
       .build();
     ApiFuture<Snapshot> future = snapshotClient.getSnapshotCallable().futureCall(request);
     // Do something
     Snapshot response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSnapshotHttpRequest,com.google.cloud.compute.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotClient this]
    (-> this (.getSnapshotCallable))))

(defn get-iam-policy-snapshot-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     String formattedResource = ProjectGlobalSnapshotResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GetIamPolicySnapshotHttpRequest request = GetIamPolicySnapshotHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = snapshotClient.getIamPolicySnapshotCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicySnapshotHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotClient this]
    (-> this (.getIamPolicySnapshotCallable))))

(defn list-snapshots-paged-callable
  "Retrieves the list of Snapshot resources contained within the specified project.

   Sample code:



   try (SnapshotClient snapshotClient = SnapshotClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListSnapshotsHttpRequest request = ListSnapshotsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListSnapshotsPagedResponse> future = snapshotClient.listSnapshotsPagedCallable().futureCall(request);
     // Do something
     for (Snapshot element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSnapshotsHttpRequest,com.google.cloud.compute.v1.SnapshotClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SnapshotClient this]
    (-> this (.listSnapshotsPagedCallable))))

(defn shutdown-now
  ""
  ([^SnapshotClient this]
    (-> this (.shutdownNow))))

