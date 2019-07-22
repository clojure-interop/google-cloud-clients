(ns com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings$Builder
  "Builder for WorkflowTemplateServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1.stub WorkflowTemplateServiceStubSettings$Builder]))

(defn instantiate-workflow-template-settings
  "Returns the builder for the settings used for calls to instantiateWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.InstantiateWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.instantiateWorkflowTemplateSettings))))

(defn delete-workflow-template-settings
  "Returns the builder for the settings used for calls to deleteWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.DeleteWorkflowTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.deleteWorkflowTemplateSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings$Builder [^WorkflowTemplateServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn instantiate-inline-workflow-template-operation-settings
  "Returns the builder for the settings used for calls to instantiateInlineWorkflowTemplate.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.instantiateInlineWorkflowTemplateOperationSettings))))

(defn list-workflow-templates-settings
  "Returns the builder for the settings used for calls to listWorkflowTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dataproc.v1.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1.ListWorkflowTemplatesResponse,com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.listWorkflowTemplatesSettings))))

(defn create-workflow-template-settings
  "Returns the builder for the settings used for calls to createWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.createWorkflowTemplateSettings))))

(defn instantiate-workflow-template-operation-settings
  "Returns the builder for the settings used for calls to instantiateWorkflowTemplate.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1.InstantiateWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.instantiateWorkflowTemplateOperationSettings))))

(defn build
  "returns: `com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.build))))

(defn update-workflow-template-settings
  "Returns the builder for the settings used for calls to updateWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.updateWorkflowTemplateSettings))))

(defn get-workflow-template-settings
  "Returns the builder for the settings used for calls to getWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.GetWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.getWorkflowTemplateSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn instantiate-inline-workflow-template-settings
  "Returns the builder for the settings used for calls to instantiateInlineWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceStubSettings$Builder this]
    (-> this (.instantiateInlineWorkflowTemplateSettings))))

