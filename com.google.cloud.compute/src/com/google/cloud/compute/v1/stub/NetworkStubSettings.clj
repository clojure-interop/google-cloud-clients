(ns com.google.cloud.compute.v1.stub.NetworkStubSettings
  "Settings class to configure an instance of NetworkStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addPeeringNetwork to 30 seconds:



  NetworkStubSettings.Builder networkSettingsBuilder =
      NetworkStubSettings.newBuilder();
  networkSettingsBuilder.addPeeringNetworkSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  NetworkStubSettings networkSettings = networkSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NetworkStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (NetworkStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (NetworkStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (NetworkStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (NetworkStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (NetworkStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder []
    (NetworkStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (NetworkStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (NetworkStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (NetworkStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (NetworkStubSettings/getDefaultServiceScopes )))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.NetworkStub`

  throws: java.io.IOException"
  ([^NetworkStubSettings this]
    (-> this (.createStub))))

(defn add-peering-network-settings
  "Returns the object with the settings used for calls to addPeeringNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkStubSettings this]
    (-> this (.addPeeringNetworkSettings))))

(defn patch-network-settings
  "Returns the object with the settings used for calls to patchNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkStubSettings this]
    (-> this (.patchNetworkSettings))))

(defn insert-network-settings
  "Returns the object with the settings used for calls to insertNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkStubSettings this]
    (-> this (.insertNetworkSettings))))

(defn get-network-settings
  "Returns the object with the settings used for calls to getNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetNetworkHttpRequest,com.google.cloud.compute.v1.Network>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkStubSettings this]
    (-> this (.getNetworkSettings))))

(defn switch-to-custom-mode-network-settings
  "Returns the object with the settings used for calls to switchToCustomModeNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkStubSettings this]
    (-> this (.switchToCustomModeNetworkSettings))))

(defn remove-peering-network-settings
  "Returns the object with the settings used for calls to removePeeringNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkStubSettings this]
    (-> this (.removePeeringNetworkSettings))))

(defn delete-network-settings
  "Returns the object with the settings used for calls to deleteNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkStubSettings this]
    (-> this (.deleteNetworkSettings))))

(defn list-networks-settings
  "Returns the object with the settings used for calls to listNetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkList,com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NetworkStubSettings this]
    (-> this (.listNetworksSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder [^NetworkStubSettings this]
    (-> this (.toBuilder))))

