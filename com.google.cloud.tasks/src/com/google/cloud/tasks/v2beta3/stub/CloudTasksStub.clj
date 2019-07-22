(ns com.google.cloud.tasks.v2beta3.stub.CloudTasksStub
  "Base stub class for Cloud Tasks API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2beta3.stub CloudTasksStub]))

(defn ->cloud-tasks-stub
  "Constructor."
  (^CloudTasksStub []
    (new CloudTasksStub )))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.getIamPolicyCallable))))

(defn list-tasks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ListTasksRequest,com.google.cloud.tasks.v2beta3.CloudTasksClient$ListTasksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.listTasksPagedCallable))))

(defn get-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.GetQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.getQueueCallable))))

(defn pause-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.PauseQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.pauseQueueCallable))))

(defn resume-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ResumeQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.resumeQueueCallable))))

(defn update-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.UpdateQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.updateQueueCallable))))

(defn delete-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.DeleteQueueRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.deleteQueueCallable))))

(defn list-queues-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ListQueuesRequest,com.google.cloud.tasks.v2beta3.ListQueuesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.listQueuesCallable))))

(defn list-tasks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ListTasksRequest,com.google.cloud.tasks.v2beta3.ListTasksResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.listTasksCallable))))

(defn create-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.CreateQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.createQueueCallable))))

(defn list-queues-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.ListQueuesRequest,com.google.cloud.tasks.v2beta3.CloudTasksClient$ListQueuesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.listQueuesPagedCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^CloudTasksStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.testIamPermissionsCallable))))

(defn get-task-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.GetTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.getTaskCallable))))

(defn delete-task-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.DeleteTaskRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.deleteTaskCallable))))

(defn create-task-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.CreateTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.createTaskCallable))))

(defn purge-queue-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.PurgeQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.purgeQueueCallable))))

(defn run-task-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.tasks.v2beta3.RunTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallable [^CloudTasksStub this]
    (-> this (.runTaskCallable))))

