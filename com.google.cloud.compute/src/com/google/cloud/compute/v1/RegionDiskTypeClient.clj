(ns com.google.cloud.compute.v1.RegionDiskTypeClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionDiskTypeClient regionDiskTypeClient = RegionDiskTypeClient.create()) {
    ProjectRegionDiskTypeName diskType = ProjectRegionDiskTypeName.of(\"[PROJECT]\", \"[REGION]\", \"[DISK_TYPE]\");
    DiskType response = regionDiskTypeClient.getRegionDiskType(diskType);
  }

  Note: close() needs to be called on the regionDiskTypeClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of RegionDiskTypeSettings to
  create(). For example:

  To customize credentials:



  RegionDiskTypeSettings regionDiskTypeSettings =
      RegionDiskTypeSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionDiskTypeClient regionDiskTypeClient =
      RegionDiskTypeClient.create(regionDiskTypeSettings);

  To customize the endpoint:



  RegionDiskTypeSettings regionDiskTypeSettings =
      RegionDiskTypeSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionDiskTypeClient regionDiskTypeClient =
      RegionDiskTypeClient.create(regionDiskTypeSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionDiskTypeClient]))

(defn *create
  "Constructs an instance of RegionDiskTypeClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RegionDiskTypeSettings`

  returns: `com.google.cloud.compute.v1.RegionDiskTypeClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionDiskTypeClient [^com.google.cloud.compute.v1.RegionDiskTypeSettings settings]
    (RegionDiskTypeClient/create settings))
  (^com.google.cloud.compute.v1.RegionDiskTypeClient []
    (RegionDiskTypeClient/create )))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionDiskTypeSettings`"
  (^com.google.cloud.compute.v1.RegionDiskTypeSettings [^RegionDiskTypeClient this]
    (-> this (.getSettings))))

(defn get-region-disk-type-callable
  "Returns the specified regional disk type. Gets a list of available disk types by making a
   list() request.

   Sample code:



   try (RegionDiskTypeClient regionDiskTypeClient = RegionDiskTypeClient.create()) {
     String formattedDiskType = ProjectRegionDiskTypeName.format(\"[PROJECT]\", \"[REGION]\", \"[DISK_TYPE]\");
     GetRegionDiskTypeHttpRequest request = GetRegionDiskTypeHttpRequest.newBuilder()
       .setDiskType(formattedDiskType)
       .build();
     ApiFuture<DiskType> future = regionDiskTypeClient.getRegionDiskTypeCallable().futureCall(request);
     // Do something
     DiskType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskTypeClient this]
    (-> this (.getRegionDiskTypeCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionDiskTypeStub`"
  ([^RegionDiskTypeClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionDiskTypeClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionDiskTypeClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^RegionDiskTypeClient this]
    (-> this (.shutdown))))

(defn list-region-disk-types-paged-callable
  "Retrieves a list of regional disk types available to the specified project.

   Sample code:



   try (RegionDiskTypeClient regionDiskTypeClient = RegionDiskTypeClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionDiskTypesHttpRequest request = ListRegionDiskTypesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRegionDiskTypesPagedResponse> future = regionDiskTypeClient.listRegionDiskTypesPagedCallable().futureCall(request);
     // Do something
     for (DiskType element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeClient$ListRegionDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskTypeClient this]
    (-> this (.listRegionDiskTypesPagedCallable))))

(defn get-region-disk-type
  "Returns the specified regional disk type. Gets a list of available disk types by making a
   list() request.

   Sample code:



   try (RegionDiskTypeClient regionDiskTypeClient = RegionDiskTypeClient.create()) {
     ProjectRegionDiskTypeName diskType = ProjectRegionDiskTypeName.of(\"[PROJECT]\", \"[REGION]\", \"[DISK_TYPE]\");
     DiskType response = regionDiskTypeClient.getRegionDiskType(diskType);
   }

  disk-type - Name of the disk type to return. - `com.google.cloud.compute.v1.ProjectRegionDiskTypeName`

  returns: `com.google.cloud.compute.v1.DiskType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.DiskType [^RegionDiskTypeClient this ^com.google.cloud.compute.v1.ProjectRegionDiskTypeName disk-type]
    (-> this (.getRegionDiskType disk-type))))

(defn close
  ""
  ([^RegionDiskTypeClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionDiskTypeClient this]
    (-> this (.isTerminated))))

(defn list-region-disk-types
  "Retrieves a list of regional disk types available to the specified project.

   Sample code:



   try (RegionDiskTypeClient regionDiskTypeClient = RegionDiskTypeClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (DiskType element : regionDiskTypeClient.listRegionDiskTypes(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - The name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RegionDiskTypeClient$ListRegionDiskTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionDiskTypeClient$ListRegionDiskTypesPagedResponse [^RegionDiskTypeClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRegionDiskTypes region))))

(defn list-region-disk-types-callable
  "Retrieves a list of regional disk types available to the specified project.

   Sample code:



   try (RegionDiskTypeClient regionDiskTypeClient = RegionDiskTypeClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionDiskTypesHttpRequest request = ListRegionDiskTypesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       RegionDiskTypeList response = regionDiskTypeClient.listRegionDiskTypesCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskTypeClient this]
    (-> this (.listRegionDiskTypesCallable))))

(defn shutdown-now
  ""
  ([^RegionDiskTypeClient this]
    (-> this (.shutdownNow))))

