(ns com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings
  "Settings class to configure an instance of DataLabelingServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (datalabeling.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createDataset to 30 seconds:



  DataLabelingServiceStubSettings.Builder dataLabelingServiceSettingsBuilder =
      DataLabelingServiceStubSettings.newBuilder();
  dataLabelingServiceSettingsBuilder.createDatasetSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DataLabelingServiceStubSettings dataLabelingServiceSettings = dataLabelingServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1.stub DataLabelingServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DataLabelingServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DataLabelingServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DataLabelingServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DataLabelingServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DataLabelingServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DataLabelingServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DataLabelingServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings$Builder`"
  (^com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DataLabelingServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings$Builder []
    (DataLabelingServiceStubSettings/newBuilder )))

(defn get-annotation-spec-set-settings
  "Returns the object with the settings used for calls to getAnnotationSpecSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.getAnnotationSpecSetSettings))))

(defn get-data-item-settings
  "Returns the object with the settings used for calls to getDataItem.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,com.google.cloud.datalabeling.v1beta1.DataItem>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.getDataItemSettings))))

(defn delete-evaluation-job-settings
  "Returns the object with the settings used for calls to deleteEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.deleteEvaluationJobSettings))))

(defn search-evaluations-settings
  "Returns the object with the settings used for calls to searchEvaluations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.searchEvaluationsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStub`

  throws: java.io.IOException"
  ([^DataLabelingServiceStubSettings this]
    (-> this (.createStub))))

(defn search-example-comparisons-settings
  "Returns the object with the settings used for calls to searchExampleComparisons.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.searchExampleComparisonsSettings))))

(defn get-evaluation-job-settings
  "Returns the object with the settings used for calls to getEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.getEvaluationJobSettings))))

(defn get-annotated-dataset-settings
  "Returns the object with the settings used for calls to getAnnotatedDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.getAnnotatedDatasetSettings))))

(defn resume-evaluation-job-settings
  "Returns the object with the settings used for calls to resumeEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.resumeEvaluationJobSettings))))

(defn label-image-settings
  "Returns the object with the settings used for calls to labelImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.labelImageSettings))))

(defn create-annotation-spec-set-settings
  "Returns the object with the settings used for calls to createAnnotationSpecSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.createAnnotationSpecSetSettings))))

(defn export-data-operation-settings
  "Returns the object with the settings used for calls to exportData.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,com.google.cloud.datalabeling.v1beta1.ExportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ExportDataOperationMetadata>`"
  ([^DataLabelingServiceStubSettings this]
    (-> this (.exportDataOperationSettings))))

(defn delete-annotated-dataset-settings
  "Returns the object with the settings used for calls to deleteAnnotatedDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.deleteAnnotatedDatasetSettings))))

(defn get-example-settings
  "Returns the object with the settings used for calls to getExample.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.GetExampleRequest,com.google.cloud.datalabeling.v1beta1.Example>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.getExampleSettings))))

(defn list-annotated-datasets-settings
  "Returns the object with the settings used for calls to listAnnotatedDatasets.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.listAnnotatedDatasetsSettings))))

(defn get-dataset-settings
  "Returns the object with the settings used for calls to getDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,com.google.cloud.datalabeling.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.getDatasetSettings))))

(defn create-evaluation-job-settings
  "Returns the object with the settings used for calls to createEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.createEvaluationJobSettings))))

(defn delete-instruction-settings
  "Returns the object with the settings used for calls to deleteInstruction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.deleteInstructionSettings))))

(defn delete-annotation-spec-set-settings
  "Returns the object with the settings used for calls to deleteAnnotationSpecSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.deleteAnnotationSpecSetSettings))))

(defn delete-dataset-settings
  "Returns the object with the settings used for calls to deleteDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.deleteDatasetSettings))))

(defn pause-evaluation-job-settings
  "Returns the object with the settings used for calls to pauseEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.pauseEvaluationJobSettings))))

(defn import-data-operation-settings
  "Returns the object with the settings used for calls to importData.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,com.google.cloud.datalabeling.v1beta1.ImportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ImportDataOperationMetadata>`"
  ([^DataLabelingServiceStubSettings this]
    (-> this (.importDataOperationSettings))))

(defn export-data-settings
  "Returns the object with the settings used for calls to exportData.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.exportDataSettings))))

(defn list-examples-settings
  "Returns the object with the settings used for calls to listExamples.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,com.google.cloud.datalabeling.v1beta1.ListExamplesResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.listExamplesSettings))))

(defn list-data-items-settings
  "Returns the object with the settings used for calls to listDataItems.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.listDataItemsSettings))))

(defn update-evaluation-job-settings
  "Returns the object with the settings used for calls to updateEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.updateEvaluationJobSettings))))

(defn create-dataset-settings
  "Returns the object with the settings used for calls to createDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,com.google.cloud.datalabeling.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.createDatasetSettings))))

(defn label-image-operation-settings
  "Returns the object with the settings used for calls to labelImage.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceStubSettings this]
    (-> this (.labelImageOperationSettings))))

(defn create-instruction-settings
  "Returns the object with the settings used for calls to createInstruction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.createInstructionSettings))))

(defn label-text-operation-settings
  "Returns the object with the settings used for calls to labelText.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceStubSettings this]
    (-> this (.labelTextOperationSettings))))

(defn list-instructions-settings
  "Returns the object with the settings used for calls to listInstructions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.listInstructionsSettings))))

(defn list-datasets-settings
  "Returns the object with the settings used for calls to listDatasets.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.listDatasetsSettings))))

(defn create-instruction-operation-settings
  "Returns the object with the settings used for calls to createInstruction.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,com.google.cloud.datalabeling.v1beta1.Instruction,com.google.cloud.datalabeling.v1beta1.CreateInstructionMetadata>`"
  ([^DataLabelingServiceStubSettings this]
    (-> this (.createInstructionOperationSettings))))

(defn label-text-settings
  "Returns the object with the settings used for calls to labelText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.labelTextSettings))))

(defn label-video-operation-settings
  "Returns the object with the settings used for calls to labelVideo.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceStubSettings this]
    (-> this (.labelVideoOperationSettings))))

(defn get-instruction-settings
  "Returns the object with the settings used for calls to getInstruction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,com.google.cloud.datalabeling.v1beta1.Instruction>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.getInstructionSettings))))

(defn import-data-settings
  "Returns the object with the settings used for calls to importData.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.importDataSettings))))

(defn label-video-settings
  "Returns the object with the settings used for calls to labelVideo.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.labelVideoSettings))))

(defn get-evaluation-settings
  "Returns the object with the settings used for calls to getEvaluation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,com.google.cloud.datalabeling.v1beta1.Evaluation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.getEvaluationSettings))))

(defn list-annotation-spec-sets-settings
  "Returns the object with the settings used for calls to listAnnotationSpecSets.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.listAnnotationSpecSetsSettings))))

(defn list-evaluation-jobs-settings
  "Returns the object with the settings used for calls to listEvaluationJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataLabelingServiceStubSettings this]
    (-> this (.listEvaluationJobsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings$Builder`"
  (^com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings$Builder [^DataLabelingServiceStubSettings this]
    (-> this (.toBuilder))))

