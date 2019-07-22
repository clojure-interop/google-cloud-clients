(ns com.google.cloud.compute.v1.NetworkEndpointGroupClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
    ProjectZoneNetworkEndpointGroupName networkEndpointGroup = ProjectZoneNetworkEndpointGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
    NetworkEndpointGroupsAttachEndpointsRequest networkEndpointGroupsAttachEndpointsRequestResource = NetworkEndpointGroupsAttachEndpointsRequest.newBuilder().build();
    Operation response = networkEndpointGroupClient.attachNetworkEndpointsNetworkEndpointGroup(networkEndpointGroup, networkEndpointGroupsAttachEndpointsRequestResource);
  }

  Note: close() needs to be called on the networkEndpointGroupClient object to clean up
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

  This class can be customized by passing in a custom instance of NetworkEndpointGroupSettings
  to create(). For example:

  To customize credentials:



  NetworkEndpointGroupSettings networkEndpointGroupSettings =
      NetworkEndpointGroupSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  NetworkEndpointGroupClient networkEndpointGroupClient =
      NetworkEndpointGroupClient.create(networkEndpointGroupSettings);

  To customize the endpoint:



  NetworkEndpointGroupSettings networkEndpointGroupSettings =
      NetworkEndpointGroupSettings.newBuilder().setEndpoint(myEndpoint).build();
  NetworkEndpointGroupClient networkEndpointGroupClient =
      NetworkEndpointGroupClient.create(networkEndpointGroupSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupClient]))

(defn *create
  "Constructs an instance of NetworkEndpointGroupClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.NetworkEndpointGroupSettings`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupClient [^com.google.cloud.compute.v1.NetworkEndpointGroupSettings settings]
    (NetworkEndpointGroupClient/create settings))
  (^com.google.cloud.compute.v1.NetworkEndpointGroupClient []
    (NetworkEndpointGroupClient/create )))

(defn list-network-endpoints-network-endpoint-groups
  "Lists the network endpoints in the specified network endpoint group.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectZoneNetworkEndpointGroupName networkEndpointGroup = ProjectZoneNetworkEndpointGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     NetworkEndpointGroupsListEndpointsRequest networkEndpointGroupsListEndpointsRequestResource = NetworkEndpointGroupsListEndpointsRequest.newBuilder().build();
     for (NetworkEndpointWithHealthStatus element : networkEndpointGroupClient.listNetworkEndpointsNetworkEndpointGroups(networkEndpointGroup, networkEndpointGroupsListEndpointsRequestResource).iterateAll()) {
       // doThingsWith(element);
     }
   }

  network-endpoint-group - The name of the network endpoint group from which you want to generate a list of included network endpoints. It should comply with RFC1035. - `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`
  network-endpoint-groups-list-endpoints-request-resource - `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName network-endpoint-group ^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest network-endpoint-groups-list-endpoints-request-resource]
    (-> this (.listNetworkEndpointsNetworkEndpointGroups network-endpoint-group network-endpoint-groups-list-endpoints-request-resource)))
  (^com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest request]
    (-> this (.listNetworkEndpointsNetworkEndpointGroups request))))

(defn aggregated-list-network-endpoint-groups-paged-callable
  "Retrieves the list of network endpoint groups and sorts them by zone.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListNetworkEndpointGroupsHttpRequest request = AggregatedListNetworkEndpointGroupsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListNetworkEndpointGroupsPagedResponse> future = networkEndpointGroupClient.aggregatedListNetworkEndpointGroupsPagedCallable().futureCall(request);
     // Do something
     for (NetworkEndpointGroupsScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$AggregatedListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.aggregatedListNetworkEndpointGroupsPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupSettings`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupSettings [^NetworkEndpointGroupClient this]
    (-> this (.getSettings))))

(defn aggregated-list-network-endpoint-groups-callable
  "Retrieves the list of network endpoint groups and sorts them by zone.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListNetworkEndpointGroupsHttpRequest request = AggregatedListNetworkEndpointGroupsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       NetworkEndpointGroupAggregatedList response = networkEndpointGroupClient.aggregatedListNetworkEndpointGroupsCallable().call(request);
       for (NetworkEndpointGroupsScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.aggregatedListNetworkEndpointGroupsCallable))))

(defn insert-network-endpoint-group-callable
  "Creates a network endpoint group in the specified project using the parameters that are
   included in the request.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     NetworkEndpointGroup networkEndpointGroupResource = NetworkEndpointGroup.newBuilder().build();
     InsertNetworkEndpointGroupHttpRequest request = InsertNetworkEndpointGroupHttpRequest.newBuilder()
       .setZone(formattedZone)
       .setNetworkEndpointGroupResource(networkEndpointGroupResource)
       .build();
     ApiFuture<Operation> future = networkEndpointGroupClient.insertNetworkEndpointGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.insertNetworkEndpointGroupCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.NetworkEndpointGroupStub`"
  ([^NetworkEndpointGroupClient this]
    (-> this (.getStub))))

(defn list-network-endpoints-network-endpoint-groups-callable
  "Lists the network endpoints in the specified network endpoint group.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedNetworkEndpointGroup = ProjectZoneNetworkEndpointGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     NetworkEndpointGroupsListEndpointsRequest networkEndpointGroupsListEndpointsRequestResource = NetworkEndpointGroupsListEndpointsRequest.newBuilder().build();
     ListNetworkEndpointsNetworkEndpointGroupsHttpRequest request = ListNetworkEndpointsNetworkEndpointGroupsHttpRequest.newBuilder()
       .setNetworkEndpointGroup(formattedNetworkEndpointGroup)
       .setNetworkEndpointGroupsListEndpointsRequestResource(networkEndpointGroupsListEndpointsRequestResource)
       .build();
     while (true) {
       NetworkEndpointGroupsListNetworkEndpoints response = networkEndpointGroupClient.listNetworkEndpointsNetworkEndpointGroupsCallable().call(request);
       for (NetworkEndpointWithHealthStatus element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupsListNetworkEndpoints>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsCallable))))

(defn detach-network-endpoints-network-endpoint-group
  "Detach a list of network endpoints from the specified network endpoint group.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectZoneNetworkEndpointGroupName networkEndpointGroup = ProjectZoneNetworkEndpointGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     NetworkEndpointGroupsDetachEndpointsRequest networkEndpointGroupsDetachEndpointsRequestResource = NetworkEndpointGroupsDetachEndpointsRequest.newBuilder().build();
     Operation response = networkEndpointGroupClient.detachNetworkEndpointsNetworkEndpointGroup(networkEndpointGroup, networkEndpointGroupsDetachEndpointsRequestResource);
   }

  network-endpoint-group - The name of the network endpoint group where you are removing network endpoints. It should comply with RFC1035. - `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`
  network-endpoint-groups-detach-endpoints-request-resource - `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName network-endpoint-group ^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest network-endpoint-groups-detach-endpoints-request-resource]
    (-> this (.detachNetworkEndpointsNetworkEndpointGroup network-endpoint-group network-endpoint-groups-detach-endpoints-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.DetachNetworkEndpointsNetworkEndpointGroupHttpRequest request]
    (-> this (.detachNetworkEndpointsNetworkEndpointGroup request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^NetworkEndpointGroupClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^NetworkEndpointGroupClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^NetworkEndpointGroupClient this]
    (-> this (.shutdown))))

(defn list-network-endpoints-network-endpoint-groups-paged-callable
  "Lists the network endpoints in the specified network endpoint group.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedNetworkEndpointGroup = ProjectZoneNetworkEndpointGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     NetworkEndpointGroupsListEndpointsRequest networkEndpointGroupsListEndpointsRequestResource = NetworkEndpointGroupsListEndpointsRequest.newBuilder().build();
     ListNetworkEndpointsNetworkEndpointGroupsHttpRequest request = ListNetworkEndpointsNetworkEndpointGroupsHttpRequest.newBuilder()
       .setNetworkEndpointGroup(formattedNetworkEndpointGroup)
       .setNetworkEndpointGroupsListEndpointsRequestResource(networkEndpointGroupsListEndpointsRequestResource)
       .build();
     ApiFuture<ListNetworkEndpointsNetworkEndpointGroupsPagedResponse> future = networkEndpointGroupClient.listNetworkEndpointsNetworkEndpointGroupsPagedCallable().futureCall(request);
     // Do something
     for (NetworkEndpointWithHealthStatus element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointsNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointsNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.listNetworkEndpointsNetworkEndpointGroupsPagedCallable))))

(defn test-iam-permissions-network-endpoint-group-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedResource = ProjectZoneNetworkEndpointGroupResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsNetworkEndpointGroupHttpRequest request = TestIamPermissionsNetworkEndpointGroupHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = networkEndpointGroupClient.testIamPermissionsNetworkEndpointGroupCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.testIamPermissionsNetworkEndpointGroupCallable))))

(defn list-network-endpoint-groups
  "Retrieves the list of network endpoint groups that are located in the specified project and
   zone.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (NetworkEndpointGroup element : networkEndpointGroupClient.listNetworkEndpointGroups(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone where the network endpoint group is located. It should comply with RFC1035. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listNetworkEndpointGroups zone))))

(defn get-network-endpoint-group-callable
  "Returns the specified network endpoint group. Gets a list of available network endpoint groups
   by making a list() request.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedNetworkEndpointGroup = ProjectZoneNetworkEndpointGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     GetNetworkEndpointGroupHttpRequest request = GetNetworkEndpointGroupHttpRequest.newBuilder()
       .setNetworkEndpointGroup(formattedNetworkEndpointGroup)
       .build();
     ApiFuture<NetworkEndpointGroup> future = networkEndpointGroupClient.getNetworkEndpointGroupCallable().futureCall(request);
     // Do something
     NetworkEndpointGroup response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.getNetworkEndpointGroupCallable))))

(defn get-network-endpoint-group
  "Returns the specified network endpoint group. Gets a list of available network endpoint groups
   by making a list() request.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectZoneNetworkEndpointGroupName networkEndpointGroup = ProjectZoneNetworkEndpointGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     NetworkEndpointGroup response = networkEndpointGroupClient.getNetworkEndpointGroup(networkEndpointGroup);
   }

  network-endpoint-group - The name of the network endpoint group. It should comply with RFC1035. - `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroup`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NetworkEndpointGroup [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName network-endpoint-group]
    (-> this (.getNetworkEndpointGroup network-endpoint-group))))

(defn delete-network-endpoint-group
  "Deletes the specified network endpoint group. The network endpoints in the NEG and the VM
   instances they belong to are not terminated when the NEG is deleted. Note that the NEG cannot
   be deleted if there are backend services referencing it.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectZoneNetworkEndpointGroupName networkEndpointGroup = ProjectZoneNetworkEndpointGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     Operation response = networkEndpointGroupClient.deleteNetworkEndpointGroup(networkEndpointGroup);
   }

  network-endpoint-group - The name of the network endpoint group to delete. It should comply with RFC1035. - `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName network-endpoint-group]
    (-> this (.deleteNetworkEndpointGroup network-endpoint-group))))

(defn close
  ""
  ([^NetworkEndpointGroupClient this]
    (-> this (.close))))

(defn list-network-endpoint-groups-callable
  "Retrieves the list of network endpoint groups that are located in the specified project and
   zone.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListNetworkEndpointGroupsHttpRequest request = ListNetworkEndpointGroupsHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       NetworkEndpointGroupList response = networkEndpointGroupClient.listNetworkEndpointGroupsCallable().call(request);
       for (NetworkEndpointGroup element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.listNetworkEndpointGroupsCallable))))

(defn detach-network-endpoints-network-endpoint-group-callable
  "Detach a list of network endpoints from the specified network endpoint group.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedNetworkEndpointGroup = ProjectZoneNetworkEndpointGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     NetworkEndpointGroupsDetachEndpointsRequest networkEndpointGroupsDetachEndpointsRequestResource = NetworkEndpointGroupsDetachEndpointsRequest.newBuilder().build();
     DetachNetworkEndpointsNetworkEndpointGroupHttpRequest request = DetachNetworkEndpointsNetworkEndpointGroupHttpRequest.newBuilder()
       .setNetworkEndpointGroup(formattedNetworkEndpointGroup)
       .setNetworkEndpointGroupsDetachEndpointsRequestResource(networkEndpointGroupsDetachEndpointsRequestResource)
       .build();
     ApiFuture<Operation> future = networkEndpointGroupClient.detachNetworkEndpointsNetworkEndpointGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DetachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.detachNetworkEndpointsNetworkEndpointGroupCallable))))

(defn attach-network-endpoints-network-endpoint-group
  "Attach a list of network endpoints to the specified network endpoint group.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectZoneNetworkEndpointGroupName networkEndpointGroup = ProjectZoneNetworkEndpointGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     NetworkEndpointGroupsAttachEndpointsRequest networkEndpointGroupsAttachEndpointsRequestResource = NetworkEndpointGroupsAttachEndpointsRequest.newBuilder().build();
     Operation response = networkEndpointGroupClient.attachNetworkEndpointsNetworkEndpointGroup(networkEndpointGroup, networkEndpointGroupsAttachEndpointsRequestResource);
   }

  network-endpoint-group - The name of the network endpoint group where you are attaching network endpoints to. It should comply with RFC1035. - `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`
  network-endpoint-groups-attach-endpoints-request-resource - `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName network-endpoint-group ^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest network-endpoint-groups-attach-endpoints-request-resource]
    (-> this (.attachNetworkEndpointsNetworkEndpointGroup network-endpoint-group network-endpoint-groups-attach-endpoints-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.AttachNetworkEndpointsNetworkEndpointGroupHttpRequest request]
    (-> this (.attachNetworkEndpointsNetworkEndpointGroup request))))

(defn list-network-endpoint-groups-paged-callable
  "Retrieves the list of network endpoint groups that are located in the specified project and
   zone.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListNetworkEndpointGroupsHttpRequest request = ListNetworkEndpointGroupsHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListNetworkEndpointGroupsPagedResponse> future = networkEndpointGroupClient.listNetworkEndpointGroupsPagedCallable().futureCall(request);
     // Do something
     for (NetworkEndpointGroup element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworkEndpointGroupsHttpRequest,com.google.cloud.compute.v1.NetworkEndpointGroupClient$ListNetworkEndpointGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.listNetworkEndpointGroupsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^NetworkEndpointGroupClient this]
    (-> this (.isTerminated))))

(defn delete-network-endpoint-group-callable
  "Deletes the specified network endpoint group. The network endpoints in the NEG and the VM
   instances they belong to are not terminated when the NEG is deleted. Note that the NEG cannot
   be deleted if there are backend services referencing it.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedNetworkEndpointGroup = ProjectZoneNetworkEndpointGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     DeleteNetworkEndpointGroupHttpRequest request = DeleteNetworkEndpointGroupHttpRequest.newBuilder()
       .setNetworkEndpointGroup(formattedNetworkEndpointGroup)
       .build();
     ApiFuture<Operation> future = networkEndpointGroupClient.deleteNetworkEndpointGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.deleteNetworkEndpointGroupCallable))))

(defn insert-network-endpoint-group
  "Creates a network endpoint group in the specified project using the parameters that are
   included in the request.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     NetworkEndpointGroup networkEndpointGroupResource = NetworkEndpointGroup.newBuilder().build();
     Operation response = networkEndpointGroupClient.insertNetworkEndpointGroup(zone, networkEndpointGroupResource);
   }

  zone - The name of the zone where you want to create the network endpoint group. It should comply with RFC1035. - `com.google.cloud.compute.v1.ProjectZoneName`
  network-endpoint-group-resource - Represents a collection of network endpoints. - `com.google.cloud.compute.v1.NetworkEndpointGroup`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.NetworkEndpointGroup network-endpoint-group-resource]
    (-> this (.insertNetworkEndpointGroup zone network-endpoint-group-resource)))
  (^com.google.cloud.compute.v1.Operation [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.InsertNetworkEndpointGroupHttpRequest request]
    (-> this (.insertNetworkEndpointGroup request))))

(defn attach-network-endpoints-network-endpoint-group-callable
  "Attach a list of network endpoints to the specified network endpoint group.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     String formattedNetworkEndpointGroup = ProjectZoneNetworkEndpointGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NETWORK_ENDPOINT_GROUP]\");
     NetworkEndpointGroupsAttachEndpointsRequest networkEndpointGroupsAttachEndpointsRequestResource = NetworkEndpointGroupsAttachEndpointsRequest.newBuilder().build();
     AttachNetworkEndpointsNetworkEndpointGroupHttpRequest request = AttachNetworkEndpointsNetworkEndpointGroupHttpRequest.newBuilder()
       .setNetworkEndpointGroup(formattedNetworkEndpointGroup)
       .setNetworkEndpointGroupsAttachEndpointsRequestResource(networkEndpointGroupsAttachEndpointsRequestResource)
       .build();
     ApiFuture<Operation> future = networkEndpointGroupClient.attachNetworkEndpointsNetworkEndpointGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AttachNetworkEndpointsNetworkEndpointGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NetworkEndpointGroupClient this]
    (-> this (.attachNetworkEndpointsNetworkEndpointGroupCallable))))

(defn aggregated-list-network-endpoint-groups
  "Retrieves the list of network endpoint groups and sorts them by zone.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (NetworkEndpointGroupsScopedList element : networkEndpointGroupClient.aggregatedListNetworkEndpointGroups(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupClient$AggregatedListNetworkEndpointGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupClient$AggregatedListNetworkEndpointGroupsPagedResponse [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListNetworkEndpointGroups project))))

(defn shutdown-now
  ""
  ([^NetworkEndpointGroupClient this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions-network-endpoint-group
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (NetworkEndpointGroupClient networkEndpointGroupClient = NetworkEndpointGroupClient.create()) {
     ProjectZoneNetworkEndpointGroupResourceName resource = ProjectZoneNetworkEndpointGroupResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = networkEndpointGroupClient.testIamPermissionsNetworkEndpointGroup(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsNetworkEndpointGroup resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^NetworkEndpointGroupClient this ^com.google.cloud.compute.v1.TestIamPermissionsNetworkEndpointGroupHttpRequest request]
    (-> this (.testIamPermissionsNetworkEndpointGroup request))))

