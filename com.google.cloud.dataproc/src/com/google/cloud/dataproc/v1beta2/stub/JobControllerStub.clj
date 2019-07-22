(ns com.google.cloud.dataproc.v1beta2.stub.JobControllerStub
  "Base stub class for Google Cloud Dataproc API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2.stub JobControllerStub]))

(defn ->job-controller-stub
  "Constructor."
  (^JobControllerStub []
    (new JobControllerStub )))

(defn submit-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.SubmitJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerStub this]
    (-> this (.submitJobCallable))))

(defn get-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.GetJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerStub this]
    (-> this (.getJobCallable))))

(defn list-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListJobsRequest,com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerStub this]
    (-> this (.listJobsPagedCallable))))

(defn list-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.ListJobsRequest,com.google.cloud.dataproc.v1beta2.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerStub this]
    (-> this (.listJobsCallable))))

(defn update-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.UpdateJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerStub this]
    (-> this (.updateJobCallable))))

(defn cancel-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.CancelJobRequest,com.google.cloud.dataproc.v1beta2.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerStub this]
    (-> this (.cancelJobCallable))))

(defn delete-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1beta2.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^JobControllerStub this]
    (-> this (.deleteJobCallable))))

(defn close
  ""
  ([^JobControllerStub this]
    (-> this (.close))))

