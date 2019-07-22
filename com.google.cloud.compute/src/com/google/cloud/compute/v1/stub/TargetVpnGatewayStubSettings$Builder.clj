(ns com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder
  "Builder for TargetVpnGatewayStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetVpnGatewayStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder [^TargetVpnGatewayStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^TargetVpnGatewayStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn aggregated-list-target-vpn-gateways-settings
  "Returns the builder for the settings used for calls to aggregatedListTargetVpnGateways.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList,com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetVpnGatewayStubSettings$Builder this]
    (-> this (.aggregatedListTargetVpnGatewaysSettings))))

(defn delete-target-vpn-gateway-settings
  "Returns the builder for the settings used for calls to deleteTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetVpnGatewayStubSettings$Builder this]
    (-> this (.deleteTargetVpnGatewaySettings))))

(defn get-target-vpn-gateway-settings
  "Returns the builder for the settings used for calls to getTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetVpnGatewayStubSettings$Builder this]
    (-> this (.getTargetVpnGatewaySettings))))

(defn insert-target-vpn-gateway-settings
  "Returns the builder for the settings used for calls to insertTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetVpnGatewayStubSettings$Builder this]
    (-> this (.insertTargetVpnGatewaySettings))))

(defn list-target-vpn-gateways-settings
  "Returns the builder for the settings used for calls to listTargetVpnGateways.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayList,com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetVpnGatewayStubSettings$Builder this]
    (-> this (.listTargetVpnGatewaysSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings [^TargetVpnGatewayStubSettings$Builder this]
    (-> this (.build))))

