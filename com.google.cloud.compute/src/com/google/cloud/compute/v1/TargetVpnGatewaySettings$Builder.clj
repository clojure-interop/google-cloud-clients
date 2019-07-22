(ns com.google.cloud.compute.v1.TargetVpnGatewaySettings$Builder
  "Builder for TargetVpnGatewaySettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetVpnGatewaySettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings$Builder [^TargetVpnGatewaySettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaySettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.TargetVpnGatewaySettings$Builder [^TargetVpnGatewaySettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn aggregated-list-target-vpn-gateways-settings
  "Returns the builder for the settings used for calls to aggregatedListTargetVpnGateways.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList,com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetVpnGatewaySettings$Builder this]
    (-> this (.aggregatedListTargetVpnGatewaysSettings))))

(defn delete-target-vpn-gateway-settings
  "Returns the builder for the settings used for calls to deleteTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetVpnGatewaySettings$Builder this]
    (-> this (.deleteTargetVpnGatewaySettings))))

(defn get-target-vpn-gateway-settings
  "Returns the builder for the settings used for calls to getTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetVpnGatewaySettings$Builder this]
    (-> this (.getTargetVpnGatewaySettings))))

(defn insert-target-vpn-gateway-settings
  "Returns the builder for the settings used for calls to insertTargetVpnGateway.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TargetVpnGatewaySettings$Builder this]
    (-> this (.insertTargetVpnGatewaySettings))))

(defn list-target-vpn-gateways-settings
  "Returns the builder for the settings used for calls to listTargetVpnGateways.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayList,com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TargetVpnGatewaySettings$Builder this]
    (-> this (.listTargetVpnGatewaysSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetVpnGatewaySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.TargetVpnGatewaySettings [^TargetVpnGatewaySettings$Builder this]
    (-> this (.build))))

