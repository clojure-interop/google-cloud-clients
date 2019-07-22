(ns com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings
  "Settings class to configure an instance of WorkflowTemplateServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (dataproc.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createWorkflowTemplate to 30 seconds:



  WorkflowTemplateServiceSettings.Builder workflowTemplateServiceSettingsBuilder =
      WorkflowTemplateServiceSettings.newBuilder();
  workflowTemplateServiceSettingsBuilder.createWorkflowTemplateSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  WorkflowTemplateServiceSettings workflowTemplateServiceSettings = workflowTemplateServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 WorkflowTemplateServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (WorkflowTemplateServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (WorkflowTemplateServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (WorkflowTemplateServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (WorkflowTemplateServiceSettings/newBuilder client-context))
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings$Builder []
    (WorkflowTemplateServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (WorkflowTemplateServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStubSettings`

  returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings [^com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStubSettings stub]
    (WorkflowTemplateServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (WorkflowTemplateServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (WorkflowTemplateServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (WorkflowTemplateServiceSettings/getDefaultServiceScopes )))

(defn instantiate-workflow-template-settings
  "Returns the object with the settings used for calls to instantiateWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WorkflowTemplateServiceSettings this]
    (-> this (.instantiateWorkflowTemplateSettings))))

(defn delete-workflow-template-settings
  "Returns the object with the settings used for calls to deleteWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.DeleteWorkflowTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WorkflowTemplateServiceSettings this]
    (-> this (.deleteWorkflowTemplateSettings))))

(defn instantiate-inline-workflow-template-operation-settings
  "Returns the object with the settings used for calls to instantiateInlineWorkflowTemplate.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dataproc.v1beta2.InstantiateInlineWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceSettings this]
    (-> this (.instantiateInlineWorkflowTemplateOperationSettings))))

(defn list-workflow-templates-settings
  "Returns the object with the settings used for calls to listWorkflowTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dataproc.v1beta2.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1beta2.ListWorkflowTemplatesResponse,com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^WorkflowTemplateServiceSettings this]
    (-> this (.listWorkflowTemplatesSettings))))

(defn create-workflow-template-settings
  "Returns the object with the settings used for calls to createWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.CreateWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WorkflowTemplateServiceSettings this]
    (-> this (.createWorkflowTemplateSettings))))

(defn instantiate-workflow-template-operation-settings
  "Returns the object with the settings used for calls to instantiateWorkflowTemplate.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceSettings this]
    (-> this (.instantiateWorkflowTemplateOperationSettings))))

(defn update-workflow-template-settings
  "Returns the object with the settings used for calls to updateWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WorkflowTemplateServiceSettings this]
    (-> this (.updateWorkflowTemplateSettings))))

(defn get-workflow-template-settings
  "Returns the object with the settings used for calls to getWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WorkflowTemplateServiceSettings this]
    (-> this (.getWorkflowTemplateSettings))))

(defn instantiate-inline-workflow-template-settings
  "Returns the object with the settings used for calls to instantiateInlineWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.InstantiateInlineWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^WorkflowTemplateServiceSettings this]
    (-> this (.instantiateInlineWorkflowTemplateSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceSettings$Builder [^WorkflowTemplateServiceSettings this]
    (-> this (.toBuilder))))

