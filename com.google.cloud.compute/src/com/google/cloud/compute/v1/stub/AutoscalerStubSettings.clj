(ns com.google.cloud.compute.v1.stub.AutoscalerStubSettings
  "Settings class to configure an instance of AutoscalerStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteAutoscaler to 30 seconds:



  AutoscalerStubSettings.Builder autoscalerSettingsBuilder =
      AutoscalerStubSettings.newBuilder();
  autoscalerSettingsBuilder.deleteAutoscalerSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AutoscalerStubSettings autoscalerSettings = autoscalerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub AutoscalerStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (AutoscalerStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AutoscalerStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AutoscalerStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AutoscalerStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.AutoscalerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.AutoscalerStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AutoscalerStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.AutoscalerStubSettings$Builder []
    (AutoscalerStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AutoscalerStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (AutoscalerStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AutoscalerStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AutoscalerStubSettings/getDefaultServiceScopes )))

(defn update-autoscaler-settings
  "Returns the object with the settings used for calls to updateAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalerStubSettings this]
    (-> this (.updateAutoscalerSettings))))

(defn patch-autoscaler-settings
  "Returns the object with the settings used for calls to patchAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalerStubSettings this]
    (-> this (.patchAutoscalerSettings))))

(defn get-autoscaler-settings
  "Returns the object with the settings used for calls to getAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalerStubSettings this]
    (-> this (.getAutoscalerSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.AutoscalerStub`

  throws: java.io.IOException"
  ([^AutoscalerStubSettings this]
    (-> this (.createStub))))

(defn insert-autoscaler-settings
  "Returns the object with the settings used for calls to insertAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalerStubSettings this]
    (-> this (.insertAutoscalerSettings))))

(defn delete-autoscaler-settings
  "Returns the object with the settings used for calls to deleteAutoscaler.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalerStubSettings this]
    (-> this (.deleteAutoscalerSettings))))

(defn aggregated-list-autoscalers-settings
  "Returns the object with the settings used for calls to aggregatedListAutoscalers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerAggregatedList,com.google.cloud.compute.v1.AutoscalerClient$AggregatedListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AutoscalerStubSettings this]
    (-> this (.aggregatedListAutoscalersSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.AutoscalerStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.AutoscalerStubSettings$Builder [^AutoscalerStubSettings this]
    (-> this (.toBuilder))))

(defn list-autoscalers-settings
  "Returns the object with the settings used for calls to listAutoscalers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerList,com.google.cloud.compute.v1.AutoscalerClient$ListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AutoscalerStubSettings this]
    (-> this (.listAutoscalersSettings))))

