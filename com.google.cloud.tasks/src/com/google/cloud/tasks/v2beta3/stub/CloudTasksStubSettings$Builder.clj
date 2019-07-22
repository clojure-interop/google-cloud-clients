(ns com.google.cloud.tasks.v2beta3.stub.CloudTasksStubSettings$Builder
  "Builder for CloudTasksStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2beta3.stub CloudTasksStubSettings$Builder]))

(defn pause-queue-settings
  "Returns the builder for the settings used for calls to pauseQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.PauseQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.pauseQueueSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.tasks.v2beta3.stub.CloudTasksStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.tasks.v2beta3.stub.CloudTasksStubSettings$Builder [^CloudTasksStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-queues-settings
  "Returns the builder for the settings used for calls to listQueues.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.tasks.v2beta3.ListQueuesRequest,com.google.cloud.tasks.v2beta3.ListQueuesResponse,com.google.cloud.tasks.v2beta3.CloudTasksClient$ListQueuesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.listQueuesSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn create-task-settings
  "Returns the builder for the settings used for calls to createTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.CreateTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.createTaskSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn update-queue-settings
  "Returns the builder for the settings used for calls to updateQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.UpdateQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.updateQueueSettings))))

(defn create-queue-settings
  "Returns the builder for the settings used for calls to createQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.CreateQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.createQueueSettings))))

(defn delete-task-settings
  "Returns the builder for the settings used for calls to deleteTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.DeleteTaskRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.deleteTaskSettings))))

(defn build
  "returns: `com.google.cloud.tasks.v2beta3.stub.CloudTasksStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.tasks.v2beta3.stub.CloudTasksStubSettings [^CloudTasksStubSettings$Builder this]
    (-> this (.build))))

(defn resume-queue-settings
  "Returns the builder for the settings used for calls to resumeQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.ResumeQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.resumeQueueSettings))))

(defn get-queue-settings
  "Returns the builder for the settings used for calls to getQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.GetQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.getQueueSettings))))

(defn purge-queue-settings
  "Returns the builder for the settings used for calls to purgeQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.PurgeQueueRequest,com.google.cloud.tasks.v2beta3.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.purgeQueueSettings))))

(defn run-task-settings
  "Returns the builder for the settings used for calls to runTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.RunTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.runTaskSettings))))

(defn delete-queue-settings
  "Returns the builder for the settings used for calls to deleteQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.DeleteQueueRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.deleteQueueSettings))))

(defn get-task-settings
  "Returns the builder for the settings used for calls to getTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.tasks.v2beta3.GetTaskRequest,com.google.cloud.tasks.v2beta3.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.getTaskSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^CloudTasksStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn list-tasks-settings
  "Returns the builder for the settings used for calls to listTasks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.tasks.v2beta3.ListTasksRequest,com.google.cloud.tasks.v2beta3.ListTasksResponse,com.google.cloud.tasks.v2beta3.CloudTasksClient$ListTasksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^CloudTasksStubSettings$Builder this]
    (-> this (.listTasksSettings))))

