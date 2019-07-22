(ns com.google.cloud.dataproc.v1.stub.GrpcWorkflowTemplateServiceStub
  "gRPC stub implementation for Google Cloud Dataproc API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1.stub GrpcWorkflowTemplateServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dataproc.v1.stub.GrpcWorkflowTemplateServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1.stub.GrpcWorkflowTemplateServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcWorkflowTemplateServiceStub/create client-context callable-factory))
  (^com.google.cloud.dataproc.v1.stub.GrpcWorkflowTemplateServiceStub [^com.google.cloud.dataproc.v1.stub.WorkflowTemplateServiceStubSettings settings]
    (GrpcWorkflowTemplateServiceStub/create settings)))

(defn delete-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.DeleteWorkflowTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.deleteWorkflowTemplateCallable))))

(defn instantiate-workflow-template-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1.InstantiateWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.WorkflowMetadata>`"
  ([^GrpcWorkflowTemplateServiceStub this]
    (-> this (.instantiateWorkflowTemplateOperationCallable))))

(defn instantiate-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.InstantiateWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.instantiateWorkflowTemplateCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcWorkflowTemplateServiceStub this]
    (-> this (.getOperationsStub))))

(defn create-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.CreateWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.createWorkflowTemplateCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcWorkflowTemplateServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcWorkflowTemplateServiceStub this]
    (-> this (.shutdown))))

(defn get-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.GetWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.getWorkflowTemplateCallable))))

(defn list-workflow-templates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1.ListWorkflowTemplatesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.listWorkflowTemplatesCallable))))

(defn list-workflow-templates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.ListWorkflowTemplatesRequest,com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient$ListWorkflowTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.listWorkflowTemplatesPagedCallable))))

(defn close
  ""
  ([^GrpcWorkflowTemplateServiceStub this]
    (-> this (.close))))

(defn update-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest,com.google.cloud.dataproc.v1.WorkflowTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.updateWorkflowTemplateCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.isTerminated))))

(defn instantiate-inline-workflow-template-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.WorkflowMetadata>`"
  ([^GrpcWorkflowTemplateServiceStub this]
    (-> this (.instantiateInlineWorkflowTemplateOperationCallable))))

(defn instantiate-inline-workflow-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcWorkflowTemplateServiceStub this]
    (-> this (.instantiateInlineWorkflowTemplateCallable))))

(defn shutdown-now
  ""
  ([^GrpcWorkflowTemplateServiceStub this]
    (-> this (.shutdownNow))))

