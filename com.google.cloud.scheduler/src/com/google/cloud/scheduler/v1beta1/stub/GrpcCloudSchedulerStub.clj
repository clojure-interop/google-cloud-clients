(ns com.google.cloud.scheduler.v1beta1.stub.GrpcCloudSchedulerStub
  "gRPC stub implementation for Cloud Scheduler API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1beta1.stub GrpcCloudSchedulerStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.scheduler.v1beta1.stub.GrpcCloudSchedulerStub`

  throws: java.io.IOException"
  (^com.google.cloud.scheduler.v1beta1.stub.GrpcCloudSchedulerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcCloudSchedulerStub/create client-context callable-factory))
  (^com.google.cloud.scheduler.v1beta1.stub.GrpcCloudSchedulerStub [^com.google.cloud.scheduler.v1beta1.stub.CloudSchedulerStubSettings settings]
    (GrpcCloudSchedulerStub/create settings)))

(defn update-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.UpdateJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.updateJobCallable))))

(defn run-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.RunJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.runJobCallable))))

(defn list-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.ListJobsRequest,com.google.cloud.scheduler.v1beta1.CloudSchedulerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.listJobsPagedCallable))))

(defn list-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.ListJobsRequest,com.google.cloud.scheduler.v1beta1.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.listJobsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcCloudSchedulerStub this]
    (-> this (.isShutdown))))

(defn delete-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.deleteJobCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcCloudSchedulerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn resume-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.ResumeJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.resumeJobCallable))))

(defn shutdown
  ""
  ([^GrpcCloudSchedulerStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcCloudSchedulerStub this]
    (-> this (.close))))

(defn pause-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.PauseJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.pauseJobCallable))))

(defn get-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.GetJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.getJobCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcCloudSchedulerStub this]
    (-> this (.isTerminated))))

(defn create-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.scheduler.v1beta1.CreateJobRequest,com.google.cloud.scheduler.v1beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudSchedulerStub this]
    (-> this (.createJobCallable))))

(defn shutdown-now
  ""
  ([^GrpcCloudSchedulerStub this]
    (-> this (.shutdownNow))))

