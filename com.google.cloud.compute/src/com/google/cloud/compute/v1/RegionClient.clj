(ns com.google.cloud.compute.v1.RegionClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionClient regionClient = RegionClient.create()) {
    ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
    Region response = regionClient.getRegion(region);
  }

  Note: close() needs to be called on the regionClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of RegionSettings to create().
  For example:

  To customize credentials:



  RegionSettings regionSettings =
      RegionSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionClient regionClient =
      RegionClient.create(regionSettings);

  To customize the endpoint:



  RegionSettings regionSettings =
      RegionSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionClient regionClient =
      RegionClient.create(regionSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionClient]))

(defn *create
  "Constructs an instance of RegionClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RegionSettings`

  returns: `com.google.cloud.compute.v1.RegionClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionClient [^com.google.cloud.compute.v1.RegionSettings settings]
    (RegionClient/create settings))
  (^com.google.cloud.compute.v1.RegionClient []
    (RegionClient/create )))

(defn list-regions
  "Retrieves the list of region resources available to the specified project.

   Sample code:



   try (RegionClient regionClient = RegionClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Region element : regionClient.listRegions(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.RegionClient$ListRegionsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionClient$ListRegionsPagedResponse [^RegionClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listRegions project))))

(defn list-regions-callable
  "Retrieves the list of region resources available to the specified project.

   Sample code:



   try (RegionClient regionClient = RegionClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListRegionsHttpRequest request = ListRegionsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       RegionList response = regionClient.listRegionsCallable().call(request);
       for (Region element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionClient this]
    (-> this (.listRegionsCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionSettings`"
  (^com.google.cloud.compute.v1.RegionSettings [^RegionClient this]
    (-> this (.getSettings))))

(defn get-region-callable
  "Returns the specified Region resource. Gets a list of available regions by making a list()
   request.

   Sample code:



   try (RegionClient regionClient = RegionClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     GetRegionHttpRequest request = GetRegionHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<Region> future = regionClient.getRegionCallable().futureCall(request);
     // Do something
     Region response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionHttpRequest,com.google.cloud.compute.v1.Region>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionClient this]
    (-> this (.getRegionCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionStub`"
  ([^RegionClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^RegionClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^RegionClient this]
    (-> this (.close))))

(defn list-regions-paged-callable
  "Retrieves the list of region resources available to the specified project.

   Sample code:



   try (RegionClient regionClient = RegionClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListRegionsHttpRequest request = ListRegionsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListRegionsPagedResponse> future = regionClient.listRegionsPagedCallable().futureCall(request);
     // Do something
     for (Region element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionClient$ListRegionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionClient this]
    (-> this (.listRegionsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^RegionClient this]
    (-> this (.shutdownNow))))

(defn get-region
  "Returns the specified Region resource. Gets a list of available regions by making a list()
   request.

   Sample code:



   try (RegionClient regionClient = RegionClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Region response = regionClient.getRegion(region);
   }

  region - Name of the region resource to return. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.Region`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Region [^RegionClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.getRegion region))))

