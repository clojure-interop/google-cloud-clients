(ns com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder
  "Builder for NetworkStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NetworkStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.NetworkStubSettings$Builder [^NetworkStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn add-peering-network-settings
  "Returns the builder for the settings used for calls to addPeeringNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkStubSettings$Builder this]
    (-> this (.addPeeringNetworkSettings))))

(defn patch-network-settings
  "Returns the builder for the settings used for calls to patchNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkStubSettings$Builder this]
    (-> this (.patchNetworkSettings))))

(defn insert-network-settings
  "Returns the builder for the settings used for calls to insertNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkStubSettings$Builder this]
    (-> this (.insertNetworkSettings))))

(defn get-network-settings
  "Returns the builder for the settings used for calls to getNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetNetworkHttpRequest,com.google.cloud.compute.v1.Network>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkStubSettings$Builder this]
    (-> this (.getNetworkSettings))))

(defn switch-to-custom-mode-network-settings
  "Returns the builder for the settings used for calls to switchToCustomModeNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkStubSettings$Builder this]
    (-> this (.switchToCustomModeNetworkSettings))))

(defn remove-peering-network-settings
  "Returns the builder for the settings used for calls to removePeeringNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkStubSettings$Builder this]
    (-> this (.removePeeringNetworkSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.NetworkStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.NetworkStubSettings [^NetworkStubSettings$Builder this]
    (-> this (.build))))

(defn delete-network-settings
  "Returns the builder for the settings used for calls to deleteNetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NetworkStubSettings$Builder this]
    (-> this (.deleteNetworkSettings))))

(defn list-networks-settings
  "Returns the builder for the settings used for calls to listNetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkList,com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NetworkStubSettings$Builder this]
    (-> this (.listNetworksSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^NetworkStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

