(ns com.google.cloud.automl.v1beta1.AutoMlSettings$Builder
  "Builder for AutoMlSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1 AutoMlSettings$Builder]))

(defn deploy-model-operation-settings
  "Returns the builder for the settings used for calls to deployModel.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.deployModelOperationSettings))))

(defn create-model-settings
  "Returns the builder for the settings used for calls to createModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.createModelSettings))))

(defn delete-model-settings
  "Returns the builder for the settings used for calls to deleteModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.deleteModelSettings))))

(defn create-model-operation-settings
  "Returns the builder for the settings used for calls to createModel.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.cloud.automl.v1beta1.Model,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.createModelOperationSettings))))

(defn undeploy-model-settings
  "Returns the builder for the settings used for calls to undeployModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.undeployModelSettings))))

(defn export-model-settings
  "Returns the builder for the settings used for calls to exportModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.exportModelSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.automl.v1beta1.AutoMlSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.automl.v1beta1.AutoMlSettings$Builder [^AutoMlSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn deploy-model-settings
  "Returns the builder for the settings used for calls to deployModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.deployModelSettings))))

(defn delete-dataset-operation-settings
  "Returns the builder for the settings used for calls to deleteDataset.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.deleteDatasetOperationSettings))))

(defn export-evaluated-examples-operation-settings
  "Returns the builder for the settings used for calls to exportEvaluatedExamples.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.exportEvaluatedExamplesOperationSettings))))

(defn get-model-settings
  "Returns the builder for the settings used for calls to getModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.GetModelRequest,com.google.cloud.automl.v1beta1.Model>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.getModelSettings))))

(defn get-model-evaluation-settings
  "Returns the builder for the settings used for calls to getModelEvaluation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.GetModelEvaluationRequest,com.google.cloud.automl.v1beta1.ModelEvaluation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.getModelEvaluationSettings))))

(defn export-data-operation-settings
  "Returns the builder for the settings used for calls to exportData.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.exportDataOperationSettings))))

(defn export-evaluated-examples-settings
  "Returns the builder for the settings used for calls to exportEvaluatedExamples.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.exportEvaluatedExamplesSettings))))

(defn delete-model-operation-settings
  "Returns the builder for the settings used for calls to deleteModel.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.deleteModelOperationSettings))))

(defn get-table-spec-settings
  "Returns the builder for the settings used for calls to getTableSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.GetTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.getTableSpecSettings))))

(defn update-table-spec-settings
  "Returns the builder for the settings used for calls to updateTableSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.UpdateTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.updateTableSpecSettings))))

(defn list-table-specs-settings
  "Returns the builder for the settings used for calls to listTableSpecs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.automl.v1beta1.ListTableSpecsRequest,com.google.cloud.automl.v1beta1.ListTableSpecsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.listTableSpecsSettings))))

(defn get-dataset-settings
  "Returns the builder for the settings used for calls to getDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.GetDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.getDatasetSettings))))

(defn delete-dataset-settings
  "Returns the builder for the settings used for calls to deleteDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.deleteDatasetSettings))))

(defn import-data-operation-settings
  "Returns the builder for the settings used for calls to importData.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.importDataOperationSettings))))

(defn build
  "returns: `com.google.cloud.automl.v1beta1.AutoMlSettings`

  throws: java.io.IOException"
  (^com.google.cloud.automl.v1beta1.AutoMlSettings [^AutoMlSettings$Builder this]
    (-> this (.build))))

(defn undeploy-model-operation-settings
  "Returns the builder for the settings used for calls to undeployModel.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.undeployModelOperationSettings))))

(defn list-model-evaluations-settings
  "Returns the builder for the settings used for calls to listModelEvaluations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest,com.google.cloud.automl.v1beta1.ListModelEvaluationsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.listModelEvaluationsSettings))))

(defn export-data-settings
  "Returns the builder for the settings used for calls to exportData.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.exportDataSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings$Builder`"
  (^com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings$Builder [^AutoMlSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-dataset-settings
  "Returns the builder for the settings used for calls to updateDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.UpdateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.updateDatasetSettings))))

(defn create-dataset-settings
  "Returns the builder for the settings used for calls to createDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.CreateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.createDatasetSettings))))

(defn list-column-specs-settings
  "Returns the builder for the settings used for calls to listColumnSpecs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.automl.v1beta1.ListColumnSpecsRequest,com.google.cloud.automl.v1beta1.ListColumnSpecsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.listColumnSpecsSettings))))

(defn update-column-spec-settings
  "Returns the builder for the settings used for calls to updateColumnSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.updateColumnSpecSettings))))

(defn get-annotation-spec-settings
  "Returns the builder for the settings used for calls to getAnnotationSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.GetAnnotationSpecRequest,com.google.cloud.automl.v1beta1.AnnotationSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.getAnnotationSpecSettings))))

(defn list-datasets-settings
  "Returns the builder for the settings used for calls to listDatasets.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.automl.v1beta1.ListDatasetsRequest,com.google.cloud.automl.v1beta1.ListDatasetsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.listDatasetsSettings))))

(defn get-column-spec-settings
  "Returns the builder for the settings used for calls to getColumnSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.GetColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.getColumnSpecSettings))))

(defn export-model-operation-settings
  "Returns the builder for the settings used for calls to exportModel.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlSettings$Builder this]
    (-> this (.exportModelOperationSettings))))

(defn import-data-settings
  "Returns the builder for the settings used for calls to importData.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.importDataSettings))))

(defn list-models-settings
  "Returns the builder for the settings used for calls to listModels.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.automl.v1beta1.ListModelsRequest,com.google.cloud.automl.v1beta1.ListModelsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^AutoMlSettings$Builder this]
    (-> this (.listModelsSettings))))

