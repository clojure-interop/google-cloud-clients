(ns com.google.cloud.compute.v1.TargetVpnGatewaySettings
  "Settings class to configure an instance of TargetVpnGatewayClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetVpnGateway to 30 seconds:



  TargetVpnGatewaySettings.Builder targetVpnGatewaySettingsBuilder =
      TargetVpnGatewaySettings.newBuilder();
  targetVpnGatewaySettingsBuilder.deleteTargetVpnGatewaySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetVpnGatewaySettings targetVpnGatewaySettings = targetVpnGatewaySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetVpnGatewaySettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetVpnGatewaySettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetVpnGatewaySettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetVpnGatewaySettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetVpnGatewaySettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaySettings$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaySettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetVpnGatewaySettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.TargetVpnGatewaySettings$Builder []
    (TargetVpnGatewaySettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetVpnGatewaySettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetVpnGatewaySettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetVpnGatewaySettings [^com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings stub]
    (TargetVpnGatewaySettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetVpnGatewaySettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetVpnGatewaySettings/getDefaultServiceScopes )))

(defn aggregated-list-target-vpn-gateways-settings
  "Returns the object with the settings used for calls to aggregatedListTargetVpnGateways.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList,com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetVpnGatewaySettings this]
    (-> this (.aggregatedListTargetVpnGatewaysSettings))))

(defn delete-target-vpn-gateway-settings
  "Returns the object with the settings used for calls to deleteTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetVpnGatewaySettings this]
    (-> this (.deleteTargetVpnGatewaySettings))))

(defn get-target-vpn-gateway-settings
  "Returns the object with the settings used for calls to getTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetVpnGatewaySettings this]
    (-> this (.getTargetVpnGatewaySettings))))

(defn insert-target-vpn-gateway-settings
  "Returns the object with the settings used for calls to insertTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetVpnGatewaySettings this]
    (-> this (.insertTargetVpnGatewaySettings))))

(defn list-target-vpn-gateways-settings
  "Returns the object with the settings used for calls to listTargetVpnGateways.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayList,com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetVpnGatewaySettings this]
    (-> this (.listTargetVpnGatewaysSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaySettings$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaySettings$Builder [^TargetVpnGatewaySettings this]
    (-> this (.toBuilder))))

