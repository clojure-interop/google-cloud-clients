(ns com.google.cloud.talent.v4beta1.stub.JobServiceStub
  "Base stub class for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub JobServiceStub]))

(defn ->job-service-stub
  "Constructor."
  (^JobServiceStub []
    (new JobServiceStub )))

(defn batch-update-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.batchUpdateJobsCallable))))

(defn search-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.searchJobsPagedCallable))))

(defn batch-create-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.batchCreateJobsCallable))))

(defn batch-update-jobs-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceStub this]
    (-> this (.batchUpdateJobsOperationCallable))))

(defn update-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.updateJobCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^JobServiceStub this]
    (-> this (.getOperationsStub))))

(defn list-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.listJobsPagedCallable))))

(defn list-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.listJobsCallable))))

(defn delete-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.deleteJobCallable))))

(defn search-jobs-for-alert-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.searchJobsForAlertCallable))))

(defn close
  ""
  ([^JobServiceStub this]
    (-> this (.close))))

(defn batch-create-jobs-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^JobServiceStub this]
    (-> this (.batchCreateJobsOperationCallable))))

(defn get-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.getJobCallable))))

(defn search-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.searchJobsCallable))))

(defn create-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.createJobCallable))))

(defn search-jobs-for-alert-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.searchJobsForAlertPagedCallable))))

(defn batch-delete-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchDeleteJobsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobServiceStub this]
    (-> this (.batchDeleteJobsCallable))))

