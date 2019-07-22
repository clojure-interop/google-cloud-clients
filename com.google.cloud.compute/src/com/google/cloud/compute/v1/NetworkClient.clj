(ns com.google.cloud.compute.v1.NetworkClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (NetworkClient networkClient = NetworkClient.create()) {
    ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of(\"[PROJECT]\", \"[NETWORK]\");
    NetworksAddPeeringRequest networksAddPeeringRequestResource = NetworksAddPeeringRequest.newBuilder().build();
    Operation response = networkClient.addPeeringNetwork(network, networksAddPeeringRequestResource);
  }

  Note: close() needs to be called on the networkClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of NetworkSettings to create().
  For example:

  To customize credentials:



  NetworkSettings networkSettings =
      NetworkSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  NetworkClient networkClient =
      NetworkClient.create(networkSettings);

  To customize the endpoint:



  NetworkSettings networkSettings =
      NetworkSettings.newBuilder().setEndpoint(myEndpoint).build();
  NetworkClient networkClient =
      NetworkClient.create(networkSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkClient]))

(defn *create
  "Constructs an instance of NetworkClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.NetworkSettings`

  returns: `com.google.cloud.compute.v1.NetworkClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NetworkClient [^com.google.cloud.compute.v1.NetworkSettings settings]
    (NetworkClient/create settings))
  (^com.google.cloud.compute.v1.NetworkClient []
    (NetworkClient/create )))

(defn list-networks-paged-callable
  "Retrieves the list of networks available to the specified project.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListNetworksHttpRequest request = ListNetworksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListNetworksPagedResponse> future = networkClient.listNetworksPagedCallable().futureCall(request);
     // Do something
     for (Network element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.listNetworksPagedCallable))))

(defn insert-network-callable
  "Creates a network in the specified project using the data included in the request.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     Network networkResource = Network.newBuilder().build();
     InsertNetworkHttpRequest request = InsertNetworkHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setNetworkResource(networkResource)
       .build();
     ApiFuture<Operation> future = networkClient.insertNetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.insertNetworkCallable))))

(defn remove-peering-network-callable
  "Removes a peering from the specified network.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedNetwork = ProjectGlobalNetworkName.format(\"[PROJECT]\", \"[NETWORK]\");
     NetworksRemovePeeringRequest networksRemovePeeringRequestResource = NetworksRemovePeeringRequest.newBuilder().build();
     RemovePeeringNetworkHttpRequest request = RemovePeeringNetworkHttpRequest.newBuilder()
       .setNetwork(formattedNetwork)
       .setNetworksRemovePeeringRequestResource(networksRemovePeeringRequestResource)
       .build();
     ApiFuture<Operation> future = networkClient.removePeeringNetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.removePeeringNetworkCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.NetworkSettings`"
  (^com.google.cloud.compute.v1.NetworkSettings [^NetworkClient this]
    (-> this (.getSettings))))

(defn list-networks
  "Retrieves the list of networks available to the specified project.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Network element : networkClient.listNetworks(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse [^NetworkClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listNetworks project))))

(defn patch-network
  "Patches the specified network with the data included in the request. Only the following fields
   can be modified: routingConfig.routingMode.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of(\"[PROJECT]\", \"[NETWORK]\");
     Network networkResource = Network.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = networkClient.patchNetwork(network, networkResource, fieldMask);
   }

  network - Name of the network to update. - `com.google.cloud.compute.v1.ProjectGlobalNetworkName`
  network-resource - Represents a Network resource. Read Virtual Private Cloud (VPC) Network Overview for more information. (== resource_for v1.networks ==) (== resource_for beta.networks ==) - `com.google.cloud.compute.v1.Network`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.ProjectGlobalNetworkName network ^com.google.cloud.compute.v1.Network network-resource ^java.util.List field-mask]
    (-> this (.patchNetwork network network-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.PatchNetworkHttpRequest request]
    (-> this (.patchNetwork request))))

(defn insert-network
  "Creates a network in the specified project using the data included in the request.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Network networkResource = Network.newBuilder().build();
     Operation response = networkClient.insertNetwork(project, networkResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  network-resource - Represents a Network resource. Read Virtual Private Cloud (VPC) Network Overview for more information. (== resource_for v1.networks ==) (== resource_for beta.networks ==) - `com.google.cloud.compute.v1.Network`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.Network network-resource]
    (-> this (.insertNetwork project network-resource)))
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.InsertNetworkHttpRequest request]
    (-> this (.insertNetwork request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.NetworkStub`"
  ([^NetworkClient this]
    (-> this (.getStub))))

(defn switch-to-custom-mode-network
  "Switches the network mode from auto subnet mode to custom subnet mode.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of(\"[PROJECT]\", \"[NETWORK]\");
     Operation response = networkClient.switchToCustomModeNetwork(network);
   }

  network - Name of the network to be updated. - `com.google.cloud.compute.v1.ProjectGlobalNetworkName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.ProjectGlobalNetworkName network]
    (-> this (.switchToCustomModeNetwork network))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^NetworkClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^NetworkClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^NetworkClient this]
    (-> this (.shutdown))))

(defn patch-network-callable
  "Patches the specified network with the data included in the request. Only the following fields
   can be modified: routingConfig.routingMode.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedNetwork = ProjectGlobalNetworkName.format(\"[PROJECT]\", \"[NETWORK]\");
     Network networkResource = Network.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchNetworkHttpRequest request = PatchNetworkHttpRequest.newBuilder()
       .setNetwork(formattedNetwork)
       .setNetworkResource(networkResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = networkClient.patchNetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.patchNetworkCallable))))

(defn get-network-callable
  "Returns the specified network. Gets a list of available networks by making a list() request.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedNetwork = ProjectGlobalNetworkName.format(\"[PROJECT]\", \"[NETWORK]\");
     GetNetworkHttpRequest request = GetNetworkHttpRequest.newBuilder()
       .setNetwork(formattedNetwork)
       .build();
     ApiFuture<Network> future = networkClient.getNetworkCallable().futureCall(request);
     // Do something
     Network response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNetworkHttpRequest,com.google.cloud.compute.v1.Network>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.getNetworkCallable))))

(defn switch-to-custom-mode-network-callable
  "Switches the network mode from auto subnet mode to custom subnet mode.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedNetwork = ProjectGlobalNetworkName.format(\"[PROJECT]\", \"[NETWORK]\");
     SwitchToCustomModeNetworkHttpRequest request = SwitchToCustomModeNetworkHttpRequest.newBuilder()
       .setNetwork(formattedNetwork)
       .build();
     ApiFuture<Operation> future = networkClient.switchToCustomModeNetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.switchToCustomModeNetworkCallable))))

(defn close
  ""
  ([^NetworkClient this]
    (-> this (.close))))

(defn remove-peering-network
  "Removes a peering from the specified network.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of(\"[PROJECT]\", \"[NETWORK]\");
     NetworksRemovePeeringRequest networksRemovePeeringRequestResource = NetworksRemovePeeringRequest.newBuilder().build();
     Operation response = networkClient.removePeeringNetwork(network, networksRemovePeeringRequestResource);
   }

  network - Name of the network resource to remove peering from. - `com.google.cloud.compute.v1.ProjectGlobalNetworkName`
  networks-remove-peering-request-resource - `com.google.cloud.compute.v1.NetworksRemovePeeringRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.ProjectGlobalNetworkName network ^com.google.cloud.compute.v1.NetworksRemovePeeringRequest networks-remove-peering-request-resource]
    (-> this (.removePeeringNetwork network networks-remove-peering-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest request]
    (-> this (.removePeeringNetwork request))))

(defn get-network
  "Returns the specified network. Gets a list of available networks by making a list() request.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of(\"[PROJECT]\", \"[NETWORK]\");
     Network response = networkClient.getNetwork(network);
   }

  network - Name of the network to return. - `com.google.cloud.compute.v1.ProjectGlobalNetworkName`

  returns: `com.google.cloud.compute.v1.Network`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Network [^NetworkClient this ^com.google.cloud.compute.v1.ProjectGlobalNetworkName network]
    (-> this (.getNetwork network))))

(defn add-peering-network
  "Adds a peering to the specified network.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of(\"[PROJECT]\", \"[NETWORK]\");
     NetworksAddPeeringRequest networksAddPeeringRequestResource = NetworksAddPeeringRequest.newBuilder().build();
     Operation response = networkClient.addPeeringNetwork(network, networksAddPeeringRequestResource);
   }

  network - Name of the network resource to add peering to. - `com.google.cloud.compute.v1.ProjectGlobalNetworkName`
  networks-add-peering-request-resource - `com.google.cloud.compute.v1.NetworksAddPeeringRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.ProjectGlobalNetworkName network ^com.google.cloud.compute.v1.NetworksAddPeeringRequest networks-add-peering-request-resource]
    (-> this (.addPeeringNetwork network networks-add-peering-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest request]
    (-> this (.addPeeringNetwork request))))

(defn delete-network-callable
  "Deletes the specified network.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedNetwork = ProjectGlobalNetworkName.format(\"[PROJECT]\", \"[NETWORK]\");
     DeleteNetworkHttpRequest request = DeleteNetworkHttpRequest.newBuilder()
       .setNetwork(formattedNetwork)
       .build();
     ApiFuture<Operation> future = networkClient.deleteNetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.deleteNetworkCallable))))

(defn add-peering-network-callable
  "Adds a peering to the specified network.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedNetwork = ProjectGlobalNetworkName.format(\"[PROJECT]\", \"[NETWORK]\");
     NetworksAddPeeringRequest networksAddPeeringRequestResource = NetworksAddPeeringRequest.newBuilder().build();
     AddPeeringNetworkHttpRequest request = AddPeeringNetworkHttpRequest.newBuilder()
       .setNetwork(formattedNetwork)
       .setNetworksAddPeeringRequestResource(networksAddPeeringRequestResource)
       .build();
     ApiFuture<Operation> future = networkClient.addPeeringNetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.addPeeringNetworkCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^NetworkClient this]
    (-> this (.isTerminated))))

(defn list-networks-callable
  "Retrieves the list of networks available to the specified project.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListNetworksHttpRequest request = ListNetworksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       NetworkList response = networkClient.listNetworksCallable().call(request);
       for (Network element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkClient this]
    (-> this (.listNetworksCallable))))

(defn shutdown-now
  ""
  ([^NetworkClient this]
    (-> this (.shutdownNow))))

(defn delete-network
  "Deletes the specified network.

   Sample code:



   try (NetworkClient networkClient = NetworkClient.create()) {
     ProjectGlobalNetworkName network = ProjectGlobalNetworkName.of(\"[PROJECT]\", \"[NETWORK]\");
     Operation response = networkClient.deleteNetwork(network);
   }

  network - Name of the network to delete. - `com.google.cloud.compute.v1.ProjectGlobalNetworkName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkClient this ^com.google.cloud.compute.v1.ProjectGlobalNetworkName network]
    (-> this (.deleteNetwork network))))

