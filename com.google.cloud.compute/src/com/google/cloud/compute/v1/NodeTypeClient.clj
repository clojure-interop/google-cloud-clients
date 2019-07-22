(ns com.google.cloud.compute.v1.NodeTypeClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
    ProjectZoneNodeTypeName nodeType = ProjectZoneNodeTypeName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_TYPE]\");
    NodeType response = nodeTypeClient.getNodeType(nodeType);
  }

  Note: close() needs to be called on the nodeTypeClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of NodeTypeSettings to create().
  For example:

  To customize credentials:



  NodeTypeSettings nodeTypeSettings =
      NodeTypeSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  NodeTypeClient nodeTypeClient =
      NodeTypeClient.create(nodeTypeSettings);

  To customize the endpoint:



  NodeTypeSettings nodeTypeSettings =
      NodeTypeSettings.newBuilder().setEndpoint(myEndpoint).build();
  NodeTypeClient nodeTypeClient =
      NodeTypeClient.create(nodeTypeSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTypeClient]))

(defn *create
  "Constructs an instance of NodeTypeClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.NodeTypeSettings`

  returns: `com.google.cloud.compute.v1.NodeTypeClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NodeTypeClient [^com.google.cloud.compute.v1.NodeTypeSettings settings]
    (NodeTypeClient/create settings))
  (^com.google.cloud.compute.v1.NodeTypeClient []
    (NodeTypeClient/create )))

(defn aggregated-list-node-types-callable
  "Retrieves an aggregated list of node types.

   Sample code:



   try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListNodeTypesHttpRequest request = AggregatedListNodeTypesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       NodeTypeAggregatedList response = nodeTypeClient.aggregatedListNodeTypesCallable().call(request);
       for (NodeTypesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeClient this]
    (-> this (.aggregatedListNodeTypesCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.NodeTypeSettings`"
  (^com.google.cloud.compute.v1.NodeTypeSettings [^NodeTypeClient this]
    (-> this (.getSettings))))

(defn list-node-types
  "Retrieves a list of node types available to the specified project.

   Sample code:



   try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (NodeType element : nodeTypeClient.listNodeTypes(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.NodeTypeClient$ListNodeTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeTypeClient$ListNodeTypesPagedResponse [^NodeTypeClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listNodeTypes zone))))

(defn get-node-type
  "Returns the specified node type. Gets a list of available node types by making a list()
   request.

   Sample code:



   try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
     ProjectZoneNodeTypeName nodeType = ProjectZoneNodeTypeName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_TYPE]\");
     NodeType response = nodeTypeClient.getNodeType(nodeType);
   }

  node-type - Name of the node type to return. - `com.google.cloud.compute.v1.ProjectZoneNodeTypeName`

  returns: `com.google.cloud.compute.v1.NodeType`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeType [^NodeTypeClient this ^com.google.cloud.compute.v1.ProjectZoneNodeTypeName node-type]
    (-> this (.getNodeType node-type))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.NodeTypeStub`"
  ([^NodeTypeClient this]
    (-> this (.getStub))))

(defn aggregated-list-node-types-paged-callable
  "Retrieves an aggregated list of node types.

   Sample code:



   try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListNodeTypesHttpRequest request = AggregatedListNodeTypesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListNodeTypesPagedResponse> future = nodeTypeClient.aggregatedListNodeTypesPagedCallable().futureCall(request);
     // Do something
     for (NodeTypesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeClient$AggregatedListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeClient this]
    (-> this (.aggregatedListNodeTypesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^NodeTypeClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^NodeTypeClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^NodeTypeClient this]
    (-> this (.shutdown))))

(defn get-node-type-callable
  "Returns the specified node type. Gets a list of available node types by making a list()
   request.

   Sample code:



   try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
     String formattedNodeType = ProjectZoneNodeTypeName.format(\"[PROJECT]\", \"[ZONE]\", \"[NODE_TYPE]\");
     GetNodeTypeHttpRequest request = GetNodeTypeHttpRequest.newBuilder()
       .setNodeType(formattedNodeType)
       .build();
     ApiFuture<NodeType> future = nodeTypeClient.getNodeTypeCallable().futureCall(request);
     // Do something
     NodeType response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeTypeHttpRequest,com.google.cloud.compute.v1.NodeType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeClient this]
    (-> this (.getNodeTypeCallable))))

(defn close
  ""
  ([^NodeTypeClient this]
    (-> this (.close))))

(defn list-node-types-paged-callable
  "Retrieves a list of node types available to the specified project.

   Sample code:



   try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListNodeTypesHttpRequest request = ListNodeTypesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListNodeTypesPagedResponse> future = nodeTypeClient.listNodeTypesPagedCallable().futureCall(request);
     // Do something
     for (NodeType element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeClient$ListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeClient this]
    (-> this (.listNodeTypesPagedCallable))))

(defn aggregated-list-node-types
  "Retrieves an aggregated list of node types.

   Sample code:



   try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (NodeTypesScopedList element : nodeTypeClient.aggregatedListNodeTypes(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.NodeTypeClient$AggregatedListNodeTypesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeTypeClient$AggregatedListNodeTypesPagedResponse [^NodeTypeClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListNodeTypes project))))

(defn list-node-types-callable
  "Retrieves a list of node types available to the specified project.

   Sample code:



   try (NodeTypeClient nodeTypeClient = NodeTypeClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListNodeTypesHttpRequest request = ListNodeTypesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       NodeTypeList response = nodeTypeClient.listNodeTypesCallable().call(request);
       for (NodeType element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeClient this]
    (-> this (.listNodeTypesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^NodeTypeClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^NodeTypeClient this]
    (-> this (.shutdownNow))))

