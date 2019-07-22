(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings$Builder
  "Builder for DataLabelingServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceSettings$Builder]))

(defn get-annotation-spec-set-settings
  "Returns the builder for the settings used for calls to getAnnotationSpecSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getAnnotationSpecSetSettings))))

(defn get-data-item-settings
  "Returns the builder for the settings used for calls to getDataItem.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,com.google.cloud.datalabeling.v1beta1.DataItem>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getDataItemSettings))))

(defn delete-evaluation-job-settings
  "Returns the builder for the settings used for calls to deleteEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.deleteEvaluationJobSettings))))

(defn search-evaluations-settings
  "Returns the builder for the settings used for calls to searchEvaluations.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.searchEvaluationsSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings$Builder [^DataLabelingServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn search-example-comparisons-settings
  "Returns the builder for the settings used for calls to searchExampleComparisons.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.searchExampleComparisonsSettings))))

(defn get-evaluation-job-settings
  "Returns the builder for the settings used for calls to getEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getEvaluationJobSettings))))

(defn get-annotated-dataset-settings
  "Returns the builder for the settings used for calls to getAnnotatedDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getAnnotatedDatasetSettings))))

(defn resume-evaluation-job-settings
  "Returns the builder for the settings used for calls to resumeEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.resumeEvaluationJobSettings))))

(defn label-image-settings
  "Returns the builder for the settings used for calls to labelImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.labelImageSettings))))

(defn create-annotation-spec-set-settings
  "Returns the builder for the settings used for calls to createAnnotationSpecSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.createAnnotationSpecSetSettings))))

(defn export-data-operation-settings
  "Returns the builder for the settings used for calls to exportData.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,com.google.cloud.datalabeling.v1beta1.ExportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ExportDataOperationMetadata>`"
  ([^DataLabelingServiceSettings$Builder this]
    (-> this (.exportDataOperationSettings))))

(defn delete-annotated-dataset-settings
  "Returns the builder for the settings used for calls to deleteAnnotatedDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.deleteAnnotatedDatasetSettings))))

(defn get-example-settings
  "Returns the builder for the settings used for calls to getExample.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.GetExampleRequest,com.google.cloud.datalabeling.v1beta1.Example>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getExampleSettings))))

(defn list-annotated-datasets-settings
  "Returns the builder for the settings used for calls to listAnnotatedDatasets.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.listAnnotatedDatasetsSettings))))

(defn get-dataset-settings
  "Returns the builder for the settings used for calls to getDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,com.google.cloud.datalabeling.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getDatasetSettings))))

(defn create-evaluation-job-settings
  "Returns the builder for the settings used for calls to createEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.createEvaluationJobSettings))))

(defn delete-instruction-settings
  "Returns the builder for the settings used for calls to deleteInstruction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.deleteInstructionSettings))))

(defn delete-annotation-spec-set-settings
  "Returns the builder for the settings used for calls to deleteAnnotationSpecSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.deleteAnnotationSpecSetSettings))))

(defn delete-dataset-settings
  "Returns the builder for the settings used for calls to deleteDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.deleteDatasetSettings))))

(defn pause-evaluation-job-settings
  "Returns the builder for the settings used for calls to pauseEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.pauseEvaluationJobSettings))))

(defn import-data-operation-settings
  "Returns the builder for the settings used for calls to importData.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,com.google.cloud.datalabeling.v1beta1.ImportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ImportDataOperationMetadata>`"
  ([^DataLabelingServiceSettings$Builder this]
    (-> this (.importDataOperationSettings))))

(defn build
  "returns: `com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.datalabeling.v1beta1.DataLabelingServiceSettings [^DataLabelingServiceSettings$Builder this]
    (-> this (.build))))

(defn export-data-settings
  "Returns the builder for the settings used for calls to exportData.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.exportDataSettings))))

(defn list-examples-settings
  "Returns the builder for the settings used for calls to listExamples.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,com.google.cloud.datalabeling.v1beta1.ListExamplesResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.listExamplesSettings))))

(defn list-data-items-settings
  "Returns the builder for the settings used for calls to listDataItems.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.listDataItemsSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings$Builder`"
  (^com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings$Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-evaluation-job-settings
  "Returns the builder for the settings used for calls to updateEvaluationJob.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.updateEvaluationJobSettings))))

(defn create-dataset-settings
  "Returns the builder for the settings used for calls to createDataset.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,com.google.cloud.datalabeling.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.createDatasetSettings))))

(defn label-image-operation-settings
  "Returns the builder for the settings used for calls to labelImage.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceSettings$Builder this]
    (-> this (.labelImageOperationSettings))))

(defn create-instruction-settings
  "Returns the builder for the settings used for calls to createInstruction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.createInstructionSettings))))

(defn label-text-operation-settings
  "Returns the builder for the settings used for calls to labelText.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceSettings$Builder this]
    (-> this (.labelTextOperationSettings))))

(defn list-instructions-settings
  "Returns the builder for the settings used for calls to listInstructions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.listInstructionsSettings))))

(defn list-datasets-settings
  "Returns the builder for the settings used for calls to listDatasets.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.listDatasetsSettings))))

(defn create-instruction-operation-settings
  "Returns the builder for the settings used for calls to createInstruction.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,com.google.cloud.datalabeling.v1beta1.Instruction,com.google.cloud.datalabeling.v1beta1.CreateInstructionMetadata>`"
  ([^DataLabelingServiceSettings$Builder this]
    (-> this (.createInstructionOperationSettings))))

(defn label-text-settings
  "Returns the builder for the settings used for calls to labelText.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.labelTextSettings))))

(defn label-video-operation-settings
  "Returns the builder for the settings used for calls to labelVideo.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^DataLabelingServiceSettings$Builder this]
    (-> this (.labelVideoOperationSettings))))

(defn get-instruction-settings
  "Returns the builder for the settings used for calls to getInstruction.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,com.google.cloud.datalabeling.v1beta1.Instruction>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getInstructionSettings))))

(defn import-data-settings
  "Returns the builder for the settings used for calls to importData.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.importDataSettings))))

(defn label-video-settings
  "Returns the builder for the settings used for calls to labelVideo.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.labelVideoSettings))))

(defn get-evaluation-settings
  "Returns the builder for the settings used for calls to getEvaluation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,com.google.cloud.datalabeling.v1beta1.Evaluation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.getEvaluationSettings))))

(defn list-annotation-spec-sets-settings
  "Returns the builder for the settings used for calls to listAnnotationSpecSets.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.listAnnotationSpecSetsSettings))))

(defn list-evaluation-jobs-settings
  "Returns the builder for the settings used for calls to listEvaluationJobs.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataLabelingServiceSettings$Builder this]
    (-> this (.listEvaluationJobsSettings))))

