(ns com.google.cloud.compute.v1.stub.TargetPoolStubSettings
  "Settings class to configure an instance of TargetPoolStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addHealthCheckTargetPool to 30 seconds:



  TargetPoolStubSettings.Builder targetPoolSettingsBuilder =
      TargetPoolStubSettings.newBuilder();
  targetPoolSettingsBuilder.addHealthCheckTargetPoolSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetPoolStubSettings targetPoolSettings = targetPoolSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetPoolStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetPoolStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetPoolStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetPoolStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetPoolStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.TargetPoolStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetPoolStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetPoolStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.TargetPoolStubSettings$Builder []
    (TargetPoolStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetPoolStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetPoolStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetPoolStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetPoolStubSettings/getDefaultServiceScopes )))

(defn set-backup-target-pool-settings
  "Returns the object with the settings used for calls to setBackupTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.setBackupTargetPoolSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetPoolStub`

  throws: java.io.IOException"
  ([^TargetPoolStubSettings this]
    (-> this (.createStub))))

(defn list-target-pools-settings
  "Returns the object with the settings used for calls to listTargetPools.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolList,com.google.cloud.compute.v1.TargetPoolClient$ListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetPoolStubSettings this]
    (-> this (.listTargetPoolsSettings))))

(defn add-health-check-target-pool-settings
  "Returns the object with the settings used for calls to addHealthCheckTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.addHealthCheckTargetPoolSettings))))

(defn insert-target-pool-settings
  "Returns the object with the settings used for calls to insertTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.insertTargetPoolSettings))))

(defn remove-health-check-target-pool-settings
  "Returns the object with the settings used for calls to removeHealthCheckTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.removeHealthCheckTargetPoolSettings))))

(defn delete-target-pool-settings
  "Returns the object with the settings used for calls to deleteTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.deleteTargetPoolSettings))))

(defn get-target-pool-settings
  "Returns the object with the settings used for calls to getTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPool>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.getTargetPoolSettings))))

(defn add-instance-target-pool-settings
  "Returns the object with the settings used for calls to addInstanceTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.addInstanceTargetPoolSettings))))

(defn remove-instance-target-pool-settings
  "Returns the object with the settings used for calls to removeInstanceTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemoveInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.removeInstanceTargetPoolSettings))))

(defn aggregated-list-target-pools-settings
  "Returns the object with the settings used for calls to aggregatedListTargetPools.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolAggregatedList,com.google.cloud.compute.v1.TargetPoolClient$AggregatedListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetPoolStubSettings this]
    (-> this (.aggregatedListTargetPoolsSettings))))

(defn get-health-target-pool-settings
  "Returns the object with the settings used for calls to getHealthTargetPool.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPoolInstanceHealth>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetPoolStubSettings this]
    (-> this (.getHealthTargetPoolSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.TargetPoolStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetPoolStubSettings$Builder [^TargetPoolStubSettings this]
    (-> this (.toBuilder))))

