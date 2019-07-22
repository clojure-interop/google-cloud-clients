(ns com.google.cloud.compute.v1.InterconnectLocationClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (InterconnectLocationClient interconnectLocationClient = InterconnectLocationClient.create()) {
    ProjectGlobalInterconnectLocationName interconnectLocation = ProjectGlobalInterconnectLocationName.of(\"[PROJECT]\", \"[INTERCONNECT_LOCATION]\");
    InterconnectLocation response = interconnectLocationClient.getInterconnectLocation(interconnectLocation);
  }

  Note: close() needs to be called on the interconnectLocationClient object to clean up
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

  This class can be customized by passing in a custom instance of InterconnectLocationSettings
  to create(). For example:

  To customize credentials:



  InterconnectLocationSettings interconnectLocationSettings =
      InterconnectLocationSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  InterconnectLocationClient interconnectLocationClient =
      InterconnectLocationClient.create(interconnectLocationSettings);

  To customize the endpoint:



  InterconnectLocationSettings interconnectLocationSettings =
      InterconnectLocationSettings.newBuilder().setEndpoint(myEndpoint).build();
  InterconnectLocationClient interconnectLocationClient =
      InterconnectLocationClient.create(interconnectLocationSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectLocationClient]))

(defn *create
  "Constructs an instance of InterconnectLocationClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.InterconnectLocationSettings`

  returns: `com.google.cloud.compute.v1.InterconnectLocationClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InterconnectLocationClient [^com.google.cloud.compute.v1.InterconnectLocationSettings settings]
    (InterconnectLocationClient/create settings))
  (^com.google.cloud.compute.v1.InterconnectLocationClient []
    (InterconnectLocationClient/create )))

(defn list-interconnect-locations-paged-callable
  "Retrieves the list of interconnect locations available to the specified project.

   Sample code:



   try (InterconnectLocationClient interconnectLocationClient = InterconnectLocationClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListInterconnectLocationsHttpRequest request = ListInterconnectLocationsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListInterconnectLocationsPagedResponse> future = interconnectLocationClient.listInterconnectLocationsPagedCallable().futureCall(request);
     // Do something
     for (InterconnectLocation element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectLocationClient this]
    (-> this (.listInterconnectLocationsPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.InterconnectLocationSettings`"
  (^com.google.cloud.compute.v1.InterconnectLocationSettings [^InterconnectLocationClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InterconnectLocationStub`"
  ([^InterconnectLocationClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^InterconnectLocationClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^InterconnectLocationClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^InterconnectLocationClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^InterconnectLocationClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^InterconnectLocationClient this]
    (-> this (.isTerminated))))

(defn list-interconnect-locations
  "Retrieves the list of interconnect locations available to the specified project.

   Sample code:



   try (InterconnectLocationClient interconnectLocationClient = InterconnectLocationClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (InterconnectLocation element : interconnectLocationClient.listInterconnectLocations(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse [^InterconnectLocationClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listInterconnectLocations project))))

(defn list-interconnect-locations-callable
  "Retrieves the list of interconnect locations available to the specified project.

   Sample code:



   try (InterconnectLocationClient interconnectLocationClient = InterconnectLocationClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListInterconnectLocationsHttpRequest request = ListInterconnectLocationsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       InterconnectLocationList response = interconnectLocationClient.listInterconnectLocationsCallable().call(request);
       for (InterconnectLocation element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectLocationClient this]
    (-> this (.listInterconnectLocationsCallable))))

(defn get-interconnect-location-callable
  "Returns the details for the specified interconnect location. Gets a list of available
   interconnect locations by making a list() request.

   Sample code:



   try (InterconnectLocationClient interconnectLocationClient = InterconnectLocationClient.create()) {
     String formattedInterconnectLocation = ProjectGlobalInterconnectLocationName.format(\"[PROJECT]\", \"[INTERCONNECT_LOCATION]\");
     GetInterconnectLocationHttpRequest request = GetInterconnectLocationHttpRequest.newBuilder()
       .setInterconnectLocation(formattedInterconnectLocation)
       .build();
     ApiFuture<InterconnectLocation> future = interconnectLocationClient.getInterconnectLocationCallable().futureCall(request);
     // Do something
     InterconnectLocation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectLocationHttpRequest,com.google.cloud.compute.v1.InterconnectLocation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectLocationClient this]
    (-> this (.getInterconnectLocationCallable))))

(defn shutdown-now
  ""
  ([^InterconnectLocationClient this]
    (-> this (.shutdownNow))))

(defn get-interconnect-location
  "Returns the details for the specified interconnect location. Gets a list of available
   interconnect locations by making a list() request.

   Sample code:



   try (InterconnectLocationClient interconnectLocationClient = InterconnectLocationClient.create()) {
     ProjectGlobalInterconnectLocationName interconnectLocation = ProjectGlobalInterconnectLocationName.of(\"[PROJECT]\", \"[INTERCONNECT_LOCATION]\");
     InterconnectLocation response = interconnectLocationClient.getInterconnectLocation(interconnectLocation);
   }

  interconnect-location - Name of the interconnect location to return. - `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName`

  returns: `com.google.cloud.compute.v1.InterconnectLocation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InterconnectLocation [^InterconnectLocationClient this ^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName interconnect-location]
    (-> this (.getInterconnectLocation interconnect-location))))

