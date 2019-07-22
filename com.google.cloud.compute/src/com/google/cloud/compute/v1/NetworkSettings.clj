(ns com.google.cloud.compute.v1.NetworkSettings
  "Settings class to configure an instance of NetworkClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addPeeringNetwork to 30 seconds:



  NetworkSettings.Builder networkSettingsBuilder =
      NetworkSettings.newBuilder();
  networkSettingsBuilder.addPeeringNetworkSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  NetworkSettings networkSettings = networkSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (NetworkSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (NetworkSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (NetworkSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (NetworkSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.NetworkSettings$Builder`"
  (^com.google.cloud.compute.v1.NetworkSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (NetworkSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.NetworkSettings$Builder []
    (NetworkSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (NetworkSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (NetworkSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.NetworkStubSettings`

  returns: `com.google.cloud.compute.v1.NetworkSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NetworkSettings [^com.google.cloud.compute.v1.stub.NetworkStubSettings stub]
    (NetworkSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (NetworkSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (NetworkSettings/getDefaultServiceScopes )))

(defn add-peering-network-settings
  "Returns the object with the settings used for calls to addPeeringNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkSettings this]
    (-> this (.addPeeringNetworkSettings))))

(defn patch-network-settings
  "Returns the object with the settings used for calls to patchNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkSettings this]
    (-> this (.patchNetworkSettings))))

(defn insert-network-settings
  "Returns the object with the settings used for calls to insertNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkSettings this]
    (-> this (.insertNetworkSettings))))

(defn get-network-settings
  "Returns the object with the settings used for calls to getNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetNetworkHttpRequest,com.google.cloud.compute.v1.Network>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkSettings this]
    (-> this (.getNetworkSettings))))

(defn switch-to-custom-mode-network-settings
  "Returns the object with the settings used for calls to switchToCustomModeNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkSettings this]
    (-> this (.switchToCustomModeNetworkSettings))))

(defn remove-peering-network-settings
  "Returns the object with the settings used for calls to removePeeringNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkSettings this]
    (-> this (.removePeeringNetworkSettings))))

(defn delete-network-settings
  "Returns the object with the settings used for calls to deleteNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NetworkSettings this]
    (-> this (.deleteNetworkSettings))))

(defn list-networks-settings
  "Returns the object with the settings used for calls to listNetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkList,com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NetworkSettings this]
    (-> this (.listNetworksSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.NetworkSettings$Builder`"
  (^com.google.cloud.compute.v1.NetworkSettings$Builder [^NetworkSettings this]
    (-> this (.toBuilder))))

