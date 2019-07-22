(ns com.google.cloud.redis.v1.CloudRedisSettings$Builder
  "Builder for CloudRedisSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.redis.v1 CloudRedisSettings$Builder]))

(defn delete-instance-settings
  "Returns the builder for the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.redis.v1.DeleteInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudRedisSettings$Builder this]
    (-> this (.deleteInstanceSettings))))

(defn get-instance-settings
  "Returns the builder for the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.redis.v1.GetInstanceRequest,com.google.cloud.redis.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudRedisSettings$Builder this]
    (-> this (.getInstanceSettings))))

(defn list-instances-settings
  "Returns the builder for the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.redis.v1.ListInstancesRequest,com.google.cloud.redis.v1.ListInstancesResponse,com.google.cloud.redis.v1.CloudRedisClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^CloudRedisSettings$Builder this]
    (-> this (.listInstancesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.redis.v1.CloudRedisSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.redis.v1.CloudRedisSettings$Builder [^CloudRedisSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn import-instance-settings
  "Returns the builder for the settings used for calls to importInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.redis.v1.ImportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudRedisSettings$Builder this]
    (-> this (.importInstanceSettings))))

(defn export-instance-operation-settings
  "Returns the builder for the settings used for calls to exportInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.redis.v1.ExportInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings$Builder this]
    (-> this (.exportInstanceOperationSettings))))

(defn delete-instance-operation-settings
  "Returns the builder for the settings used for calls to deleteInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.redis.v1.DeleteInstanceRequest,com.google.protobuf.Empty,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings$Builder this]
    (-> this (.deleteInstanceOperationSettings))))

(defn export-instance-settings
  "Returns the builder for the settings used for calls to exportInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.redis.v1.ExportInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudRedisSettings$Builder this]
    (-> this (.exportInstanceSettings))))

(defn build
  "returns: `com.google.cloud.redis.v1.CloudRedisSettings`

  throws: java.io.IOException"
  (^com.google.cloud.redis.v1.CloudRedisSettings [^CloudRedisSettings$Builder this]
    (-> this (.build))))

(defn create-instance-settings
  "Returns the builder for the settings used for calls to createInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.redis.v1.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudRedisSettings$Builder this]
    (-> this (.createInstanceSettings))))

(defn import-instance-operation-settings
  "Returns the builder for the settings used for calls to importInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.redis.v1.ImportInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings$Builder this]
    (-> this (.importInstanceOperationSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.redis.v1.stub.CloudRedisStubSettings$Builder`"
  (^com.google.cloud.redis.v1.stub.CloudRedisStubSettings$Builder [^CloudRedisSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn create-instance-operation-settings
  "Returns the builder for the settings used for calls to createInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.redis.v1.CreateInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings$Builder this]
    (-> this (.createInstanceOperationSettings))))

(defn failover-instance-settings
  "Returns the builder for the settings used for calls to failoverInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.redis.v1.FailoverInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudRedisSettings$Builder this]
    (-> this (.failoverInstanceSettings))))

(defn update-instance-operation-settings
  "Returns the builder for the settings used for calls to updateInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.redis.v1.UpdateInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings$Builder this]
    (-> this (.updateInstanceOperationSettings))))

(defn failover-instance-operation-settings
  "Returns the builder for the settings used for calls to failoverInstance.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.redis.v1.FailoverInstanceRequest,com.google.cloud.redis.v1.Instance,com.google.cloud.redis.v1.OperationMetadata>`"
  ([^CloudRedisSettings$Builder this]
    (-> this (.failoverInstanceOperationSettings))))

(defn update-instance-settings
  "Returns the builder for the settings used for calls to updateInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.redis.v1.UpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^CloudRedisSettings$Builder this]
    (-> this (.updateInstanceSettings))))

