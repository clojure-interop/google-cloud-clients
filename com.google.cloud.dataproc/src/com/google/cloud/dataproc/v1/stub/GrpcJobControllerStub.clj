(ns com.google.cloud.dataproc.v1.stub.GrpcJobControllerStub
  "gRPC stub implementation for Google Cloud Dataproc API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1.stub GrpcJobControllerStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.dataproc.v1.stub.GrpcJobControllerStub`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1.stub.GrpcJobControllerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcJobControllerStub/create client-context callable-factory))
  (^com.google.cloud.dataproc.v1.stub.GrpcJobControllerStub [^com.google.cloud.dataproc.v1.stub.JobControllerStubSettings settings]
    (GrpcJobControllerStub/create settings)))

(defn update-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.UpdateJobRequest,com.google.cloud.dataproc.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobControllerStub this]
    (-> this (.updateJobCallable))))

(defn list-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.ListJobsRequest,com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobControllerStub this]
    (-> this (.listJobsPagedCallable))))

(defn list-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.ListJobsRequest,com.google.cloud.dataproc.v1.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobControllerStub this]
    (-> this (.listJobsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcJobControllerStub this]
    (-> this (.isShutdown))))

(defn delete-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobControllerStub this]
    (-> this (.deleteJobCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcJobControllerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcJobControllerStub this]
    (-> this (.shutdown))))

(defn submit-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.SubmitJobRequest,com.google.cloud.dataproc.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobControllerStub this]
    (-> this (.submitJobCallable))))

(defn close
  ""
  ([^GrpcJobControllerStub this]
    (-> this (.close))))

(defn get-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.GetJobRequest,com.google.cloud.dataproc.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobControllerStub this]
    (-> this (.getJobCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcJobControllerStub this]
    (-> this (.isTerminated))))

(defn cancel-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dataproc.v1.CancelJobRequest,com.google.cloud.dataproc.v1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobControllerStub this]
    (-> this (.cancelJobCallable))))

(defn shutdown-now
  ""
  ([^GrpcJobControllerStub this]
    (-> this (.shutdownNow))))

