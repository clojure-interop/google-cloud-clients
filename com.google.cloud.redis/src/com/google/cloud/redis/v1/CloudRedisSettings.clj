(ns com.google.cloud.redis.v1.CloudRedisSettings
  "Settings class to configure an instance of CloudRedisClient.

  The default instance has everything set to sensible defaults:


    The default service address (redis.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getInstance to 30 seconds:



  CloudRedisSettings.Builder cloudRedisSettingsBuilder =
      CloudRedisSettings.newBuilder();
  cloudRedisSettingsBuilder.getInstanceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  CloudRedisSettings cloudRedisSettings = cloudRedisSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.redis.v1 CloudRedisSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (CloudRedisSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (CloudRedisSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (CloudRedisSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.redis.v1.CloudRedisSettings$Builder`"
  (^com.google.cloud.redis.v1.CloudRedisSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (CloudRedisSettings/newBuilder client-context))
  (^com.google.cloud.redis.v1.CloudRedisSettings$Builder []
    (CloudRedisSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (CloudRedisSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.redis.v1.stub.CloudRedisStubSettings`

  returns: `com.google.cloud.redis.v1.CloudRedisSettings`

  throws: java.io.IOException"
  (^com.google.cloud.redis.v1.CloudRedisSettings [^com.google.cloud.redis.v1.stub.CloudRedisStubSettings stub]
    (CloudRedisSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (CloudRedisSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (CloudRedisSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CloudRedisSettings/getDefaultServiceScopes )))

(defn delete-instance-settings
  "Returns the object with the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1.DeleteInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisSettings this]
    (-> this (.deleteInstanceSettings))))

(defn get-instance-settings
  "Returns the object with the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1.GetInstanceRequest,com.google.cloud.redis.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisSettings this]
    (-> this (.getInstanceSettings))))

(defn list-instances-settings
  "Returns the object with the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.redis.v1.ListInstancesRequest,com.google.cloud.redis.v1.ListInstancesResponse,com.google.cloud.redis.v1.CloudRedisClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^CloudRedisSettings this]
    (-> this (.listInstancesSettings))))

(defn import-instance-settings
  "Returns the object with the settings used for calls to importInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1.ImportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisSettings this]
    (-> this (.importInstanceSettings))))

(defn export-instance-operation-settings
  "Returns the object with the settings used for calls to exportInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1.ExportInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings this]
    (-> this (.exportInstanceOperationSettings))))

(defn delete-instance-operation-settings
  "Returns the object with the settings used for calls to deleteInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1.DeleteInstanceRequest,com.google.protobuf.Empty,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings this]
    (-> this (.deleteInstanceOperationSettings))))

(defn export-instance-settings
  "Returns the object with the settings used for calls to exportInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1.ExportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisSettings this]
    (-> this (.exportInstanceSettings))))

(defn create-instance-settings
  "Returns the object with the settings used for calls to createInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisSettings this]
    (-> this (.createInstanceSettings))))

(defn import-instance-operation-settings
  "Returns the object with the settings used for calls to importInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1.ImportInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings this]
    (-> this (.importInstanceOperationSettings))))

(defn create-instance-operation-settings
  "Returns the object with the settings used for calls to createInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1.CreateInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings this]
    (-> this (.createInstanceOperationSettings))))

(defn failover-instance-settings
  "Returns the object with the settings used for calls to failoverInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1.FailoverInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisSettings this]
    (-> this (.failoverInstanceSettings))))

(defn update-instance-operation-settings
  "Returns the object with the settings used for calls to updateInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1.UpdateInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings this]
    (-> this (.updateInstanceOperationSettings))))

(defn failover-instance-operation-settings
  "Returns the object with the settings used for calls to failoverInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1.FailoverInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings this]
    (-> this (.failoverInstanceOperationSettings))))

(defn update-instance-settings
  "Returns the object with the settings used for calls to updateInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisSettings this]
    (-> this (.updateInstanceSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.redis.v1.CloudRedisSettings$Builder`"
  (^com.google.cloud.redis.v1.CloudRedisSettings$Builder [^CloudRedisSettings this]
    (-> this (.toBuilder))))

