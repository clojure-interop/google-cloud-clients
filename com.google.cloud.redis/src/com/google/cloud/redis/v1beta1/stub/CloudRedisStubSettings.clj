(ns com.google.cloud.redis.v1beta1.stub.CloudRedisStubSettings
  "Settings class to configure an instance of CloudRedisStub.

  The default instance has everything set to sensible defaults:


    The default service address (redis.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getInstance to 30 seconds:



  CloudRedisStubSettings.Builder cloudRedisSettingsBuilder =
      CloudRedisStubSettings.newBuilder();
  cloudRedisSettingsBuilder.getInstanceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  CloudRedisStubSettings cloudRedisSettings = cloudRedisSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.redis.v1beta1.stub CloudRedisStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (CloudRedisStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (CloudRedisStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CloudRedisStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (CloudRedisStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (CloudRedisStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (CloudRedisStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (CloudRedisStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.redis.v1beta1.stub.CloudRedisStubSettings$Builder`"
  (^com.google.cloud.redis.v1beta1.stub.CloudRedisStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (CloudRedisStubSettings/newBuilder client-context))
  (^com.google.cloud.redis.v1beta1.stub.CloudRedisStubSettings$Builder []
    (CloudRedisStubSettings/newBuilder )))

(defn delete-instance-settings
  "Returns the object with the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1beta1.DeleteInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisStubSettings this]
    (-> this (.deleteInstanceSettings))))

(defn get-instance-settings
  "Returns the object with the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1beta1.GetInstanceRequest,com.google.cloud.redis.v1beta1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisStubSettings this]
    (-> this (.getInstanceSettings))))

(defn list-instances-settings
  "Returns the object with the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.redis.v1beta1.ListInstancesRequest,com.google.cloud.redis.v1beta1.ListInstancesResponse,com.google.cloud.redis.v1beta1.CloudRedisClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^CloudRedisStubSettings this]
    (-> this (.listInstancesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.redis.v1beta1.stub.CloudRedisStub`

  throws: java.io.IOException"
  ([^CloudRedisStubSettings this]
    (-> this (.createStub))))

(defn import-instance-settings
  "Returns the object with the settings used for calls to importInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1beta1.ImportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisStubSettings this]
    (-> this (.importInstanceSettings))))

(defn export-instance-operation-settings
  "Returns the object with the settings used for calls to exportInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1beta1.ExportInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^CloudRedisStubSettings this]
    (-> this (.exportInstanceOperationSettings))))

(defn delete-instance-operation-settings
  "Returns the object with the settings used for calls to deleteInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1beta1.DeleteInstanceRequest,com.google.protobuf.Empty,com.google.protobuf.Any>`"
  ([^CloudRedisStubSettings this]
    (-> this (.deleteInstanceOperationSettings))))

(defn export-instance-settings
  "Returns the object with the settings used for calls to exportInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1beta1.ExportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisStubSettings this]
    (-> this (.exportInstanceSettings))))

(defn create-instance-settings
  "Returns the object with the settings used for calls to createInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1beta1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisStubSettings this]
    (-> this (.createInstanceSettings))))

(defn import-instance-operation-settings
  "Returns the object with the settings used for calls to importInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1beta1.ImportInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^CloudRedisStubSettings this]
    (-> this (.importInstanceOperationSettings))))

(defn create-instance-operation-settings
  "Returns the object with the settings used for calls to createInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1beta1.CreateInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^CloudRedisStubSettings this]
    (-> this (.createInstanceOperationSettings))))

(defn failover-instance-settings
  "Returns the object with the settings used for calls to failoverInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1beta1.FailoverInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisStubSettings this]
    (-> this (.failoverInstanceSettings))))

(defn update-instance-operation-settings
  "Returns the object with the settings used for calls to updateInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1beta1.UpdateInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^CloudRedisStubSettings this]
    (-> this (.updateInstanceOperationSettings))))

(defn failover-instance-operation-settings
  "Returns the object with the settings used for calls to failoverInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.redis.v1beta1.FailoverInstanceRequest,com.google.cloud.redis.v1beta1.Instance,com.google.protobuf.Any>`"
  ([^CloudRedisStubSettings this]
    (-> this (.failoverInstanceOperationSettings))))

(defn update-instance-settings
  "Returns the object with the settings used for calls to updateInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.redis.v1beta1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CloudRedisStubSettings this]
    (-> this (.updateInstanceSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.redis.v1beta1.stub.CloudRedisStubSettings$Builder`"
  (^com.google.cloud.redis.v1beta1.stub.CloudRedisStubSettings$Builder [^CloudRedisStubSettings this]
    (-> this (.toBuilder))))

