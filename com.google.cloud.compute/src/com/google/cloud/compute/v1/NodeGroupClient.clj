(ns com.google.cloud.compute.v1.NodeGroupClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
    ProjectZoneNodeGroupName nodeGroup = ProjectZoneNodeGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
    NodeGroupsAddNodesRequest nodeGroupsAddNodesRequestResource = NodeGroupsAddNodesRequest.newBuilder().build();
    Operation response = nodeGroupClient.addNodesNodeGroup(nodeGroup, nodeGroupsAddNodesRequestResource);
  }

  Note: close() needs to be called on the nodeGroupClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of NodeGroupSettings to create().
  For example:

  To customize credentials:



  NodeGroupSettings nodeGroupSettings =
      NodeGroupSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  NodeGroupClient nodeGroupClient =
      NodeGroupClient.create(nodeGroupSettings);

  To customize the endpoint:



  NodeGroupSettings nodeGroupSettings =
      NodeGroupSettings.newBuilder().setEndpoint(myEndpoint).build();
  NodeGroupClient nodeGroupClient =
      NodeGroupClient.create(nodeGroupSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupClient]))

(defn *create
  "Constructs an instance of NodeGroupClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.NodeGroupSettings`

  returns: `com.google.cloud.compute.v1.NodeGroupClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NodeGroupClient [^com.google.cloud.compute.v1.NodeGroupSettings settings]
    (NodeGroupClient/create settings))
  (^com.google.cloud.compute.v1.NodeGroupClient []
    (NodeGroupClient/create )))

(defn list-node-groups-callable
  "Retrieves a list of node groups available to the specified project. Note: use
   nodeGroups.listNodes for more details about each group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListNodeGroupsHttpRequest request = ListNodeGroupsHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       NodeGroupList response = nodeGroupClient.listNodeGroupsCallable().call(request);
       for (NodeGroup element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.listNodeGroupsCallable))))

(defn add-nodes-node-group-callable
  "Adds specified number of nodes to the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedNodeGroup = ProjectZoneNodeGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     NodeGroupsAddNodesRequest nodeGroupsAddNodesRequestResource = NodeGroupsAddNodesRequest.newBuilder().build();
     AddNodesNodeGroupHttpRequest request = AddNodesNodeGroupHttpRequest.newBuilder()
       .setNodeGroup(formattedNodeGroup)
       .setNodeGroupsAddNodesRequestResource(nodeGroupsAddNodesRequestResource)
       .build();
     ApiFuture<Operation> future = nodeGroupClient.addNodesNodeGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.addNodesNodeGroupCallable))))

(defn insert-node-group-callable
  "Creates a NodeGroup resource in the specified project using the data included in the request.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     Integer initialNodeCount = 0;
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     NodeGroup nodeGroupResource = NodeGroup.newBuilder().build();
     InsertNodeGroupHttpRequest request = InsertNodeGroupHttpRequest.newBuilder()
       .setInitialNodeCount(initialNodeCount)
       .setZone(formattedZone)
       .setNodeGroupResource(nodeGroupResource)
       .build();
     ApiFuture<Operation> future = nodeGroupClient.insertNodeGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.insertNodeGroupCallable))))

(defn list-nodes-node-groups-paged-callable
  "Lists nodes in the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedNodeGroup = ProjectZoneNodeGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     ListNodesNodeGroupsHttpRequest request = ListNodesNodeGroupsHttpRequest.newBuilder()
       .setNodeGroup(formattedNodeGroup)
       .build();
     ApiFuture<ListNodesNodeGroupsPagedResponse> future = nodeGroupClient.listNodesNodeGroupsPagedCallable().futureCall(request);
     // Do something
     for (NodeGroupNode element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$ListNodesNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.listNodesNodeGroupsPagedCallable))))

(defn get-iam-policy-node-group-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedResource = ProjectZoneNodeGroupResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     GetIamPolicyNodeGroupHttpRequest request = GetIamPolicyNodeGroupHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = nodeGroupClient.getIamPolicyNodeGroupCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.getIamPolicyNodeGroupCallable))))

(defn test-iam-permissions-node-group
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupResourceName resource = ProjectZoneNodeGroupResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = nodeGroupClient.testIamPermissionsNodeGroup(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsNodeGroup resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^NodeGroupClient this ^com.google.cloud.compute.v1.TestIamPermissionsNodeGroupHttpRequest request]
    (-> this (.testIamPermissionsNodeGroup request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.NodeGroupSettings`"
  (^com.google.cloud.compute.v1.NodeGroupSettings [^NodeGroupClient this]
    (-> this (.getSettings))))

(defn set-iam-policy-node-group-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedResource = ProjectZoneNodeGroupResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
     SetIamPolicyNodeGroupHttpRequest request = SetIamPolicyNodeGroupHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setZoneSetPolicyRequestResource(zoneSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = nodeGroupClient.setIamPolicyNodeGroupCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.setIamPolicyNodeGroupCallable))))

(defn list-nodes-node-groups
  "Lists nodes in the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupName nodeGroup = ProjectZoneNodeGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     for (NodeGroupNode element : nodeGroupClient.listNodesNodeGroups(nodeGroup).iterateAll()) {
       // doThingsWith(element);
     }
   }

  node-group - Name of the NodeGroup resource whose nodes you want to list. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`

  returns: `com.google.cloud.compute.v1.NodeGroupClient$ListNodesNodeGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeGroupClient$ListNodesNodeGroupsPagedResponse [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupName node-group]
    (-> this (.listNodesNodeGroups node-group))))

(defn aggregated-list-node-groups-paged-callable
  "Retrieves an aggregated list of node groups. Note: use nodeGroups.listNodes for more details
   about each group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListNodeGroupsHttpRequest request = AggregatedListNodeGroupsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListNodeGroupsPagedResponse> future = nodeGroupClient.aggregatedListNodeGroupsPagedCallable().futureCall(request);
     // Do something
     for (NodeGroupsScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$AggregatedListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.aggregatedListNodeGroupsPagedCallable))))

(defn delete-node-group-callable
  "Deletes the specified NodeGroup resource.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedNodeGroup = ProjectZoneNodeGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     DeleteNodeGroupHttpRequest request = DeleteNodeGroupHttpRequest.newBuilder()
       .setNodeGroup(formattedNodeGroup)
       .build();
     ApiFuture<Operation> future = nodeGroupClient.deleteNodeGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.deleteNodeGroupCallable))))

(defn set-iam-policy-node-group
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupResourceName resource = ProjectZoneNodeGroupResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
     Policy response = nodeGroupClient.setIamPolicyNodeGroup(resource, zoneSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName`
  zone-set-policy-request-resource - `com.google.cloud.compute.v1.ZoneSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName resource ^com.google.cloud.compute.v1.ZoneSetPolicyRequest zone-set-policy-request-resource]
    (-> this (.setIamPolicyNodeGroup resource zone-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^NodeGroupClient this ^com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest request]
    (-> this (.setIamPolicyNodeGroup request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.NodeGroupStub`"
  ([^NodeGroupClient this]
    (-> this (.getStub))))

(defn set-node-template-node-group-callable
  "Updates the node template of the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedNodeGroup = ProjectZoneNodeGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     NodeGroupsSetNodeTemplateRequest nodeGroupsSetNodeTemplateRequestResource = NodeGroupsSetNodeTemplateRequest.newBuilder().build();
     SetNodeTemplateNodeGroupHttpRequest request = SetNodeTemplateNodeGroupHttpRequest.newBuilder()
       .setNodeGroup(formattedNodeGroup)
       .setNodeGroupsSetNodeTemplateRequestResource(nodeGroupsSetNodeTemplateRequestResource)
       .build();
     ApiFuture<Operation> future = nodeGroupClient.setNodeTemplateNodeGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.setNodeTemplateNodeGroupCallable))))

(defn test-iam-permissions-node-group-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedResource = ProjectZoneNodeGroupResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsNodeGroupHttpRequest request = TestIamPermissionsNodeGroupHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = nodeGroupClient.testIamPermissionsNodeGroupCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNodeGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.testIamPermissionsNodeGroupCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^NodeGroupClient this]
    (-> this (.isShutdown))))

(defn list-nodes-node-groups-callable
  "Lists nodes in the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedNodeGroup = ProjectZoneNodeGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     ListNodesNodeGroupsHttpRequest request = ListNodesNodeGroupsHttpRequest.newBuilder()
       .setNodeGroup(formattedNodeGroup)
       .build();
     while (true) {
       NodeGroupsListNodes response = nodeGroupClient.listNodesNodeGroupsCallable().call(request);
       for (NodeGroupNode element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupsListNodes>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.listNodesNodeGroupsCallable))))

(defn set-node-template-node-group
  "Updates the node template of the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupName nodeGroup = ProjectZoneNodeGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     NodeGroupsSetNodeTemplateRequest nodeGroupsSetNodeTemplateRequestResource = NodeGroupsSetNodeTemplateRequest.newBuilder().build();
     Operation response = nodeGroupClient.setNodeTemplateNodeGroup(nodeGroup, nodeGroupsSetNodeTemplateRequestResource);
   }

  node-group - Name of the NodeGroup resource to update. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`
  node-groups-set-node-template-request-resource - `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupName node-group ^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest node-groups-set-node-template-request-resource]
    (-> this (.setNodeTemplateNodeGroup node-group node-groups-set-node-template-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest request]
    (-> this (.setNodeTemplateNodeGroup request))))

(defn delete-node-group
  "Deletes the specified NodeGroup resource.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupName nodeGroup = ProjectZoneNodeGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     Operation response = nodeGroupClient.deleteNodeGroup(nodeGroup);
   }

  node-group - Name of the NodeGroup resource to delete. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupName node-group]
    (-> this (.deleteNodeGroup node-group))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^NodeGroupClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-node-groups-paged-callable
  "Retrieves a list of node groups available to the specified project. Note: use
   nodeGroups.listNodes for more details about each group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListNodeGroupsHttpRequest request = ListNodeGroupsHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListNodeGroupsPagedResponse> future = nodeGroupClient.listNodeGroupsPagedCallable().futureCall(request);
     // Do something
     for (NodeGroup element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$ListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.listNodeGroupsPagedCallable))))

(defn shutdown
  ""
  ([^NodeGroupClient this]
    (-> this (.shutdown))))

(defn delete-nodes-node-group-callable
  "Deletes specified nodes from the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedNodeGroup = ProjectZoneNodeGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     NodeGroupsDeleteNodesRequest nodeGroupsDeleteNodesRequestResource = NodeGroupsDeleteNodesRequest.newBuilder().build();
     DeleteNodesNodeGroupHttpRequest request = DeleteNodesNodeGroupHttpRequest.newBuilder()
       .setNodeGroup(formattedNodeGroup)
       .setNodeGroupsDeleteNodesRequestResource(nodeGroupsDeleteNodesRequestResource)
       .build();
     ApiFuture<Operation> future = nodeGroupClient.deleteNodesNodeGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.deleteNodesNodeGroupCallable))))

(defn insert-node-group
  "Creates a NodeGroup resource in the specified project using the data included in the request.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     Integer initialNodeCount = 0;
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     NodeGroup nodeGroupResource = NodeGroup.newBuilder().build();
     Operation response = nodeGroupClient.insertNodeGroup(initialNodeCount, zone, nodeGroupResource);
   }

  initial-node-count - Initial count of nodes in the node group. - `java.lang.Integer`
  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`
  node-group-resource - A NodeGroup resource. To create a node group, you must first create a node templates. To learn more about node groups and sole-tenant nodes, read the Sole-tenant nodes documentation. (== resource_for beta.nodeGroups ==) (== resource_for v1.nodeGroups ==) - `com.google.cloud.compute.v1.NodeGroup`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^java.lang.Integer initial-node-count ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.NodeGroup node-group-resource]
    (-> this (.insertNodeGroup initial-node-count zone node-group-resource)))
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^com.google.cloud.compute.v1.InsertNodeGroupHttpRequest request]
    (-> this (.insertNodeGroup request))))

(defn aggregated-list-node-groups
  "Retrieves an aggregated list of node groups. Note: use nodeGroups.listNodes for more details
   about each group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (NodeGroupsScopedList element : nodeGroupClient.aggregatedListNodeGroups(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.NodeGroupClient$AggregatedListNodeGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeGroupClient$AggregatedListNodeGroupsPagedResponse [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListNodeGroups project))))

(defn get-node-group
  "Returns the specified NodeGroup. Get a list of available NodeGroups by making a list() request.
   Note: the \"nodes\" field should not be used. Use nodeGroups.listNodes instead.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupName nodeGroup = ProjectZoneNodeGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     NodeGroup response = nodeGroupClient.getNodeGroup(nodeGroup);
   }

  node-group - Name of the node group to return. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`

  returns: `com.google.cloud.compute.v1.NodeGroup`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeGroup [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupName node-group]
    (-> this (.getNodeGroup node-group))))

(defn close
  ""
  ([^NodeGroupClient this]
    (-> this (.close))))

(defn get-iam-policy-node-group
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupResourceName resource = ProjectZoneNodeGroupResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     Policy response = nodeGroupClient.getIamPolicyNodeGroup(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName resource]
    (-> this (.getIamPolicyNodeGroup resource))))

(defn delete-nodes-node-group
  "Deletes specified nodes from the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupName nodeGroup = ProjectZoneNodeGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     NodeGroupsDeleteNodesRequest nodeGroupsDeleteNodesRequestResource = NodeGroupsDeleteNodesRequest.newBuilder().build();
     Operation response = nodeGroupClient.deleteNodesNodeGroup(nodeGroup, nodeGroupsDeleteNodesRequestResource);
   }

  node-group - Name of the NodeGroup resource to delete. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`
  node-groups-delete-nodes-request-resource - `com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupName node-group ^com.google.cloud.compute.v1.NodeGroupsDeleteNodesRequest node-groups-delete-nodes-request-resource]
    (-> this (.deleteNodesNodeGroup node-group node-groups-delete-nodes-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^com.google.cloud.compute.v1.DeleteNodesNodeGroupHttpRequest request]
    (-> this (.deleteNodesNodeGroup request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^NodeGroupClient this]
    (-> this (.isTerminated))))

(defn list-node-groups
  "Retrieves a list of node groups available to the specified project. Note: use
   nodeGroups.listNodes for more details about each group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (NodeGroup element : nodeGroupClient.listNodeGroups(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.NodeGroupClient$ListNodeGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeGroupClient$ListNodeGroupsPagedResponse [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listNodeGroups zone))))

(defn get-node-group-callable
  "Returns the specified NodeGroup. Get a list of available NodeGroups by making a list() request.
   Note: the \"nodes\" field should not be used. Use nodeGroups.listNodes instead.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedNodeGroup = ProjectZoneNodeGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     GetNodeGroupHttpRequest request = GetNodeGroupHttpRequest.newBuilder()
       .setNodeGroup(formattedNodeGroup)
       .build();
     ApiFuture<NodeGroup> future = nodeGroupClient.getNodeGroupCallable().futureCall(request);
     // Do something
     NodeGroup response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeGroupHttpRequest,com.google.cloud.compute.v1.NodeGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.getNodeGroupCallable))))

(defn add-nodes-node-group
  "Adds specified number of nodes to the node group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     ProjectZoneNodeGroupName nodeGroup = ProjectZoneNodeGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[NODE_GROUP]\");
     NodeGroupsAddNodesRequest nodeGroupsAddNodesRequestResource = NodeGroupsAddNodesRequest.newBuilder().build();
     Operation response = nodeGroupClient.addNodesNodeGroup(nodeGroup, nodeGroupsAddNodesRequestResource);
   }

  node-group - Name of the NodeGroup resource. - `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`
  node-groups-add-nodes-request-resource - `com.google.cloud.compute.v1.NodeGroupsAddNodesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^com.google.cloud.compute.v1.ProjectZoneNodeGroupName node-group ^com.google.cloud.compute.v1.NodeGroupsAddNodesRequest node-groups-add-nodes-request-resource]
    (-> this (.addNodesNodeGroup node-group node-groups-add-nodes-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^NodeGroupClient this ^com.google.cloud.compute.v1.AddNodesNodeGroupHttpRequest request]
    (-> this (.addNodesNodeGroup request))))

(defn shutdown-now
  ""
  ([^NodeGroupClient this]
    (-> this (.shutdownNow))))

(defn aggregated-list-node-groups-callable
  "Retrieves an aggregated list of node groups. Note: use nodeGroups.listNodes for more details
   about each group.

   Sample code:



   try (NodeGroupClient nodeGroupClient = NodeGroupClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListNodeGroupsHttpRequest request = AggregatedListNodeGroupsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       NodeGroupAggregatedList response = nodeGroupClient.aggregatedListNodeGroupsCallable().call(request);
       for (NodeGroupsScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupClient this]
    (-> this (.aggregatedListNodeGroupsCallable))))

