(ns com.google.cloud.compute.v1.MachineTypeClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
    ProjectZoneMachineTypeName machineType = ProjectZoneMachineTypeName.of(\"[PROJECT]\", \"[ZONE]\", \"[MACHINE_TYPE]\");
    MachineType response = machineTypeClient.getMachineType(machineType);
  }

  Note: close() needs to be called on the machineTypeClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of MachineTypeSettings to
  create(). For example:

  To customize credentials:



  MachineTypeSettings machineTypeSettings =
      MachineTypeSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  MachineTypeClient machineTypeClient =
      MachineTypeClient.create(machineTypeSettings);

  To customize the endpoint:



  MachineTypeSettings machineTypeSettings =
      MachineTypeSettings.newBuilder().setEndpoint(myEndpoint).build();
  MachineTypeClient machineTypeClient =
      MachineTypeClient.create(machineTypeSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 MachineTypeClient]))

(defn *create
  "Constructs an instance of MachineTypeClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.MachineTypeSettings`

  returns: `com.google.cloud.compute.v1.MachineTypeClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.MachineTypeClient [^com.google.cloud.compute.v1.MachineTypeSettings settings]
    (MachineTypeClient/create settings))
  (^com.google.cloud.compute.v1.MachineTypeClient []
    (MachineTypeClient/create )))

(defn aggregated-list-machine-types-callable
  "Retrieves an aggregated list of machine types.

   Sample code:



   try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListMachineTypesHttpRequest request = AggregatedListMachineTypesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       MachineTypeAggregatedList response = machineTypeClient.aggregatedListMachineTypesCallable().call(request);
       for (MachineTypesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeClient this]
    (-> this (.aggregatedListMachineTypesCallable))))

(defn list-machine-types
  "Retrieves a list of machine types available to the specified project.

   Sample code:



   try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (MachineType element : machineTypeClient.listMachineTypes(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.MachineTypeClient$ListMachineTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.MachineTypeClient$ListMachineTypesPagedResponse [^MachineTypeClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listMachineTypes zone))))

(defn aggregated-list-machine-types-paged-callable
  "Retrieves an aggregated list of machine types.

   Sample code:



   try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListMachineTypesHttpRequest request = AggregatedListMachineTypesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListMachineTypesPagedResponse> future = machineTypeClient.aggregatedListMachineTypesPagedCallable().futureCall(request);
     // Do something
     for (MachineTypesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeClient$AggregatedListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeClient this]
    (-> this (.aggregatedListMachineTypesPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.MachineTypeSettings`"
  (^com.google.cloud.compute.v1.MachineTypeSettings [^MachineTypeClient this]
    (-> this (.getSettings))))

(defn aggregated-list-machine-types
  "Retrieves an aggregated list of machine types.

   Sample code:



   try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (MachineTypesScopedList element : machineTypeClient.aggregatedListMachineTypes(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.MachineTypeClient$AggregatedListMachineTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.MachineTypeClient$AggregatedListMachineTypesPagedResponse [^MachineTypeClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListMachineTypes project))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.MachineTypeStub`"
  ([^MachineTypeClient this]
    (-> this (.getStub))))

(defn list-machine-types-paged-callable
  "Retrieves a list of machine types available to the specified project.

   Sample code:



   try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListMachineTypesHttpRequest request = ListMachineTypesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListMachineTypesPagedResponse> future = machineTypeClient.listMachineTypesPagedCallable().futureCall(request);
     // Do something
     for (MachineType element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeClient$ListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeClient this]
    (-> this (.listMachineTypesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^MachineTypeClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^MachineTypeClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn get-machine-type-callable
  "Returns the specified machine type. Gets a list of available machine types by making a list()
   request.

   Sample code:



   try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
     String formattedMachineType = ProjectZoneMachineTypeName.format(\"[PROJECT]\", \"[ZONE]\", \"[MACHINE_TYPE]\");
     GetMachineTypeHttpRequest request = GetMachineTypeHttpRequest.newBuilder()
       .setMachineType(formattedMachineType)
       .build();
     ApiFuture<MachineType> future = machineTypeClient.getMachineTypeCallable().futureCall(request);
     // Do something
     MachineType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetMachineTypeHttpRequest,com.google.cloud.compute.v1.MachineType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeClient this]
    (-> this (.getMachineTypeCallable))))

(defn shutdown
  ""
  ([^MachineTypeClient this]
    (-> this (.shutdown))))

(defn list-machine-types-callable
  "Retrieves a list of machine types available to the specified project.

   Sample code:



   try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListMachineTypesHttpRequest request = ListMachineTypesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       MachineTypeList response = machineTypeClient.listMachineTypesCallable().call(request);
       for (MachineType element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeClient this]
    (-> this (.listMachineTypesCallable))))

(defn get-machine-type
  "Returns the specified machine type. Gets a list of available machine types by making a list()
   request.

   Sample code:



   try (MachineTypeClient machineTypeClient = MachineTypeClient.create()) {
     ProjectZoneMachineTypeName machineType = ProjectZoneMachineTypeName.of(\"[PROJECT]\", \"[ZONE]\", \"[MACHINE_TYPE]\");
     MachineType response = machineTypeClient.getMachineType(machineType);
   }

  machine-type - Name of the machine type to return. - `com.google.cloud.compute.v1.ProjectZoneMachineTypeName`

  returns: `com.google.cloud.compute.v1.MachineType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.MachineType [^MachineTypeClient this ^com.google.cloud.compute.v1.ProjectZoneMachineTypeName machine-type]
    (-> this (.getMachineType machine-type))))

(defn close
  ""
  ([^MachineTypeClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^MachineTypeClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^MachineTypeClient this]
    (-> this (.shutdownNow))))

