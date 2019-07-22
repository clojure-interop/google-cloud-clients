(ns com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings
  "Settings class to configure an instance of TargetVpnGatewayStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetVpnGateway to 30 seconds:



  TargetVpnGatewayStubSettings.Builder targetVpnGatewaySettingsBuilder =
      TargetVpnGatewayStubSettings.newBuilder();
  targetVpnGatewaySettingsBuilder.deleteTargetVpnGatewaySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetVpnGatewayStubSettings targetVpnGatewaySettings = targetVpnGatewaySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetVpnGatewayStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetVpnGatewayStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetVpnGatewayStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetVpnGatewayStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetVpnGatewayStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetVpnGatewayStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder []
    (TargetVpnGatewayStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetVpnGatewayStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetVpnGatewayStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetVpnGatewayStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetVpnGatewayStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-target-vpn-gateways-settings
  "Returns the object with the settings used for calls to aggregatedListTargetVpnGateways.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList,com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetVpnGatewayStubSettings this]
    (-> this (.aggregatedListTargetVpnGatewaysSettings))))

(defn delete-target-vpn-gateway-settings
  "Returns the object with the settings used for calls to deleteTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetVpnGatewayStubSettings this]
    (-> this (.deleteTargetVpnGatewaySettings))))

(defn get-target-vpn-gateway-settings
  "Returns the object with the settings used for calls to getTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetVpnGatewayStubSettings this]
    (-> this (.getTargetVpnGatewaySettings))))

(defn insert-target-vpn-gateway-settings
  "Returns the object with the settings used for calls to insertTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetVpnGatewayStubSettings this]
    (-> this (.insertTargetVpnGatewaySettings))))

(defn list-target-vpn-gateways-settings
  "Returns the object with the settings used for calls to listTargetVpnGateways.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayList,com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetVpnGatewayStubSettings this]
    (-> this (.listTargetVpnGatewaysSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetVpnGatewayStub`

  throws: java.io.IOException"
  ([^TargetVpnGatewayStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder [^TargetVpnGatewayStubSettings this]
    (-> this (.toBuilder))))

