(ns com.google.cloud.compute.v1.InterconnectSettings
  "Settings class to configure an instance of InterconnectClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteInterconnect to 30 seconds:



  InterconnectSettings.Builder interconnectSettingsBuilder =
      InterconnectSettings.newBuilder();
  interconnectSettingsBuilder.deleteInterconnectSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InterconnectSettings interconnectSettings = interconnectSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InterconnectSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InterconnectSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InterconnectSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InterconnectSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.InterconnectSettings$Builder`"
  (^com.google.cloud.compute.v1.InterconnectSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InterconnectSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.InterconnectSettings$Builder []
    (InterconnectSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InterconnectSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InterconnectSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.InterconnectStubSettings`

  returns: `com.google.cloud.compute.v1.InterconnectSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InterconnectSettings [^com.google.cloud.compute.v1.stub.InterconnectStubSettings stub]
    (InterconnectSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InterconnectSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InterconnectSettings/getDefaultServiceScopes )))

(defn delete-interconnect-settings
  "Returns the object with the settings used for calls to deleteInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectSettings this]
    (-> this (.deleteInterconnectSettings))))

(defn get-interconnect-settings
  "Returns the object with the settings used for calls to getInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInterconnectHttpRequest,com.google.cloud.compute.v1.Interconnect>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectSettings this]
    (-> this (.getInterconnectSettings))))

(defn get-diagnostics-interconnect-settings
  "Returns the object with the settings used for calls to getDiagnosticsInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetDiagnosticsInterconnectHttpRequest,com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectSettings this]
    (-> this (.getDiagnosticsInterconnectSettings))))

(defn insert-interconnect-settings
  "Returns the object with the settings used for calls to insertInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectSettings this]
    (-> this (.insertInterconnectSettings))))

(defn list-interconnects-settings
  "Returns the object with the settings used for calls to listInterconnects.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectList,com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InterconnectSettings this]
    (-> this (.listInterconnectsSettings))))

(defn patch-interconnect-settings
  "Returns the object with the settings used for calls to patchInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectSettings this]
    (-> this (.patchInterconnectSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.InterconnectSettings$Builder`"
  (^com.google.cloud.compute.v1.InterconnectSettings$Builder [^InterconnectSettings this]
    (-> this (.toBuilder))))

