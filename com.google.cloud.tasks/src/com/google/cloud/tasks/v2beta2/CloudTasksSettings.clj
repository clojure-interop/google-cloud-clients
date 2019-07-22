(ns com.google.cloud.tasks.v2beta2.CloudTasksSettings
  "Settings class to configure an instance of CloudTasksClient.

  The default instance has everything set to sensible defaults:


    The default service address (cloudtasks.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getQueue to 30 seconds:



  CloudTasksSettings.Builder cloudTasksSettingsBuilder =
      CloudTasksSettings.newBuilder();
  cloudTasksSettingsBuilder.getQueueSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  CloudTasksSettings cloudTasksSettings = cloudTasksSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.tasks.v2beta2 CloudTasksSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (CloudTasksSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (CloudTasksSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (CloudTasksSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.tasks.v2beta2.CloudTasksSettings$Builder`"
  (^com.google.cloud.tasks.v2beta2.CloudTasksSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (CloudTasksSettings/newBuilder client-context))
  (^com.google.cloud.tasks.v2beta2.CloudTasksSettings$Builder []
    (CloudTasksSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (CloudTasksSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.tasks.v2beta2.stub.CloudTasksStubSettings`

  returns: `com.google.cloud.tasks.v2beta2.CloudTasksSettings`

  throws: java.io.IOException"
  (^com.google.cloud.tasks.v2beta2.CloudTasksSettings [^com.google.cloud.tasks.v2beta2.stub.CloudTasksStubSettings stub]
    (CloudTasksSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (CloudTasksSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (CloudTasksSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CloudTasksSettings/getDefaultServiceScopes )))

(defn acknowledge-task-settings
  "Returns the object with the settings used for calls to acknowledgeTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.acknowledgeTaskSettings))))

(defn pause-queue-settings
  "Returns the object with the settings used for calls to pauseQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.PauseQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.pauseQueueSettings))))

(defn list-queues-settings
  "Returns the object with the settings used for calls to listQueues.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.tasks.v2beta2.ListQueuesRequest,com.google.cloud.tasks.v2beta2.ListQueuesResponse,com.google.cloud.tasks.v2beta2.CloudTasksClient$ListQueuesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^CloudTasksSettings this]
    (-> this (.listQueuesSettings))))

(defn renew-lease-settings
  "Returns the object with the settings used for calls to renewLease.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.RenewLeaseRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.renewLeaseSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn create-task-settings
  "Returns the object with the settings used for calls to createTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.CreateTaskRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.createTaskSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.setIamPolicySettings))))

(defn update-queue-settings
  "Returns the object with the settings used for calls to updateQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.UpdateQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.updateQueueSettings))))

(defn create-queue-settings
  "Returns the object with the settings used for calls to createQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.CreateQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.createQueueSettings))))

(defn delete-task-settings
  "Returns the object with the settings used for calls to deleteTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.DeleteTaskRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.deleteTaskSettings))))

(defn resume-queue-settings
  "Returns the object with the settings used for calls to resumeQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.ResumeQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.resumeQueueSettings))))

(defn get-queue-settings
  "Returns the object with the settings used for calls to getQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.GetQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.getQueueSettings))))

(defn purge-queue-settings
  "Returns the object with the settings used for calls to purgeQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.PurgeQueueRequest,com.google.cloud.tasks.v2beta2.Queue>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.purgeQueueSettings))))

(defn run-task-settings
  "Returns the object with the settings used for calls to runTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.RunTaskRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.runTaskSettings))))

(defn delete-queue-settings
  "Returns the object with the settings used for calls to deleteQueue.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.DeleteQueueRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.deleteQueueSettings))))

(defn get-task-settings
  "Returns the object with the settings used for calls to getTask.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.GetTaskRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.getTaskSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.getIamPolicySettings))))

(defn cancel-lease-settings
  "Returns the object with the settings used for calls to cancelLease.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.CancelLeaseRequest,com.google.cloud.tasks.v2beta2.Task>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.cancelLeaseSettings))))

(defn lease-tasks-settings
  "Returns the object with the settings used for calls to leaseTasks.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.tasks.v2beta2.LeaseTasksRequest,com.google.cloud.tasks.v2beta2.LeaseTasksResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudTasksSettings this]
    (-> this (.leaseTasksSettings))))

(defn list-tasks-settings
  "Returns the object with the settings used for calls to listTasks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.tasks.v2beta2.ListTasksRequest,com.google.cloud.tasks.v2beta2.ListTasksResponse,com.google.cloud.tasks.v2beta2.CloudTasksClient$ListTasksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^CloudTasksSettings this]
    (-> this (.listTasksSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.tasks.v2beta2.CloudTasksSettings$Builder`"
  (^com.google.cloud.tasks.v2beta2.CloudTasksSettings$Builder [^CloudTasksSettings this]
    (-> this (.toBuilder))))

