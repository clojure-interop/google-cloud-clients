(ns com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient
  "Service Description: The API interface for managing Workflow Templates in the Cloud Dataproc API.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
    RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
    WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
    WorkflowTemplate response = workflowTemplateServiceClient.createWorkflowTemplate(parent, template);
  }

  Note: close() needs to be called on the workflowTemplateServiceClient object to clean up
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

  This class can be customized by passing in a custom instance of
  WorkflowTemplateServiceSettings to create(). For example:

  To customize credentials:



  WorkflowTemplateServiceSettings workflowTemplateServiceSettings =
      WorkflowTemplateServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  WorkflowTemplateServiceClient workflowTemplateServiceClient =
      WorkflowTemplateServiceClient.create(workflowTemplateServiceSettings);

  To customize the endpoint:



  WorkflowTemplateServiceSettings workflowTemplateServiceSettings =
      WorkflowTemplateServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  WorkflowTemplateServiceClient workflowTemplateServiceClient =
      WorkflowTemplateServiceClient.create(workflowTemplateServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 WorkflowTemplateServiceClient]))

(defn *create
  "Constructs an instance of WorkflowTemplateServiceClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings`

  returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient [^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings settings]
    (WorkflowTemplateServiceClient/create settings))
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient []
    (WorkflowTemplateServiceClient/create )))

(defn delete-workflow-template-callable
  "Deletes a workflow template. It does not cancel in-progress workflows.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplateName name = WorkflowTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[WORKFLOW_TEMPLATE]\");
     DeleteWorkflowTemplateRequest request = DeleteWorkflowTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = workflowTemplateServiceClient.deleteWorkflowTemplateCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteWorkflowTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceClient this]
    (-> this (.deleteWorkflowTemplateCallable))))

(defn instantiate-workflow-template-operation-callable
  "Instantiates a template and begins execution.

   The returned Operation can be used to track execution of workflow by polling
   [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   entire workflow is finished.

   The running workflow can be aborted via
   [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   inflight jobs to be cancelled and workflow-owned clusters to be deleted.

   The [Operation.metadata][google.longrunning.Operation.metadata] will be
   [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].

   On successful completion, [Operation.response][google.longrunning.Operation.response] will
   be [Empty][google.protobuf.Empty].

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplateName name = WorkflowTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[WORKFLOW_TEMPLATE]\");
     InstantiateWorkflowTemplateRequest request = InstantiateWorkflowTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     OperationFuture<Empty, WorkflowMetadata> future = workflowTemplateServiceClient.instantiateWorkflowTemplateOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceClient this]
    (-> this (.instantiateWorkflowTemplateOperationCallable))))

(defn instantiate-workflow-template-callable
  "Instantiates a template and begins execution.

   The returned Operation can be used to track execution of workflow by polling
   [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   entire workflow is finished.

   The running workflow can be aborted via
   [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   inflight jobs to be cancelled and workflow-owned clusters to be deleted.

   The [Operation.metadata][google.longrunning.Operation.metadata] will be
   [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].

   On successful completion, [Operation.response][google.longrunning.Operation.response] will
   be [Empty][google.protobuf.Empty].

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplateName name = WorkflowTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[WORKFLOW_TEMPLATE]\");
     InstantiateWorkflowTemplateRequest request = InstantiateWorkflowTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Operation> future = workflowTemplateServiceClient.instantiateWorkflowTemplateCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceClient this]
    (-> this (.instantiateWorkflowTemplateCallable))))

(defn get-settings
  "returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings`"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings [^WorkflowTemplateServiceClient this]
    (-> this (.getSettings))))

(defn create-workflow-template
  "Creates new workflow template.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
     WorkflowTemplate response = workflowTemplateServiceClient.createWorkflowTemplate(parent, template);
   }

  parent - Required. The \"resource name\" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}` - `com.google.cloud.dataproc.v1beta2.RegionName`
  template - Required. The Dataproc workflow template to create. - `com.google.cloud.dataproc.v1beta2.WorkflowTemplate`

  returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplate [^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.RegionName parent ^com.google.cloud.dataproc.v1beta2.WorkflowTemplate template]
    (-> this (.createWorkflowTemplate parent template)))
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplate [^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.CreateWorkflowTemplateRequest request]
    (-> this (.createWorkflowTemplate request))))

(defn create-workflow-template-callable
  "Creates new workflow template.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
     CreateWorkflowTemplateRequest request = CreateWorkflowTemplateRequest.newBuilder()
       .setParent(parent.toString())
       .setTemplate(template)
       .build();
     ApiFuture<WorkflowTemplate> future = workflowTemplateServiceClient.createWorkflowTemplateCallable().futureCall(request);
     // Do something
     WorkflowTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CreateWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceClient this]
    (-> this (.createWorkflowTemplateCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStub`"
  ([^WorkflowTemplateServiceClient this]
    (-> this (.getStub))))

(defn instantiate-workflow-template-async
  "Instantiates a template and begins execution.

   The returned Operation can be used to track execution of workflow by polling
   [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   entire workflow is finished.

   The running workflow can be aborted via
   [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   inflight jobs to be cancelled and workflow-owned clusters to be deleted.

   The [Operation.metadata][google.longrunning.Operation.metadata] will be
   [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].

   On successful completion, [Operation.response][google.longrunning.Operation.response] will
   be [Empty][google.protobuf.Empty].

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplateName name = WorkflowTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[WORKFLOW_TEMPLATE]\");
     Map<String, String> parameters = new HashMap<>();
     workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(name, parameters).get();
   }

  name - Required. The \"resource name\" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` - `com.google.cloud.dataproc.v1beta2.WorkflowTemplateName`
  parameters - Optional. Map from parameter names to values that should be used for those parameters. Values may not exceed 100 characters. - `java.util.Map`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.WorkflowMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.WorkflowTemplateName name ^java.util.Map parameters]
    (-> this (.instantiateWorkflowTemplateAsync name parameters)))
  ([^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.WorkflowTemplateName name]
    (-> this (.instantiateWorkflowTemplateAsync name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^WorkflowTemplateServiceClient this]
    (-> this (.isShutdown))))

(defn list-workflow-templates
  "Lists workflows that match the specified filter in the request.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (WorkflowTemplate element : workflowTemplateServiceClient.listWorkflowTemplates(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The \"resource name\" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}` - `com.google.cloud.dataproc.v1beta2.RegionName`

  returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse [^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.RegionName parent]
    (-> this (.listWorkflowTemplates parent))))

(defn update-workflow-template
  "Updates (replaces) workflow template. The updated template must contain version that matches
   the current server version.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
     WorkflowTemplate response = workflowTemplateServiceClient.updateWorkflowTemplate(template);
   }

  template - Required. The updated workflow template. The `template.version` field must match the current version. - `com.google.cloud.dataproc.v1beta2.WorkflowTemplate`

  returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplate [^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.WorkflowTemplate template]
    (-> this (.updateWorkflowTemplate template))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^WorkflowTemplateServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^WorkflowTemplateServiceClient this]
    (-> this (.shutdown))))

(defn get-workflow-template-callable
  "Retrieves the latest workflow template.

   Can retrieve previously instantiated template by specifying optional version parameter.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplateName name = WorkflowTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[WORKFLOW_TEMPLATE]\");
     GetWorkflowTemplateRequest request = GetWorkflowTemplateRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<WorkflowTemplate> future = workflowTemplateServiceClient.getWorkflowTemplateCallable().futureCall(request);
     // Do something
     WorkflowTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceClient this]
    (-> this (.getWorkflowTemplateCallable))))

(defn list-workflow-templates-callable
  "Lists workflows that match the specified filter in the request.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     ListWorkflowTemplatesRequest request = ListWorkflowTemplatesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListWorkflowTemplatesResponse response = workflowTemplateServiceClient.listWorkflowTemplatesCallable().call(request);
       for (WorkflowTemplate element : response.getTemplatesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1beta2.ListWorkflowTemplatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceClient this]
    (-> this (.listWorkflowTemplatesCallable))))

(defn list-workflow-templates-paged-callable
  "Lists workflows that match the specified filter in the request.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     ListWorkflowTemplatesRequest request = ListWorkflowTemplatesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListWorkflowTemplatesPagedResponse> future = workflowTemplateServiceClient.listWorkflowTemplatesPagedCallable().futureCall(request);
     // Do something
     for (WorkflowTemplate element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceClient this]
    (-> this (.listWorkflowTemplatesPagedCallable))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^WorkflowTemplateServiceClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^WorkflowTemplateServiceClient this]
    (-> this (.close))))

(defn get-workflow-template
  "Retrieves the latest workflow template.

   Can retrieve previously instantiated template by specifying optional version parameter.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplateName name = WorkflowTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[WORKFLOW_TEMPLATE]\");
     WorkflowTemplate response = workflowTemplateServiceClient.getWorkflowTemplate(name);
   }

  name - Required. The \"resource name\" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` - `com.google.cloud.dataproc.v1beta2.WorkflowTemplateName`

  returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplate [^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.WorkflowTemplateName name]
    (-> this (.getWorkflowTemplate name))))

(defn update-workflow-template-callable
  "Updates (replaces) workflow template. The updated template must contain version that matches
   the current server version.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
     UpdateWorkflowTemplateRequest request = UpdateWorkflowTemplateRequest.newBuilder()
       .setTemplate(template)
       .build();
     ApiFuture<WorkflowTemplate> future = workflowTemplateServiceClient.updateWorkflowTemplateCallable().futureCall(request);
     // Do something
     WorkflowTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceClient this]
    (-> this (.updateWorkflowTemplateCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^WorkflowTemplateServiceClient this]
    (-> this (.isTerminated))))

(defn instantiate-inline-workflow-template-operation-callable
  "Instantiates a template and begins execution.

   This method is equivalent to executing the sequence
   [CreateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.CreateWorkflowTemplate],
   [InstantiateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.InstantiateWorkflowTemplate],
   [DeleteWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.DeleteWorkflowTemplate].

   The returned Operation can be used to track execution of workflow by polling
   [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   entire workflow is finished.

   The running workflow can be aborted via
   [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   inflight jobs to be cancelled and workflow-owned clusters to be deleted.

   The [Operation.metadata][google.longrunning.Operation.metadata] will be
   [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].

   On successful completion, [Operation.response][google.longrunning.Operation.response] will
   be [Empty][google.protobuf.Empty].

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
     InstantiateInlineWorkflowTemplateRequest request = InstantiateInlineWorkflowTemplateRequest.newBuilder()
       .setParent(parent.toString())
       .setTemplate(template)
       .build();
     OperationFuture<Empty, WorkflowMetadata> future = workflowTemplateServiceClient.instantiateInlineWorkflowTemplateOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.InstantiateInlineWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceClient this]
    (-> this (.instantiateInlineWorkflowTemplateOperationCallable))))

(defn delete-workflow-template
  "Deletes a workflow template. It does not cancel in-progress workflows.

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     WorkflowTemplateName name = WorkflowTemplateName.of(\"[PROJECT]\", \"[REGION]\", \"[WORKFLOW_TEMPLATE]\");
     workflowTemplateServiceClient.deleteWorkflowTemplate(name);
   }

  name - Required. The \"resource name\" of the workflow template, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` - `com.google.cloud.dataproc.v1beta2.WorkflowTemplateName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.WorkflowTemplateName name]
    (-> this (.deleteWorkflowTemplate name))))

(defn instantiate-inline-workflow-template-async
  "Instantiates a template and begins execution.

   This method is equivalent to executing the sequence
   [CreateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.CreateWorkflowTemplate],
   [InstantiateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.InstantiateWorkflowTemplate],
   [DeleteWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.DeleteWorkflowTemplate].

   The returned Operation can be used to track execution of workflow by polling
   [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   entire workflow is finished.

   The running workflow can be aborted via
   [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   inflight jobs to be cancelled and workflow-owned clusters to be deleted.

   The [Operation.metadata][google.longrunning.Operation.metadata] will be
   [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].

   On successful completion, [Operation.response][google.longrunning.Operation.response] will
   be [Empty][google.protobuf.Empty].

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
     workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(parent, template).get();
   }

  parent - Required. The \"resource name\" of the workflow template region, as described in https://cloud.google.com/apis/design/resource_names of the form `projects/{project_id}/regions/{region}` - `com.google.cloud.dataproc.v1beta2.RegionName`
  template - Required. The workflow template to instantiate. - `com.google.cloud.dataproc.v1beta2.WorkflowTemplate`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.WorkflowMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.RegionName parent ^com.google.cloud.dataproc.v1beta2.WorkflowTemplate template]
    (-> this (.instantiateInlineWorkflowTemplateAsync parent template)))
  ([^WorkflowTemplateServiceClient this ^com.google.cloud.dataproc.v1beta2.InstantiateInlineWorkflowTemplateRequest request]
    (-> this (.instantiateInlineWorkflowTemplateAsync request))))

(defn instantiate-inline-workflow-template-callable
  "Instantiates a template and begins execution.

   This method is equivalent to executing the sequence
   [CreateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.CreateWorkflowTemplate],
   [InstantiateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.InstantiateWorkflowTemplate],
   [DeleteWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.DeleteWorkflowTemplate].

   The returned Operation can be used to track execution of workflow by polling
   [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   entire workflow is finished.

   The running workflow can be aborted via
   [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   inflight jobs to be cancelled and workflow-owned clusters to be deleted.

   The [Operation.metadata][google.longrunning.Operation.metadata] will be
   [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].

   On successful completion, [Operation.response][google.longrunning.Operation.response] will
   be [Empty][google.protobuf.Empty].

   Sample code:



   try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
     RegionName parent = RegionName.of(\"[PROJECT]\", \"[REGION]\");
     WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
     InstantiateInlineWorkflowTemplateRequest request = InstantiateInlineWorkflowTemplateRequest.newBuilder()
       .setParent(parent.toString())
       .setTemplate(template)
       .build();
     ApiFuture<Operation> future = workflowTemplateServiceClient.instantiateInlineWorkflowTemplateCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.InstantiateInlineWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceClient this]
    (-> this (.instantiateInlineWorkflowTemplateCallable))))

(defn shutdown-now
  ""
  ([^WorkflowTemplateServiceClient this]
    (-> this (.shutdownNow))))

