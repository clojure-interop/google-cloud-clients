(ns com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStub
  "Base stub class for Google Cloud Dataproc API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2.stub WorkflowTemplateServiceStub]))

(defn ->workflow-template-service-stub
  "Constructor."
  (^WorkflowTemplateServiceStub []
    (new WorkflowTemplateServiceStub )))

(defn delete-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteWorkflowTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceStub this]
    (-> this (.deleteWorkflowTemplateCallable))))

(defn instantiate-workflow-template-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceStub this]
    (-> this (.instantiateWorkflowTemplateOperationCallable))))

(defn instantiate-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceStub this]
    (-> this (.instantiateWorkflowTemplateCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^WorkflowTemplateServiceStub this]
    (-> this (.getOperationsStub))))

(defn create-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CreateWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceStub this]
    (-> this (.createWorkflowTemplateCallable))))

(defn get-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceStub this]
    (-> this (.getWorkflowTemplateCallable))))

(defn list-workflow-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1beta2.ListWorkflowTemplatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceStub this]
    (-> this (.listWorkflowTemplatesCallable))))

(defn list-workflow-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceStub this]
    (-> this (.listWorkflowTemplatesPagedCallable))))

(defn close
  ""
  ([^WorkflowTemplateServiceStub this]
    (-> this (.close))))

(defn update-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateWorkflowTemplateRequest,com.google.cloud.dataproc.v1beta2.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceStub this]
    (-> this (.updateWorkflowTemplateCallable))))

(defn instantiate-inline-workflow-template-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1beta2.InstantiateInlineWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1beta2.WorkflowMetadata>`"
  ([^WorkflowTemplateServiceStub this]
    (-> this (.instantiateInlineWorkflowTemplateOperationCallable))))

(defn instantiate-inline-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.InstantiateInlineWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^WorkflowTemplateServiceStub this]
    (-> this (.instantiateInlineWorkflowTemplateCallable))))

