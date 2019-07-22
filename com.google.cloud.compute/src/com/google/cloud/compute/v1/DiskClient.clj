(ns com.google.cloud.compute.v1.DiskClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DiskClient diskClient = DiskClient.create()) {
    ProjectZoneDiskName disk = ProjectZoneDiskName.of(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
    Boolean guestFlush = false;
    Snapshot snapshotResource = Snapshot.newBuilder().build();
    Operation response = diskClient.createSnapshotDisk(disk, guestFlush, snapshotResource);
  }

  Note: close() needs to be called on the diskClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of DiskSettings to create(). For
  example:

  To customize credentials:



  DiskSettings diskSettings =
      DiskSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DiskClient diskClient =
      DiskClient.create(diskSettings);

  To customize the endpoint:



  DiskSettings diskSettings =
      DiskSettings.newBuilder().setEndpoint(myEndpoint).build();
  DiskClient diskClient =
      DiskClient.create(diskSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskClient]))

(defn *create
  "Constructs an instance of DiskClient, using the given settings. The channels are created based
   on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.DiskSettings`

  returns: `com.google.cloud.compute.v1.DiskClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.DiskClient [^com.google.cloud.compute.v1.DiskSettings settings]
    (DiskClient/create settings))
  (^com.google.cloud.compute.v1.DiskClient []
    (DiskClient/create )))

(defn set-iam-policy-disk
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneDiskResourceName resource = ProjectZoneDiskResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
     Policy response = diskClient.setIamPolicyDisk(resource, zoneSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneDiskResourceName`
  zone-set-policy-request-resource - `com.google.cloud.compute.v1.ZoneSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneDiskResourceName resource ^com.google.cloud.compute.v1.ZoneSetPolicyRequest zone-set-policy-request-resource]
    (-> this (.setIamPolicyDisk resource zone-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^DiskClient this ^com.google.cloud.compute.v1.SetIamPolicyDiskHttpRequest request]
    (-> this (.setIamPolicyDisk request))))

(defn delete-disk
  "Deletes the specified persistent disk. Deleting a disk removes its data permanently and is
   irreversible. However, deleting a disk does not delete any snapshots previously made from the
   disk. You must separately delete snapshots.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneDiskName disk = ProjectZoneDiskName.of(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
     Operation response = diskClient.deleteDisk(disk);
   }

  disk - Name of the persistent disk to delete. - `com.google.cloud.compute.v1.ProjectZoneDiskName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneDiskName disk]
    (-> this (.deleteDisk disk))))

(defn set-labels-disk-callable
  "Sets the labels on a disk. To learn more about labels, read the Labeling Resources
   documentation.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedResource = ProjectZoneDiskResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     ZoneSetLabelsRequest zoneSetLabelsRequestResource = ZoneSetLabelsRequest.newBuilder().build();
     SetLabelsDiskHttpRequest request = SetLabelsDiskHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setZoneSetLabelsRequestResource(zoneSetLabelsRequestResource)
       .build();
     ApiFuture<Operation> future = diskClient.setLabelsDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.setLabelsDiskCallable))))

(defn create-snapshot-disk-callable
  "Creates a snapshot of a specified persistent disk.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedDisk = ProjectZoneDiskName.format(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
     Boolean guestFlush = false;
     Snapshot snapshotResource = Snapshot.newBuilder().build();
     CreateSnapshotDiskHttpRequest request = CreateSnapshotDiskHttpRequest.newBuilder()
       .setDisk(formattedDisk)
       .setGuestFlush(guestFlush)
       .setSnapshotResource(snapshotResource)
       .build();
     ApiFuture<Operation> future = diskClient.createSnapshotDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.createSnapshotDiskCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.DiskSettings`"
  (^com.google.cloud.compute.v1.DiskSettings [^DiskClient this]
    (-> this (.getSettings))))

(defn get-disk-callable
  "Returns a specified persistent disk. Gets a list of available persistent disks by making a
   list() request.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedDisk = ProjectZoneDiskName.format(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
     GetDiskHttpRequest request = GetDiskHttpRequest.newBuilder()
       .setDisk(formattedDisk)
       .build();
     ApiFuture<Disk> future = diskClient.getDiskCallable().futureCall(request);
     // Do something
     Disk response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiskHttpRequest,com.google.cloud.compute.v1.Disk>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.getDiskCallable))))

(defn get-disk
  "Returns a specified persistent disk. Gets a list of available persistent disks by making a
   list() request.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneDiskName disk = ProjectZoneDiskName.of(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
     Disk response = diskClient.getDisk(disk);
   }

  disk - Name of the persistent disk to return. - `com.google.cloud.compute.v1.ProjectZoneDiskName`

  returns: `com.google.cloud.compute.v1.Disk`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Disk [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneDiskName disk]
    (-> this (.getDisk disk))))

(defn get-iam-policy-disk-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedResource = ProjectZoneDiskResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     GetIamPolicyDiskHttpRequest request = GetIamPolicyDiskHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = diskClient.getIamPolicyDiskCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.getIamPolicyDiskCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.DiskStub`"
  ([^DiskClient this]
    (-> this (.getStub))))

(defn aggregated-list-disks-paged-callable
  "Retrieves an aggregated list of persistent disks.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListDisksHttpRequest request = AggregatedListDisksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListDisksPagedResponse> future = diskClient.aggregatedListDisksPagedCallable().futureCall(request);
     // Do something
     for (DisksScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskClient$AggregatedListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.aggregatedListDisksPagedCallable))))

(defn set-labels-disk
  "Sets the labels on a disk. To learn more about labels, read the Labeling Resources
   documentation.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneDiskResourceName resource = ProjectZoneDiskResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     ZoneSetLabelsRequest zoneSetLabelsRequestResource = ZoneSetLabelsRequest.newBuilder().build();
     Operation response = diskClient.setLabelsDisk(resource, zoneSetLabelsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneDiskResourceName`
  zone-set-labels-request-resource - `com.google.cloud.compute.v1.ZoneSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneDiskResourceName resource ^com.google.cloud.compute.v1.ZoneSetLabelsRequest zone-set-labels-request-resource]
    (-> this (.setLabelsDisk resource zone-set-labels-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.SetLabelsDiskHttpRequest request]
    (-> this (.setLabelsDisk request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DiskClient this]
    (-> this (.isShutdown))))

(defn list-disks-callable
  "Retrieves a list of persistent disks contained within the specified zone.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListDisksHttpRequest request = ListDisksHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       DiskList response = diskClient.listDisksCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.listDisksCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DiskClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^DiskClient this]
    (-> this (.shutdown))))

(defn insert-disk-callable
  "Creates a persistent disk in the specified project using the data in the request. You can
   create a disk with a sourceImage, a sourceSnapshot, or create an empty 500 GB data disk by
   omitting all properties. You can also create a disk that is larger than the default size by
   specifying the sizeGb property.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     Disk diskResource = Disk.newBuilder().build();
     InsertDiskHttpRequest request = InsertDiskHttpRequest.newBuilder()
       .setZone(formattedZone)
       .setDiskResource(diskResource)
       .build();
     ApiFuture<Operation> future = diskClient.insertDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.insertDiskCallable))))

(defn test-iam-permissions-disk
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneDiskResourceName resource = ProjectZoneDiskResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = diskClient.testIamPermissionsDisk(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneDiskResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneDiskResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsDisk resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^DiskClient this ^com.google.cloud.compute.v1.TestIamPermissionsDiskHttpRequest request]
    (-> this (.testIamPermissionsDisk request))))

(defn delete-disk-callable
  "Deletes the specified persistent disk. Deleting a disk removes its data permanently and is
   irreversible. However, deleting a disk does not delete any snapshots previously made from the
   disk. You must separately delete snapshots.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedDisk = ProjectZoneDiskName.format(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
     DeleteDiskHttpRequest request = DeleteDiskHttpRequest.newBuilder()
       .setDisk(formattedDisk)
       .build();
     ApiFuture<Operation> future = diskClient.deleteDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.deleteDiskCallable))))

(defn close
  ""
  ([^DiskClient this]
    (-> this (.close))))

(defn insert-disk
  "Creates a persistent disk in the specified project using the data in the request. You can
   create a disk with a sourceImage, a sourceSnapshot, or create an empty 500 GB data disk by
   omitting all properties. You can also create a disk that is larger than the default size by
   specifying the sizeGb property.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     Disk diskResource = Disk.newBuilder().build();
     Operation response = diskClient.insertDisk(zone, diskResource);
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`
  disk-resource - A Disk resource. (== resource_for beta.disks ==) (== resource_for v1.disks ==) - `com.google.cloud.compute.v1.Disk`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.Disk disk-resource]
    (-> this (.insertDisk zone disk-resource)))
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.InsertDiskHttpRequest request]
    (-> this (.insertDisk request))))

(defn list-disks
  "Retrieves a list of persistent disks contained within the specified zone.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (Disk element : diskClient.listDisks(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.DiskClient$ListDisksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.DiskClient$ListDisksPagedResponse [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listDisks zone))))

(defn get-iam-policy-disk
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneDiskResourceName resource = ProjectZoneDiskResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     Policy response = diskClient.getIamPolicyDisk(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneDiskResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneDiskResourceName resource]
    (-> this (.getIamPolicyDisk resource))))

(defn resize-disk
  "Resizes the specified persistent disk. You can only increase the size of the disk.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneDiskName disk = ProjectZoneDiskName.of(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
     DisksResizeRequest disksResizeRequestResource = DisksResizeRequest.newBuilder().build();
     Operation response = diskClient.resizeDisk(disk, disksResizeRequestResource);
   }

  disk - The name of the persistent disk. - `com.google.cloud.compute.v1.ProjectZoneDiskName`
  disks-resize-request-resource - `com.google.cloud.compute.v1.DisksResizeRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneDiskName disk ^com.google.cloud.compute.v1.DisksResizeRequest disks-resize-request-resource]
    (-> this (.resizeDisk disk disks-resize-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.ResizeDiskHttpRequest request]
    (-> this (.resizeDisk request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DiskClient this]
    (-> this (.isTerminated))))

(defn test-iam-permissions-disk-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedResource = ProjectZoneDiskResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsDiskHttpRequest request = TestIamPermissionsDiskHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = diskClient.testIamPermissionsDiskCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsDiskHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.testIamPermissionsDiskCallable))))

(defn set-iam-policy-disk-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedResource = ProjectZoneDiskResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
     SetIamPolicyDiskHttpRequest request = SetIamPolicyDiskHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setZoneSetPolicyRequestResource(zoneSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = diskClient.setIamPolicyDiskCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyDiskHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.setIamPolicyDiskCallable))))

(defn aggregated-list-disks
  "Retrieves an aggregated list of persistent disks.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (DisksScopedList element : diskClient.aggregatedListDisks(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.DiskClient$AggregatedListDisksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.DiskClient$AggregatedListDisksPagedResponse [^DiskClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListDisks project))))

(defn aggregated-list-disks-callable
  "Retrieves an aggregated list of persistent disks.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListDisksHttpRequest request = AggregatedListDisksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       DiskAggregatedList response = diskClient.aggregatedListDisksCallable().call(request);
       for (DisksScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDisksHttpRequest,com.google.cloud.compute.v1.DiskAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.aggregatedListDisksCallable))))

(defn list-disks-paged-callable
  "Retrieves a list of persistent disks contained within the specified zone.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListDisksHttpRequest request = ListDisksHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListDisksPagedResponse> future = diskClient.listDisksPagedCallable().futureCall(request);
     // Do something
     for (Disk element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDisksHttpRequest,com.google.cloud.compute.v1.DiskClient$ListDisksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.listDisksPagedCallable))))

(defn resize-disk-callable
  "Resizes the specified persistent disk. You can only increase the size of the disk.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     String formattedDisk = ProjectZoneDiskName.format(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
     DisksResizeRequest disksResizeRequestResource = DisksResizeRequest.newBuilder().build();
     ResizeDiskHttpRequest request = ResizeDiskHttpRequest.newBuilder()
       .setDisk(formattedDisk)
       .setDisksResizeRequestResource(disksResizeRequestResource)
       .build();
     ApiFuture<Operation> future = diskClient.resizeDiskCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeDiskHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskClient this]
    (-> this (.resizeDiskCallable))))

(defn shutdown-now
  ""
  ([^DiskClient this]
    (-> this (.shutdownNow))))

(defn create-snapshot-disk
  "Creates a snapshot of a specified persistent disk.

   Sample code:



   try (DiskClient diskClient = DiskClient.create()) {
     ProjectZoneDiskName disk = ProjectZoneDiskName.of(\"[PROJECT]\", \"[ZONE]\", \"[DISK]\");
     Boolean guestFlush = false;
     Snapshot snapshotResource = Snapshot.newBuilder().build();
     Operation response = diskClient.createSnapshotDisk(disk, guestFlush, snapshotResource);
   }

  disk - Name of the persistent disk to snapshot. - `com.google.cloud.compute.v1.ProjectZoneDiskName`
  guest-flush - [Input Only] Specifies to create an application consistent snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS). - `java.lang.Boolean`
  snapshot-resource - A persistent disk snapshot resource. (== resource_for beta.snapshots ==) (== resource_for v1.snapshots ==) - `com.google.cloud.compute.v1.Snapshot`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.ProjectZoneDiskName disk ^java.lang.Boolean guest-flush ^com.google.cloud.compute.v1.Snapshot snapshot-resource]
    (-> this (.createSnapshotDisk disk guest-flush snapshot-resource)))
  (^com.google.cloud.compute.v1.Operation [^DiskClient this ^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest request]
    (-> this (.createSnapshotDisk request))))

