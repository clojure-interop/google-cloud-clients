(ns com.google.cloud.tasks.v2beta3.stub.GrpcCloudTasksStub
  "gRPC stub implementation for Cloud Tasks API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2beta3.stub GrpcCloudTasksStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.tasks.v2beta3.stub.GrpcCloudTasksStub`

  throws: java.io.IOException"
  (^com.google.cloud.tasks.v2beta3.stub.GrpcCloudTasksStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcCloudTasksStub/create client-context callable-factory))
  (^com.google.cloud.tasks.v2beta3.stub.GrpcCloudTasksStub [^com.google.cloud.tasks.v2beta3.stub.CloudTasksStubSettings settings]
    (GrpcCloudTasksStub/create settings)))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.getIamPolicyCallable))))

(defn list-tasks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ListTasksRequest,com.google.cloud.tasks.v2beta3.CloudTasksClient$ListTasksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.listTasksPagedCallable))))

(defn get-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.GetQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.getQueueCallable))))

(defn pause-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.PauseQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.pauseQueueCallable))))

(defn resume-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ResumeQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.resumeQueueCallable))))

(defn update-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.UpdateQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.updateQueueCallable))))

(defn delete-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.DeleteQueueRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.deleteQueueCallable))))

(defn list-queues-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ListQueuesRequest,com.google.cloud.tasks.v2beta3.ListQueuesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.listQueuesCallable))))

(defn list-tasks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ListTasksRequest,com.google.cloud.tasks.v2beta3.ListTasksResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.listTasksCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcCloudTasksStub this]
    (-> this (.isShutdown))))

(defn create-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.CreateQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.createQueueCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcCloudTasksStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcCloudTasksStub this]
    (-> this (.shutdown))))

(defn list-queues-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ListQueuesRequest,com.google.cloud.tasks.v2beta3.CloudTasksClient$ListQueuesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.listQueuesPagedCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^GrpcCloudTasksStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.testIamPermissionsCallable))))

(defn get-task-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.GetTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.getTaskCallable))))

(defn delete-task-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.DeleteTaskRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.deleteTaskCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcCloudTasksStub this]
    (-> this (.isTerminated))))

(defn create-task-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.CreateTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.createTaskCallable))))

(defn shutdown-now
  ""
  ([^GrpcCloudTasksStub this]
    (-> this (.shutdownNow))))

(defn purge-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.PurgeQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.purgeQueueCallable))))

(defn run-task-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.RunTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcCloudTasksStub this]
    (-> this (.runTaskCallable))))

