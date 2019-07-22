(ns com.google.cloud.compute.v1.NodeTemplateClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
    ProjectRegionNodeTemplateName nodeTemplate = ProjectRegionNodeTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[NODE_TEMPLATE]\");
    Operation response = nodeTemplateClient.deleteNodeTemplate(nodeTemplate);
  }

  Note: close() needs to be called on the nodeTemplateClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of NodeTemplateSettings to
  create(). For example:

  To customize credentials:



  NodeTemplateSettings nodeTemplateSettings =
      NodeTemplateSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  NodeTemplateClient nodeTemplateClient =
      NodeTemplateClient.create(nodeTemplateSettings);

  To customize the endpoint:



  NodeTemplateSettings nodeTemplateSettings =
      NodeTemplateSettings.newBuilder().setEndpoint(myEndpoint).build();
  NodeTemplateClient nodeTemplateClient =
      NodeTemplateClient.create(nodeTemplateSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplateClient]))

(defn *create
  "Constructs an instance of NodeTemplateClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.NodeTemplateSettings`

  returns: `com.google.cloud.compute.v1.NodeTemplateClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NodeTemplateClient [^com.google.cloud.compute.v1.NodeTemplateSettings settings]
    (NodeTemplateClient/create settings))
  (^com.google.cloud.compute.v1.NodeTemplateClient []
    (NodeTemplateClient/create )))

(defn list-node-templates-paged-callable
  "Retrieves a list of node templates available to the specified project.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListNodeTemplatesHttpRequest request = ListNodeTemplatesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListNodeTemplatesPagedResponse> future = nodeTemplateClient.listNodeTemplatesPagedCallable().futureCall(request);
     // Do something
     for (NodeTemplate element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateClient$ListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.listNodeTemplatesPagedCallable))))

(defn aggregated-list-node-templates-paged-callable
  "Retrieves an aggregated list of node templates.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListNodeTemplatesHttpRequest request = AggregatedListNodeTemplatesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListNodeTemplatesPagedResponse> future = nodeTemplateClient.aggregatedListNodeTemplatesPagedCallable().futureCall(request);
     // Do something
     for (NodeTemplatesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateClient$AggregatedListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.aggregatedListNodeTemplatesPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.NodeTemplateSettings`"
  (^com.google.cloud.compute.v1.NodeTemplateSettings [^NodeTemplateClient this]
    (-> this (.getSettings))))

(defn test-iam-permissions-node-template-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedResource = ProjectRegionNodeTemplateResourceName.format(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsNodeTemplateHttpRequest request = TestIamPermissionsNodeTemplateHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = nodeTemplateClient.testIamPermissionsNodeTemplateCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNodeTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.testIamPermissionsNodeTemplateCallable))))

(defn aggregated-list-node-templates
  "Retrieves an aggregated list of node templates.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (NodeTemplatesScopedList element : nodeTemplateClient.aggregatedListNodeTemplates(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.NodeTemplateClient$AggregatedListNodeTemplatesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeTemplateClient$AggregatedListNodeTemplatesPagedResponse [^NodeTemplateClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListNodeTemplates project))))

(defn get-iam-policy-node-template-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedResource = ProjectRegionNodeTemplateResourceName.format(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     GetIamPolicyNodeTemplateHttpRequest request = GetIamPolicyNodeTemplateHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = nodeTemplateClient.getIamPolicyNodeTemplateCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.getIamPolicyNodeTemplateCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.NodeTemplateStub`"
  ([^NodeTemplateClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^NodeTemplateClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^NodeTemplateClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn set-iam-policy-node-template
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     ProjectRegionNodeTemplateResourceName resource = ProjectRegionNodeTemplateResourceName.of(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     RegionSetPolicyRequest regionSetPolicyRequestResource = RegionSetPolicyRequest.newBuilder().build();
     Policy response = nodeTemplateClient.setIamPolicyNodeTemplate(resource, regionSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName`
  region-set-policy-request-resource - `com.google.cloud.compute.v1.RegionSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^NodeTemplateClient this ^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName resource ^com.google.cloud.compute.v1.RegionSetPolicyRequest region-set-policy-request-resource]
    (-> this (.setIamPolicyNodeTemplate resource region-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^NodeTemplateClient this ^com.google.cloud.compute.v1.SetIamPolicyNodeTemplateHttpRequest request]
    (-> this (.setIamPolicyNodeTemplate request))))

(defn shutdown
  ""
  ([^NodeTemplateClient this]
    (-> this (.shutdown))))

(defn get-iam-policy-node-template
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     ProjectRegionNodeTemplateResourceName resource = ProjectRegionNodeTemplateResourceName.of(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     Policy response = nodeTemplateClient.getIamPolicyNodeTemplate(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^NodeTemplateClient this ^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName resource]
    (-> this (.getIamPolicyNodeTemplate resource))))

(defn set-iam-policy-node-template-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedResource = ProjectRegionNodeTemplateResourceName.format(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     RegionSetPolicyRequest regionSetPolicyRequestResource = RegionSetPolicyRequest.newBuilder().build();
     SetIamPolicyNodeTemplateHttpRequest request = SetIamPolicyNodeTemplateHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setRegionSetPolicyRequestResource(regionSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = nodeTemplateClient.setIamPolicyNodeTemplateCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.setIamPolicyNodeTemplateCallable))))

(defn list-node-templates-callable
  "Retrieves a list of node templates available to the specified project.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListNodeTemplatesHttpRequest request = ListNodeTemplatesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       NodeTemplateList response = nodeTemplateClient.listNodeTemplatesCallable().call(request);
       for (NodeTemplate element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.listNodeTemplatesCallable))))

(defn insert-node-template
  "Creates a NodeTemplate resource in the specified project using the data included in the
   request.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     NodeTemplate nodeTemplateResource = NodeTemplate.newBuilder().build();
     Operation response = nodeTemplateClient.insertNodeTemplate(region, nodeTemplateResource);
   }

  region - The name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  node-template-resource - A Node Template resource. To learn more about node templates and sole-tenant nodes, read the Sole-tenant nodes documentation. (== resource_for beta.nodeTemplates ==) (== resource_for v1.nodeTemplates ==) - `com.google.cloud.compute.v1.NodeTemplate`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NodeTemplateClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.NodeTemplate node-template-resource]
    (-> this (.insertNodeTemplate region node-template-resource)))
  (^com.google.cloud.compute.v1.Operation [^NodeTemplateClient this ^com.google.cloud.compute.v1.InsertNodeTemplateHttpRequest request]
    (-> this (.insertNodeTemplate request))))

(defn get-node-template
  "Returns the specified node template. Gets a list of available node templates by making a list()
   request.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     ProjectRegionNodeTemplateName nodeTemplate = ProjectRegionNodeTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[NODE_TEMPLATE]\");
     NodeTemplate response = nodeTemplateClient.getNodeTemplate(nodeTemplate);
   }

  node-template - Name of the node template to return. - `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName`

  returns: `com.google.cloud.compute.v1.NodeTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeTemplate [^NodeTemplateClient this ^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName node-template]
    (-> this (.getNodeTemplate node-template))))

(defn close
  ""
  ([^NodeTemplateClient this]
    (-> this (.close))))

(defn test-iam-permissions-node-template
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     ProjectRegionNodeTemplateResourceName resource = ProjectRegionNodeTemplateResourceName.of(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = nodeTemplateClient.testIamPermissionsNodeTemplate(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^NodeTemplateClient this ^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsNodeTemplate resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^NodeTemplateClient this ^com.google.cloud.compute.v1.TestIamPermissionsNodeTemplateHttpRequest request]
    (-> this (.testIamPermissionsNodeTemplate request))))

(defn delete-node-template-callable
  "Deletes the specified NodeTemplate resource.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedNodeTemplate = ProjectRegionNodeTemplateName.format(\"[PROJECT]\", \"[REGION]\", \"[NODE_TEMPLATE]\");
     DeleteNodeTemplateHttpRequest request = DeleteNodeTemplateHttpRequest.newBuilder()
       .setNodeTemplate(formattedNodeTemplate)
       .build();
     ApiFuture<Operation> future = nodeTemplateClient.deleteNodeTemplateCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.deleteNodeTemplateCallable))))

(defn delete-node-template
  "Deletes the specified NodeTemplate resource.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     ProjectRegionNodeTemplateName nodeTemplate = ProjectRegionNodeTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[NODE_TEMPLATE]\");
     Operation response = nodeTemplateClient.deleteNodeTemplate(nodeTemplate);
   }

  node-template - Name of the NodeTemplate resource to delete. - `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^NodeTemplateClient this ^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName node-template]
    (-> this (.deleteNodeTemplate node-template))))

(defn get-node-template-callable
  "Returns the specified node template. Gets a list of available node templates by making a list()
   request.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedNodeTemplate = ProjectRegionNodeTemplateName.format(\"[PROJECT]\", \"[REGION]\", \"[NODE_TEMPLATE]\");
     GetNodeTemplateHttpRequest request = GetNodeTemplateHttpRequest.newBuilder()
       .setNodeTemplate(formattedNodeTemplate)
       .build();
     ApiFuture<NodeTemplate> future = nodeTemplateClient.getNodeTemplateCallable().futureCall(request);
     // Do something
     NodeTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeTemplateHttpRequest,com.google.cloud.compute.v1.NodeTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.getNodeTemplateCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^NodeTemplateClient this]
    (-> this (.isTerminated))))

(defn list-node-templates
  "Retrieves a list of node templates available to the specified project.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (NodeTemplate element : nodeTemplateClient.listNodeTemplates(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - The name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.NodeTemplateClient$ListNodeTemplatesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.NodeTemplateClient$ListNodeTemplatesPagedResponse [^NodeTemplateClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listNodeTemplates region))))

(defn aggregated-list-node-templates-callable
  "Retrieves an aggregated list of node templates.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListNodeTemplatesHttpRequest request = AggregatedListNodeTemplatesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       NodeTemplateAggregatedList response = nodeTemplateClient.aggregatedListNodeTemplatesCallable().call(request);
       for (NodeTemplatesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.aggregatedListNodeTemplatesCallable))))

(defn insert-node-template-callable
  "Creates a NodeTemplate resource in the specified project using the data included in the
   request.

   Sample code:



   try (NodeTemplateClient nodeTemplateClient = NodeTemplateClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     NodeTemplate nodeTemplateResource = NodeTemplate.newBuilder().build();
     InsertNodeTemplateHttpRequest request = InsertNodeTemplateHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setNodeTemplateResource(nodeTemplateResource)
       .build();
     ApiFuture<Operation> future = nodeTemplateClient.insertNodeTemplateCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTemplateClient this]
    (-> this (.insertNodeTemplateCallable))))

(defn shutdown-now
  ""
  ([^NodeTemplateClient this]
    (-> this (.shutdownNow))))

