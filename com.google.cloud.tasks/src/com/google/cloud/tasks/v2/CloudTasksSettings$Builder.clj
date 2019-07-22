(ns com.google.cloud.tasks.v2.CloudTasksSettings$Builder
  "Builder for CloudTasksSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2 CloudTasksSettings$Builder]))

(defn pause-queue-settings
  "Returns the builder for the settings used for calls to pauseQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.PauseQueueRequest,com.google.cloud.tasks.v2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.pauseQueueSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.tasks.v2.CloudTasksSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.tasks.v2.CloudTasksSettings$Builder [^CloudTasksSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-queues-settings
  "Returns the builder for the settings used for calls to listQueues.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.tasks.v2.ListQueuesRequest,com.google.cloud.tasks.v2.ListQueuesResponse,com.google.cloud.tasks.v2.CloudTasksClient$ListQueuesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.listQueuesSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn create-task-settings
  "Returns the builder for the settings used for calls to createTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.CreateTaskRequest,com.google.cloud.tasks.v2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.createTaskSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn update-queue-settings
  "Returns the builder for the settings used for calls to updateQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.UpdateQueueRequest,com.google.cloud.tasks.v2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.updateQueueSettings))))

(defn create-queue-settings
  "Returns the builder for the settings used for calls to createQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.CreateQueueRequest,com.google.cloud.tasks.v2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.createQueueSettings))))

(defn delete-task-settings
  "Returns the builder for the settings used for calls to deleteTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.DeleteTaskRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.deleteTaskSettings))))

(defn build
  "returns: `com.google.cloud.tasks.v2.CloudTasksSettings`

  throws: java.io.IOException"
  (^com.google.cloud.tasks.v2.CloudTasksSettings [^CloudTasksSettings$Builder this]
    (-> this (.build))))

(defn resume-queue-settings
  "Returns the builder for the settings used for calls to resumeQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.ResumeQueueRequest,com.google.cloud.tasks.v2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.resumeQueueSettings))))

(defn get-queue-settings
  "Returns the builder for the settings used for calls to getQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.GetQueueRequest,com.google.cloud.tasks.v2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.getQueueSettings))))

(defn purge-queue-settings
  "Returns the builder for the settings used for calls to purgeQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.PurgeQueueRequest,com.google.cloud.tasks.v2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.purgeQueueSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.tasks.v2.stub.CloudTasksStubSettings$Builder`"
  (^com.google.cloud.tasks.v2.stub.CloudTasksStubSettings$Builder [^CloudTasksSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn run-task-settings
  "Returns the builder for the settings used for calls to runTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.RunTaskRequest,com.google.cloud.tasks.v2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.runTaskSettings))))

(defn delete-queue-settings
  "Returns the builder for the settings used for calls to deleteQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.DeleteQueueRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.deleteQueueSettings))))

(defn get-task-settings
  "Returns the builder for the settings used for calls to getTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2.GetTaskRequest,com.google.cloud.tasks.v2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.getTaskSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn list-tasks-settings
  "Returns the builder for the settings used for calls to listTasks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.tasks.v2.ListTasksRequest,com.google.cloud.tasks.v2.ListTasksResponse,com.google.cloud.tasks.v2.CloudTasksClient$ListTasksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^CloudTasksSettings$Builder this]
    (-> this (.listTasksSettings))))

