(ns com.google.cloud.compute.v1.stub.InterconnectStubSettings
  "Settings class to configure an instance of InterconnectStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteInterconnect to 30 seconds:



  InterconnectStubSettings.Builder interconnectSettingsBuilder =
      InterconnectStubSettings.newBuilder();
  interconnectSettingsBuilder.deleteInterconnectSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InterconnectStubSettings interconnectSettings = interconnectSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InterconnectStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InterconnectStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InterconnectStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InterconnectStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InterconnectStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder []
    (InterconnectStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InterconnectStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InterconnectStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InterconnectStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InterconnectStubSettings/getDefaultServiceScopes )))

(defn delete-interconnect-settings
  "Returns the object with the settings used for calls to deleteInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectStubSettings this]
    (-> this (.deleteInterconnectSettings))))

(defn get-interconnect-settings
  "Returns the object with the settings used for calls to getInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInterconnectHttpRequest,com.google.cloud.compute.v1.Interconnect>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectStubSettings this]
    (-> this (.getInterconnectSettings))))

(defn get-diagnostics-interconnect-settings
  "Returns the object with the settings used for calls to getDiagnosticsInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetDiagnosticsInterconnectHttpRequest,com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectStubSettings this]
    (-> this (.getDiagnosticsInterconnectSettings))))

(defn insert-interconnect-settings
  "Returns the object with the settings used for calls to insertInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectStubSettings this]
    (-> this (.insertInterconnectSettings))))

(defn list-interconnects-settings
  "Returns the object with the settings used for calls to listInterconnects.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectList,com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InterconnectStubSettings this]
    (-> this (.listInterconnectsSettings))))

(defn patch-interconnect-settings
  "Returns the object with the settings used for calls to patchInterconnect.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectStubSettings this]
    (-> this (.patchInterconnectSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InterconnectStub`

  throws: java.io.IOException"
  ([^InterconnectStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InterconnectStubSettings$Builder [^InterconnectStubSettings this]
    (-> this (.toBuilder))))

