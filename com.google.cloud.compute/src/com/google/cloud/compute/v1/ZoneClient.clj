(ns com.google.cloud.compute.v1.ZoneClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ZoneClient zoneClient = ZoneClient.create()) {
    ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
    Zone response = zoneClient.getZone(zone);
  }

  Note: close() needs to be called on the zoneClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of ZoneSettings to create(). For
  example:

  To customize credentials:



  ZoneSettings zoneSettings =
      ZoneSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ZoneClient zoneClient =
      ZoneClient.create(zoneSettings);

  To customize the endpoint:



  ZoneSettings zoneSettings =
      ZoneSettings.newBuilder().setEndpoint(myEndpoint).build();
  ZoneClient zoneClient =
      ZoneClient.create(zoneSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ZoneClient]))

(defn *create
  "Constructs an instance of ZoneClient, using the given settings. The channels are created based
   on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.ZoneSettings`

  returns: `com.google.cloud.compute.v1.ZoneClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ZoneClient [^com.google.cloud.compute.v1.ZoneSettings settings]
    (ZoneClient/create settings))
  (^com.google.cloud.compute.v1.ZoneClient []
    (ZoneClient/create )))

(defn list-zones-callable
  "Retrieves the list of Zone resources available to the specified project.

   Sample code:



   try (ZoneClient zoneClient = ZoneClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListZonesHttpRequest request = ListZonesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       ZoneList response = zoneClient.listZonesCallable().call(request);
       for (Zone element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneClient this]
    (-> this (.listZonesCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.ZoneSettings`"
  (^com.google.cloud.compute.v1.ZoneSettings [^ZoneClient this]
    (-> this (.getSettings))))

(defn get-zone-callable
  "Returns the specified Zone resource. Gets a list of available zones by making a list() request.

   Sample code:



   try (ZoneClient zoneClient = ZoneClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     GetZoneHttpRequest request = GetZoneHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<Zone> future = zoneClient.getZoneCallable().futureCall(request);
     // Do something
     Zone response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetZoneHttpRequest,com.google.cloud.compute.v1.Zone>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneClient this]
    (-> this (.getZoneCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ZoneStub`"
  ([^ZoneClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ZoneClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ZoneClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ZoneClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^ZoneClient this]
    (-> this (.close))))

(defn get-zone
  "Returns the specified Zone resource. Gets a list of available zones by making a list() request.

   Sample code:



   try (ZoneClient zoneClient = ZoneClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     Zone response = zoneClient.getZone(zone);
   }

  zone - Name of the zone resource to return. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.Zone`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Zone [^ZoneClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.getZone zone))))

(defn list-zones
  "Retrieves the list of Zone resources available to the specified project.

   Sample code:



   try (ZoneClient zoneClient = ZoneClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Zone element : zoneClient.listZones(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.ZoneClient$ListZonesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ZoneClient$ListZonesPagedResponse [^ZoneClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listZones project))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ZoneClient this]
    (-> this (.isTerminated))))

(defn list-zones-paged-callable
  "Retrieves the list of Zone resources available to the specified project.

   Sample code:



   try (ZoneClient zoneClient = ZoneClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListZonesHttpRequest request = ListZonesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListZonesPagedResponse> future = zoneClient.listZonesPagedCallable().futureCall(request);
     // Do something
     for (Zone element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneClient$ListZonesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneClient this]
    (-> this (.listZonesPagedCallable))))

(defn shutdown-now
  ""
  ([^ZoneClient this]
    (-> this (.shutdownNow))))

