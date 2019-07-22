(ns com.google.cloud.compute.v1.AcceleratorTypeClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
    ProjectZoneAcceleratorTypeName acceleratorType = ProjectZoneAcceleratorTypeName.of(\"[PROJECT]\", \"[ZONE]\", \"[ACCELERATOR_TYPE]\");
    AcceleratorType response = acceleratorTypeClient.getAcceleratorType(acceleratorType);
  }

  Note: close() needs to be called on the acceleratorTypeClient object to clean up resources
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

  This class can be customized by passing in a custom instance of AcceleratorTypeSettings to
  create(). For example:

  To customize credentials:



  AcceleratorTypeSettings acceleratorTypeSettings =
      AcceleratorTypeSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AcceleratorTypeClient acceleratorTypeClient =
      AcceleratorTypeClient.create(acceleratorTypeSettings);

  To customize the endpoint:



  AcceleratorTypeSettings acceleratorTypeSettings =
      AcceleratorTypeSettings.newBuilder().setEndpoint(myEndpoint).build();
  AcceleratorTypeClient acceleratorTypeClient =
      AcceleratorTypeClient.create(acceleratorTypeSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AcceleratorTypeClient]))

(defn *create
  "Constructs an instance of AcceleratorTypeClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.AcceleratorTypeSettings`

  returns: `com.google.cloud.compute.v1.AcceleratorTypeClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.AcceleratorTypeClient [^com.google.cloud.compute.v1.AcceleratorTypeSettings settings]
    (AcceleratorTypeClient/create settings))
  (^com.google.cloud.compute.v1.AcceleratorTypeClient []
    (AcceleratorTypeClient/create )))

(defn aggregated-list-accelerator-types-paged-callable
  "Retrieves an aggregated list of accelerator types.

   Sample code:



   try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListAcceleratorTypesHttpRequest request = AggregatedListAcceleratorTypesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListAcceleratorTypesPagedResponse> future = acceleratorTypeClient.aggregatedListAcceleratorTypesPagedCallable().futureCall(request);
     // Do something
     for (AcceleratorTypesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeClient$AggregatedListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeClient this]
    (-> this (.aggregatedListAcceleratorTypesPagedCallable))))

(defn get-accelerator-type-callable
  "Returns the specified accelerator type.

   Sample code:



   try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
     String formattedAcceleratorType = ProjectZoneAcceleratorTypeName.format(\"[PROJECT]\", \"[ZONE]\", \"[ACCELERATOR_TYPE]\");
     GetAcceleratorTypeHttpRequest request = GetAcceleratorTypeHttpRequest.newBuilder()
       .setAcceleratorType(formattedAcceleratorType)
       .build();
     ApiFuture<AcceleratorType> future = acceleratorTypeClient.getAcceleratorTypeCallable().futureCall(request);
     // Do something
     AcceleratorType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAcceleratorTypeHttpRequest,com.google.cloud.compute.v1.AcceleratorType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeClient this]
    (-> this (.getAcceleratorTypeCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.AcceleratorTypeSettings`"
  (^com.google.cloud.compute.v1.AcceleratorTypeSettings [^AcceleratorTypeClient this]
    (-> this (.getSettings))))

(defn aggregated-list-accelerator-types-callable
  "Retrieves an aggregated list of accelerator types.

   Sample code:



   try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListAcceleratorTypesHttpRequest request = AggregatedListAcceleratorTypesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       AcceleratorTypeAggregatedList response = acceleratorTypeClient.aggregatedListAcceleratorTypesCallable().call(request);
       for (AcceleratorTypesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeClient this]
    (-> this (.aggregatedListAcceleratorTypesCallable))))

(defn list-accelerator-types-callable
  "Retrieves a list of accelerator types available to the specified project.

   Sample code:



   try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListAcceleratorTypesHttpRequest request = ListAcceleratorTypesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       AcceleratorTypeList response = acceleratorTypeClient.listAcceleratorTypesCallable().call(request);
       for (AcceleratorType element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeClient this]
    (-> this (.listAcceleratorTypesCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.AcceleratorTypeStub`"
  ([^AcceleratorTypeClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AcceleratorTypeClient this]
    (-> this (.isShutdown))))

(defn list-accelerator-types
  "Retrieves a list of accelerator types available to the specified project.

   Sample code:



   try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (AcceleratorType element : acceleratorTypeClient.listAcceleratorTypes(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.AcceleratorTypeClient$ListAcceleratorTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.AcceleratorTypeClient$ListAcceleratorTypesPagedResponse [^AcceleratorTypeClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listAcceleratorTypes zone))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AcceleratorTypeClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^AcceleratorTypeClient this]
    (-> this (.shutdown))))

(defn list-accelerator-types-paged-callable
  "Retrieves a list of accelerator types available to the specified project.

   Sample code:



   try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListAcceleratorTypesHttpRequest request = ListAcceleratorTypesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListAcceleratorTypesPagedResponse> future = acceleratorTypeClient.listAcceleratorTypesPagedCallable().futureCall(request);
     // Do something
     for (AcceleratorType element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeClient$ListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeClient this]
    (-> this (.listAcceleratorTypesPagedCallable))))

(defn close
  ""
  ([^AcceleratorTypeClient this]
    (-> this (.close))))

(defn aggregated-list-accelerator-types
  "Retrieves an aggregated list of accelerator types.

   Sample code:



   try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (AcceleratorTypesScopedList element : acceleratorTypeClient.aggregatedListAcceleratorTypes(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.AcceleratorTypeClient$AggregatedListAcceleratorTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.AcceleratorTypeClient$AggregatedListAcceleratorTypesPagedResponse [^AcceleratorTypeClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListAcceleratorTypes project))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AcceleratorTypeClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^AcceleratorTypeClient this]
    (-> this (.shutdownNow))))

(defn get-accelerator-type
  "Returns the specified accelerator type.

   Sample code:



   try (AcceleratorTypeClient acceleratorTypeClient = AcceleratorTypeClient.create()) {
     ProjectZoneAcceleratorTypeName acceleratorType = ProjectZoneAcceleratorTypeName.of(\"[PROJECT]\", \"[ZONE]\", \"[ACCELERATOR_TYPE]\");
     AcceleratorType response = acceleratorTypeClient.getAcceleratorType(acceleratorType);
   }

  accelerator-type - Name of the accelerator type to return. - `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName`

  returns: `com.google.cloud.compute.v1.AcceleratorType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.AcceleratorType [^AcceleratorTypeClient this ^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName accelerator-type]
    (-> this (.getAcceleratorType accelerator-type))))

