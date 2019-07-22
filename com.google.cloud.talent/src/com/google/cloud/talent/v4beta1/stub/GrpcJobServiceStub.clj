(ns com.google.cloud.talent.v4beta1.stub.GrpcJobServiceStub
  "gRPC stub implementation for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub GrpcJobServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.talent.v4beta1.stub.GrpcJobServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.GrpcJobServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcJobServiceStub/create client-context callable-factory))
  (^com.google.cloud.talent.v4beta1.stub.GrpcJobServiceStub [^com.google.cloud.talent.v4beta1.stub.JobServiceStubSettings settings]
    (GrpcJobServiceStub/create settings)))

(defn batch-update-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.batchUpdateJobsCallable))))

(defn search-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.searchJobsPagedCallable))))

(defn batch-create-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.batchCreateJobsCallable))))

(defn batch-update-jobs-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.talent.v4beta1.BatchUpdateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^GrpcJobServiceStub this]
    (-> this (.batchUpdateJobsOperationCallable))))

(defn update-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.updateJobCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcJobServiceStub this]
    (-> this (.getOperationsStub))))

(defn list-jobs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.listJobsPagedCallable))))

(defn list-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListJobsRequest,com.google.cloud.talent.v4beta1.ListJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.listJobsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcJobServiceStub this]
    (-> this (.isShutdown))))

(defn delete-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteJobRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.deleteJobCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcJobServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcJobServiceStub this]
    (-> this (.shutdown))))

(defn search-jobs-for-alert-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.searchJobsForAlertCallable))))

(defn close
  ""
  ([^GrpcJobServiceStub this]
    (-> this (.close))))

(defn batch-create-jobs-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.talent.v4beta1.BatchCreateJobsRequest,com.google.cloud.talent.v4beta1.JobOperationResult,com.google.cloud.talent.v4beta1.BatchOperationMetadata>`"
  ([^GrpcJobServiceStub this]
    (-> this (.batchCreateJobsOperationCallable))))

(defn get-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.getJobCallable))))

(defn search-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.SearchJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.searchJobsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcJobServiceStub this]
    (-> this (.isTerminated))))

(defn create-job-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateJobRequest,com.google.cloud.talent.v4beta1.Job>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.createJobCallable))))

(defn shutdown-now
  ""
  ([^GrpcJobServiceStub this]
    (-> this (.shutdownNow))))

(defn search-jobs-for-alert-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.SearchJobsRequest,com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsForAlertPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.searchJobsForAlertPagedCallable))))

(defn batch-delete-jobs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.BatchDeleteJobsRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcJobServiceStub this]
    (-> this (.batchDeleteJobsCallable))))

