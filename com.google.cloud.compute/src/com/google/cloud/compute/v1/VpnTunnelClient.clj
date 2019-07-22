(ns com.google.cloud.compute.v1.VpnTunnelClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
    ProjectRegionVpnTunnelName vpnTunnel = ProjectRegionVpnTunnelName.of(\"[PROJECT]\", \"[REGION]\", \"[VPN_TUNNEL]\");
    Operation response = vpnTunnelClient.deleteVpnTunnel(vpnTunnel);
  }

  Note: close() needs to be called on the vpnTunnelClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of VpnTunnelSettings to create().
  For example:

  To customize credentials:



  VpnTunnelSettings vpnTunnelSettings =
      VpnTunnelSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  VpnTunnelClient vpnTunnelClient =
      VpnTunnelClient.create(vpnTunnelSettings);

  To customize the endpoint:



  VpnTunnelSettings vpnTunnelSettings =
      VpnTunnelSettings.newBuilder().setEndpoint(myEndpoint).build();
  VpnTunnelClient vpnTunnelClient =
      VpnTunnelClient.create(vpnTunnelSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VpnTunnelClient]))

(defn *create
  "Constructs an instance of VpnTunnelClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.VpnTunnelSettings`

  returns: `com.google.cloud.compute.v1.VpnTunnelClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.VpnTunnelClient [^com.google.cloud.compute.v1.VpnTunnelSettings settings]
    (VpnTunnelClient/create settings))
  (^com.google.cloud.compute.v1.VpnTunnelClient []
    (VpnTunnelClient/create )))

(defn list-vpn-tunnels-paged-callable
  "Retrieves a list of VpnTunnel resources contained in the specified project and region.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListVpnTunnelsHttpRequest request = ListVpnTunnelsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListVpnTunnelsPagedResponse> future = vpnTunnelClient.listVpnTunnelsPagedCallable().futureCall(request);
     // Do something
     for (VpnTunnel element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelClient$ListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelClient this]
    (-> this (.listVpnTunnelsPagedCallable))))

(defn list-vpn-tunnels-callable
  "Retrieves a list of VpnTunnel resources contained in the specified project and region.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListVpnTunnelsHttpRequest request = ListVpnTunnelsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       VpnTunnelList response = vpnTunnelClient.listVpnTunnelsCallable().call(request);
       for (VpnTunnel element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelClient this]
    (-> this (.listVpnTunnelsCallable))))

(defn insert-vpn-tunnel-callable
  "Creates a VpnTunnel resource in the specified project and region using the data included in the
   request.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     VpnTunnel vpnTunnelResource = VpnTunnel.newBuilder().build();
     InsertVpnTunnelHttpRequest request = InsertVpnTunnelHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setVpnTunnelResource(vpnTunnelResource)
       .build();
     ApiFuture<Operation> future = vpnTunnelClient.insertVpnTunnelCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelClient this]
    (-> this (.insertVpnTunnelCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.VpnTunnelSettings`"
  (^com.google.cloud.compute.v1.VpnTunnelSettings [^VpnTunnelClient this]
    (-> this (.getSettings))))

(defn aggregated-list-vpn-tunnels
  "Retrieves an aggregated list of VPN tunnels.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (VpnTunnelsScopedList element : vpnTunnelClient.aggregatedListVpnTunnels(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse [^VpnTunnelClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListVpnTunnels project))))

(defn aggregated-list-vpn-tunnels-paged-callable
  "Retrieves an aggregated list of VPN tunnels.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListVpnTunnelsHttpRequest request = AggregatedListVpnTunnelsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListVpnTunnelsPagedResponse> future = vpnTunnelClient.aggregatedListVpnTunnelsPagedCallable().futureCall(request);
     // Do something
     for (VpnTunnelsScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelClient this]
    (-> this (.aggregatedListVpnTunnelsPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.VpnTunnelStub`"
  ([^VpnTunnelClient this]
    (-> this (.getStub))))

(defn get-vpn-tunnel-callable
  "Returns the specified VpnTunnel resource. Gets a list of available VPN tunnels by making a
   list() request.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     String formattedVpnTunnel = ProjectRegionVpnTunnelName.format(\"[PROJECT]\", \"[REGION]\", \"[VPN_TUNNEL]\");
     GetVpnTunnelHttpRequest request = GetVpnTunnelHttpRequest.newBuilder()
       .setVpnTunnel(formattedVpnTunnel)
       .build();
     ApiFuture<VpnTunnel> future = vpnTunnelClient.getVpnTunnelCallable().futureCall(request);
     // Do something
     VpnTunnel response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetVpnTunnelHttpRequest,com.google.cloud.compute.v1.VpnTunnel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelClient this]
    (-> this (.getVpnTunnelCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^VpnTunnelClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^VpnTunnelClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^VpnTunnelClient this]
    (-> this (.shutdown))))

(defn delete-vpn-tunnel
  "Deletes the specified VpnTunnel resource.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     ProjectRegionVpnTunnelName vpnTunnel = ProjectRegionVpnTunnelName.of(\"[PROJECT]\", \"[REGION]\", \"[VPN_TUNNEL]\");
     Operation response = vpnTunnelClient.deleteVpnTunnel(vpnTunnel);
   }

  vpn-tunnel - Name of the VpnTunnel resource to delete. - `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^VpnTunnelClient this ^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName vpn-tunnel]
    (-> this (.deleteVpnTunnel vpn-tunnel))))

(defn aggregated-list-vpn-tunnels-callable
  "Retrieves an aggregated list of VPN tunnels.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListVpnTunnelsHttpRequest request = AggregatedListVpnTunnelsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       VpnTunnelAggregatedList response = vpnTunnelClient.aggregatedListVpnTunnelsCallable().call(request);
       for (VpnTunnelsScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelClient this]
    (-> this (.aggregatedListVpnTunnelsCallable))))

(defn delete-vpn-tunnel-callable
  "Deletes the specified VpnTunnel resource.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     String formattedVpnTunnel = ProjectRegionVpnTunnelName.format(\"[PROJECT]\", \"[REGION]\", \"[VPN_TUNNEL]\");
     DeleteVpnTunnelHttpRequest request = DeleteVpnTunnelHttpRequest.newBuilder()
       .setVpnTunnel(formattedVpnTunnel)
       .build();
     ApiFuture<Operation> future = vpnTunnelClient.deleteVpnTunnelCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^VpnTunnelClient this]
    (-> this (.deleteVpnTunnelCallable))))

(defn close
  ""
  ([^VpnTunnelClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^VpnTunnelClient this]
    (-> this (.isTerminated))))

(defn list-vpn-tunnels
  "Retrieves a list of VpnTunnel resources contained in the specified project and region.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (VpnTunnel element : vpnTunnelClient.listVpnTunnels(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.VpnTunnelClient$ListVpnTunnelsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.VpnTunnelClient$ListVpnTunnelsPagedResponse [^VpnTunnelClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listVpnTunnels region))))

(defn shutdown-now
  ""
  ([^VpnTunnelClient this]
    (-> this (.shutdownNow))))

(defn insert-vpn-tunnel
  "Creates a VpnTunnel resource in the specified project and region using the data included in the
   request.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     VpnTunnel vpnTunnelResource = VpnTunnel.newBuilder().build();
     Operation response = vpnTunnelClient.insertVpnTunnel(region, vpnTunnelResource);
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  vpn-tunnel-resource - VPN tunnel resource. (== resource_for beta.vpnTunnels ==) (== resource_for v1.vpnTunnels ==) - `com.google.cloud.compute.v1.VpnTunnel`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^VpnTunnelClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.VpnTunnel vpn-tunnel-resource]
    (-> this (.insertVpnTunnel region vpn-tunnel-resource)))
  (^com.google.cloud.compute.v1.Operation [^VpnTunnelClient this ^com.google.cloud.compute.v1.InsertVpnTunnelHttpRequest request]
    (-> this (.insertVpnTunnel request))))

(defn get-vpn-tunnel
  "Returns the specified VpnTunnel resource. Gets a list of available VPN tunnels by making a
   list() request.

   Sample code:



   try (VpnTunnelClient vpnTunnelClient = VpnTunnelClient.create()) {
     ProjectRegionVpnTunnelName vpnTunnel = ProjectRegionVpnTunnelName.of(\"[PROJECT]\", \"[REGION]\", \"[VPN_TUNNEL]\");
     VpnTunnel response = vpnTunnelClient.getVpnTunnel(vpnTunnel);
   }

  vpn-tunnel - Name of the VpnTunnel resource to return. - `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName`

  returns: `com.google.cloud.compute.v1.VpnTunnel`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.VpnTunnel [^VpnTunnelClient this ^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName vpn-tunnel]
    (-> this (.getVpnTunnel vpn-tunnel))))

