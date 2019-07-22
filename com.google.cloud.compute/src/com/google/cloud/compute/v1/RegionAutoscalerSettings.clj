(ns com.google.cloud.compute.v1.RegionAutoscalerSettings
  "Settings class to configure an instance of RegionAutoscalerClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteRegionAutoscaler to 30 seconds:



  RegionAutoscalerSettings.Builder regionAutoscalerSettingsBuilder =
      RegionAutoscalerSettings.newBuilder();
  regionAutoscalerSettingsBuilder.deleteRegionAutoscalerSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionAutoscalerSettings regionAutoscalerSettings = regionAutoscalerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionAutoscalerSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionAutoscalerSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionAutoscalerSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionAutoscalerSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionAutoscalerSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RegionAutoscalerSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionAutoscalerSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionAutoscalerSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RegionAutoscalerSettings$Builder []
    (RegionAutoscalerSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionAutoscalerSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionAutoscalerSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings`

  returns: `com.google.cloud.compute.v1.RegionAutoscalerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionAutoscalerSettings [^com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings stub]
    (RegionAutoscalerSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionAutoscalerSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionAutoscalerSettings/getDefaultServiceScopes )))

(defn delete-region-autoscaler-settings
  "Returns the object with the settings used for calls to deleteRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionAutoscalerSettings this]
    (-> this (.deleteRegionAutoscalerSettings))))

(defn get-region-autoscaler-settings
  "Returns the object with the settings used for calls to getRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionAutoscalerSettings this]
    (-> this (.getRegionAutoscalerSettings))))

(defn insert-region-autoscaler-settings
  "Returns the object with the settings used for calls to insertRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionAutoscalerSettings this]
    (-> this (.insertRegionAutoscalerSettings))))

(defn list-region-autoscalers-settings
  "Returns the object with the settings used for calls to listRegionAutoscalers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerList,com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionAutoscalerSettings this]
    (-> this (.listRegionAutoscalersSettings))))

(defn patch-region-autoscaler-settings
  "Returns the object with the settings used for calls to patchRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionAutoscalerSettings this]
    (-> this (.patchRegionAutoscalerSettings))))

(defn update-region-autoscaler-settings
  "Returns the object with the settings used for calls to updateRegionAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionAutoscalerSettings this]
    (-> this (.updateRegionAutoscalerSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RegionAutoscalerSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionAutoscalerSettings$Builder [^RegionAutoscalerSettings this]
    (-> this (.toBuilder))))

