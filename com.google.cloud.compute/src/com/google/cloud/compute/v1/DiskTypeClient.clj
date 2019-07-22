(ns com.google.cloud.compute.v1.DiskTypeClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
    ProjectZoneDiskTypeName diskType = ProjectZoneDiskTypeName.of(\"[PROJECT]\", \"[ZONE]\", \"[DISK_TYPE]\");
    DiskType response = diskTypeClient.getDiskType(diskType);
  }

  Note: close() needs to be called on the diskTypeClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of DiskTypeSettings to create().
  For example:

  To customize credentials:



  DiskTypeSettings diskTypeSettings =
      DiskTypeSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DiskTypeClient diskTypeClient =
      DiskTypeClient.create(diskTypeSettings);

  To customize the endpoint:



  DiskTypeSettings diskTypeSettings =
      DiskTypeSettings.newBuilder().setEndpoint(myEndpoint).build();
  DiskTypeClient diskTypeClient =
      DiskTypeClient.create(diskTypeSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskTypeClient]))

(defn *create
  "Constructs an instance of DiskTypeClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.DiskTypeSettings`

  returns: `com.google.cloud.compute.v1.DiskTypeClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.DiskTypeClient [^com.google.cloud.compute.v1.DiskTypeSettings settings]
    (DiskTypeClient/create settings))
  (^com.google.cloud.compute.v1.DiskTypeClient []
    (DiskTypeClient/create )))

(defn list-disk-types-paged-callable
  "Retrieves a list of disk types available to the specified project.

   Sample code:



   try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListDiskTypesHttpRequest request = ListDiskTypesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListDiskTypesPagedResponse> future = diskTypeClient.listDiskTypesPagedCallable().futureCall(request);
     // Do something
     for (DiskType element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeClient this]
    (-> this (.listDiskTypesPagedCallable))))

(defn get-disk-type-callable
  "Returns the specified disk type. Gets a list of available disk types by making a list()
   request.

   Sample code:



   try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
     String formattedDiskType = ProjectZoneDiskTypeName.format(\"[PROJECT]\", \"[ZONE]\", \"[DISK_TYPE]\");
     GetDiskTypeHttpRequest request = GetDiskTypeHttpRequest.newBuilder()
       .setDiskType(formattedDiskType)
       .build();
     ApiFuture<DiskType> future = diskTypeClient.getDiskTypeCallable().futureCall(request);
     // Do something
     DiskType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeClient this]
    (-> this (.getDiskTypeCallable))))

(defn aggregated-list-disk-types-callable
  "Retrieves an aggregated list of disk types.

   Sample code:



   try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListDiskTypesHttpRequest request = AggregatedListDiskTypesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       DiskTypeAggregatedList response = diskTypeClient.aggregatedListDiskTypesCallable().call(request);
       for (DiskTypesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeClient this]
    (-> this (.aggregatedListDiskTypesCallable))))

(defn aggregated-list-disk-types-paged-callable
  "Retrieves an aggregated list of disk types.

   Sample code:



   try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListDiskTypesHttpRequest request = AggregatedListDiskTypesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListDiskTypesPagedResponse> future = diskTypeClient.aggregatedListDiskTypesPagedCallable().futureCall(request);
     // Do something
     for (DiskTypesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeClient this]
    (-> this (.aggregatedListDiskTypesPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.DiskTypeSettings`"
  (^com.google.cloud.compute.v1.DiskTypeSettings [^DiskTypeClient this]
    (-> this (.getSettings))))

(defn list-disk-types
  "Retrieves a list of disk types available to the specified project.

   Sample code:



   try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (DiskType element : diskTypeClient.listDiskTypes(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse [^DiskTypeClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listDiskTypes zone))))

(defn get-disk-type
  "Returns the specified disk type. Gets a list of available disk types by making a list()
   request.

   Sample code:



   try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
     ProjectZoneDiskTypeName diskType = ProjectZoneDiskTypeName.of(\"[PROJECT]\", \"[ZONE]\", \"[DISK_TYPE]\");
     DiskType response = diskTypeClient.getDiskType(diskType);
   }

  disk-type - Name of the disk type to return. - `com.google.cloud.compute.v1.ProjectZoneDiskTypeName`

  returns: `com.google.cloud.compute.v1.DiskType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.DiskType [^DiskTypeClient this ^com.google.cloud.compute.v1.ProjectZoneDiskTypeName disk-type]
    (-> this (.getDiskType disk-type))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.DiskTypeStub`"
  ([^DiskTypeClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DiskTypeClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DiskTypeClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^DiskTypeClient this]
    (-> this (.shutdown))))

(defn aggregated-list-disk-types
  "Retrieves an aggregated list of disk types.

   Sample code:



   try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (DiskTypesScopedList element : diskTypeClient.aggregatedListDiskTypes(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse [^DiskTypeClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListDiskTypes project))))

(defn close
  ""
  ([^DiskTypeClient this]
    (-> this (.close))))

(defn list-disk-types-callable
  "Retrieves a list of disk types available to the specified project.

   Sample code:



   try (DiskTypeClient diskTypeClient = DiskTypeClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListDiskTypesHttpRequest request = ListDiskTypesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       DiskTypeList response = diskTypeClient.listDiskTypesCallable().call(request);
       for (DiskType element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeClient this]
    (-> this (.listDiskTypesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DiskTypeClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^DiskTypeClient this]
    (-> this (.shutdownNow))))

