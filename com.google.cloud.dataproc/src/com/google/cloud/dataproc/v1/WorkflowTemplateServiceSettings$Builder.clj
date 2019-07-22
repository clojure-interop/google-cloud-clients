(ns com.google.cloud.dataproc.v1.WorkflowTemplateServiceSettings$Builder
  "Builder for WorkflowTemplateServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1 WorkflowTemplateServiceSettings$Builder]))

(defn instantiate-workflow-template-settings
  "Returns the builder for the settings used for calls to instantiateWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.InstantiateWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.instantiateWorkflowTemplateSettings))))

(defn delete-workflow-template-settings
  "Returns the builder for the settings used for calls to deleteWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.DeleteWorkflowTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.deleteWorkflowTemplateSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dataproc.v1.WorkflowTemplateServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dataproc.v1.WorkflowTemplateServiceSettings$Builder [^WorkflowTemplateServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn instantiate-inline-workflow-template-operation-settings
  "Returns the builder for the settings used for calls to instantiateInlineWorkflowTemplate.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.instantiateInlineWorkflowTemplateOperationSettings))))

(defn list-workflow-templates-settings
  "Returns the builder for the settings used for calls to listWorkflowTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dataproc.v1.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1.ListWorkflowTemplatesResponse,com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.listWorkflowTemplatesSettings))))

(defn create-workflow-template-settings
  "Returns the builder for the settings used for calls to createWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.createWorkflowTemplateSettings))))

(defn instantiate-workflow-template-operation-settings
  "Returns the builder for the settings used for calls to instantiateWorkflowTemplate.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1.InstantiateWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.instantiateWorkflowTemplateOperationSettings))))

(defn build
  "returns: `com.google.cloud.dataproc.v1.WorkflowTemplateServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1.WorkflowTemplateServiceSettings [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings$Builder`"
  (^com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings$Builder [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-workflow-template-settings
  "Returns the builder for the settings used for calls to updateWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.updateWorkflowTemplateSettings))))

(defn get-workflow-template-settings
  "Returns the builder for the settings used for calls to getWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.GetWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.getWorkflowTemplateSettings))))

(defn instantiate-inline-workflow-template-settings
  "Returns the builder for the settings used for calls to instantiateInlineWorkflowTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^WorkflowTemplateServiceSettings$Builder this]
    (-> this (.instantiateInlineWorkflowTemplateSettings))))

