(ns com.google.cloud.compute.v1.TargetVpnGatewayClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
    ProjectRegionTargetVpnGatewayName targetVpnGateway = ProjectRegionTargetVpnGatewayName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_VPN_GATEWAY]\");
    Operation response = targetVpnGatewayClient.deleteTargetVpnGateway(targetVpnGateway);
  }

  Note: close() needs to be called on the targetVpnGatewayClient object to clean up resources
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

  This class can be customized by passing in a custom instance of TargetVpnGatewaySettings to
  create(). For example:

  To customize credentials:



  TargetVpnGatewaySettings targetVpnGatewaySettings =
      TargetVpnGatewaySettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TargetVpnGatewayClient targetVpnGatewayClient =
      TargetVpnGatewayClient.create(targetVpnGatewaySettings);

  To customize the endpoint:



  TargetVpnGatewaySettings targetVpnGatewaySettings =
      TargetVpnGatewaySettings.newBuilder().setEndpoint(myEndpoint).build();
  TargetVpnGatewayClient targetVpnGatewayClient =
      TargetVpnGatewayClient.create(targetVpnGatewaySettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetVpnGatewayClient]))

(defn *create
  "Constructs an instance of TargetVpnGatewayClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.TargetVpnGatewaySettings`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetVpnGatewayClient [^com.google.cloud.compute.v1.TargetVpnGatewaySettings settings]
    (TargetVpnGatewayClient/create settings))
  (^com.google.cloud.compute.v1.TargetVpnGatewayClient []
    (TargetVpnGatewayClient/create )))

(defn aggregated-list-target-vpn-gateways
  "Retrieves an aggregated list of target VPN gateways.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (TargetVpnGatewaysScopedList element : targetVpnGatewayClient.aggregatedListTargetVpnGateways(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse [^TargetVpnGatewayClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListTargetVpnGateways project))))

(defn list-target-vpn-gateways-callable
  "Retrieves a list of target VPN gateways available to the specified project and region.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListTargetVpnGatewaysHttpRequest request = ListTargetVpnGatewaysHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       TargetVpnGatewayList response = targetVpnGatewayClient.listTargetVpnGatewaysCallable().call(request);
       for (TargetVpnGateway element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayClient this]
    (-> this (.listTargetVpnGatewaysCallable))))

(defn get-target-vpn-gateway-callable
  "Returns the specified target VPN gateway. Gets a list of available target VPN gateways by
   making a list() request.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     String formattedTargetVpnGateway = ProjectRegionTargetVpnGatewayName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_VPN_GATEWAY]\");
     GetTargetVpnGatewayHttpRequest request = GetTargetVpnGatewayHttpRequest.newBuilder()
       .setTargetVpnGateway(formattedTargetVpnGateway)
       .build();
     ApiFuture<TargetVpnGateway> future = targetVpnGatewayClient.getTargetVpnGatewayCallable().futureCall(request);
     // Do something
     TargetVpnGateway response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayClient this]
    (-> this (.getTargetVpnGatewayCallable))))

(defn aggregated-list-target-vpn-gateways-paged-callable
  "Retrieves an aggregated list of target VPN gateways.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListTargetVpnGatewaysHttpRequest request = AggregatedListTargetVpnGatewaysHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListTargetVpnGatewaysPagedResponse> future = targetVpnGatewayClient.aggregatedListTargetVpnGatewaysPagedCallable().futureCall(request);
     // Do something
     for (TargetVpnGatewaysScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayClient this]
    (-> this (.aggregatedListTargetVpnGatewaysPagedCallable))))

(defn list-target-vpn-gateways
  "Retrieves a list of target VPN gateways available to the specified project and region.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (TargetVpnGateway element : targetVpnGatewayClient.listTargetVpnGateways(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse [^TargetVpnGatewayClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listTargetVpnGateways region))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.TargetVpnGatewaySettings`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaySettings [^TargetVpnGatewayClient this]
    (-> this (.getSettings))))

(defn get-target-vpn-gateway
  "Returns the specified target VPN gateway. Gets a list of available target VPN gateways by
   making a list() request.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     ProjectRegionTargetVpnGatewayName targetVpnGateway = ProjectRegionTargetVpnGatewayName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_VPN_GATEWAY]\");
     TargetVpnGateway response = targetVpnGatewayClient.getTargetVpnGateway(targetVpnGateway);
   }

  target-vpn-gateway - Name of the target VPN gateway to return. - `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TargetVpnGateway [^TargetVpnGatewayClient this ^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName target-vpn-gateway]
    (-> this (.getTargetVpnGateway target-vpn-gateway))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetVpnGatewayStub`"
  ([^TargetVpnGatewayClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TargetVpnGatewayClient this]
    (-> this (.isShutdown))))

(defn insert-target-vpn-gateway-callable
  "Creates a target VPN gateway in the specified project and region using the data included in the
   request.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     TargetVpnGateway targetVpnGatewayResource = TargetVpnGateway.newBuilder().build();
     InsertTargetVpnGatewayHttpRequest request = InsertTargetVpnGatewayHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setTargetVpnGatewayResource(targetVpnGatewayResource)
       .build();
     ApiFuture<Operation> future = targetVpnGatewayClient.insertTargetVpnGatewayCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayClient this]
    (-> this (.insertTargetVpnGatewayCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TargetVpnGatewayClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^TargetVpnGatewayClient this]
    (-> this (.shutdown))))

(defn delete-target-vpn-gateway
  "Deletes the specified target VPN gateway.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     ProjectRegionTargetVpnGatewayName targetVpnGateway = ProjectRegionTargetVpnGatewayName.of(\"[PROJECT]\", \"[REGION]\", \"[TARGET_VPN_GATEWAY]\");
     Operation response = targetVpnGatewayClient.deleteTargetVpnGateway(targetVpnGateway);
   }

  target-vpn-gateway - Name of the target VPN gateway to delete. - `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetVpnGatewayClient this ^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName target-vpn-gateway]
    (-> this (.deleteTargetVpnGateway target-vpn-gateway))))

(defn close
  ""
  ([^TargetVpnGatewayClient this]
    (-> this (.close))))

(defn insert-target-vpn-gateway
  "Creates a target VPN gateway in the specified project and region using the data included in the
   request.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     TargetVpnGateway targetVpnGatewayResource = TargetVpnGateway.newBuilder().build();
     Operation response = targetVpnGatewayClient.insertTargetVpnGateway(region, targetVpnGatewayResource);
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  target-vpn-gateway-resource - Represents a Target VPN gateway resource. (== resource_for beta.targetVpnGateways ==) (== resource_for v1.targetVpnGateways ==) - `com.google.cloud.compute.v1.TargetVpnGateway`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^TargetVpnGatewayClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.TargetVpnGateway target-vpn-gateway-resource]
    (-> this (.insertTargetVpnGateway region target-vpn-gateway-resource)))
  (^com.google.cloud.compute.v1.Operation [^TargetVpnGatewayClient this ^com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest request]
    (-> this (.insertTargetVpnGateway request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TargetVpnGatewayClient this]
    (-> this (.isTerminated))))

(defn aggregated-list-target-vpn-gateways-callable
  "Retrieves an aggregated list of target VPN gateways.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListTargetVpnGatewaysHttpRequest request = AggregatedListTargetVpnGatewaysHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       TargetVpnGatewayAggregatedList response = targetVpnGatewayClient.aggregatedListTargetVpnGatewaysCallable().call(request);
       for (TargetVpnGatewaysScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayClient this]
    (-> this (.aggregatedListTargetVpnGatewaysCallable))))

(defn list-target-vpn-gateways-paged-callable
  "Retrieves a list of target VPN gateways available to the specified project and region.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListTargetVpnGatewaysHttpRequest request = ListTargetVpnGatewaysHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListTargetVpnGatewaysPagedResponse> future = targetVpnGatewayClient.listTargetVpnGatewaysPagedCallable().futureCall(request);
     // Do something
     for (TargetVpnGateway element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayClient this]
    (-> this (.listTargetVpnGatewaysPagedCallable))))

(defn delete-target-vpn-gateway-callable
  "Deletes the specified target VPN gateway.

   Sample code:



   try (TargetVpnGatewayClient targetVpnGatewayClient = TargetVpnGatewayClient.create()) {
     String formattedTargetVpnGateway = ProjectRegionTargetVpnGatewayName.format(\"[PROJECT]\", \"[REGION]\", \"[TARGET_VPN_GATEWAY]\");
     DeleteTargetVpnGatewayHttpRequest request = DeleteTargetVpnGatewayHttpRequest.newBuilder()
       .setTargetVpnGateway(formattedTargetVpnGateway)
       .build();
     ApiFuture<Operation> future = targetVpnGatewayClient.deleteTargetVpnGatewayCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayClient this]
    (-> this (.deleteTargetVpnGatewayCallable))))

(defn shutdown-now
  ""
  ([^TargetVpnGatewayClient this]
    (-> this (.shutdownNow))))

