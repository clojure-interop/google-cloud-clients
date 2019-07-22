(ns com.google.cloud.compute.v1.AddressClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AddressClient addressClient = AddressClient.create()) {
    ProjectRegionAddressName address = ProjectRegionAddressName.of(\"[PROJECT]\", \"[REGION]\", \"[ADDRESS]\");
    Operation response = addressClient.deleteAddress(address);
  }

  Note: close() needs to be called on the addressClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of AddressSettings to create().
  For example:

  To customize credentials:



  AddressSettings addressSettings =
      AddressSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AddressClient addressClient =
      AddressClient.create(addressSettings);

  To customize the endpoint:



  AddressSettings addressSettings =
      AddressSettings.newBuilder().setEndpoint(myEndpoint).build();
  AddressClient addressClient =
      AddressClient.create(addressSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddressClient]))

(defn *create
  "Constructs an instance of AddressClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.AddressSettings`

  returns: `com.google.cloud.compute.v1.AddressClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.AddressClient [^com.google.cloud.compute.v1.AddressSettings settings]
    (AddressClient/create settings))
  (^com.google.cloud.compute.v1.AddressClient []
    (AddressClient/create )))

(defn aggregated-list-addresses-callable
  "Retrieves an aggregated list of addresses.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListAddressesHttpRequest request = AggregatedListAddressesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       AddressAggregatedList response = addressClient.aggregatedListAddressesCallable().call(request);
       for (AddressesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressClient this]
    (-> this (.aggregatedListAddressesCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.AddressSettings`"
  (^com.google.cloud.compute.v1.AddressSettings [^AddressClient this]
    (-> this (.getSettings))))

(defn list-addresses
  "Retrieves a list of addresses contained within the specified region.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (Address element : addressClient.listAddresses(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse [^AddressClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listAddresses region))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.AddressStub`"
  ([^AddressClient this]
    (-> this (.getStub))))

(defn get-address
  "Returns the specified address resource.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     ProjectRegionAddressName address = ProjectRegionAddressName.of(\"[PROJECT]\", \"[REGION]\", \"[ADDRESS]\");
     Address response = addressClient.getAddress(address);
   }

  address - Name of the address resource to return. - `com.google.cloud.compute.v1.ProjectRegionAddressName`

  returns: `com.google.cloud.compute.v1.Address`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Address [^AddressClient this ^com.google.cloud.compute.v1.ProjectRegionAddressName address]
    (-> this (.getAddress address))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AddressClient this]
    (-> this (.isShutdown))))

(defn list-addresses-paged-callable
  "Retrieves a list of addresses contained within the specified region.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListAddressesHttpRequest request = ListAddressesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListAddressesPagedResponse> future = addressClient.listAddressesPagedCallable().futureCall(request);
     // Do something
     for (Address element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressClient this]
    (-> this (.listAddressesPagedCallable))))

(defn insert-address-callable
  "Creates an address resource in the specified project using the data included in the request.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     Address addressResource = Address.newBuilder().build();
     InsertAddressHttpRequest request = InsertAddressHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setAddressResource(addressResource)
       .build();
     ApiFuture<Operation> future = addressClient.insertAddressCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressClient this]
    (-> this (.insertAddressCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AddressClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^AddressClient this]
    (-> this (.shutdown))))

(defn insert-address
  "Creates an address resource in the specified project using the data included in the request.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Address addressResource = Address.newBuilder().build();
     Operation response = addressClient.insertAddress(region, addressResource);
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  address-resource - A reserved address resource. (== resource_for beta.addresses ==) (== resource_for v1.addresses ==) (== resource_for beta.globalAddresses ==) (== resource_for v1.globalAddresses ==) - `com.google.cloud.compute.v1.Address`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^AddressClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.Address address-resource]
    (-> this (.insertAddress region address-resource)))
  (^com.google.cloud.compute.v1.Operation [^AddressClient this ^com.google.cloud.compute.v1.InsertAddressHttpRequest request]
    (-> this (.insertAddress request))))

(defn delete-address
  "Deletes the specified address resource.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     ProjectRegionAddressName address = ProjectRegionAddressName.of(\"[PROJECT]\", \"[REGION]\", \"[ADDRESS]\");
     Operation response = addressClient.deleteAddress(address);
   }

  address - Name of the address resource to delete. - `com.google.cloud.compute.v1.ProjectRegionAddressName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^AddressClient this ^com.google.cloud.compute.v1.ProjectRegionAddressName address]
    (-> this (.deleteAddress address))))

(defn close
  ""
  ([^AddressClient this]
    (-> this (.close))))

(defn get-address-callable
  "Returns the specified address resource.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     String formattedAddress = ProjectRegionAddressName.format(\"[PROJECT]\", \"[REGION]\", \"[ADDRESS]\");
     GetAddressHttpRequest request = GetAddressHttpRequest.newBuilder()
       .setAddress(formattedAddress)
       .build();
     ApiFuture<Address> future = addressClient.getAddressCallable().futureCall(request);
     // Do something
     Address response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressClient this]
    (-> this (.getAddressCallable))))

(defn delete-address-callable
  "Deletes the specified address resource.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     String formattedAddress = ProjectRegionAddressName.format(\"[PROJECT]\", \"[REGION]\", \"[ADDRESS]\");
     DeleteAddressHttpRequest request = DeleteAddressHttpRequest.newBuilder()
       .setAddress(formattedAddress)
       .build();
     ApiFuture<Operation> future = addressClient.deleteAddressCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressClient this]
    (-> this (.deleteAddressCallable))))

(defn aggregated-list-addresses-paged-callable
  "Retrieves an aggregated list of addresses.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListAddressesHttpRequest request = AggregatedListAddressesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListAddressesPagedResponse> future = addressClient.aggregatedListAddressesPagedCallable().futureCall(request);
     // Do something
     for (AddressesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressClient this]
    (-> this (.aggregatedListAddressesPagedCallable))))

(defn list-addresses-callable
  "Retrieves a list of addresses contained within the specified region.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListAddressesHttpRequest request = ListAddressesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       AddressList response = addressClient.listAddressesCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressClient this]
    (-> this (.listAddressesCallable))))

(defn aggregated-list-addresses
  "Retrieves an aggregated list of addresses.

   Sample code:



   try (AddressClient addressClient = AddressClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (AddressesScopedList element : addressClient.aggregatedListAddresses(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse [^AddressClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListAddresses project))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AddressClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^AddressClient this]
    (-> this (.shutdownNow))))

