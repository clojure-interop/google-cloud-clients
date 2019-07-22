(ns com.google.cloud.scheduler.v1.stub.CloudSchedulerStub
  "Base stub class for Cloud Scheduler API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1.stub CloudSchedulerStub]))

(defn ->cloud-scheduler-stub
  "Constructor."
  (^CloudSchedulerStub []
    (new CloudSchedulerStub )))

(defn update-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.UpdateJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.updateJobCallable))))

(defn run-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.RunJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.runJobCallable))))

(defn list-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.ListJobsRequest,com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.listJobsPagedCallable))))

(defn list-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.ListJobsRequest,com.google.cloud.scheduler.v1.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.listJobsCallable))))

(defn delete-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.deleteJobCallable))))

(defn resume-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.ResumeJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.resumeJobCallable))))

(defn close
  ""
  ([^CloudSchedulerStub this]
    (-> this (.close))))

(defn pause-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.PauseJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.pauseJobCallable))))

(defn get-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.GetJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.getJobCallable))))

(defn create-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1.CreateJobRequest,com.google.cloud.scheduler.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudSchedulerStub this]
    (-> this (.createJobCallable))))

