(ns com.google.cloud.compute.v1.TargetPoolSettings
  "Settings class to configure an instance of TargetPoolClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addHealthCheckTargetPool to 30 seconds:



  TargetPoolSettings.Builder targetPoolSettingsBuilder =
      TargetPoolSettings.newBuilder();
  targetPoolSettingsBuilder.addHealthCheckTargetPoolSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetPoolSettings targetPoolSettings = targetPoolSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetPoolSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetPoolSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetPoolSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetPoolSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.TargetPoolSettings$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetPoolSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.TargetPoolSettings$Builder []
    (TargetPoolSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetPoolSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetPoolSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.TargetPoolStubSettings`

  returns: `com.google.cloud.compute.v1.TargetPoolSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetPoolSettings [^com.google.cloud.compute.v1.stub.TargetPoolStubSettings stub]
    (TargetPoolSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetPoolSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetPoolSettings/getDefaultServiceScopes )))

(defn set-backup-target-pool-settings
  "Returns the object with the settings used for calls to setBackupTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.setBackupTargetPoolSettings))))

(defn list-target-pools-settings
  "Returns the object with the settings used for calls to listTargetPools.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolList,com.google.cloud.compute.v1.TargetPoolClient$ListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetPoolSettings this]
    (-> this (.listTargetPoolsSettings))))

(defn add-health-check-target-pool-settings
  "Returns the object with the settings used for calls to addHealthCheckTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.addHealthCheckTargetPoolSettings))))

(defn insert-target-pool-settings
  "Returns the object with the settings used for calls to insertTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.insertTargetPoolSettings))))

(defn remove-health-check-target-pool-settings
  "Returns the object with the settings used for calls to removeHealthCheckTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.removeHealthCheckTargetPoolSettings))))

(defn delete-target-pool-settings
  "Returns the object with the settings used for calls to deleteTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.deleteTargetPoolSettings))))

(defn get-target-pool-settings
  "Returns the object with the settings used for calls to getTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPool>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.getTargetPoolSettings))))

(defn add-instance-target-pool-settings
  "Returns the object with the settings used for calls to addInstanceTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.addInstanceTargetPoolSettings))))

(defn remove-instance-target-pool-settings
  "Returns the object with the settings used for calls to removeInstanceTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemoveInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.removeInstanceTargetPoolSettings))))

(defn aggregated-list-target-pools-settings
  "Returns the object with the settings used for calls to aggregatedListTargetPools.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolAggregatedList,com.google.cloud.compute.v1.TargetPoolClient$AggregatedListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetPoolSettings this]
    (-> this (.aggregatedListTargetPoolsSettings))))

(defn get-health-target-pool-settings
  "Returns the object with the settings used for calls to getHealthTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPoolInstanceHealth>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolSettings this]
    (-> this (.getHealthTargetPoolSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.TargetPoolSettings$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolSettings$Builder [^TargetPoolSettings this]
    (-> this (.toBuilder))))

