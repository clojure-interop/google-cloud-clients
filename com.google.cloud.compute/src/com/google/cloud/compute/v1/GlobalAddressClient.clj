(ns com.google.cloud.compute.v1.GlobalAddressClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
    ProjectGlobalAddressName address = ProjectGlobalAddressName.of(\"[PROJECT]\", \"[ADDRESS]\");
    Operation response = globalAddressClient.deleteGlobalAddress(address);
  }

  Note: close() needs to be called on the globalAddressClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of GlobalAddressSettings to
  create(). For example:

  To customize credentials:



  GlobalAddressSettings globalAddressSettings =
      GlobalAddressSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  GlobalAddressClient globalAddressClient =
      GlobalAddressClient.create(globalAddressSettings);

  To customize the endpoint:



  GlobalAddressSettings globalAddressSettings =
      GlobalAddressSettings.newBuilder().setEndpoint(myEndpoint).build();
  GlobalAddressClient globalAddressClient =
      GlobalAddressClient.create(globalAddressSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalAddressClient]))

(defn *create
  "Constructs an instance of GlobalAddressClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.GlobalAddressSettings`

  returns: `com.google.cloud.compute.v1.GlobalAddressClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.GlobalAddressClient [^com.google.cloud.compute.v1.GlobalAddressSettings settings]
    (GlobalAddressClient/create settings))
  (^com.google.cloud.compute.v1.GlobalAddressClient []
    (GlobalAddressClient/create )))

(defn list-global-addresses-callable
  "Retrieves a list of global addresses.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListGlobalAddressesHttpRequest request = ListGlobalAddressesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       AddressList response = globalAddressClient.listGlobalAddressesCallable().call(request);
       for (Address element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.AddressList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressClient this]
    (-> this (.listGlobalAddressesCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.GlobalAddressSettings`"
  (^com.google.cloud.compute.v1.GlobalAddressSettings [^GlobalAddressClient this]
    (-> this (.getSettings))))

(defn delete-global-address-callable
  "Deletes the specified address resource.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     String formattedAddress = ProjectGlobalAddressName.format(\"[PROJECT]\", \"[ADDRESS]\");
     DeleteGlobalAddressHttpRequest request = DeleteGlobalAddressHttpRequest.newBuilder()
       .setAddress(formattedAddress)
       .build();
     ApiFuture<Operation> future = globalAddressClient.deleteGlobalAddressCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressClient this]
    (-> this (.deleteGlobalAddressCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.GlobalAddressStub`"
  ([^GlobalAddressClient this]
    (-> this (.getStub))))

(defn get-global-address-callable
  "Returns the specified address resource. Gets a list of available addresses by making a list()
   request.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     String formattedAddress = ProjectGlobalAddressName.format(\"[PROJECT]\", \"[ADDRESS]\");
     GetGlobalAddressHttpRequest request = GetGlobalAddressHttpRequest.newBuilder()
       .setAddress(formattedAddress)
       .build();
     ApiFuture<Address> future = globalAddressClient.getGlobalAddressCallable().futureCall(request);
     // Do something
     Address response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressClient this]
    (-> this (.getGlobalAddressCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GlobalAddressClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GlobalAddressClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-global-addresses
  "Retrieves a list of global addresses.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Address element : globalAddressClient.listGlobalAddresses(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.GlobalAddressClient$ListGlobalAddressesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.GlobalAddressClient$ListGlobalAddressesPagedResponse [^GlobalAddressClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listGlobalAddresses project))))

(defn shutdown
  ""
  ([^GlobalAddressClient this]
    (-> this (.shutdown))))

(defn delete-global-address
  "Deletes the specified address resource.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     ProjectGlobalAddressName address = ProjectGlobalAddressName.of(\"[PROJECT]\", \"[ADDRESS]\");
     Operation response = globalAddressClient.deleteGlobalAddress(address);
   }

  address - Name of the address resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalAddressName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^GlobalAddressClient this ^com.google.cloud.compute.v1.ProjectGlobalAddressName address]
    (-> this (.deleteGlobalAddress address))))

(defn insert-global-address-callable
  "Creates an address resource in the specified project using the data included in the request.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     Address addressResource = Address.newBuilder().build();
     InsertGlobalAddressHttpRequest request = InsertGlobalAddressHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setAddressResource(addressResource)
       .build();
     ApiFuture<Operation> future = globalAddressClient.insertGlobalAddressCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressClient this]
    (-> this (.insertGlobalAddressCallable))))

(defn close
  ""
  ([^GlobalAddressClient this]
    (-> this (.close))))

(defn insert-global-address
  "Creates an address resource in the specified project using the data included in the request.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Address addressResource = Address.newBuilder().build();
     Operation response = globalAddressClient.insertGlobalAddress(project, addressResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  address-resource - A reserved address resource. (== resource_for beta.addresses ==) (== resource_for v1.addresses ==) (== resource_for beta.globalAddresses ==) (== resource_for v1.globalAddresses ==) - `com.google.cloud.compute.v1.Address`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^GlobalAddressClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.Address address-resource]
    (-> this (.insertGlobalAddress project address-resource)))
  (^com.google.cloud.compute.v1.Operation [^GlobalAddressClient this ^com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest request]
    (-> this (.insertGlobalAddress request))))

(defn list-global-addresses-paged-callable
  "Retrieves a list of global addresses.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListGlobalAddressesHttpRequest request = ListGlobalAddressesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListGlobalAddressesPagedResponse> future = globalAddressClient.listGlobalAddressesPagedCallable().futureCall(request);
     // Do something
     for (Address element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.GlobalAddressClient$ListGlobalAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressClient this]
    (-> this (.listGlobalAddressesPagedCallable))))

(defn get-global-address
  "Returns the specified address resource. Gets a list of available addresses by making a list()
   request.

   Sample code:



   try (GlobalAddressClient globalAddressClient = GlobalAddressClient.create()) {
     ProjectGlobalAddressName address = ProjectGlobalAddressName.of(\"[PROJECT]\", \"[ADDRESS]\");
     Address response = globalAddressClient.getGlobalAddress(address);
   }

  address - Name of the address resource to return. - `com.google.cloud.compute.v1.ProjectGlobalAddressName`

  returns: `com.google.cloud.compute.v1.Address`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Address [^GlobalAddressClient this ^com.google.cloud.compute.v1.ProjectGlobalAddressName address]
    (-> this (.getGlobalAddress address))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GlobalAddressClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GlobalAddressClient this]
    (-> this (.shutdownNow))))

