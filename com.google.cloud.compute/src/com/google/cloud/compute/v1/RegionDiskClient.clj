(ns com.google.cloud.compute.v1.RegionDiskClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
    ProjectRegionDiskName disk = ProjectRegionDiskName.of(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
    Snapshot snapshotResource = Snapshot.newBuilder().build();
    Operation response = regionDiskClient.createSnapshotRegionDisk(disk, snapshotResource);
  }

  Note: close() needs to be called on the regionDiskClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of RegionDiskSettings to
  create(). For example:

  To customize credentials:



  RegionDiskSettings regionDiskSettings =
      RegionDiskSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionDiskClient regionDiskClient =
      RegionDiskClient.create(regionDiskSettings);

  To customize the endpoint:



  RegionDiskSettings regionDiskSettings =
      RegionDiskSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionDiskClient regionDiskClient =
      RegionDiskClient.create(regionDiskSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionDiskClient]))

(defn *create
  "Constructs an instance of RegionDiskClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RegionDiskSettings`

  returns: `com.google.cloud.compute.v1.RegionDiskClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionDiskClient [^com.google.cloud.compute.v1.RegionDiskSettings settings]
    (RegionDiskClient/create settings))
  (^com.google.cloud.compute.v1.RegionDiskClient []
    (RegionDiskClient/create )))

(defn create-snapshot-region-disk-callable
  "Creates a snapshot of this regional disk.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedDisk = ProjectRegionDiskName.format(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
     Snapshot snapshotResource = Snapshot.newBuilder().build();
     CreateSnapshotRegionDiskHttpRequest request = CreateSnapshotRegionDiskHttpRequest.newBuilder()
       .setDisk(formattedDisk)
       .setSnapshotResource(snapshotResource)
       .build();
     ApiFuture<Operation> future = regionDiskClient.createSnapshotRegionDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.createSnapshotRegionDiskCallable))))

(defn set-labels-region-disk
  "Sets the labels on the target regional disk.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     ProjectRegionDiskResourceName resource = ProjectRegionDiskResourceName.of(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     RegionSetLabelsRequest regionSetLabelsRequestResource = RegionSetLabelsRequest.newBuilder().build();
     Operation response = regionDiskClient.setLabelsRegionDisk(resource, regionSetLabelsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectRegionDiskResourceName`
  region-set-labels-request-resource - `com.google.cloud.compute.v1.RegionSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.ProjectRegionDiskResourceName resource ^com.google.cloud.compute.v1.RegionSetLabelsRequest region-set-labels-request-resource]
    (-> this (.setLabelsRegionDisk resource region-set-labels-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest request]
    (-> this (.setLabelsRegionDisk request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionDiskSettings`"
  (^com.google.cloud.compute.v1.RegionDiskSettings [^RegionDiskClient this]
    (-> this (.getSettings))))

(defn set-labels-region-disk-callable
  "Sets the labels on the target regional disk.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedResource = ProjectRegionDiskResourceName.format(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     RegionSetLabelsRequest regionSetLabelsRequestResource = RegionSetLabelsRequest.newBuilder().build();
     SetLabelsRegionDiskHttpRequest request = SetLabelsRegionDiskHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setRegionSetLabelsRequestResource(regionSetLabelsRequestResource)
       .build();
     ApiFuture<Operation> future = regionDiskClient.setLabelsRegionDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.setLabelsRegionDiskCallable))))

(defn test-iam-permissions-region-disk-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedResource = ProjectRegionDiskResourceName.format(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsRegionDiskHttpRequest request = TestIamPermissionsRegionDiskHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = regionDiskClient.testIamPermissionsRegionDiskCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.testIamPermissionsRegionDiskCallable))))

(defn list-region-disks
  "Retrieves the list of persistent disks contained within the specified region.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (Disk element : regionDiskClient.listRegionDisks(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RegionDiskClient$ListRegionDisksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionDiskClient$ListRegionDisksPagedResponse [^RegionDiskClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRegionDisks region))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionDiskStub`"
  ([^RegionDiskClient this]
    (-> this (.getStub))))

(defn delete-region-disk-callable
  "Deletes the specified regional persistent disk. Deleting a regional disk removes all the
   replicas of its data permanently and is irreversible. However, deleting a disk does not delete
   any snapshots previously made from the disk. You must separately delete snapshots.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedDisk = ProjectRegionDiskName.format(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
     DeleteRegionDiskHttpRequest request = DeleteRegionDiskHttpRequest.newBuilder()
       .setDisk(formattedDisk)
       .build();
     ApiFuture<Operation> future = regionDiskClient.deleteRegionDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.deleteRegionDiskCallable))))

(defn get-region-disk
  "Returns a specified regional persistent disk.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     ProjectRegionDiskName disk = ProjectRegionDiskName.of(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
     Disk response = regionDiskClient.getRegionDisk(disk);
   }

  disk - Name of the regional persistent disk to return. - `com.google.cloud.compute.v1.ProjectRegionDiskName`

  returns: `com.google.cloud.compute.v1.Disk`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Disk [^RegionDiskClient this ^com.google.cloud.compute.v1.ProjectRegionDiskName disk]
    (-> this (.getRegionDisk disk))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionDiskClient this]
    (-> this (.isShutdown))))

(defn resize-region-disk-callable
  "Resizes the specified regional persistent disk.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedDisk = ProjectRegionDiskName.format(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
     RegionDisksResizeRequest regionDisksResizeRequestResource = RegionDisksResizeRequest.newBuilder().build();
     ResizeRegionDiskHttpRequest request = ResizeRegionDiskHttpRequest.newBuilder()
       .setDisk(formattedDisk)
       .setRegionDisksResizeRequestResource(regionDisksResizeRequestResource)
       .build();
     ApiFuture<Operation> future = regionDiskClient.resizeRegionDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.resizeRegionDiskCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionDiskClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn create-snapshot-region-disk
  "Creates a snapshot of this regional disk.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     ProjectRegionDiskName disk = ProjectRegionDiskName.of(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
     Snapshot snapshotResource = Snapshot.newBuilder().build();
     Operation response = regionDiskClient.createSnapshotRegionDisk(disk, snapshotResource);
   }

  disk - Name of the regional persistent disk to snapshot. - `com.google.cloud.compute.v1.ProjectRegionDiskName`
  snapshot-resource - A persistent disk snapshot resource. (== resource_for beta.snapshots ==) (== resource_for v1.snapshots ==) - `com.google.cloud.compute.v1.Snapshot`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.ProjectRegionDiskName disk ^com.google.cloud.compute.v1.Snapshot snapshot-resource]
    (-> this (.createSnapshotRegionDisk disk snapshot-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.CreateSnapshotRegionDiskHttpRequest request]
    (-> this (.createSnapshotRegionDisk request))))

(defn shutdown
  ""
  ([^RegionDiskClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^RegionDiskClient this]
    (-> this (.close))))

(defn insert-region-disk-callable
  "Creates a persistent regional disk in the specified project using the data included in the
   request.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     Disk diskResource = Disk.newBuilder().build();
     InsertRegionDiskHttpRequest request = InsertRegionDiskHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setDiskResource(diskResource)
       .build();
     ApiFuture<Operation> future = regionDiskClient.insertRegionDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.insertRegionDiskCallable))))

(defn list-region-disks-paged-callable
  "Retrieves the list of persistent disks contained within the specified region.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionDisksHttpRequest request = ListRegionDisksHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRegionDisksPagedResponse> future = regionDiskClient.listRegionDisksPagedCallable().futureCall(request);
     // Do something
     for (Disk element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.RegionDiskClient$ListRegionDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.listRegionDisksPagedCallable))))

(defn insert-region-disk
  "Creates a persistent regional disk in the specified project using the data included in the
   request.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Disk diskResource = Disk.newBuilder().build();
     Operation response = regionDiskClient.insertRegionDisk(region, diskResource);
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  disk-resource - A Disk resource. (== resource_for beta.disks ==) (== resource_for v1.disks ==) - `com.google.cloud.compute.v1.Disk`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.Disk disk-resource]
    (-> this (.insertRegionDisk region disk-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.InsertRegionDiskHttpRequest request]
    (-> this (.insertRegionDisk request))))

(defn list-region-disks-callable
  "Retrieves the list of persistent disks contained within the specified region.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionDisksHttpRequest request = ListRegionDisksHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       DiskList response = regionDiskClient.listRegionDisksCallable().call(request);
       for (Disk element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDisksHttpRequest,com.google.cloud.compute.v1.DiskList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.listRegionDisksCallable))))

(defn resize-region-disk
  "Resizes the specified regional persistent disk.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     ProjectRegionDiskName disk = ProjectRegionDiskName.of(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
     RegionDisksResizeRequest regionDisksResizeRequestResource = RegionDisksResizeRequest.newBuilder().build();
     Operation response = regionDiskClient.resizeRegionDisk(disk, regionDisksResizeRequestResource);
   }

  disk - Name of the regional persistent disk. - `com.google.cloud.compute.v1.ProjectRegionDiskName`
  region-disks-resize-request-resource - `com.google.cloud.compute.v1.RegionDisksResizeRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.ProjectRegionDiskName disk ^com.google.cloud.compute.v1.RegionDisksResizeRequest region-disks-resize-request-resource]
    (-> this (.resizeRegionDisk disk region-disks-resize-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.ResizeRegionDiskHttpRequest request]
    (-> this (.resizeRegionDisk request))))

(defn delete-region-disk
  "Deletes the specified regional persistent disk. Deleting a regional disk removes all the
   replicas of its data permanently and is irreversible. However, deleting a disk does not delete
   any snapshots previously made from the disk. You must separately delete snapshots.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     ProjectRegionDiskName disk = ProjectRegionDiskName.of(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
     Operation response = regionDiskClient.deleteRegionDisk(disk);
   }

  disk - Name of the regional persistent disk to delete. - `com.google.cloud.compute.v1.ProjectRegionDiskName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionDiskClient this ^com.google.cloud.compute.v1.ProjectRegionDiskName disk]
    (-> this (.deleteRegionDisk disk))))

(defn get-region-disk-callable
  "Returns a specified regional persistent disk.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     String formattedDisk = ProjectRegionDiskName.format(\"[PROJECT]\", \"[REGION]\", \"[DISK]\");
     GetRegionDiskHttpRequest request = GetRegionDiskHttpRequest.newBuilder()
       .setDisk(formattedDisk)
       .build();
     ApiFuture<Disk> future = regionDiskClient.getRegionDiskCallable().futureCall(request);
     // Do something
     Disk response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskClient this]
    (-> this (.getRegionDiskCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionDiskClient this]
    (-> this (.isTerminated))))

(defn test-iam-permissions-region-disk
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (RegionDiskClient regionDiskClient = RegionDiskClient.create()) {
     ProjectRegionDiskResourceName resource = ProjectRegionDiskResourceName.of(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = regionDiskClient.testIamPermissionsRegionDisk(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectRegionDiskResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^RegionDiskClient this ^com.google.cloud.compute.v1.ProjectRegionDiskResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsRegionDisk resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^RegionDiskClient this ^com.google.cloud.compute.v1.TestIamPermissionsRegionDiskHttpRequest request]
    (-> this (.testIamPermissionsRegionDisk request))))

(defn shutdown-now
  ""
  ([^RegionDiskClient this]
    (-> this (.shutdownNow))))

