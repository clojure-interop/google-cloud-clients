(ns com.google.cloud.automl.v1beta1.stub.AutoMlStub
  "Base stub class for Cloud AutoML API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1.stub AutoMlStub]))

(defn ->auto-ml-stub
  "Constructor."
  (^AutoMlStub []
    (new AutoMlStub )))

(defn list-table-specs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListTableSpecsRequest,com.google.cloud.automl.v1beta1.ListTableSpecsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listTableSpecsCallable))))

(defn create-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.cloud.automl.v1beta1.Model,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.createModelOperationCallable))))

(defn delete-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.deleteModelCallable))))

(defn list-table-specs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListTableSpecsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listTableSpecsPagedCallable))))

(defn export-evaluated-examples-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.exportEvaluatedExamplesCallable))))

(defn export-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.exportModelOperationCallable))))

(defn get-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.getDatasetCallable))))

(defn list-model-evaluations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest,com.google.cloud.automl.v1beta1.ListModelEvaluationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listModelEvaluationsCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^AutoMlStub this]
    (-> this (.getOperationsStub))))

(defn deploy-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.deployModelCallable))))

(defn delete-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.deleteModelOperationCallable))))

(defn update-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.updateDatasetCallable))))

(defn get-annotation-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetAnnotationSpecRequest,com.google.cloud.automl.v1beta1.AnnotationSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.getAnnotationSpecCallable))))

(defn create-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.CreateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.createDatasetCallable))))

(defn create-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.createModelCallable))))

(defn get-column-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.getColumnSpecCallable))))

(defn delete-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.deleteDatasetCallable))))

(defn delete-dataset-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.deleteDatasetOperationCallable))))

(defn list-model-evaluations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listModelEvaluationsPagedCallable))))

(defn get-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetModelRequest,com.google.cloud.automl.v1beta1.Model>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.getModelCallable))))

(defn list-models-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listModelsPagedCallable))))

(defn export-evaluated-examples-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.exportEvaluatedExamplesOperationCallable))))

(defn export-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.exportModelCallable))))

(defn import-data-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.importDataCallable))))

(defn undeploy-model-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.undeployModelCallable))))

(defn deploy-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.deployModelOperationCallable))))

(defn list-datasets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListDatasetsRequest,com.google.cloud.automl.v1beta1.ListDatasetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listDatasetsCallable))))

(defn close
  ""
  ([^AutoMlStub this]
    (-> this (.close))))

(defn list-column-specs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListColumnSpecsRequest,com.google.cloud.automl.v1beta1.ListColumnSpecsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listColumnSpecsCallable))))

(defn get-model-evaluation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetModelEvaluationRequest,com.google.cloud.automl.v1beta1.ModelEvaluation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.getModelEvaluationCallable))))

(defn list-column-specs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListColumnSpecsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listColumnSpecsPagedCallable))))

(defn export-data-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.exportDataOperationCallable))))

(defn update-table-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.updateTableSpecCallable))))

(defn list-datasets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListDatasetsRequest,com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listDatasetsPagedCallable))))

(defn import-data-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.importDataOperationCallable))))

(defn update-column-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.updateColumnSpecCallable))))

(defn export-data-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.exportDataCallable))))

(defn undeploy-model-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStub this]
    (-> this (.undeployModelOperationCallable))))

(defn list-models-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.ListModelsRequest,com.google.cloud.automl.v1beta1.ListModelsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.listModelsCallable))))

(defn get-table-spec-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.GetTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoMlStub this]
    (-> this (.getTableSpecCallable))))

