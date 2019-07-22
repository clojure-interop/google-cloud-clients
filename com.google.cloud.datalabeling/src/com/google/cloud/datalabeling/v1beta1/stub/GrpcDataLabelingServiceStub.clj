(ns com.google.cloud.datalabeling.v1beta1.stub.GrpcDataLabelingServiceStub
  "gRPC stub implementation for Data Labeling API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1.stub GrpcDataLabelingServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.datalabeling.v1beta1.stub.GrpcDataLabelingServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.datalabeling.v1beta1.stub.GrpcDataLabelingServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcDataLabelingServiceStub/create client-context callable-factory))
  (^com.google.cloud.datalabeling.v1beta1.stub.GrpcDataLabelingServiceStub [^com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings settings]
    (GrpcDataLabelingServiceStub/create settings)))

(defn list-evaluation-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listEvaluationJobsCallable))))

(defn pause-evaluation-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.pauseEvaluationJobCallable))))

(defn list-annotation-spec-sets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listAnnotationSpecSetsPagedCallable))))

(defn get-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,com.google.cloud.datalabeling.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.getDatasetCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.getOperationsStub))))

(defn delete-annotation-spec-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.deleteAnnotationSpecSetCallable))))

(defn list-annotated-datasets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listAnnotatedDatasetsCallable))))

(defn create-annotation-spec-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.createAnnotationSpecSetCallable))))

(defn get-evaluation-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.getEvaluationJobCallable))))

(defn list-data-items-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDataItemsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listDataItemsPagedCallable))))

(defn delete-instruction-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.deleteInstructionCallable))))

(defn create-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,com.google.cloud.datalabeling.v1beta1.Dataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.createDatasetCallable))))

(defn get-instruction-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,com.google.cloud.datalabeling.v1beta1.Instruction>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.getInstructionCallable))))

(defn delete-annotated-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.deleteAnnotatedDatasetCallable))))

(defn list-examples-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listExamplesCallable))))

(defn get-evaluation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,com.google.cloud.datalabeling.v1beta1.Evaluation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.getEvaluationCallable))))

(defn list-annotation-spec-sets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listAnnotationSpecSetsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcDataLabelingServiceStub this]
    (-> this (.isShutdown))))

(defn delete-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.deleteDatasetCallable))))

(defn search-evaluations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.searchEvaluationsPagedCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcDataLabelingServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn label-text-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.labelTextCallable))))

(defn create-instruction-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.createInstructionCallable))))

(defn label-video-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.labelVideoCallable))))

(defn shutdown
  ""
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.shutdown))))

(defn list-evaluation-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listEvaluationJobsPagedCallable))))

(defn list-instructions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListInstructionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listInstructionsPagedCallable))))

(defn update-evaluation-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.updateEvaluationJobCallable))))

(defn list-instructions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listInstructionsCallable))))

(defn get-annotation-spec-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.getAnnotationSpecSetCallable))))

(defn list-annotated-datasets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listAnnotatedDatasetsPagedCallable))))

(defn import-data-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.importDataCallable))))

(defn list-datasets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listDatasetsCallable))))

(defn close
  ""
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.close))))

(defn get-annotated-dataset-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.getAnnotatedDatasetCallable))))

(defn create-evaluation-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,com.google.cloud.datalabeling.v1beta1.EvaluationJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.createEvaluationJobCallable))))

(defn label-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.labelImageCallable))))

(defn search-example-comparisons-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.searchExampleComparisonsCallable))))

(defn label-text-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.labelTextOperationCallable))))

(defn export-data-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,com.google.cloud.datalabeling.v1beta1.ExportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ExportDataOperationMetadata>`"
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.exportDataOperationCallable))))

(defn get-data-item-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,com.google.cloud.datalabeling.v1beta1.DataItem>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.getDataItemCallable))))

(defn delete-evaluation-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.deleteEvaluationJobCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcDataLabelingServiceStub this]
    (-> this (.isTerminated))))

(defn list-datasets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListDatasetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listDatasetsPagedCallable))))

(defn get-example-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.GetExampleRequest,com.google.cloud.datalabeling.v1beta1.Example>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.getExampleCallable))))

(defn create-instruction-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,com.google.cloud.datalabeling.v1beta1.Instruction,com.google.cloud.datalabeling.v1beta1.CreateInstructionMetadata>`"
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.createInstructionOperationCallable))))

(defn import-data-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,com.google.cloud.datalabeling.v1beta1.ImportDataOperationResponse,com.google.cloud.datalabeling.v1beta1.ImportDataOperationMetadata>`"
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.importDataOperationCallable))))

(defn search-example-comparisons-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.searchExampleComparisonsPagedCallable))))

(defn list-examples-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListExamplesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listExamplesPagedCallable))))

(defn search-evaluations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.searchEvaluationsCallable))))

(defn label-image-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.labelImageOperationCallable))))

(defn export-data-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.exportDataCallable))))

(defn resume-evaluation-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.resumeEvaluationJobCallable))))

(defn list-data-items-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataLabelingServiceStub this]
    (-> this (.listDataItemsCallable))))

(defn shutdown-now
  ""
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.shutdownNow))))

(defn label-video-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,com.google.cloud.datalabeling.v1beta1.LabelOperationMetadata>`"
  ([^GrpcDataLabelingServiceStub this]
    (-> this (.labelVideoOperationCallable))))

