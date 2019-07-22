(ns com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings
  "Settings class to configure an instance of AutoMlStub.

  The default instance has everything set to sensible defaults:


    The default service address (automl.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createDataset to 30 seconds:



  AutoMlStubSettings.Builder autoMlSettingsBuilder =
      AutoMlStubSettings.newBuilder();
  autoMlSettingsBuilder.createDatasetSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AutoMlStubSettings autoMlSettings = autoMlSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1.stub AutoMlStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AutoMlStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AutoMlStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AutoMlStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AutoMlStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (AutoMlStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AutoMlStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AutoMlStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings$Builder`"
  (^com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AutoMlStubSettings/newBuilder client-context))
  (^com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings$Builder []
    (AutoMlStubSettings/newBuilder )))

(defn deploy-model-operation-settings
  "Returns the object with the settings used for calls to deployModel.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.deployModelOperationSettings))))

(defn create-model-settings
  "Returns the object with the settings used for calls to createModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.createModelSettings))))

(defn delete-model-settings
  "Returns the object with the settings used for calls to deleteModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.deleteModelSettings))))

(defn create-model-operation-settings
  "Returns the object with the settings used for calls to createModel.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.CreateModelRequest,com.google.cloud.automl.v1beta1.Model,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.createModelOperationSettings))))

(defn undeploy-model-settings
  "Returns the object with the settings used for calls to undeployModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.undeployModelSettings))))

(defn export-model-settings
  "Returns the object with the settings used for calls to exportModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.exportModelSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.automl.v1beta1.stub.AutoMlStub`

  throws: java.io.IOException"
  ([^AutoMlStubSettings this]
    (-> this (.createStub))))

(defn deploy-model-settings
  "Returns the object with the settings used for calls to deployModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.DeployModelRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.deployModelSettings))))

(defn delete-dataset-operation-settings
  "Returns the object with the settings used for calls to deleteDataset.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.deleteDatasetOperationSettings))))

(defn export-evaluated-examples-operation-settings
  "Returns the object with the settings used for calls to exportEvaluatedExamples.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.exportEvaluatedExamplesOperationSettings))))

(defn get-model-settings
  "Returns the object with the settings used for calls to getModel.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.GetModelRequest,com.google.cloud.automl.v1beta1.Model>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.getModelSettings))))

(defn get-model-evaluation-settings
  "Returns the object with the settings used for calls to getModelEvaluation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.GetModelEvaluationRequest,com.google.cloud.automl.v1beta1.ModelEvaluation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.getModelEvaluationSettings))))

(defn export-data-operation-settings
  "Returns the object with the settings used for calls to exportData.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.exportDataOperationSettings))))

(defn export-evaluated-examples-settings
  "Returns the object with the settings used for calls to exportEvaluatedExamples.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.exportEvaluatedExamplesSettings))))

(defn delete-model-operation-settings
  "Returns the object with the settings used for calls to deleteModel.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.DeleteModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.deleteModelOperationSettings))))

(defn get-table-spec-settings
  "Returns the object with the settings used for calls to getTableSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.GetTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.getTableSpecSettings))))

(defn update-table-spec-settings
  "Returns the object with the settings used for calls to updateTableSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.UpdateTableSpecRequest,com.google.cloud.automl.v1beta1.TableSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.updateTableSpecSettings))))

(defn list-table-specs-settings
  "Returns the object with the settings used for calls to listTableSpecs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.automl.v1beta1.ListTableSpecsRequest,com.google.cloud.automl.v1beta1.ListTableSpecsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListTableSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AutoMlStubSettings this]
    (-> this (.listTableSpecsSettings))))

(defn get-dataset-settings
  "Returns the object with the settings used for calls to getDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.GetDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.getDatasetSettings))))

(defn delete-dataset-settings
  "Returns the object with the settings used for calls to deleteDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.DeleteDatasetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.deleteDatasetSettings))))

(defn import-data-operation-settings
  "Returns the object with the settings used for calls to importData.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.importDataOperationSettings))))

(defn undeploy-model-operation-settings
  "Returns the object with the settings used for calls to undeployModel.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.UndeployModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.undeployModelOperationSettings))))

(defn list-model-evaluations-settings
  "Returns the object with the settings used for calls to listModelEvaluations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest,com.google.cloud.automl.v1beta1.ListModelEvaluationsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AutoMlStubSettings this]
    (-> this (.listModelEvaluationsSettings))))

(defn export-data-settings
  "Returns the object with the settings used for calls to exportData.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.exportDataSettings))))

(defn update-dataset-settings
  "Returns the object with the settings used for calls to updateDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.UpdateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.updateDatasetSettings))))

(defn create-dataset-settings
  "Returns the object with the settings used for calls to createDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.CreateDatasetRequest,com.google.cloud.automl.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.createDatasetSettings))))

(defn list-column-specs-settings
  "Returns the object with the settings used for calls to listColumnSpecs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.automl.v1beta1.ListColumnSpecsRequest,com.google.cloud.automl.v1beta1.ListColumnSpecsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListColumnSpecsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AutoMlStubSettings this]
    (-> this (.listColumnSpecsSettings))))

(defn update-column-spec-settings
  "Returns the object with the settings used for calls to updateColumnSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.UpdateColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.updateColumnSpecSettings))))

(defn get-annotation-spec-settings
  "Returns the object with the settings used for calls to getAnnotationSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.GetAnnotationSpecRequest,com.google.cloud.automl.v1beta1.AnnotationSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.getAnnotationSpecSettings))))

(defn list-datasets-settings
  "Returns the object with the settings used for calls to listDatasets.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.automl.v1beta1.ListDatasetsRequest,com.google.cloud.automl.v1beta1.ListDatasetsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AutoMlStubSettings this]
    (-> this (.listDatasetsSettings))))

(defn get-column-spec-settings
  "Returns the object with the settings used for calls to getColumnSpec.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.GetColumnSpecRequest,com.google.cloud.automl.v1beta1.ColumnSpec>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.getColumnSpecSettings))))

(defn export-model-operation-settings
  "Returns the object with the settings used for calls to exportModel.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.automl.v1beta1.ExportModelRequest,com.google.protobuf.Empty,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^AutoMlStubSettings this]
    (-> this (.exportModelOperationSettings))))

(defn import-data-settings
  "Returns the object with the settings used for calls to importData.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.automl.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoMlStubSettings this]
    (-> this (.importDataSettings))))

(defn list-models-settings
  "Returns the object with the settings used for calls to listModels.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.automl.v1beta1.ListModelsRequest,com.google.cloud.automl.v1beta1.ListModelsResponse,com.google.cloud.automl.v1beta1.AutoMlClient$ListModelsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AutoMlStubSettings this]
    (-> this (.listModelsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings$Builder`"
  (^com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings$Builder [^AutoMlStubSettings this]
    (-> this (.toBuilder))))

