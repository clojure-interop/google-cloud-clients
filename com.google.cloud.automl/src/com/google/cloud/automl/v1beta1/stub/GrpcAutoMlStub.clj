(ns com.google.cloud.automl.v1beta1.stub.GrpcAutoMlStub
  "gRPC stub implementation for Cloud AutoML API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1.stub GrpcAutoMlStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.automl.v1beta1.stub.GrpcAutoMlStub`

  throws: java.io.IOException"
  (^com.google.cloud.automl.v1beta1.stub.GrpcAutoMlStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcAutoMlStub/create client-context callable-factory))
  (^com.google.cloud.automl.v1beta1.stub.GrpcAutoMlStub [^com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings settings]
    (GrpcAutoMlStub/create settings)))

(defn list-table-specs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListTableSpecsRequest,com.google.cloud.automl.v1beta1.ListTableSpecsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listTableSpecsCallable))))

(defn create-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.cloud.automl.v1beta1.Model,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.createModelOperationCallable))))

(defn delete-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.deleteModelCallable))))

(defn list-table-specs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListTableSpecsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listTableSpecsPagedCallable))))

(defn export-evaluated-examples-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.exportEvaluatedExamplesCallable))))

(defn export-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.exportModelOperationCallable))))

(defn get-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.getDatasetCallable))))

(defn list-model-evaluations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest,com.google.cloud.automl.v1beta1.ListModelEvaluationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listModelEvaluationsCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcAutoMlStub this]
    (-> this (.getOperationsStub))))

(defn deploy-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.deployModelCallable))))

(defn delete-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.deleteModelOperationCallable))))

(defn update-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.updateDatasetCallable))))

(defn get-annotation-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetAnnotationSpecRequest,com.google.cloud.automl.v1beta1.AnnotationSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.getAnnotationSpecCallable))))

(defn create-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.CreateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.createDatasetCallable))))

(defn create-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.createModelCallable))))

(defn get-column-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.getColumnSpecCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcAutoMlStub this]
    (-> this (.isShutdown))))

(defn delete-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.deleteDatasetCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcAutoMlStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-dataset-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.deleteDatasetOperationCallable))))

(defn shutdown
  ""
  ([^GrpcAutoMlStub this]
    (-> this (.shutdown))))

(defn list-model-evaluations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listModelEvaluationsPagedCallable))))

(defn get-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetModelRequest,com.google.cloud.automl.v1beta1.Model>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.getModelCallable))))

(defn list-models-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listModelsPagedCallable))))

(defn export-evaluated-examples-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.exportEvaluatedExamplesOperationCallable))))

(defn export-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.exportModelCallable))))

(defn import-data-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.importDataCallable))))

(defn undeploy-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.undeployModelCallable))))

(defn deploy-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.deployModelOperationCallable))))

(defn list-datasets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListDatasetsRequest,com.google.cloud.automl.v1beta1.ListDatasetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listDatasetsCallable))))

(defn close
  ""
  ([^GrpcAutoMlStub this]
    (-> this (.close))))

(defn list-column-specs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListColumnSpecsRequest,com.google.cloud.automl.v1beta1.ListColumnSpecsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listColumnSpecsCallable))))

(defn get-model-evaluation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetModelEvaluationRequest,com.google.cloud.automl.v1beta1.ModelEvaluation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.getModelEvaluationCallable))))

(defn list-column-specs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListColumnSpecsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listColumnSpecsPagedCallable))))

(defn export-data-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.exportDataOperationCallable))))

(defn update-table-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.updateTableSpecCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcAutoMlStub this]
    (-> this (.isTerminated))))

(defn list-datasets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListDatasetsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listDatasetsPagedCallable))))

(defn import-data-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.importDataOperationCallable))))

(defn update-column-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.updateColumnSpecCallable))))

(defn export-data-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.exportDataCallable))))

(defn undeploy-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcAutoMlStub this]
    (-> this (.undeployModelOperationCallable))))

(defn shutdown-now
  ""
  ([^GrpcAutoMlStub this]
    (-> this (.shutdownNow))))

(defn list-models-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelsRequest,com.google.cloud.automl.v1beta1.ListModelsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.listModelsCallable))))

(defn get-table-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAutoMlStub this]
    (-> this (.getTableSpecCallable))))

